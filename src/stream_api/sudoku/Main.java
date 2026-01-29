package stream_api.sudoku;

import stream_api.sudoku.model.Board;
import stream_api.sudoku.model.Space;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static stream_api.sudoku.util.BoardTemplate.BOARD_TEMPLATE;
import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);
    private static Board board;
    private final static int BOARD_LIMIT = 9;

    public static void main(String[] args) {
        // Se passar args, usa eles. Se não, usa um mapa padrão para teste.
        final Map<String, String> positions = (args.length > 0) ? parseArgs(args) : getMockBoard();

        var option = -1;
        while (true) {
            System.out.println("\n--- SUDOKU JAVA ---");
            System.out.println("1 - Iniciar um novo Jogo");
            System.out.println("2 - Colocar um novo número");
            System.out.println("3 - Remover um número");
            System.out.println("4 - Visualizar jogo atual");
            System.out.println("5 - Verificar status do jogo");
            System.out.println("6 - Limpar jogo");
            System.out.println("7 - Finalizar jogo");
            System.out.println("8 - Sair");
            System.out.print("Opção: ");

            option = runUntilGetValidNumber(1, 8);

            switch (option) {
                case 1 -> startGame(positions);
                case 2 -> inputNumber();
                case 3 -> removeNumber();
                case 4 -> showCurrentGame();
                case 5 -> showGameStatus();
                case 6 -> clearGame();
                case 7 -> finishGame();
                case 8 -> {
                    System.out.println("Saindo...");
                    System.exit(0);
                }
                default -> System.out.println("Opção inválida.");
            }
        }
    }

    private static Map<String, String> parseArgs(String[] args) {
        return Stream.of(args).collect(Collectors.toMap(
                k -> k.split(";")[0],
                v -> v.split(";")[1]
        ));
    }

    private static void startGame(final Map<String, String> positions) {
        if (nonNull(board)) {
            System.out.println("O jogo já foi iniciado!");
            return;
        }

        List<List<Space>> spaces = new ArrayList<>();
        for (int i = 0; i < BOARD_LIMIT; i++) {
            spaces.add(new ArrayList<>());
            for (int j = 0; j < BOARD_LIMIT; j++) {
                var positionConfig = positions.get("%s,%s".formatted(i, j));
                // caso a configuraçao falhe, cria espaço vazio (evita NullPointer)
                if (positionConfig == null) {
                    spaces.get(i).add(new Space(0, false));
                    continue;
                }
                var expected = Integer.parseInt(positionConfig.split(",")[0]);
                var fixed = Boolean.parseBoolean(positionConfig.split(",")[1]);
                var currentSpace = new Space(expected, fixed);
                spaces.get(i).add(currentSpace);
            }
        }
        board = new Board(spaces);
        System.out.println("O jogo foi iniciado com sucesso!");
    }

    private static void inputNumber() {
        if (checkGameNotStarted()) return;

        System.out.println("Informe a LINHA (0-8):");
        var col = runUntilGetValidNumber(0, 8); // No seu template, a primeira dimensão é linha
        System.out.println("Informe a COLUNA (0-8):");
        var row = runUntilGetValidNumber(0, 8);
        System.out.printf("Informe o número (1-9) para a posição [%s,%s]:\n", col, row);
        var value = runUntilGetValidNumber(1, 9);

        if (!board.changeValue(col, row, value)) {
            System.out.printf("A posição [%s,%s] é fixa e não pode ser alterada!\n", col, row);
        } else {
            System.out.println("Número inserido.");
        }
    }

    private static void removeNumber() {
        if (checkGameNotStarted()) return;

        System.out.println("Informe a LINHA (0-8):");
        var col = runUntilGetValidNumber(0, 8);
        System.out.println("Informe a COLUNA (0-8):");
        var row = runUntilGetValidNumber(0, 8);

        if (!board.clearValue(col, row)) {
            System.out.printf("A posição [%s,%s] é fixa!\n", col, row);
        } else {
            System.out.println("Número removido.");
        }
    }

    private static void showCurrentGame() {
        if (checkGameNotStarted()) return;

        var args = new Object[81];
        var argPos = 0;
        // percorre a matriz para preencher o template
        for (int i = 0; i < BOARD_LIMIT; i++) {
            for (var col : board.getSpaces()) {
                // ajuste de logica de exibicao
                var space = col.get(i);
                // Nota: O template espera a matriz transposta ou sua lógica de loop original estava invertida.
                // Ajustei para pegar board.getSpaces().get(i).get(j) se for Lista de Linhas.
                // Abaixo sigo a lógica original do seu código assumindo List<Row<Col>>:
            }
        }

        // Simplificando para funcionar com a estrutura de dados
        // spaces.get(i) = Linha i
        for(int row=0; row < BOARD_LIMIT; row++){
            for(int col=0; col < BOARD_LIMIT; col++){
                var space = board.getSpaces().get(row).get(col);
                args[argPos++] = " " + ((isNull(space.getActual())) ? " " : space.getActual());
            }
        }

        System.out.println("Seu jogo atual:");
        System.out.printf((BOARD_TEMPLATE) + "\n", args);
    }

    private static void showGameStatus() {
        if (checkGameNotStarted()) return;
        System.out.printf("Status: %s\n", board.getStatus().getLabel());
        System.out.println(board.hasErrors() ? "O jogo contém erros." : "O jogo não contém erros.");
    }

    private static void clearGame() {
        if (checkGameNotStarted()) return;
        System.out.println("Tem certeza? (sim/não)");
        var confirm = scanner.next();
        if (confirm.equalsIgnoreCase("sim")) {
            board.reset();
            System.out.println("Jogo reiniciado.");
        }
    }

    private static void finishGame() {
        if (checkGameNotStarted()) return;

        if (board.gameIsFinished()) {
            System.out.println("PARABÉNS! Você concluiu o Sudoku!");
            showCurrentGame();
            board = null; // encerra
        } else if (board.hasErrors()) {
            System.out.println("Seu jogo contém erros. Verifique o tabuleiro.");
        } else {
            System.out.println("O jogo ainda está incompleto.");
        }
    }

    private static int runUntilGetValidNumber(final int min, final int max) {
        var current = -1;
        while (true) {
            try {
                // Lê como string e converte para evitar buffer sujo
                String input = scanner.next();
                current = Integer.parseInt(input);
                if (current >= min && current <= max) return current;
                System.out.printf("Informe um número entre %s e %s: ", min, max);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número.");
            }
        }
    }

    private static boolean checkGameNotStarted() {
        if (isNull(board)) {
            System.out.println("O jogo ainda não foi iniciado. Selecione a opção 1.");
            return true;
        }
        return false;
    }

    // gera um tabuleiro simples para teste (apenas diagonal)
    private static Map<String, String> getMockBoard() {
        Map<String, String> positions = new HashMap<>();
        // Preenche tudo com zeros e não fixo por padrão
        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                positions.put(i + "," + j, "1,false");
            }
        }
        return positions;
    }
}
package desafio_rotas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rota = scanner.nextLine();

        // Separe a string de entrada usando o caractere '-'
        String[] partes = rota.split("-");

        // Verifica se a divisão resultou em duas partes (recurso e ação)
        if (partes.length != 2) {
            System.out.println("invalido");
            return;
        }

        String recurso = partes[0];
        String acao = partes[1];

        // O regex [a-z]+ garante que são letras minúsculas e .endsWith("s") verifica o plural
        boolean recursoValido = recurso.matches("[a-z]+") && recurso.endsWith("s");

        // Verifica se a ação é uma das permitidas
        boolean acaoValida = acao.equals("listar") ||
                acao.equals("criar") ||
                acao.equals("atualizar") ||
                acao.equals("deletar");

        // Imprima "valido" se a rota seguir o padrão, ou "invalido" caso contrário.
        if (recursoValido && acaoValida) {
            System.out.println("valido");
        } else {
            System.out.println("invalido");
        }

        scanner.close();
    }
}
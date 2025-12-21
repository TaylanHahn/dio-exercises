package exercicio_contaBancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // criação do scanner
        Scanner scanner = new Scanner(System.in);

        // coleta de dados para nova conta
        System.out.println("=== NOVA CONTA NULLBANK ===");
        System.out.println("Informe o numero da conta:");
        int numLido = scanner.nextInt();
        scanner.nextLine(); // limpa o buffer
        System.out.println("Informe o nome do titular:");
        String nomeLido = scanner.nextLine();
        System.out.println("Informe o valor do deposito inicial:");
        double depLido = scanner.nextDouble();

        // nova conta instanciada
        ContaBancaria cb = new ContaBancaria(numLido, nomeLido, depLido);

        // variavel escolha
        int escolha;

        do {
            // exibe o menu no terminal
            System.out.println("===== MENU =====");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Consultar limite cheque especial");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sacar");
            System.out.println("5 - Pagar boleto");
            System.out.println("0 - Sair");
            System.out.println("===============");

            escolha = scanner.nextInt();
            switch (escolha) {
                case 1:
                    double saldo = cb.consultarSaldo();
                    System.out.println("O seu saldo atual é de R$ " + saldo);
                    break;
                case 2:
                    double limiteCE = cb.consultarLimiteChequeEspecial();
                    System.out.println("O limite do seu cheque especial é: " + limiteCE);
                    break;
                case 3:
                    System.out.println("Informe o valor a ser depositado");
                    double deposito = scanner.nextDouble();
                    cb.depositar(deposito);
                    break;
                case 4:
                    System.out.println("Informe o valor que deseja sacar:");
                    double saque = scanner.nextDouble();
                    boolean sucesso = cb.sacar(saque);
                    if (sucesso){
                        System.out.println("Saque realizado com sucesso!");
                    } else {
                        System.out.println("Erro ao realizar o saque!");
                    }
                    break;
                case 5:
                    System.out.println("Informe o valor do boleto a ser pago:");
                    double boleto = scanner.nextDouble();
                    cb.pagarBoleto(boleto);
                    break;
                case 0: break;
            }
        } while (escolha != 0);
        scanner.close();
    }
}
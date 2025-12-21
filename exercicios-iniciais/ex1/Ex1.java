// Minha solução para o exercicio 1

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(">>> Menu de Opções AWS <<<");
        System.out.println("1 - Demandas de servidores virtuais");
        System.out.println("2 - Armazenamento de arquivos");
        System.out.println("3 - Bancos de dados relacionais");
        System.out.println("4 - Execuções de código sob demanda");
        System.out.println("Envie o número da alternativa escolhida:");
        
        String solicitacao = scanner.nextLine();
        
        String texto = solicitacao.toLowerCase();
        
        switch(texto){
          case "1":
            System.out.print("EC2");
            break;
          case "2":
            System.out.print("S3");
            break;
          case "3":
            System.out.print("RDS");
            break;
          case "4":
            System.out.print("Lambda");
            break;
          default:
            System.out.print("Serviço desconhecido");
            break;
        }
        scanner.close();
    }
}
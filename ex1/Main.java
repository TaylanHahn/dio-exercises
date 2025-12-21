// Solução do DIO para o exercicio 1 
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Lê a linha inteira que o sistema de teste vai enviar
        String solicitacao = scanner.nextLine();
        
        // Opcional: converte para minúsculas para evitar erros se escreverem "S3" ou "s3"
        // Mas a verificação deve ser nas palavras-chave do enunciado
        
        // Verifica qual palavra-chave está contida na solicitação
        if (solicitacao.contains("servidores virtuais")) {
            System.out.println("EC2");
        } else if (solicitacao.contains("armazenamento de arquivos")) {
            System.out.println("S3");
        } else if (solicitacao.contains("bancos de dados relacionais")) {
            System.out.println("RDS");
        } else if (solicitacao.contains("execuções de código sob demanda")) {
            System.out.println("Lambda");
        } else {
            // Atenção: O enunciado pede "Servico" sem "ç" na saída padrão em muitos casos
            // Verifique se o teste espera "Servico" ou "Serviço". 
            // Pelo seu texto de saída, parece ser "Servico".
            System.out.println("Servico desconhecido");
        }
        
        scanner.close();
    }
}


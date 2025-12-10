import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            float valorSalario = scanner.nextFloat();
            float valorBeneficios = scanner.nextFloat();

            float valorImposto = 0;
            if(valorSalario >= 0 && valorSalario <= 1100.00){
                valorImposto = 0.05f * valorSalario;
            } else if (valorSalario >= 1100.01f && valorSalario <= 2500.00){
                valorImposto = 0.10f * valorSalario;
            } else {
                valorImposto = 0.15f * valorSalario;
            }

            float saida = valorSalario - valorImposto + valorBeneficios;
            System.out.println(String.format("%.2f", saida));
        }
    }
}

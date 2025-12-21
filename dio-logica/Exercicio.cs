using System;

public class Exercicio{
    public static void Main(){
        float valorSalario = float.Parse(Console.ReadLine());
        float valorBeneficios = float.Parse(Console.ReadLine());

        float valorImposto = 0;
        if(valorSalario >=0 && valorSalario <=1100){
            valorImposto = 0.05f * valorSalario;
        } else if (valorSalario >= 1100.01 &&valorSalario <= 2500.00){
                valorImposto = 0.10f * valorSalario;
        } else {
                valorImposto = 0.15f * valorSalario;
            }

        float saida = valorSalario - valorImposto + valorBeneficios;
        Console.WriteLine(saida.ToString("0.00"));
    }
}
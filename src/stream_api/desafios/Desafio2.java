/*
Desafio 2 - Imprima a soma dos números pares da lista:
Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.
*/

package stream_api.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Desafio2 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int soma = numeros.stream()
                .filter((n) -> n % 2 == 0)
                .mapToInt(Integer::intValue)// converte para o tipo primitivo
                .sum();
        System.out.println(soma);
    }
}

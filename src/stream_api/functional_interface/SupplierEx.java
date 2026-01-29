package stream_api.functional_interface;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
 * É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
 */
public class SupplierEx {
    public static void main(String[] args) {

        /* TODO ESTE BLOCO, PODE SER RESUMIDO DE FORMA ENXUTA
        // Usar o Supplier com expressão lambda para fornecer uma saudação personalizada
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";

        // Usar o Supplier para obter uma lista com 5 saudações
        List<String> listaSaudacoes = Stream.generate(saudacao)
                .limit(5)
                .toList();
         */

        // DE FORMA MAIS ENXUTA, FICA ASSIM:
        List<String> listaSaudacoes = Stream.generate(() -> "Olá, seja bem-vindo(a)!")
                .limit(5)
                .toList();

        // Imprimir as saudações geradas
        listaSaudacoes.forEach(System.out::println);
    }
}



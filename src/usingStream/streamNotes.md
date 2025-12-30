# Guia Essencial: Consumer, Function, Predicate e Collectors (Java Stream API)

Este documento resume os quatro pilares fundamentais para manipulação de dados utilizando a Stream API do Java (introduzida no Java 8).

---

## 1. Resumo Rápido e Comparação

| Conceito | Interface Funcional | Assinatura do Método Abstrato | Entrada / Saída | Uso Principal na Stream | Descrição Simples |
| :--- | :--- | :--- | :--- | :--- | :--- |
| **Predicate** | `Predicate<T>` | `boolean test(T t)` | Recebe `T` → Retorna `boolean` | `.filter()` | **Decisor:** Define se um elemento deve permanecer ou ser removido. |
| **Function** | `Function<T, R>` | `R apply(T t)` | Recebe `T` → Retorna `R` | `.map()` | **Transformador:** Converte um objeto de um tipo em outro (ex: Objeto → String). |
| **Consumer** | `Consumer<T>` | `void accept(T t)` | Recebe `T` → Retorna `void` | `.forEach()`, `.peek()` | **Executor:** Executa uma ação com o dado (ex: imprimir, salvar no banco) sem retornar nada. |
| **Collectors** | N/A (Classe Utilitária) | N/A | Recebe `Stream` → Retorna `Coleção/Resultado` | `.collect()` | **Finalizador:** Agrupa, resume ou converte o fluxo de dados em uma Lista, Map, Set ou valor único. |

---

## 2. Detalhamento dos Conceitos

### A. Predicate `<T>`
Interface funcional usada para validar condições.
* **Conceito:** Representa uma afirmação que pode ser verdadeira ou falsa.
* **Onde usar:** Principalmente no método `filter()` para selecionar elementos.

### B. Function `<T, R>`
Interface funcional usada para transformação de dados.
* **Conceito:** Recebe um argumento de tipo `T` e produz um resultado de tipo `R`.
* **Onde usar:** Principalmente no método `map()` para extrair dados ou converter objetos.

### C. Consumer `<T>`
Interface funcional usada para efeitos colaterais (side-effects).
* **Conceito:** Recebe um argumento e realiza uma operação, mas não devolve resultado.
* **Onde usar:** Em `forEach()` (operação terminal) ou `peek()` (para debug/log durante o fluxo).

### D. Collectors
Não é uma interface funcional, mas uma classe utilitária (`java.util.stream.Collectors`) que fornece implementações de `Collector`.
* **Conceito:** Define como acumular os elementos processados da Stream em um resultado final.
* **Onde usar:** No método terminal `.collect()`.

---

## 3. Exemplos Práticos (Código Java)

Abaixo, um exemplo completo simulando uma lista de produtos para demonstrar todos os conceitos juntos.

```java
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamApiDemo {

    // Classe simples para exemplo
    static class Produto {
        String nome;
        double preco;
        String categoria;

        public Produto(String nome, double preco, String categoria) {
            this.nome = nome;
            this.preco = preco;
            this.categoria = categoria;
        }

        @Override
        public String toString() {
            return nome + " (R$ " + preco + ")";
        }
    }

    public static void main(String[] args) {
        List<Produto> produtos = Arrays.asList(
            new Produto("Notebook", 3500.00, "Eletrônicos"),
            new Produto("Mouse", 120.00, "Eletrônicos"),
            new Produto("Teclado", 200.00, "Eletrônicos"),
            new Produto("Cadeira", 800.00, "Móveis"),
            new Produto("Mesa", 1200.00, "Móveis")
        );

        // -------------------------------------------------
        // 1. PREDICATE (Filtragem)
        // -------------------------------------------------
        // Definição: Aceita um Produto, retorna true se preço > 500
        Predicate<Produto> ehCaro = p -> p.preco > 500.00;

        // -------------------------------------------------
        // 2. FUNCTION (Transformação)
        // -------------------------------------------------
        // Definição: Aceita um Produto, retorna uma String (o nome em caixa alta)
        Function<Produto, String> extrairNomeUpper = p -> p.nome.toUpperCase();

        // -------------------------------------------------
        // 3. CONSUMER (Ação)
        // -------------------------------------------------
        // Definição: Aceita uma String (nome), imprime no console
        Consumer<String> imprimir = nome -> System.out.println("Produto processado: " + nome);

        System.out.println("--- Pipeline Completo ---");

        // USANDO TODOS JUNTOS NA STREAM
        List<String> nomesProdutosCaros = produtos.stream()
            .filter(ehCaro)               // Usa PREDICATE
            .map(extrairNomeUpper)        // Usa FUNCTION
            .peek(imprimir)               // Usa CONSUMER (dentro do fluxo para log)
            .collect(Collectors.toList()); // Usa COLLECTORS

        
        // -------------------------------------------------
        // 4. COLLECTORS (Outros exemplos de agragação)
        // -------------------------------------------------
        System.out.println("\n--- Exemplo Avançado de Collectors ---");

        // Agrupando produtos por Categoria (Map<String, List<Produto>>)
        Map<String, List<Produto>> porCategoria = produtos.stream()
            .collect(Collectors.groupingBy(p -> p.categoria));

        // Gerando uma String única separada por vírgula
        String todosNomes = produtos.stream()
            .map(p -> p.nome)
            .collect(Collectors.joining(", "));

        System.out.println("Produtos agrupados: " + porCategoria);
        System.out.println("Nomes concatenados: " + todosNomes);
    }
}
````
## 4. Diferenças Cruciais

### Consumer vs Function
* **Use Consumer** quando você quer apenas executar algo e não precisa de retorno (ex: `System.out.println`, salvar no banco).
* **Use Function** quando você precisa transformar o dado e passar o resultado para a próxima etapa da Stream.

### Filter (Predicate) vs Map (Function)
* **Filter** reduz a quantidade de itens na stream (remove o que não satisfaz a condição). O tipo do objeto não muda.
* **Map** mantém a quantidade de itens (geralmente), mas altera o tipo ou conteúdo do objeto.

### Collectors vs forEach (Consumer)
* **Use Collectors (`.collect()`)** quando você quer obter uma estrutura de dados (Lista, Map) para usar depois no código.
* **Use forEach** quando a Stream é o fim da linha e você só quer iterar para imprimir ou causar um efeito colateral.

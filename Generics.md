## Generics em Java

### Conceito
Generics (Genéricos) permitem que classes, interfaces e métodos possam ser parametrizados por tipos. Isso significa que você pode definir uma classe ou método com um "placeholder" para o tipo, que será definido no momento do uso.

### Principais benefícios
- **Segurança de tipos**: Evita erros de `ClassCastException` em tempo de execução.
- **Reutilização de código**: Permite escrever algoritmos genéricos que funcionam com diferentes tipos.
- **Eliminação de casts**: Reduz a necessidade de conversões explícitas.

### Sintaxe Básica
- **Classes Genéricas**: `class NomeClasse<T> { ... }`
- **Métodos Genéricos**: `<T> void nomeMetodo(T parametro) { ... }`
- **Interfaces Genéricas**: `interface NomeInterface<T> { ... }`

O `<T>` é um tipo parâmetro (pode ser qualquer letra/nome), que será substituído por um tipo concreto quando a classe/método for usado.

> Exemplo:
```java
// Classe genérica para representar uma Caixa que pode armazenar qualquer tipo
public class Caixa<T> {
    private T conteudo;

    // Método para adicionar conteúdo à caixa
    public void guardar(T conteudo) {
        this.conteudo = conteudo;
    }

    // Método para retirar conteúdo da caixa
    public T retirar() {
        return conteudo;
    }

    public static void main(String[] args) {
        // Exemplo de uso com String
        Caixa<String> caixaDeString = new Caixa<>();
        caixaDeString.guardar("Livro de Java");
        String itemString = caixaDeString.retirar();
        System.out.println("Conteúdo da caixa (String): " + itemString);

        // Exemplo de uso com Integer
        Caixa<Integer> caixaDeInt = new Caixa<>();
        caixaDeInt.guardar(42);
        int itemInt = caixaDeInt.retirar(); // Autounboxing
        System.out.println("Conteúdo da caixa (Integer): " + itemInt);
    }
}
````

### Convenções de Nomes para Tipos Parâmetros

- `<E>` - Elemento (usado em coleções)
- `<K>` - Chave (Key)
- `<V>` - Valor (Value)
- `<T>` - Tipo (Type)
- `<N>` - Número (Number)

### Observações Importantes

- `Type Erasure`: Em tempo de compilação, os genéricos são removidos (erased) e substituídos por Object ou pelo limite superior do tipo.
- Não é possível usar tipos primitivos: Use as classes wrappers correspondentes (ex: Integer em vez de int).
- Herança com genéricos: List<String> não é subtipo de List<Object>, mesmo que String seja subtipo de Object.

### Quando Usar?
- Quando você quer criar estruturas de dados ou algoritmos que funcionem com múltiplos tipos de forma type-safe.
- Em coleções (List, Set, Map) onde você quer especificar o tipo dos elementos.
- Para evitar casts e tornar o código mais legível e seguro.

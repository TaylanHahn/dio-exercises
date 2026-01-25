package collections_java_api.main.java.search_map;

public class Main {
    public static void main(String[] args) {

        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.adicionarProduto(0021, "Picanha", 50.00, 10);
        estoque.adicionarProduto(0234, "Cerveja", 12.00, 34);
        estoque.adicionarProduto(1234, "Carvão", 15.50, 15);
        estoque.adicionarProduto(8790, "Pão de Alho", 10.00, 40);
        estoque.adicionarProduto(0122, "Costela c/ osso", 30.00, 5);

        System.out.println("---------------- TOTAL do Estoque -------------------");
        System.out.println(estoque.calcularValorTotalEstoque());
        System.out.println("-------------- MAIS BARATO -------------------");
        System.out.println( estoque.obterProdutoMaisBarato());
        System.out.println("--------------- MAIS CARO -------------------");
        System.out.println(estoque.obterProdutoMaisCaro());

    }
}

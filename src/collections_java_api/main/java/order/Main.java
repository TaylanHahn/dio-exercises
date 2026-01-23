package collections_java_api.main.java.order;

public class Main {
    public static void main(String[] args) {
        CadastroProdutos cadP = new CadastroProdutos();
        cadP.adicionarProduto("Leite", 111111L, 7.00d, 5);
        cadP.adicionarProduto("Arroz", 222222L, 4.00d, 10);
        cadP.adicionarProduto("Feijao", 888888L, 7.00d, 2);
        cadP.adicionarProduto("Biscoito", 777777L, 10.00d, 12);

        System.out.println(cadP.exibirProdutosPorNome());
        System.out.println(cadP.exibirProdutosPorPreco());
    }
}

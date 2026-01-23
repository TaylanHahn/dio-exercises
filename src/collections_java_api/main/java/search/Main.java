package collections_java_api.main.java.search;

public class Main {
    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();

        catalogo.adicionarLivro("Livro 1", "Autor 1", 2000);
        catalogo.adicionarLivro("Livro 2", "Autor 2", 2017);
        catalogo.adicionarLivro("Livro 3", "Autor 3", 1995);
        catalogo.adicionarLivro("Livro 4", "Autor 4", 1983);
        catalogo.adicionarLivro("Livro 5", "Autor 5", 2026);

        System.out.println(catalogo.pesquisarPorAutor("Autor 4"));
        System.out.println(catalogo.pesquisarPorTitulo("Livro 2"));
        System.out.println(catalogo.pesquisarPorIntervaloAnos(2000, 2026));
    }
}

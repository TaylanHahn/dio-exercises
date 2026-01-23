package collections_java_api.main.java.search_set;

public class Main {
    public static void main(String[] args) {
        AgendaContatos agc = new AgendaContatos();

        agc.exibirContato();

        agc.adicionarContato("Taylan", 12345);
        agc.adicionarContato("Taylan", 0);
        agc.adicionarContato("Taylan Hahn", 98765);
        agc.adicionarContato("Taylan Fernandes", 12345);

        agc.exibirContato();

        System.out.println(agc.pesquisarPorNome("Taylan"));

        System.out.println("Contato atualizado: " + agc.atualizarNumeroContato("Taylan Hahn", 456678));

        agc.exibirContato();
    }
}

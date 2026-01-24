package collections_java_api.main.java.map;

public class Main {
    public static void main(String[] args) {
        AgendaContatos ageC = new AgendaContatos();

        ageC.adicionarContato("Taylan", 989898989);
        ageC.adicionarContato("Jhulia", 2121212121);
        ageC.adicionarContato("Luisa", 676767676);
        ageC.adicionarContato("Jose", 343434343);
        ageC.adicionarContato("Peter", 656565656);
        ageC.adicionarContato("Clarissa", 171171171);
        ageC.exibirContatos();
        System.out.println("-------------------------");
        System.out.println(ageC.pesquisarPorNome("Jhulia"));
        System.out.println("-------------------------");
        ageC.removerContato("Clarissa");
        ageC.exibirContatos();
        System.out.println("-------------------------");
    }
}

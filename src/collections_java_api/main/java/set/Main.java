package collections_java_api.main.java.set;

public class Main {
    public static void main(String[] args) {
        ConjuntoConvidados cc = new ConjuntoConvidados();
        System.out.println("Existem " + cc.contarConvidados() + " convidados dentro do Set");

        cc.adicionarConvidado("Convidado 1", 12345);
        cc.adicionarConvidado("Convidado 2", 12346);
        cc.adicionarConvidado("Convidado 3", 12347);
        cc.adicionarConvidado("Convidado 4", 12347);

        System.out.println("Existem " + cc.contarConvidados() + " convidados dentro do Set");
        cc.removerConvidadoPorCodigoConvite(12345);
        System.out.println("Existem " + cc.contarConvidados() + " convidados dentro do Set");

        cc.exibirConvidados();

    }
}

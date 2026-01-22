package collections_java_api.main.java.list;

public class Main {
    public static void main(String[] args) {
        ListaTarefas listaTeste = new ListaTarefas();

        System.out.println("O número total de elementos na lista é: " + listaTeste.obterNumeroTotalTarefas());
        listaTeste.adicionarTarefa("Estudar Bootcamp JAVA");
        listaTeste.adicionarTarefa("Responder mensagens no email");
        listaTeste.adicionarTarefa("Responder mensagens no email");
        System.out.println("O número total de elementos na lista é: " + listaTeste.obterNumeroTotalTarefas());

        listaTeste.removerTarefa("Responder mensagens no email");

        System.out.println("O número total de elementos na lista é: " + listaTeste.obterNumeroTotalTarefas());

        listaTeste.obterDescricoesTarefas();
    }
}

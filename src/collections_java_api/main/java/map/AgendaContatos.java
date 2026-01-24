package collections_java_api.main.java.map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    // ATRIBUTOS
    private Map<String, Integer> agendaContatoMap;

    // CONSTRUTOR
    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    // MÉTODOS
    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroDeRetorno = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroDeRetorno = agendaContatoMap.get(nome);
        }
        return numeroDeRetorno;
    }

}

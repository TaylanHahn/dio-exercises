package collections_java_api.main.java.order_map;

import java.time.LocalDate;
import java.util.*;

public class AgendaEventos {
    // ATRIBUTO
    private Map<LocalDate, Evento> agenda;

    // CONSTRUTOR
    public AgendaEventos() {
        this.agenda = new HashMap<>();
    }

    // MÉTODOS

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        agenda.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
       Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(agenda);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(agenda);
        for(Map.Entry<LocalDate, Evento> entry: eventosTreeMap.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                System.out.println("O próximo evento: " + entry.getValue() + "acontecerá na data" + entry.getKey());
                break;
            }
        }

    }

}

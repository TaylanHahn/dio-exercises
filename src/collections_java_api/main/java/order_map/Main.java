package collections_java_api.main.java.order_map;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2026, 3, 24),"Evento 1", "Show de Rock");
        agendaEventos.adicionarEvento(LocalDate.of(2026, 8, 12),"Evento 2", "Feira do Livro");
        agendaEventos.adicionarEvento(LocalDate.of(2026, 12, 24),"Evento 3", "Natal LUZ");
        agendaEventos.adicionarEvento(LocalDate.of(2026, 4, 4),"Evento 4", "Dia do Star Wars");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
    }
}

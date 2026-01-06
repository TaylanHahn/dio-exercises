package exercicio_equipeTech;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Equipe {
    public String nome;
    public List<Consultor> consultores = new ArrayList<>();

    public Equipe(String nome) {
        this.nome = nome;
    }

    public void adicionar(Consultor c) {
        consultores.add(c);
    }

    public List<Consultor> ordenados() {
        List<Consultor> lista = new ArrayList<>(consultores);
        Collections.sort(lista);
        return lista;
    }
}

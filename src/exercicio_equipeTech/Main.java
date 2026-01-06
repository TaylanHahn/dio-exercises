package exercicio_equipeTech;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Equipe> equipes = new HashMap<>();

        Equipe alpha = new Equipe("Alpha");
        alpha.adicionar(new ConsultorDados("Lucas", "Pleno"));
        alpha.adicionar(new ConsultorBackend("Bruno", "Senior"));
        alpha.adicionar(new ConsultorFrontend("Maria", "Junior"));
        equipes.put("Alpha", alpha);

        Equipe beta = new Equipe("Beta");
        beta.adicionar(new ConsultorBackend("Joao", "Junior"));
        beta.adicionar(new ConsultorDados("Ana", "Senior"));
        equipes.put("Beta", beta);

        String nomeEquipe = sc.nextLine();
        Equipe equipe = equipes.get(nomeEquipe);

        //  Se a equipe existir, imprima os consultores ordenados, caso contrario 'Equipe nao encontrada'

        if(equipe != null){
            List<Consultor> listaOrdenada = equipe.ordenados();
            for (Consultor c : listaOrdenada){
                System.out.println(c);
            }
        } else {
            System.out.println("Equipe nao encontrada");
        }




    }
}

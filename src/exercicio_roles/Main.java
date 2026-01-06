package exercicio_roles;

import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine().trim();

        List<Consultant> consultantList = new ArrayList<>();

        // Cada consultor pode vir separado por ";"
        String[] entries = inputLine.split(";");

        for (String entry : entries) {
            entry = entry.trim();
            if (entry.isEmpty()) continue;

            String[] parts = entry.split(" ", 2);
            String jobTitle = parts[0];
            String personName = parts[1];

            // Criar os IF ELSE para instanciar Developer, Analyst e Manager

            if (jobTitle.equalsIgnoreCase("Developer")) {
                var dev = new Developer(personName);
                consultantList.add(dev);
            } else if (jobTitle.equalsIgnoreCase("Analyst")) {
                var an = new Analyst(personName);
                consultantList.add(an);
            } else if (jobTitle.equalsIgnoreCase("Manager")) {
                var man = new Manager(personName);
                consultantList.add(man);
            } else {
                System.out.println("Cargo desconhecido: " + jobTitle);
            }
        }

        // Impressão final na ordem de entrada
        for (Consultant consultant : consultantList) {
            System.out.println(consultant.present());
        }
    }
}

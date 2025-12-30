package usingStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = Arrays.asList(
                new Funcionario("Ana", "TI", 5000, 28),
                new Funcionario("Bruno", "Financeiro", 7000, 35),
                new Funcionario("Carlos", "TI", 6500, 40),
                new Funcionario("Beatriz", "RH", 4000, 30),
                new Funcionario("Daniel", "Financeiro", 8000, 45),
                new Funcionario("Amanda", "RH", 4500, 25),
                new Funcionario("Eduardo", "TI", 6000, 32)
        );

        // 1. Lista de funcionarios do depto de TI com salario acima de 5500
        List<Funcionario> tiAltos = funcionarios.stream()
                .filter(f -> f.getDepartamento().equals("TI"))
                .filter(f -> f.getSalario() > 5500)
                .collect(Collectors.toList());

        System.out.println("Funcionários de TI com salário > 5500:");
        tiAltos.forEach(System.out::println);

        // 2. Media salarial por depto
        Map<String, Double> mediaPorDepto = funcionarios.stream()
                .collect(Collectors.groupingBy(
                        Funcionario::getDepartamento,
                        Collectors.averagingDouble(Funcionario::getSalario)
                ));

        System.out.println("\nMédia salarial por departamento:");
        mediaPorDepto.forEach((d, m) -> System.out.println(d + ": R$" + m));

        // 3. Funcionario mais velho
        funcionarios.stream()
                .max(Comparator.comparingInt(Funcionario::getIdade))
                .ifPresent(f -> System.out.println("\nFuncionário mais velho: " + f));

        // 4. Soma total dos salarios
        double somaSalarios = funcionarios.stream()
                .mapToDouble(Funcionario::getSalario)
                .sum();
        System.out.println("\nSoma total dos salários: R$" + somaSalarios);

        // 5. Agrupa por departamento
        Map<String, List<Funcionario>> agrupados = funcionarios.stream()
                .collect(Collectors.groupingBy(Funcionario::getDepartamento));

        System.out.println("\nFuncionários agrupados por departamento:");
        agrupados.forEach((d, lista) -> {
            System.out.println(d + " -> " + lista);
        });
    }
}

package usingStream;

public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;
    private int idade;

    public Funcionario(String nome, String departamento, double salario, int idade) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public double getSalario() {
        return salario;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return nome + " - " + departamento + " - R$" + salario + " - " + idade + " anos";
    }

}

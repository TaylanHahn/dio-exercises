package collections_java_api.main.java.search_set;

import java.util.Objects;

public class Contato {
    // ATRIBUTOS
    private String nome;
    private int numero;

    // CONSTRUTOR
    public Contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    // GETTERS
    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    // MÉTODOS


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(nome, contato.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }

    @Override
    public String toString() {
        return "Nome contato: " + getNome() + " - Fone: " + getNumero() ;
    }
}

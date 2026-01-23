package collections_java_api.main.java.set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    // ATRIBUTO
    private Set<Convidado> convidadoSet;

    // CONSTRUTOR
    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    // MÉTODOS
    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet) {
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }
}

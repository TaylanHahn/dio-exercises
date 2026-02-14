package padroes_de_projeto.facade;

import padroes_de_projeto.facade.subsistema1.cep.CepApi;
import padroes_de_projeto.facade.subsistema2.crm.CrmService;

public class Facade {
    public void migrarCliente(String nome, String cep){

        String cidade = CepApi.getInstance().recuperarCidade(cep);
        String estado = CepApi.getInstance().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}

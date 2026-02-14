package padroes_de_projeto.facade.subsistema1.cep;

public class CepApi {
    private static CepApi instance = new CepApi();

    private CepApi(){
        super();
    }

    public static CepApi getInstance(){
        return instance;
    }

    public String recuperarCidade(String cep){
        return "Porto Alegre";
    }

    public String recuperarEstado(String cep){
        return "RS";
    }
}

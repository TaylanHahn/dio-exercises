package padroes_de_projeto.singleton;

// Singleton "Apressado"
public class CepApi {
    private static CepApi instance = new CepApi();;

    public CepApi(){
        super();
    }

    public static CepApi getInstance(){
        return instance;
    }
}

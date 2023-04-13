package dio.gof.subsistema2;

public class CepApi {
    //criado Singleton
    private static CepApi instancia = new CepApi();

    public CepApi() {
        super();
    }
    public static CepApi getInstancia(){

        return instancia;
    }
    //criar métodos de instancia públicos

    public String recuperarCidade(String cep){
        return "";
    }

    public String recuperarEstado(String cep){
        return "";
    }

    public String recuperarCidade() {
        return recuperarCidade();
    }

    public String recuperarEstado() {
        return recuperarEstado();
    }
}

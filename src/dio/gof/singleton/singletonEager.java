package dio.gof.singleton;

public class singletonEager {
   //irá instanciar direto
    private static singletonEager instancia = new singletonEager();

    public singletonEager() {
    }
    public static singletonEager getInstancia(){
        return instancia;
    }
}

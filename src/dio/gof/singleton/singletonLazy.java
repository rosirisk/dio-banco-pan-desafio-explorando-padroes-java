package dio.gof.singleton;

public class singletonLazy {

    private static singletonLazy instancia;

    // não disponibiliza a instancia para o usuário

    private singletonLazy() {
    }

    public static singletonLazy getInstancia(){
        if (instancia == null){
            instancia = new singletonLazy();
        }
        return instancia;
    }
}

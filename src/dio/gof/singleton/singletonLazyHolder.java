package dio.gof.singleton;

public class singletonLazyHolder {

    private static class Holder{
        public static singletonLazyHolder instancia = new singletonLazyHolder();
    }

        private singletonLazyHolder() {
    }
    public static singletonLazyHolder getInstancia(){
    return Holder.instancia;
    }
}

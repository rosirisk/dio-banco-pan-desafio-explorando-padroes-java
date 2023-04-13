package dio.gof;

import dio.gof.facade.Facade;
import dio.gof.singleton.singletonEager;
import dio.gof.singleton.singletonLazy;
import dio.gof.singleton.singletonLazyHolder;
import dio.gof.strategy.*;

public class test {

    private static Robo robo;




    public static void main (String[] args){

        //Instanciar cada um deles  Teste relacionados ao Design Pattern Singleton

        singletonLazy lazy = singletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = singletonLazy.getInstancia();
        System.out.println(lazy);

        singletonEager eager = singletonEager.getInstancia();
        System.out.println(eager);
        eager = singletonEager.getInstancia();
        System.out.println(eager);

        singletonLazyHolder holder = singletonLazyHolder.getInstancia();
        System.out.println(holder);
        holder = singletonLazyHolder.getInstancia();
        System.out.println(holder);


        //Testes Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();


        //Teste Facade
        // Criar nova instancia do Facade
        Facade facade = new Facade();
        facade.migrarCliente("Venilton", "12210-050");

    }
}

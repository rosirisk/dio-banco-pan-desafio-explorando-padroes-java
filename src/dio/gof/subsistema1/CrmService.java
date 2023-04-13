package dio.gof.subsistema1;

public class CrmService {

    private static String nome = "Venilton";
    private static String cep = "12211‑620";
    private static String cidade = "São josé dos Campos";
    private static String estado = "SP";

    private CrmService(){
        super();
    }


    public static void gravarCliente (String nome, String cep, String cidade, String estado) {
        System.out.println("Cliente salvo no sistema de CRM!");
        System.out.println(CrmService.nome);
        System.out.println(CrmService.cep);
        System.out.println(CrmService.cidade);
        System.out.println(CrmService.estado);

    }
}

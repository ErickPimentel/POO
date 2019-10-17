import java.util.HashMap;
import java.util.Map;

public class TestaConta {
    public static void main(String[] args){
        Conta c1 = new Conta();
        Conta c2 = new Conta();
        Conta c3 = new Conta();
        c1.deposita(10000);
        c2.deposita(5000);
        c3.deposita(3000);

        Map<String, Conta> mapadecontas = new HashMap<String, Conta>();

        mapadecontas.put("diretor", c1);
        mapadecontas.put("gerente",c2);
        mapadecontas.put("cliente", c3);

        Conta contaDoDiretor = (Conta) mapadecontas.get("diretor");
        Conta contaDoGerente = (Conta) mapadecontas.get("gerente");
        Conta contaDoCliente = (Conta) mapadecontas.get("cliente");

        System.out.println("Conta do Diretor: " + contaDoDiretor.getSaldo());
        System.out.println("Conta do Gerente: " + contaDoGerente.getSaldo());
        System.out.println("Conta do Cliente: " + contaDoCliente.getSaldo());

    }
}

public class TesteConta {
    public static void main(String[] args){
        Conta c = new Conta();

        try {
            c.deposita(-10);
        }catch (DepositoNegativoException e){
            //System.out.println("Erro: " + e);
            System.out.println(e);
            //System.out.println(e.getMessage());
        }

        try {
            c.saca(100);
        }catch (SaldoInsuficienteException e){
            //System.out.println("Erro: " + e);
            System.out.println(e);
            //System.out.println(e.getMessage());
        }


    }
}

package Conta;

public class TesteContaExcecaoExterna {
    public static void main(String[] args) {
        Conta c = new Conta();
        c.setSaldo(100);
        try {
            c.saca(200);
        }catch (SaldoInsuficienteException e){
            System.out.println("Erro: " + e);
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            c.deposita(-200);
        }catch (ValorInvalidoException e){
            System.out.println("Erro: " + e);
            System.out.println("Erro: " + e.getMessage());
        }


    }
}

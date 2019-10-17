public class EnviarCartoes {
    public void enviarCartao(Tipo_IF tipo){
        Cartao ca = new Cartao(tipo);
        ca.getTipo().tipo();
    }


    public static void main(String[] args) {
        EnviarCartoes s = new EnviarCartoes();
        s.enviarCartao(new CartaoAniversario());

        s.enviarCartao(new CartaoNatalino());

        s.enviarCartao(new CartaoPascoa());
    }
}

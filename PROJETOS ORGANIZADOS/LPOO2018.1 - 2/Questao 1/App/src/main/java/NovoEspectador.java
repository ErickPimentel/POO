public class NovoEspectador extends Espectador {
    public NovoEspectador(String nome, int idade, double price) {
        super(nome, idade);
        super.setBilheteManagement(new BilheteManagement(""));
        super.getBilheteManagement().setAsCustom(price);
    }
}

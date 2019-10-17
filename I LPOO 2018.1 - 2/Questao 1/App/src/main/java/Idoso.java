public class Idoso extends Espectador {
    public Idoso(String nome, int idade) {
        super(nome, idade);
        super.setBilheteManagement(new BilheteManagement(""));
        super.getBilheteManagement().setAsIdoso();
    }
}

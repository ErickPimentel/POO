public class Idoso extends Espectador {
    Idoso(){

    }

    public Idoso(String nome, int idade) {
        super(nome, idade);
        super.setBilhete(new BilheteManagement(""));
        super.getBilhete().setIdoso();
    }
}

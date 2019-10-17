public class Idoso extends Espectador {
    public Idoso() {
    }

    public Idoso(String nome, int idade) {
        super(nome, idade);
        super.setBilhete(new Bilhete(""));
        super.getBilhete().setIdoso();
    }
}

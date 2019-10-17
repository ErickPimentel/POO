public class Idoso extends Espectador {

    Idoso() {
    }

    Idoso(String nome, int idade) {
        super(nome, idade);
        super.setBilhete(new Bilhete(""));
        super.getBilhete().setIdoso();
    }
}

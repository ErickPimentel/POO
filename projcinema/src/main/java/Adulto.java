public class Adulto extends Espectador {
    private String cpf;

    Adulto() {
    }

    Adulto(String nome, int idade, String cpf) {
        super(nome, idade);
        this.cpf = cpf;
        super.setBilhete(new Bilhete(""));
        super.getBilhete().setAdulto();
    }
}

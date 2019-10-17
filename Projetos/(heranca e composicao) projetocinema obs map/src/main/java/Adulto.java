public class Adulto extends Espectador {
    private String cpf;

    Adulto(){

    }

    public Adulto(String nome, int idade, String cpf) {
        super(nome, idade);
        this.cpf = cpf;
        super.setBilhete(new BilheteManagement(""));
        super.getBilhete().setAdulto();
    }
}

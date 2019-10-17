public class Adulto extends Espectador {
    private String cpf;

    public Adulto(String nome, int idade, String cpf) {
        super(nome, idade);
        this.cpf = cpf;
        super.setBilheteManagement(new BilheteManagement(""));
        super.getBilheteManagement().setAsAdulto();
    }





}

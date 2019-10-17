public class Crianca extends Espectador {
    private String responsavel;

    public Crianca(String nome, int idade, String responsavel) {
        super(nome, idade);
        this.responsavel = responsavel;
        super.setBilheteManagement(new BilheteManagement(""));
        super.getBilheteManagement().setAsCrianca();
    }



}

public class Crianca extends Espectador {
    private String responsavel;

    public Crianca(){
    }

    public Crianca(String nome, int idade, String responsavel){
        super(nome, idade);
        this.responsavel = responsavel;
        super.setBilhete(new BilheteManagement(""));
        super.getBilhete().setCrianca();
    }


}

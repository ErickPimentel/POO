public class Crianca extends Espectador {
    private String responsavel;

    Crianca(){

    }

    Crianca(String nome, int idade, String responsavel) {
        super(nome, idade);
        this.responsavel = responsavel;
        super.setBilhete(new Bilhete(""));
        super.getBilhete().setCrianca();
    }
}

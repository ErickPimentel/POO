public abstract class Espectador {
    private String nome;
    private int idade;
    private BilheteManagement bilhete;

    Espectador(){

    }

    public Espectador(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public BilheteManagement getBilhete() {
        return bilhete;
    }

    public void setBilhete(BilheteManagement bilhete) {
        this.bilhete = bilhete;
    }
}

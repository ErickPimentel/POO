public abstract class Espectador {
    private String nome;
    private int idade;

    public Espectador(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    private BilheteManagement bilheteManagement;


    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BilheteManagement getBilheteManagement() {
        return bilheteManagement;
    }

    public void setBilheteManagement(BilheteManagement bilheteManagement) {
        this.bilheteManagement = bilheteManagement;
    }
}

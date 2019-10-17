public abstract class Midia {
    private String titulo;
    private int ano;
    private Preco_IF preco;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Preco_IF getPreco() {
        return preco;
    }

    public void setPreco(Preco_IF preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "{" +
                "titulo='" + titulo + '\'' +
                ", ano=" + ano +
                ", preco=" + preco.preco() +
                '}';
    }
}

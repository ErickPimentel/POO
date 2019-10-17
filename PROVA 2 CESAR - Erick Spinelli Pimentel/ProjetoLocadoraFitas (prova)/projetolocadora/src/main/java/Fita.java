public class Fita {
    private String titulo;
    private int ano;
    private double preco;

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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Fita{" +
                "titulo='" + titulo + '\'' +
                ", ano=" + ano +
                ", preco=" + preco +
                '}';
    }
}

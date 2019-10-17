import java.util.Objects;

public class Musica {
    private int codigo;
    private String autor;
    private String nomemusica;
    private int ano;

    public Musica(){
    }

    public Musica(int codigo, String autor, String nomemusica, int ano) {
        this.codigo = codigo;
        this.autor = autor;
        this.nomemusica = nomemusica;
        this.ano = ano;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNomemusica() {
        return nomemusica;
    }

    public void setNomemusica(String nomemusica) {
        this.nomemusica = nomemusica;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Musica musica = (Musica) o;
        return codigo == musica.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }

    @Override
    public String toString() {
        return "\nMusica{" +
                "codigo=" + codigo +
                ", autor='" + autor + '\'' +
                ", nomemusica='" + nomemusica + '\'' +
                ", ano=" + ano +
                '}';
    }
}

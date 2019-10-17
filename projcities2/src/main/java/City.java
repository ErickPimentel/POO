import java.util.Objects;

public class City {
    private String nome;
    private String estado;
    private String cep;

    City(){

    }

    public City(String nome, String estado, String cep) {
        this.setNome(nome);
        this.setEstado(estado);
        this.setCep(cep);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return nome.equals(city.nome) &&
                estado.equals(city.estado) &&
                cep.equals(city.cep);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, estado, cep);
    }

//    @Override
//    public int compareTo(City o) {
//        int cmp = nome.compareTo(o.nome);
//        if (cmp == 0) {
//            cmp = estado.compareTo(o.estado);
//        }
//        return cmp;
//    }

    @Override
    public String toString() {
        return "\nCity{" +
                "nome='" + nome + '\'' +
                ", estado='" + estado + '\'' +
                ", cep='" + cep + '\'' +
                '}';
    }
}

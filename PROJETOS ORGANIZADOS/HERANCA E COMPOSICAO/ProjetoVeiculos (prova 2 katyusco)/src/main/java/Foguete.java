public class Foguete extends Veiculo {

    public Foguete() {
    }

    public Foguete(String combustive, Piloto[] pilotos) {
        super(combustive, pilotos);
    }

    public void lancamento(){
        System.out.println("FOGUETE LANCADO");
    }

    @Override
    public String toString() {
        return "Foguete" + super.toString();
    }
}

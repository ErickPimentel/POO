import java.awt.image.VolatileImage;
import java.util.Arrays;

public abstract class Veiculo implements Dirigivel_IF{
    private String combustive;
    private Piloto[] pilotos;

    public Veiculo() {
    }

    public Veiculo(String combustive, Piloto[] pilotos) {
        this.combustive = combustive;
        this.pilotos = pilotos;
    }

    public String getCombustive() {
        return combustive;
    }

    public void setCombustive(String combustive) {
        this.combustive = combustive;
    }

    public Piloto[] getPilotos() {
        return pilotos;
    }

    public void setPilotos(Piloto[] pilotos) {
        this.pilotos = pilotos;
    }

    public void acelerar(){
        System.out.println("ACELERANDO");
    }

    public void frear(){
        System.out.println("FREANDO");
    }

    @Override
    public String toString() {
        return "{" +
                "combustive='" + combustive + '\'' +
                ", pilotos=" + Arrays.toString(pilotos) +
                '}';
    }
}

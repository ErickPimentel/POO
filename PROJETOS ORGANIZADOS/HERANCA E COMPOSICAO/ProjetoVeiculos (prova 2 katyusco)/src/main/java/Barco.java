import java.util.Arrays;

public class Barco extends Veiculo implements Navegavel_IF {
    private int comprimento;
    private int largura;

    public Barco() {
    }

    public Barco(String combustive, Piloto[] pilotos, int comprimento, int largura) {
        super(combustive, pilotos);
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public void localizacao() {
        System.out.println("LOCALIZANDO...");
    }

    @Override
    public String toString() {
        return "Barco{" +
                "combustive='" + getCombustive() + '\'' +
                ", pilotos=" + Arrays.toString(getPilotos()) +
                ", comprimento" + comprimento +
                ", largura" + largura +
                '}';
    }
}

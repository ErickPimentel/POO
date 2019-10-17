public class Retangulo extends Figura {
    private int largura;

    public Retangulo() {
    }

    public Retangulo(int lado, int largura) {
        super(lado);
        this.largura = largura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    @Override
    public double area() {
        return this.largura * getLado();
    }

    @Override
    public String toString() {
        return "Retangulo" + "{" +
                "lado=" + getLado() + " ,largura: " + largura + '}';
    }
}

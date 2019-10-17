public class Quadrado extends Figura {

    public Quadrado() {
    }

    public Quadrado(int lado) {
        super(lado);
    }

    @Override
    public double area() {
        return this.getLado() * this.getLado();
    }

    @Override
    public String toString() {
        return "Quadrado" + super.toString();
    }
}

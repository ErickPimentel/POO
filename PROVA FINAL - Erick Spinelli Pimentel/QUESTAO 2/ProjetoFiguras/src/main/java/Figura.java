public abstract class Figura {
    private int lado;

    public Figura() {
    }

    public Figura(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public double area(){
        return 0;
    }

    @Override
    public String toString() {
        return "{" +
                "lado=" + lado +
                '}';
    }
}

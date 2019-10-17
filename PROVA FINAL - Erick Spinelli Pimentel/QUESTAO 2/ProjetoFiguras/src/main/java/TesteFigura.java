public class TesteFigura {
    public static void main(String[] args) {
        Figura q = new Quadrado(5);
        //System.out.println("Lado quadrado: " + q.getLado());
        System.out.println("Area quadrado: " + q.area());

        Figura r = new Retangulo(5 , 10);
        System.out.println("Area retangulo: " + r.area());

        System.out.println(q.toString());
        System.out.println(r.toString());

    }
}

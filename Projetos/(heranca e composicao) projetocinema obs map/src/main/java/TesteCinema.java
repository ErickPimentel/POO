public class TesteCinema {
    public static void main(String[] args) {
        Cinema c = new Cinema();
        Espectador a1 = new Adulto("Erick",19,"13377788850");
        Espectador a2 = new Adulto("Isaque", 19,"14455566660");
        Espectador c1 = new Crianca("Micael",5, "Rayanne");
        Espectador c2 = new Crianca("Ikael",5, "Rayanne");
        Espectador i1 = new Idoso("Rayanne", 21);

        c.addEspectador(a1);
        c.addEspectador(a2);
        c.addEspectador(c1);
        c.addEspectador(c2);
        c.addEspectador(i1);

        System.out.println("Preco de a1: " + a1.getBilhete().getPreco());
        System.out.println("Preco de a2: " + a2.getBilhete().getPreco());
        System.out.println("Preco de c1: " + c1.getBilhete().getPreco());
        System.out.println("Preco de c2: " + c2.getBilhete().getPreco());
        System.out.println("Preco de i1: " + i1.getBilhete().getPreco());

        a1.getBilhete().setDia("quarta");
        a2.getBilhete().setDia("quarta");
        c1.getBilhete().setDia("quarta");
        c2.getBilhete().setDia("quarta");
        i1.getBilhete().setDia("quarta");

        System.out.println("Preco de a1 na quarta: " + a1.getBilhete().getPreco());
        System.out.println("Preco de a2 na quarta: " + a2.getBilhete().getPreco());
        System.out.println("Preco de c1 na quarta: " + c1.getBilhete().getPreco());
        System.out.println("Preco de c2 na quarta: " + c2.getBilhete().getPreco());
        System.out.println("Preco de i1 na quarta: " + i1.getBilhete().getPreco());

        a1.getBilhete().setDia("feriado");
        a2.getBilhete().setDia("feriado");
        c1.getBilhete().setDia("feriado");
        c2.getBilhete().setDia("feriado");
        i1.getBilhete().setDia("feriado");

        System.out.println("Preco de a1 no feriado: " + a1.getBilhete().getPreco());
        System.out.println("Preco de a2 no feriado: " + a2.getBilhete().getPreco());
        System.out.println("Preco de c1 no feriado: " + c1.getBilhete().getPreco());
        System.out.println("Preco de c2 no feriado: " + c2.getBilhete().getPreco());
        System.out.println("Preco de i1 no feriado: " + i1.getBilhete().getPreco());
    }


}

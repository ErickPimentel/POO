public class App {
    public static void main(String[] args) {
        Locadora locadora = new Locadora();

        System.out.println("Pratilheira");
        System.out.println(locadora.getnaloja());
        System.out.println("Fora da loja");
        System.out.println(locadora.getalugados());
        System.out.println("\n");

        Midia dvd = new DVD();
        dvd.setCodigo(1);
        dvd.setNome("Era do Gelo");
        dvd.setPreco(new Lancamento().preco());

        Midia cd = new CD();
        cd.setCodigo(2);
        cd.setNome("GD na Ilha");
        cd.setPreco(new Normal().preco());

        Midia fita = new Fita();
        fita.setCodigo(3);
        fita.setNome("Dora a Aventureira");
        fita.setPreco(new Infantil().preco());

        locadora.colocar(dvd);
        locadora.colocar(cd);
        locadora.colocar(fita);

        System.out.println("Pratilheira");
        System.out.println(locadora.getnaloja());
        System.out.println("Fora da loja");
        System.out.println(locadora.getalugados());
        System.out.println("\n");

        locadora.alugar(cd);
        locadora.alugar(fita);

        System.out.println("Pratilheira");
        System.out.println(locadora.getnaloja());
        System.out.println("Fora da loja");
        System.out.println(locadora.getalugados());
        System.out.println("\n");


        locadora.retorna(cd);
        locadora.retorna(fita);

        System.out.println("Pratilheira");
        System.out.println(locadora.getnaloja());
        System.out.println("Fora da loja");
        System.out.println(locadora.getalugados());
        System.out.println("\n");

    }
}

public class TesteLocadora {
    public static void main(String[] args) {
        Locadora loc = new Locadora();

        Cliente c1 = new Cliente(100,"ana");
        Cliente c2 = new Cliente(200, "pedro");
        Cliente c3 = new Cliente(300, "caio");

        DVD d1 = new DVD(1,"Rambo");
        DVD d2 = new DVD(2,"StarWars");
        DVD d3 = new DVD(3,"Vingadores");

        System.out.println(loc.cadastrarCliente(c1));
        System.out.println(loc.cadastrarCliente(c2));
        System.out.println(loc.cadastrarCliente(c3));
        System.out.println(loc.cadastrarCliente(c3));

        System.out.println(loc.cadastrarDvds(d1));
        System.out.println(loc.cadastrarDvds(d2));
        System.out.println(loc.cadastrarDvds(d3));
        System.out.println(loc.cadastrarDvds(d3));

        System.out.println(loc.contarDVDsEmprestados());

        System.out.println(loc.fazerEmprestimo(c1,d1));
        System.out.println(loc.fazerEmprestimo(c2,d2));
        System.out.println(loc.fazerEmprestimo(c3,d1));

        System.out.println(loc.contarDVDsEmprestados());


    }
}

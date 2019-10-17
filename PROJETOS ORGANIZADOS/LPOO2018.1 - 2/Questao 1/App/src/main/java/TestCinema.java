public class TestCinema {

    public static void main(String[] args) {
        Cinema cinema = new Cinema();

        Espectador e1 = new Adulto("Isaque", 19, "231423434243");
        cinema.addEspectador(e1);
        System.out.println("Preco de e1: " + e1.getBilheteManagement().getPrice());

        e1.getBilheteManagement().setAsCrianca();
        System.out.println("Preco de e1 mudado para valor de crianca mesmo sendo ainda aulto: " + e1.getBilheteManagement().getPrice());

        System.out.println();
        Espectador e2 = new Crianca("Maria", 5, "Isaque");
        cinema.addEspectador(e2);
        System.out.println("Preco de e2 (crianca): " + e2.getBilheteManagement().getPrice());
        e2.getBilheteManagement().setAsAdulto();
        System.out.println("Preco de e2 com valor de adulto mesmo sendo crianca: " + e2.getBilheteManagement().getPrice());

        System.out.println();
        Espectador e3 = new Adulto("Marcos", 53, "203192183");
        cinema.addEspectador(e3);
        e3.getBilheteManagement().setDay("quarta");
        System.out.println("Preco de e3 (adulto) em uma quarta feira: " + e3.getBilheteManagement().getPrice());
        e3.getBilheteManagement().setAsCustom(42341);
        System.out.println("Preco de e3 com valor customizado mesmo sendo adulto: " + e3.getBilheteManagement().getPrice());

    }

}

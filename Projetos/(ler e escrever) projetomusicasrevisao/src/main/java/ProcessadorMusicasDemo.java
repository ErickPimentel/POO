import java.io.IOException;

public class ProcessadorMusicasDemo {
    public static void main(String[] args) throws IOException {
        ProcessadorMusicas pm = new ProcessadorMusicas();
        pm.lerMusicas("C:\\Users\\Erick Pimentel\\IdeaProjects\\projetomusicasrevisao\\src\\main\\java\\song");

        ComparadorPorCodigo cpc = new ComparadorPorCodigo();
        pm.gravarMusicasOrdenadasPor("C:\\Users\\Erick Pimentel\\IdeaProjects\\projetomusicasrevisao\\src\\main\\java\\saidacodigo", cpc);

        ComparadorPorAutor cpa = new ComparadorPorAutor();
        pm.gravarMusicasOrdenadasPor("C:\\Users\\Erick Pimentel\\IdeaProjects\\projetomusicasrevisao\\src\\main\\java\\saidaautor",cpa);

        ComparadorPorNomeMusica cpnm = new ComparadorPorNomeMusica();
        pm.gravarMusicasOrdenadasPor("C:\\Users\\Erick Pimentel\\IdeaProjects\\projetomusicasrevisao\\src\\main\\java\\saidanomemusica",cpnm);

        ComparadorPorAno cpano = new ComparadorPorAno();
        pm.gravarMusicasOrdenadasPor("C:\\Users\\Erick Pimentel\\IdeaProjects\\projetomusicasrevisao\\src\\main\\java\\saidaano", cpano);


    }
}

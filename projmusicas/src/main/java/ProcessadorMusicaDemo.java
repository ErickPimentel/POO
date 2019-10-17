import java.io.IOException;

public class ProcessadorMusicaDemo {
    public static void main(String[] args) throws IOException {
        ProcessadorMusica pm = new ProcessadorMusica();
        pm.lerMusicas("C:\\Users\\Erick Pimentel\\IdeaProjects\\projmusicas\\src\\main\\java\\song");

        ComparadorPorCodigo cpc = new ComparadorPorCodigo();
        pm.gravarMusicasOrdenadasPor("C:\\Users\\Erick Pimentel\\IdeaProjects\\projmusicas\\src\\main\\java\\saidacodigo", cpc);

        ComparadorPorNome cpn = new ComparadorPorNome();
        pm.gravarMusicasOrdenadasPor("C:\\Users\\Erick Pimentel\\IdeaProjects\\projmusicas\\src\\main\\java\\saidanome", cpn);

        ComparadorPorAutor cpa = new ComparadorPorAutor();
        pm.gravarMusicasOrdenadasPor("C:\\Users\\Erick Pimentel\\IdeaProjects\\projmusicas\\src\\main\\java\\saidaautor",cpa);

        ComparadorPorAno cpano = new ComparadorPorAno();
        pm.gravarMusicasOrdenadasPor("C:\\Users\\Erick Pimentel\\IdeaProjects\\projmusicas\\src\\main\\java\\saidaano", cpano);

    }
}

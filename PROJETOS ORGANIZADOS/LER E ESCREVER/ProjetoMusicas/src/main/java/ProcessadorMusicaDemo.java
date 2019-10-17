import java.io.IOException;

public class ProcessadorMusicaDemo {
    public static void main(String[] args) throws IOException {
        ProcessadorMusica pm = new ProcessadorMusica();
        pm.lerMusicas("C:\\Users\\Erick Pimentel\\Desktop\\PROJETOS\\ProjetoMusicas\\src\\main\\java\\song");

        ComparadorPorCodigo cpc = new ComparadorPorCodigo();
        pm.gravarMusicasOrdenadasPor("C:\\Users\\Erick Pimentel\\Desktop\\PROJETOS\\ProjetoMusicas\\src\\main\\java\\saidacodigo",cpc);

        ComparadorPorTitulo cpt = new ComparadorPorTitulo();
        pm.gravarMusicasOrdenadasPor("C:\\Users\\Erick Pimentel\\Desktop\\PROJETOS\\ProjetoMusicas\\src\\main\\java\\saidatitulo",cpt);

        ComparadorPorAutor cpa = new ComparadorPorAutor();
        pm.gravarMusicasOrdenadasPor("C:\\Users\\Erick Pimentel\\Desktop\\PROJETOS\\ProjetoMusicas\\src\\main\\java\\saidaautor", cpa);

        ComparadorPorAno cpano = new ComparadorPorAno();
        pm.gravarMusicasOrdenadasPor("C:\\Users\\Erick Pimentel\\Desktop\\PROJETOS\\ProjetoMusicas\\src\\main\\java\\saidaano", cpano);
    }
}

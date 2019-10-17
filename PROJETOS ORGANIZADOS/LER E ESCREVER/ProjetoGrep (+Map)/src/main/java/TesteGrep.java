import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TesteGrep {
    public static void main(String[] args) throws IOException {
        Grep g = new Grep();
        g.grep("ebook","C:\\Users\\Erick Pimentel\\Desktop\\PROJETOS\\ProjetoGrep\\src\\main\\java\\saidagrep");

        g.incluirLivro(1,"GD na Ilha", "GabrielDiniz", "DVD", 20);

        //System.out.println(g.removerTodasOcorrencias("ebook"));

        ComparadorPorId cpid = new ComparadorPorId();
        g.gravarLivrosOrdenadosPor("C:\\Users\\Erick Pimentel\\Desktop\\PROJETOS\\ProjetoGrep\\src\\main\\java\\saidaid",cpid);

        ComparadorPorAutor cpa = new ComparadorPorAutor();
        g.gravarLivrosOrdenadosPor("C:\\Users\\Erick Pimentel\\Desktop\\PROJETOS\\ProjetoGrep\\src\\main\\java\\saidaautor",cpa);

        ComparadorPorFormato cpf = new ComparadorPorFormato();
        g.gravarLivrosOrdenadosPor("C:\\Users\\Erick Pimentel\\Desktop\\PROJETOS\\ProjetoGrep\\src\\main\\java\\saidaformato", cpf);

        Map<String, List<String>> hashmap = new HashMap<String,List<String>>();
        hashmap = g.agruparLivrosPorFormato();
        System.out.println(hashmap.keySet());

        System.out.println(hashmap.toString());



    }
}

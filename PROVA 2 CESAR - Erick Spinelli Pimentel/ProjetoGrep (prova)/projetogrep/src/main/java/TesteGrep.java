import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TesteGrep {
    public static void main(String[] args) throws IOException {
        Grep g = new Grep();
        g.grep("ebook", "C:\\Users\\ifpb\\IdeaProjects\\projetogrep\\src\\main\\java\\saidatermo");

        g.incluirLivro(1,"GD na Ilha", "Gabriel Diniz", "ebook", 20);

        g.removerTodasOcorrencias("My Friend is a Duck");

        ComparadorPorAutor cpa = new ComparadorPorAutor();
        g.gravarLivrosOrdenadosPor("C:\\Users\\ifpb\\IdeaProjects\\projetogrep\\src\\main\\java\\saidacomparadorporautor",cpa);

        ComparadorPorFormato cpf = new ComparadorPorFormato();
        g.gravarLivrosOrdenadosPor("C:\\Users\\ifpb\\IdeaProjects\\projetogrep\\src\\main\\java\\saidacomparadorporformato", cpf);

        Map<String,Livro> hashmap = new HashMap<String, Livro>();
        hashmap = g.agruparLivrosFormato();
    }
}

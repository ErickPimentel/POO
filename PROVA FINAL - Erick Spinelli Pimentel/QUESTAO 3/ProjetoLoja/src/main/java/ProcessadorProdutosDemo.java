import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProcessadorProdutosDemo {
    public static void main(String[] args) throws IOException {
        List<Produto> lista = new ArrayList<Produto>();

        Produto p0 = new Produto(1,"Feijao", 68);
        Produto p1 = new Produto(2,"Arroz", 100);
        Produto p2 = new Produto(3,"Balde", 78);
        Produto p3 = new Produto(4,"Prego", 91);
        Produto p4 = new Produto(5,"Luva", 87);
        Produto p5 = new Produto(6,"Caixa", 94);
        Produto p6 = new Produto(7,"Molho", 83);
        Produto p7 = new Produto(8,"Sal", 85);
        Produto p8 = new Produto(9,"Acucar", 76);
        Produto p9 = new Produto(10,"Farinha", 81);

        lista.add(p0);
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        lista.add(p5);
        lista.add(p6);
        lista.add(p7);
        lista.add(p8);
        lista.add(p9);

        ProcessadorProdutos p = new ProcessadorProdutos(lista);
        p.mostrarGraficoDistribuicaoPrecos();

        p.salvarProdutos("F:\\PROVA\\QUESTAO 3\\ProjetoLoja\\src\\main\\java\\produtos");

    }
}

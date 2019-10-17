import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProcessadorProdutos {

    List<Produto> lista = new ArrayList<Produto>();

    public ProcessadorProdutos(List<Produto> lista){
        this.lista.addAll(lista);
    }

    public void mostrarGraficoDistribuicaoPrecos(){
        int contador09 = 0;
        int contador1019 = 0;
        int contador2029 = 0;
        int contador3039 = 0;
        int contador4049 = 0;
        int contador5059 = 0;
        int contador6069 = 0;
        int contador7079 = 0;
        int contador8089 = 0;
        int contador9099 = 0;
        int contador100 = 0;

        for (Produto p : this.lista){
            if (p.getPreco() >= 0 && p.getPreco() <= 9){
                contador09++;
            }
            else if (p.getPreco() >= 10 && p.getPreco() <= 19){
                contador1019++;
            }
            else if (p.getPreco() >= 20 && p.getPreco() <= 29){
                contador2029++;
            }
            else if (p.getPreco() >= 30 && p.getPreco() <= 39){
                contador3039++;
            }
            else if (p.getPreco() >= 40 && p.getPreco() <= 49){
                contador4049++;
            }
            else if (p.getPreco() >= 50 && p.getPreco() <= 59){
                contador5059++;
            }
            else if (p.getPreco() >= 60 && p.getPreco() <= 69){
                contador6069++;
            }
            else if (p.getPreco() >= 70 && p.getPreco() <= 79){
                contador7079++;
            }
            else if (p.getPreco() >= 80 && p.getPreco() <= 89){
                contador8089++;
            }
            else if (p.getPreco() >= 90 && p.getPreco() <= 99){
                contador9099++;
            }
            else if (p.getPreco() == 100){
                contador100++;
            }
        }

        String mais = "+ ";

        System.out.println("GRAFICO DE DISTRIBUICAO DE PRECOS");
        System.out.println("---------------------------------");
        System.out.println("00-09: " + mais.repeat(contador09));
        System.out.println("10-19: " + mais.repeat(contador1019));
        System.out.println("20-29: " + mais.repeat(contador2029));
        System.out.println("30-39: " + mais.repeat(contador3039));
        System.out.println("40-49: " + mais.repeat(contador4049));
        System.out.println("50-59: " + mais.repeat(contador5059));
        System.out.println("60-69: " + mais.repeat(contador6069));
        System.out.println("70-79: " + mais.repeat(contador7079));
        System.out.println("80-89: " + mais.repeat(contador8089));
        System.out.println("90-99: " + mais.repeat(contador9099));
        System.out.println("  100: " + mais.repeat(contador100));

        double maiorpreco = 0;
        double menorpreco = 99999;
        double somador = 0;
        double media = 0;
        for (Produto p : lista){
            if (p.getPreco() > maiorpreco){
                maiorpreco = p.getPreco();
            }
            if (p.getPreco() < menorpreco){
                menorpreco = p.getPreco();
            }

            somador += p.getPreco();
            media = somador / 10;
        }
        System.out.println("\n");
        System.out.println("Menor Preco: " + menorpreco);
        System.out.println("Maior Preco: " + maiorpreco);
        System.out.println("Media dos precos: " + media);
    }

    public void salvarProdutos(String filePath) throws IOException {
        OutputStream os = new FileOutputStream(filePath);
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);


        int contador09 = 0;
        int contador1019 = 0;
        int contador2029 = 0;
        int contador3039 = 0;
        int contador4049 = 0;
        int contador5059 = 0;
        int contador6069 = 0;
        int contador7079 = 0;
        int contador8089 = 0;
        int contador9099 = 0;
        int contador100 = 0;

        for (Produto p : this.lista){
            if (p.getPreco() >= 0 && p.getPreco() <= 9){
                contador09++;
            }
            else if (p.getPreco() >= 10 && p.getPreco() <= 19){
                contador1019++;
            }
            else if (p.getPreco() >= 20 && p.getPreco() <= 29){
                contador2029++;
            }
            else if (p.getPreco() >= 30 && p.getPreco() <= 39){
                contador3039++;
            }
            else if (p.getPreco() >= 40 && p.getPreco() <= 49){
                contador4049++;
            }
            else if (p.getPreco() >= 50 && p.getPreco() <= 59){
                contador5059++;
            }
            else if (p.getPreco() >= 60 && p.getPreco() <= 69){
                contador6069++;
            }
            else if (p.getPreco() >= 70 && p.getPreco() <= 79){
                contador7079++;
            }
            else if (p.getPreco() >= 80 && p.getPreco() <= 89){
                contador8089++;
            }
            else if (p.getPreco() >= 90 && p.getPreco() <= 99){
                contador9099++;
            }
            else if (p.getPreco() == 100){
                contador100++;
            }
        }

        String mais = "+ ";

        bw.write("GRAFICO DE DISTRIBUICAO DE PRECOS\n");
        bw.write("---------------------------------\n");
        bw.write("00-09: " + mais.repeat(contador09) + "\n");
        bw.write("10-19: " + mais.repeat(contador1019) + "\n");
        bw.write("20-29: " + mais.repeat(contador2029) + "\n");
        bw.write("30-39: " + mais.repeat(contador3039) + "\n");
        bw.write("40-49: " + mais.repeat(contador4049) + "\n");
        bw.write("50-59: " + mais.repeat(contador5059) + "\n");
        bw.write("60-69: " + mais.repeat(contador6069) + "\n");
        bw.write("70-79: " + mais.repeat(contador7079) + "\n");
        bw.write("80-89: " + mais.repeat(contador8089) + "\n");
        bw.write("90-99: " + mais.repeat(contador9099) + "\n");
        bw.write("  100: " + mais.repeat(contador100) + "\n");

        double maiorpreco = 0;
        double menorpreco = 99999;
        double somador = 0;
        double media = 0;
        int contador = 0;
        for (Produto p : lista){
            if (p.getPreco() > maiorpreco){
                maiorpreco = p.getPreco();
            }
            if (p.getPreco() < menorpreco){
                menorpreco = p.getPreco();
            }

            somador += p.getPreco();
            contador++;
            media = somador / contador;
        }
        bw.write("\n");
        bw.write("Menor Preco: " + menorpreco + "\n");
        bw.write("Maior Preco: " + maiorpreco + "\n");
        bw.write("Media dos precos: " + media + "\n");

        bw.write("\n");

        for (Produto p : lista){
            bw.write(p.toString());
            bw.write("\n");
        }

        bw.close();

    }



}

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContadorVogais {
    public static void main(String[] args) throws IOException {
        try {
            Scanner scan = new Scanner(System.in);
            String filePath = scan.next();
            InputStream is = new FileInputStream(filePath);
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            List<String> lista = new ArrayList<String>();
            String linha = br.readLine();
            int contador = 0;
            while (linha != null){
                for (int i = 0; i < linha.length(); i++){
                    char c = linha.charAt(i);
                    if (c == 97 || c == 101 || c == 105 || c == 111 || c == 117) {
                        contador++;
                    }

                }

                lista.add(linha);
                linha = br.readLine();
            }
            br.close();

            for (String l : lista){
                System.out.println(l);
            }

            System.out.println("\n");
            System.out.println("Quantidade de vogais em " + filePath + ": " + contador);
        }catch (FileNotFoundException e){
            System.out.println("Erro! o caminho do arquivo não foi passado como argumento");
            System.out.println("Sintaxe: java -jar ContadorVogais.jar [nome_arquivo]");
        }
    }
}

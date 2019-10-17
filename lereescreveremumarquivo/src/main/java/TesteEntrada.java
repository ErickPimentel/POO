import jdk.internal.util.xml.impl.Input;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class TesteEntrada {
    public static void main (String[] args) throws IOException {
        InputStream is = new FileInputStream("C:\\Users\\Erick Pimentel\\IdeaProjects\\lereescreveremumarquivo" +
                                                        "\\src\\main\\java\\arquivo");
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine();
        while (linha != null){
            System.out.println(linha);
            linha = br.readLine();
        }
        br.close();




    }
}

import java.io.*;

public class TesteEntrada2 {
    public static void main (String[] agrs) throws FileNotFoundException {
        BufferedReader br = new BufferedReader( new InputStreamReader(new FileInputStream("C:\\Users\\Erick Pimentel\\IdeaProjects\\lereescreveremumarquivo" +
                                                                                                    "\\src\\main\\java\\arquivo")));

        try {
            String linha = br.readLine();
            while (linha != null){
                System.out.println(linha);
                linha = br.readLine();
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

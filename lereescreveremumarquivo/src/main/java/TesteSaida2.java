import java.io.*;

public class TesteSaida2 {
    public static void maain (String [] args) throws FileNotFoundException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\Erick Pimentel\\IdeaProjects\\lereescreveremumarquivo\\" +
                                                                                                "src\\main\\java\\saida")));
        try {
            bw.write("Erick");
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

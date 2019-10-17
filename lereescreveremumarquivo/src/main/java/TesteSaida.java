import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.IOException;




public class TesteSaida {
    public static void main(String[] args) throws FileNotFoundException {
        OutputStream os = new FileOutputStream("C:\\Users\\Erick Pimentel\\IdeaProjects\\lereescreveremumarquivo\\" +
                                                "src\\main\\java\\saida");
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);
        try {
            bw.write("Erick");
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

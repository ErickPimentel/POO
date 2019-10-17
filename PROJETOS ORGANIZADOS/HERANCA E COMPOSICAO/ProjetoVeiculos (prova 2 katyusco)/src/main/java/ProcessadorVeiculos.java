import java.io.*;
import java.util.List;

public class ProcessadorVeiculos {
    public void gravarVeiculos(List<Veiculo> lista , String filePath) throws IOException {
        OutputStream os = new FileOutputStream(filePath);
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);

        for (Veiculo v : lista){
            bw.write(v.toString());
            bw.write("\n");
        }
        bw.close();
    }

}

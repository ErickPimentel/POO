import java.io.FileNotFoundException;

public class TesteArquivo2 {
    public static void main(String[] args){

        try {
            new java.io.FileInputStream("arquivo.txt");
        }catch (FileNotFoundException e){
            System.out.println("Erro: "+ e);
            //e.printStackTrace();
        }

    }
}

import java.util.Map;
import java.util.HashMap;

public class Locadora {
    private Map<String,Midia> naLoja = new HashMap<String, Midia>();
    private Map<String,Midia> alugados = new HashMap<String, Midia>();

    public void colocar(Midia midia){
        naLoja.put(midia.getTitulo(), midia);
    }

    public void alugar(Midia midia){
        naLoja.remove(midia.getTitulo());
        alugados.put(midia.getTitulo(), midia);
    }

    public void retorna(Midia midia){
        alugados.remove(midia.getTitulo(), midia);
        naLoja.put(midia.getTitulo(), midia);
    }

    public Map<String,Midia> getnaloja(){
        return naLoja;
    }

    public Map<String,Midia> getalugados(){
        return alugados;
    }
}

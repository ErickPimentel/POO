import java.util.Map;
import java.util.HashMap;

public class Locadora {
    private Map<Integer,Midia> naloja = new HashMap<Integer,Midia>();
    private Map<Integer,Midia> alugados = new HashMap<Integer, Midia>();

    public void colocar(Midia midia){
        naloja.put(midia.getCodigo(), midia);
    }

    public void alugar(Midia midia){
        naloja.remove(midia.getCodigo());
        alugados.put(midia.getCodigo(), midia);
    }

    public void retorna(Midia midia){
        alugados.remove(midia.getCodigo());
        naloja.put(midia.getCodigo(), midia);
    }

    public Map<Integer, Midia> getalugados(){
        return alugados;
    }

    public Map<Integer, Midia> getnaloja(){
        return naloja;
    }
}

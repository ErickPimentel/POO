import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private List<Espectador> espectadores = new ArrayList<Espectador>();

    public void addEspectador(Espectador espectador){
        espectadores.add(espectador);
    }

    public List<Espectador> getEspectadores(){
        return espectadores;
    }
}

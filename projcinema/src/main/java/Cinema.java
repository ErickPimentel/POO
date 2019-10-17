import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private ArrayList<Espectador> espectadores = new ArrayList<Espectador>();

    public void addEspectador(Espectador espectador){
        espectadores.add(espectador);
    }

    public ArrayList<Espectador> getEspectadores(){
        return espectadores;
    }
}

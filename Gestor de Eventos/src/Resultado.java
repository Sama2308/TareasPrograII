import java.util.ArrayList;
import java.util.List;

public class Resultado {
    private Participante ganador;
    private List<Participante> posiciones;

    public Resultado(Participante ganador, List<Participante> posiciones) {
        this.ganador = ganador;
        this.posiciones = new ArrayList<>(posiciones);
    }

    public Participante getGanador() {
        return ganador;
    }

    public List<Participante> getPosiciones() {
        return new ArrayList<>(posiciones);
    }
}

import java.util.ArrayList;
import java.util.List;

public class Participante extends Persona {
    private List<Evento> eventos;

    public Participante(String nombre, String id) {
        super(nombre, id);
        this.eventos = new ArrayList<>();
    }

    public void agregarEvento(Evento evento) {
        if (!eventos.contains(evento)) {
            eventos.add(evento);
        }
    }

    public List<Evento> getEventos() {
        return new ArrayList<>(eventos);
    }
}

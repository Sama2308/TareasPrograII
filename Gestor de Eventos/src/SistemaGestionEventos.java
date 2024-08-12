import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SistemaGestionEventos {
    private Map<String, Evento> eventos;
    private Map<String, Participante> participantes;

    public SistemaGestionEventos() {
        this.eventos = new HashMap<>();
        this.participantes = new HashMap<>();
    }

    // Registrar un nuevo evento
    public void registrarEvento(Evento evento) throws EventoYaExisteException {
        if (eventos.containsKey(evento.getNombre())) {
            throw new EventoYaExisteException("El evento '" + evento.getNombre() + "' ya existe.");
        }
        eventos.put(evento.getNombre(), evento);
    }

    // Registrar un nuevo participante
    public void registrarParticipante(Participante participante) throws ParticipanteYaExisteException {
        if (participantes.containsKey(participante.getId())) {
            throw new ParticipanteYaExisteException("El participante con ID '" + participante.getId() + "' ya existe.");
        }
        participantes.put(participante.getId(), participante);
    }

    // Asignar participantes a un evento
    public void asignarParticipanteAEvento(String nombreEvento, String idParticipante) throws EventoNoEncontradoException, ParticipanteNoEncontradoException {
        Evento evento = eventos.get(nombreEvento);
        if (evento == null) {
            throw new EventoNoEncontradoException("Evento '" + nombreEvento + "' no encontrado.");
        }
        Participante participante = participantes.get(idParticipante);
        if (participante == null) {
            throw new ParticipanteNoEncontradoException("Participante con ID '" + idParticipante + "' no encontrado.");
        }
        evento.agregarParticipante(participante);
        participante.agregarEvento(evento);
    }

    // Registrar resultados de un evento
    public void registrarResultado(String nombreEvento, Resultado resultado) throws EventoNoEncontradoException {
        Evento evento = eventos.get(nombreEvento);
        if (evento == null) {
            throw new EventoNoEncontradoException("Evento '" + nombreEvento + "' no encontrado.");
        }
        evento.setResultado(resultado);
    }

    // Consultar información de un evento
    public Evento obtenerEvento(String nombreEvento) throws EventoNoEncontradoException {
        Evento evento = eventos.get(nombreEvento);
        if (evento == null) {
            throw new EventoNoEncontradoException("Evento '" + nombreEvento + "' no encontrado.");
        }
        return evento;
    }

    // Consultar información de un participante
    public Participante obtenerParticipante(String idParticipante) throws ParticipanteNoEncontradoException {
        Participante participante = participantes.get(idParticipante);
        if (participante == null) {
            throw new ParticipanteNoEncontradoException("Participante con ID '" + idParticipante + "' no encontrado.");
        }
        return participante;
    }

    // Consultar lista de todos los eventos
    public List<Evento> obtenerTodosLosEventos() {
        return new ArrayList<>(eventos.values());
    }
}

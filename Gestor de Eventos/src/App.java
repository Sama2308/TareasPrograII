import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        SistemaGestionEventos sistema = new SistemaGestionEventos();

        try {
            // Registrar eventos
            Evento evento1 = new Evento(
                    "Maratón 10K",
                    "Carrera anual de 10 kilómetros",
                    LocalDate.of(2024, 9, 15),
                    LocalTime.of(8, 0),
                    LocalDate.of(2024, 9, 15),
                    LocalTime.of(12, 0)
            );
            sistema.registrarEvento(evento1);

            Evento evento2 = new Evento(
                    "Concurso de Fotografía",
                    "Concurso abierto de fotografía urbana",
                    LocalDate.of(2024, 10, 1),
                    LocalTime.of(9, 0),
                    LocalDate.of(2024, 10, 15),
                    LocalTime.of(17, 0)
            );
            sistema.registrarEvento(evento2);

            // Registrar participantes
            Participante participante1 = new Participante("Juan Pérez", "P001");
            sistema.registrarParticipante(participante1);

            Participante participante2 = new Participante("María López", "P002");
            sistema.registrarParticipante(participante2);

            Participante participante3 = new Participante("Carlos Ruiz", "P003");
            sistema.registrarParticipante(participante3);

            // Asignar participantes a eventos
            sistema.asignarParticipanteAEvento("Maratón 10K", "P001");
            sistema.asignarParticipanteAEvento("Maratón 10K", "P002");
            sistema.asignarParticipanteAEvento("Concurso de Fotografía", "P003");

            // Registrar resultado para un evento
            Resultado resultado1 = new Resultado(participante1, Arrays.asList(participante1, participante2));
            sistema.registrarResultado("Maratón 10K", resultado1);

            // Consultar información de un evento
            Evento eventoObtenido = sistema.obtenerEvento("Maratón 10K");
            System.out.println("Evento: " + eventoObtenido.getNombre());
            System.out.println("Descripción: " + eventoObtenido.getDescripcion());
            System.out.println("Fecha de Inicio: " + eventoObtenido.getFechaInicio());
            System.out.println("Participantes: " + eventoObtenido.getParticipantes().size());
            System.out.println("Ganador: " + eventoObtenido.getResultado().getGanador().getNombre());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

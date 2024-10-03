import java.util.ArrayList;
import java.util.List;

public class Encuesta {
    private List<Pregunta> preguntas;
    private List<String> respuestas;

    public Encuesta() {
        preguntas = new ArrayList<>();
        respuestas = new ArrayList<>();
    }

    public void agregarPregunta(Pregunta pregunta) {
        preguntas.add(pregunta);
    }

    public Pregunta getSiguientePregunta() {
        if (preguntas.isEmpty()) {
            return null;
        }
        return preguntas.remove(0);
    }

    public void guardarRespuesta(String respuesta) {
        respuestas.add(respuesta);
    }

    public List<String> getRespuestas() {
        return respuestas;
    }
}
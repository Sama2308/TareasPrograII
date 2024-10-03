public class Main {
    public static void main(String[] args) {
        // Crear encuesta y agregar preguntas
        Encuesta encuesta = new Encuesta();
        encuesta.agregarPregunta(new Pregunta("¿Cuál es tu nombre completo?"));
        encuesta.agregarPregunta(new Pregunta("¿Cuántos años tienes?"));
        encuesta.agregarPregunta(new Pregunta("¿Que estudias?"));
        encuesta.agregarPregunta(new Pregunta("¿A que te dedicas?"));
        encuesta.agregarPregunta(new Pregunta("¿Cuál es tu pasatiempo favorito?"));

        // Crear ventana de encuesta
        VentanaEncuesta ventana = new VentanaEncuesta(encuesta);

        // Opcional: crear gestor de base de datos y crear tabla
        // GestorBD gestorBD = new GestorBD("jdbc:mysql://localhost:3306/encuesta", "root", "password");
        // gestorBD.crearTabla();
    }
}
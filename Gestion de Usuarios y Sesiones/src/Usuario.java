public class Usuario {
    private static int contador = 0;
    private int id;
    private String nombre;
    private String correo;

    public Usuario(String nombre, String correo) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        if (!correo.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new IllegalArgumentException("Correo electrónico inválido.");
        }
        this.id = ++contador;
        this.nombre = nombre;
        this.correo = correo;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }
}

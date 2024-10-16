import java.util.ArrayList;
import java.util.List;

public class GestorUsuarios {
    private List<Usuario> usuarios;
    private List<Sesion> sesiones;

    public GestorUsuarios() {
        this.usuarios = new ArrayList<>();
        this.sesiones = new ArrayList<>();
    }

    public void insertarUsuario(String nombre, String correo) {
        Usuario nuevoUsuario = new Usuario(nombre, correo);
        usuarios.add(nuevoUsuario);
        Sesion nuevaSesion = new Sesion(nuevoUsuario.getId());
        sesiones.add(nuevaSesion);
        System.out.println("Usuario y sesión guardados exitosamente.");
    }

    public void mostrarUsuarios() {
        if (usuarios.isEmpty()) {
            System.out.println("No hay usuarios registrados.");
        } else {
            System.out.println("Lista de Usuarios:");
            usuarios.forEach(usuario ->
                    System.out.println("ID: " + usuario.getId() + ", Nombre: " + usuario.getNombre() + ", Correo: " + usuario.getCorreo()));
        }
    }

    public void mostrarSesiones() {
        if (sesiones.isEmpty()) {
            System.out.println("No hay sesiones registradas.");
        } else {
            System.out.println("Lista de Sesiones:");
            sesiones.forEach(sesion ->
                    System.out.println("ID de Sesión: " + sesion.getIdSesion() + ", ID de Usuario: " + sesion.getIdUsuario() + ", Fecha de Inicio: " + sesion.getFechaInicio()));
        }
    }
}

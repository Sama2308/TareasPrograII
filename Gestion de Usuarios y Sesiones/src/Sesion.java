import java.util.Date;

public class Sesion {
    private static int contador = 0;
    private int idSesion;
    private int idUsuario;
    private Date fechaInicio;

    public Sesion(int idUsuario) {
        this.idSesion = ++contador;
        this.idUsuario = idUsuario;
        this.fechaInicio = new Date();  // Fecha y hora actuales
    }

    public int getIdSesion() {
        return idSesion;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }
}

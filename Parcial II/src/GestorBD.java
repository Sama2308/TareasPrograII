import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GestorBD {
    private Connection conexion;

    public GestorBD(String url, String usuario, String password) {
        try {
            conexion = DriverManager.getConnection(url, usuario, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void crearTabla() {
        // Sentencia de creación de tabla
        String crearTablaSQL = "CREATE TABLE IF NOT EXISTS respuestas_encuesta (id INT PRIMARY KEY, respuesta VARCHAR(255))";
        try (PreparedStatement pstmt = conexion.prepareStatement(crearTablaSQL)) {
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void insertarRespuesta(String respuesta) {
        // Sentencia de inserción de respuesta
        String insertSQL = "INSERT INTO respuestas_encuesta (respuesta) VALUES (?)";
        try (PreparedStatement pstmt = conexion.prepareStatement(insertSQL)) {
            pstmt.setString(1, respuesta);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
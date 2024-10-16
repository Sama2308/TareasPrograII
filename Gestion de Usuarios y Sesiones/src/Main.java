import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GestorUsuarios gestorUsuarios = new GestorUsuarios();

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = leerOpcion();
            ejecutarOpcion(opcion);
        } while (opcion != 4);
    }

    private static void mostrarMenu() {
        System.out.println("Menú:");
        System.out.println("1. Insertar Usuario y Sesión");
        System.out.println("2. Mostrar Usuarios");
        System.out.println("3. Mostrar Sesiones");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static int leerOpcion() {
        int opcion = -1;
        try {
            opcion = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Entrada no válida. Por favor, ingrese un número.");
        } finally {
            scanner.nextLine();  // Limpiar el buffer
        }
        return opcion;
    }

    private static void ejecutarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                insertarUsuario();
                break;
            case 2:
                gestorUsuarios.mostrarUsuarios();
                break;
            case 3:
                gestorUsuarios.mostrarSesiones();
                break;
            case 4:
                salir();
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    private static void insertarUsuario() {
        System.out.print("Ingrese el nombre del usuario: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el correo electrónico del usuario: ");
        String correo = scanner.nextLine();
        gestorUsuarios.insertarUsuario(nombre, correo);
    }

    private static void salir() {
        System.out.println("Saliendo de la aplicación...");
        scanner.close();
    }
}

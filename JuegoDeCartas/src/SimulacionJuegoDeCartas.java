import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimulacionJuegoDeCartas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de jugadores (mínimo 2): ");
        int numeroDeJugadores = scanner.nextInt();

        while (numeroDeJugadores < 2) {
            System.out.print("Número de jugadores no válido. Ingrese al menos 2 jugadores: ");
            numeroDeJugadores = scanner.nextInt();
        }

        System.out.print("Ingrese el número de rondas: ");
        int rondas = scanner.nextInt();

        List<Jugador> jugadores = new ArrayList<>();
        for (int i = 1; i <= numeroDeJugadores; i++) {
            jugadores.add(new Jugador("Jugador " + i));
        }

        System.out.println("Seleccione el tipo de juego:");
        System.out.println("1. Poker");
        System.out.println("2. Blackjack");
        int seleccionJuego = scanner.nextInt();

        TipoDeJuego tipoDeJuego;
        switch (seleccionJuego) {
            case 1:
                tipoDeJuego = new Poker();
                break;
            case 2:
                tipoDeJuego = new Blackjack();
                break;
            default:
                System.out.println("Selección no válida. Se jugará Póker por defecto.");
                tipoDeJuego = new Poker();
                break;
        }

        JuegoDeCartas juego = new JuegoDeCartas(jugadores, rondas, tipoDeJuego);
        juego.jugar();
    }
}

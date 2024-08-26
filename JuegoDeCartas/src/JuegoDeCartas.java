import java.util.List;

class JuegoDeCartas {
    private Baraja baraja;
    private List<Jugador> jugadores;
    private int rondas;
    private TipoDeJuego tipoDeJuego;

    public JuegoDeCartas(List<Jugador> jugadores, int rondas, TipoDeJuego tipoDeJuego) {
        this.baraja = new Baraja();
        this.jugadores = jugadores;
        this.rondas = rondas;
        this.tipoDeJuego = tipoDeJuego;
    }

    public void jugar() {
        for (int i = 1; i <= rondas; i++) {
            System.out.println("\n--- Ronda " + i + " ---");
            jugarRonda();
        }

        mostrarGanadorFinal();
    }

    private void jugarRonda() {
        tipoDeJuego.repartirCartas(jugadores, baraja);

        for (Jugador jugador : jugadores) {
            tipoDeJuego.mostrarCartasDeJugador(jugador);
        }

        Jugador ganador = tipoDeJuego.determinarGanador(jugadores);

        if (ganador != null) {
            ganador.ganarPunto();
            System.out.println(ganador.getNombre() + " gana la ronda.");
        } else {
            System.out.println("Empate en esta ronda, nadie gana punto.");
        }
    }

    private void mostrarGanadorFinal() {
        Jugador ganadorFinal = null;
        int puntajeMaximo = -1;
        boolean empate = false;

        System.out.println("\nPuntaje final:");

        for (Jugador jugador : jugadores) {
            System.out.println(jugador.getNombre() + ": " + jugador.getPuntaje() + " puntos");
            if (jugador.getPuntaje() > puntajeMaximo) {
                puntajeMaximo = jugador.getPuntaje();
                ganadorFinal = jugador;
                empate = false;
            } else if (jugador.getPuntaje() == puntajeMaximo) {
                empate = true;
            }
        }

        if (!empate && ganadorFinal != null) {
            System.out.println("\nEl ganador del juego es " + ganadorFinal.getNombre() + " con " + puntajeMaximo + " puntos.");
        } else {
            System.out.println("\nEmpate en el juego, no hay un ganador claro.");
        }
    }
}

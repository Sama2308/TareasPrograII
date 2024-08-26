import java.util.List;


class Poker implements TipoDeJuego {

    @Override
    public void repartirCartas(List<Jugador> jugadores, Baraja baraja) {
        for (Jugador jugador : jugadores) {
            jugador.limpiarMano();
            for (int i = 0; i < 5; i++) {
                jugador.agregarCarta(baraja.repartirCarta());
            }
        }
    }

    @Override
    public Jugador determinarGanador(List<Jugador> jugadores) {
        Jugador ganador = null;
        int valorMaximo = -1;
        boolean empate = false;

        for (Jugador jugador : jugadores) {
            int valorMano = calcularValorMano(jugador.getMano());
            if (valorMano > valorMaximo) {
                valorMaximo = valorMano;
                ganador = jugador;
                empate = false;
            } else if (valorMano == valorMaximo) {
                empate = true;
            }
        }

        return empate ? null : ganador;
    }

    private int calcularValorMano(List<Carta> mano) {
        // Lógica para calcular el valor de una mano en póker (simplificación)
        return mano.stream().mapToInt(Carta::getValor).sum();
    }

    @Override
    public void mostrarCartasDeJugador(Jugador jugador) {
        System.out.println(jugador.getNombre() + " tiene las siguientes cartas: " + jugador.getMano());
    }
}

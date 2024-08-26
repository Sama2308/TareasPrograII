import java.util.List;

class Blackjack implements TipoDeJuego {

    @Override
    public void repartirCartas(List<Jugador> jugadores, Baraja baraja) {
        for (Jugador jugador : jugadores) {
            jugador.limpiarMano();
            for (int i = 0; i < 2; i++) {
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
            if (valorMano > valorMaximo && valorMano <= 21) {
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
        int valor = mano.stream().mapToInt(Carta::getValor).sum();
        long ases = mano.stream().filter(carta -> carta.getValor() == 1).count();

        while (valor <= 11 && ases > 0) {
            valor += 10; // Considerar As como 11 si no se pasa de 21
            ases--;
        }

        return valor;
    }

    @Override
    public void mostrarCartasDeJugador(Jugador jugador) {
        System.out.println(jugador.getNombre() + " tiene las siguientes cartas: " + jugador.getMano());
    }
}

import java.util.List;

interface TipoDeJuego {
    void repartirCartas(List<Jugador> jugadores, Baraja baraja);
    Jugador determinarGanador(List<Jugador> jugadores);
    void mostrarCartasDeJugador(Jugador jugador);
}

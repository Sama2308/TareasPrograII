import java.util.ArrayList;
import java.util.List;

class Jugador {
    private String nombre;
    private List<Carta> mano;
    private int puntaje;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.mano = new ArrayList<>();
        this.puntaje = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Carta> getMano() {
        return mano;
    }

    public void agregarCarta(Carta carta) {
        mano.add(carta);
    }

    public void limpiarMano() {
        mano.clear();
    }

    public void ganarPunto() {
        puntaje++;
    }

    public int getPuntaje() {
        return puntaje;
    }

    @Override
    public String toString() {
        return nombre + " tiene " + mano;
    }
}

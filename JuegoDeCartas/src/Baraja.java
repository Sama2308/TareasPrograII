import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Baraja {
    private List<Carta> cartas;

    public Baraja() {
        this.cartas = new ArrayList<>();
        crearBaraja();
        barajar();
    }

    private void crearBaraja() {
        String[] palos = {"Corazones", "Diamantes", "Tréboles", "Picas"};
        for (String palo : palos) {
            for (int valor = 1; valor <= 13; valor++) {
                cartas.add(new Carta(palo, valor));
            }
        }
    }

    public void barajar() {
        Collections.shuffle(cartas);
    }

    public Carta repartirCarta() {
        return cartas.isEmpty() ? null : cartas.remove(0);
    }

    public boolean hayCartasSuficientes(int cantidad) {
        return cartas.size() >= cantidad;
    }
}

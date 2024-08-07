public class Perro extends Animal implements Alimentable {
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra");
    }

    @Override
    public void comer() {
        System.out.println("El perro está comiendo");
    }

    @Override
    public void beber() {
        System.out.println("El perro está bebiendo");
    }

    public void hacerTruco() {
        System.out.println("El perro está haciendo un truco");
    }

    public void hacerTruco(String truco) {
        System.out.println("El perro está haciendo el truco " + truco);
    }
}
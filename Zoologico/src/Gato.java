public class Gato extends Animal implements Alimentable {
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El gato maúlla");
    }

    @Override
    public void comer() {
        System.out.println("El gato está comiendo");
    }

    @Override
    public void beber() {
        System.out.println("El gato está bebiendo");
    }
}
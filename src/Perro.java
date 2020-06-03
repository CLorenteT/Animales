import java.util.Scanner;

public class Perro extends Animal {
    private String nombreDueño;
    public Perro(String nombre, String tipo, int numPatas, int numAlas, String alimentacion, String nombreDueño) {
        super(nombre, tipo, numPatas, numAlas, alimentacion);
        this.nombreDueño = nombreDueño;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombre() + "\n" + "Tipo: " + getTipo() + "\n" + "Número de patas: " + getNumPatas() + "\n" + "Número de alas: " + getNumAlas() + "\n" + "Alimentación: " + getAlimentacion() + "\n" + "Nombre del dueño: " + nombreDueño + "\n");
    }

    public void ladrar() {
        System.out.println("Guau Guau!");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Perro p = new Perro("Chihuahua", "Mamífero", 4, 0, "Carnívora", "Jero");
        p.mostrarDatos();

        System.out.println("El " + p.getNombre() + " tiene hambre? ");

        if (s.next().equals("si")) {
            p.ladrar();
            System.out.println("El " + p.getNombre() + " está comiendo");
            p.comer();
            p.ladrar();
        } else {
            System.out.println("El " + p.getNombre() + " no tiene hambre, va a dormir");
            p.dormir();
        }
    }

}

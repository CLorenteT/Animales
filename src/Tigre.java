import java.util.Scanner;

public class Tigre extends Animal {
    private String habitat;

    public Tigre(String nombre, String tipo, int numPatas, int numAlas, String alimentacion, String habitat) {
        super(nombre, tipo, numPatas, numAlas, alimentacion);
        this.habitat = habitat;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombre() + "\n" + "Tipo: " + getTipo() + "\n" + "Número de patas: " + getNumPatas() + "\n" + "Número de alas: " + getNumAlas() + "\n" + "Alimentación: " + getAlimentacion() + "\n" + "Hábitat: " + habitat + "\n");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Tigre t = new Tigre("Tigre de Bengala", "Mamífero", 4, 0, "Carnívora", "Sabana");
        t.mostrarDatos();

        System.out.println("El " + t.getNombre() + " tiene hambre? ");

        if (s.next().equals("si")) {
            t.cazar();
            System.out.println("El " + t.getNombre() + " está comiendo");
            t.comer();
        } else {
            System.out.println("El " + t.getNombre() + " no tiene hambre, va a dormir");
            t.dormir();
        }

    }
}

public class Animal {
    private String nombre;
    private String tipo;
    private int numPatas;
    private int numAlas;
    private String alimentacion;

    public Animal(String nombre, String tipo, int numPatas, int numAlas, String alimentacion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.numPatas = numPatas;
        this.numAlas = numAlas;
        this.alimentacion = alimentacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumPatas() {
        return numPatas;
    }

    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }

    public int getNumAlas() {
        return numAlas;
    }

    public void setNumAlas(int numAlas) {
        this.numAlas = numAlas;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public void comer() {
        System.out.println("Ñam ñam!");
    }

    public void cazar() {
        System.out.println(nombre + " está cazando");
    }

    public void dormir() {
        System.out.println("Zzz...");
    }
}

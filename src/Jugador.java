public class Jugador {
    private static int contadorID = 0; // Contador estático para generar IDs únicos
    private int id;
    private String nombre;
    private int edad;
    private String posicion;

    // Constructor
    public Jugador(String nombre, int edad, String posicion) {
        this.id = ++contadorID; // Generar ID automáticamente
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getPosicion() {
        return posicion;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Edad: " + edad + ", Posición: " + posicion;
    }
}

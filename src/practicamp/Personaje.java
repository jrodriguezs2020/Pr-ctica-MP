
package practicamp;

public class Personaje {
    private String nombre;
    private int cantidadOro;
    private int salud;
    private int poder;

    public Personaje(String nombre, int cantidadOro, int salud, int poder) { //Constructor
        this.nombre = nombre;
        this.cantidadOro = cantidadOro;
        this.salud = salud;
        this.poder = poder;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadOro() {
        return cantidadOro;
    }

    public void setCantidadOro(int cantidadOro) {
        this.cantidadOro = cantidadOro;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }
}

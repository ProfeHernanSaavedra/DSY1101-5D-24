

/**
 *
 * @author Profe Hernán
 * @version 04-09-2024
 */
public class Pelicula {
    
    private String genero,nombre;
    private double duracion;
    private int año;
    private Director direccion;

    public Pelicula() {
    }

    public Pelicula(String genero, String nombre, double duracion, int año, Director direccion) {
        this.genero = genero;
        this.nombre = nombre;
        this.duracion = duracion;
        this.año = año;
        this.direccion = direccion;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Director getDireccion() {
        return direccion;
    }

    public void setDireccion(Director direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "genero=" + genero + ", nombre=" + nombre + ", duracion=" + duracion + ", a\u00f1o=" + año + ", direccion=" + direccion + '}';
    }
    
    
    
}

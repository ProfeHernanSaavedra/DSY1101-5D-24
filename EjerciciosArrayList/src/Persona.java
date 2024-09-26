
import java.time.LocalDate;

/**
 *
 * @author USRVI-LC2
 */
public class Persona {
    
    private String nombre;
    private LocalDate fechaNac;
    private char genero;

    public Persona() {
    }

    public Persona(String nombre, LocalDate fechaNac, char genero) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", fechaNac=" + fechaNac + ", genero=" + genero + '}';
    }
    
    
    
}

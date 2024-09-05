
import java.time.LocalDate;

/**
 *
 * @author USRVI-LC2
 */
public class Docente {
    
    private String rut,nombre,sede;
    private int nroDocente;
    private LocalDate fechaIngreso;

    public Docente() {
    }

    public Docente(String rut, String nombre, String sede, int nroDocente, LocalDate fechaIngreso) {
        this.rut = rut;
        this.nombre = nombre;
        this.sede = sede;
        this.nroDocente = nroDocente;
        this.fechaIngreso = fechaIngreso;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public int getNroDocente() {
        return nroDocente;
    }

    public void setNroDocente(int nroDocente) {
        this.nroDocente = nroDocente;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "Docente{" + "rut=" + rut + ", nombre=" + nombre + ", sede=" + sede + ", nroDocente=" + nroDocente + ", fechaIngreso=" + fechaIngreso + '}';
    }
    
    
    
}

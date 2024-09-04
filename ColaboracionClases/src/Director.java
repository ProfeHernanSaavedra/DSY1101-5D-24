
import java.util.Date;

/**
 *
 * @author Profe Hernán
 * @version 04-09-2024
 */
public class Director {
    
    private String nombre,profesion;
    private Date fechaNacimiento;
    private int añosCarrera;
    private char sexo;

    public Director() {
    }

    public Director(String nombre, String profesion, Date fechaNacimiento, int añosCarrera, char sexo) {
        this.nombre = nombre;
        this.profesion = profesion;
        this.fechaNacimiento = fechaNacimiento;
        this.añosCarrera = añosCarrera;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getAñosCarrera() {
        return añosCarrera;
    }

    public void setAñosCarrera(int añosCarrera) {
        this.añosCarrera = añosCarrera;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Director{" + "nombre=" + nombre + ", profesion=" + profesion + ", fechaNacimiento=" + fechaNacimiento + ", a\u00f1osCarrera=" + añosCarrera + ", sexo=" + sexo + '}';
    }
    
    
    
    
    
}

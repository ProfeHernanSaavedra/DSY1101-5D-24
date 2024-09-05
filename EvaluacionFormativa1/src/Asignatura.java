
/**
 *
 * @author USRVI-LC2
 */
public class Asignatura {
    
    private int codidoAsignatura;
    private double nota1,nota2,nota3;
    private String nombreAsignatura;
    private Docente docente;
    private Alumno alumno;

    public Asignatura() {
    }

    public Asignatura(int codidoAsignatura, double nota1, double nota2, double nota3, String nombreAsignatura, Docente docente, Alumno alumno) {
        this.codidoAsignatura = codidoAsignatura;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nombreAsignatura = nombreAsignatura;
        this.docente = docente;
        this.alumno = alumno;
    }

    public int getCodidoAsignatura() {
        return codidoAsignatura;
    }

    public void setCodidoAsignatura(int codidoAsignatura) {
        this.codidoAsignatura = codidoAsignatura;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "codidoAsignatura=" + codidoAsignatura + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + ", nombreAsignatura=" + nombreAsignatura + ", docente=" + docente + ", alumno=" + alumno + '}';
    }
    
    
    public void calculoPromedio()
    {
        double notaFinal = (this.getNota1() + this.getNota2()+this.getNota3())/3;
        System.out.println("Su nota final es: " + notaFinal);
    }
    
     public double calculoPromedio2()
    {
        double notaFinal = (this.getNota1() + this.getNota2()+this.getNota3())/3;
        return notaFinal;
    }
    
}

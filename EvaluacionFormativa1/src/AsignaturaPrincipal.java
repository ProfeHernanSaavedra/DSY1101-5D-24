
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Scanner;

/**
 *
 * @author USRVI-LC2
 */
public class AsignaturaPrincipal {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int año;
        int mes;
        int dia;
        String nombre;
        String rut;
        
        System.out.println("Ingrese Rut:");
        rut = leer.next();
        System.out.println("Ingrese Nombre: ");
        nombre = leer.next();
        System.out.println("Ingrese su fecha de nacimiento");
        System.out.println("dia:");
        dia = leer.nextInt();
        System.out.println("mes: ");
        mes = leer.nextInt();
        System.out.println("año: ");
        año = leer.nextInt();
        
        //fecha Nacimiento
        LocalDate fechaNacimiento = LocalDate.of(año, mes, dia);
        
        //fecha actual
        LocalDate fechaActual = LocalDate.now();
        
        //calculo edad
        Period periodo = Period.between(fechaNacimiento, fechaActual);
        //System.out.println(periodo);
        int edad = periodo.getYears();
        System.out.println("su edad es: "+ edad + " años");
        
        
        Alumno alu1 = new Alumno(rut, nombre, edad,fechaNacimiento);
        
        
        int añoIngresoDoc,nroDocente;
        int mesIngresoDoc;
        int diaIngresoDoc;
        String nombreDocente;
        String rutDocente;
        String sedeDocente;
        System.out.println("");
        System.out.println("----DATOS DOCENTE-----");
        System.out.println("Ingrese Rut:");
        rutDocente = leer.next();
        System.out.println("Ingrese Nombre: ");
        nombreDocente = leer.next();
        System.out.println("Ingrese Nro Docente: ");
        nroDocente = leer.nextInt();
        System.out.println("Ingrese Sede Docente: ");
        sedeDocente = leer.next();
        System.out.println("Ingrese su fecha de Ingreso");
        System.out.println("dia:");
        diaIngresoDoc = leer.nextInt();
        System.out.println("mes: ");
        mesIngresoDoc = leer.nextInt();
        System.out.println("año: ");
        añoIngresoDoc = leer.nextInt();
        
        LocalDate fechaIngreso = LocalDate.of(añoIngresoDoc, mesIngresoDoc, diaIngresoDoc);
        
        Docente doce1 = new Docente(rutDocente, nombreDocente, sedeDocente, nroDocente, fechaIngreso);
        
        System.out.println("");
        System.out.println("----DATOS ASIGNATURA-----");
        System.out.println("Ingrese codigo asignatura");
        int codigo = leer.nextInt();
        System.out.println("Ingrese Nombre de asignatura");
        String nombreAsg = leer.next();
        System.out.println("Ingrese nota 1:");
        double nota1 = leer.nextDouble();
        System.out.println("Ingrese nota 2:");
        double nota2 = leer.nextDouble();
        System.out.println("Ingrese nota 3:");
        double nota3 = leer.nextDouble();
        
        
        Asignatura asig = new Asignatura(codigo, nota1, nota2, nota3, nombreAsg, doce1, alu1);
        
        asig.calculoPromedio();
        
        System.out.println(asig.toString());
        
    }
    
}

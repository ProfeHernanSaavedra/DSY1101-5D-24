
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author USRVI-LC2
 */
public class Principal {
    
    public static void main(String[] args) {
        
        
        int [] numeros;
        numeros = new int[3];
        
        numeros[0] = 3;
        numeros[1] = 12;
        numeros[2] = 44;
        
        System.out.println(numeros[2]);
        System.out.println("***********************");
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        System.out.println("**************");
        args = new String[3];
        
        args[1] = "Maria";
        args[2] = "Juan";
        
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        System.out.println("*****************");
        for (String elemento : args) {
            System.out.println(elemento);
        }
        System.out.println("AHORA CON ARRAYLIST");
        //fore + tab
        Persona per1 = new Persona("Valeska", LocalDate.of(2000, 9, 12), 'f');
        Persona per2 = new Persona("Ignacio", LocalDate.of(1999, 10, 10), 'm');
        
        //declarar una lista
        //List<Persona> listaPersonas = new ArrayList<>();
        ArrayList<Persona> listaPersonas = new ArrayList<>();
        
        listaPersonas.add(per1);
        listaPersonas.add(per2);
        
        for (Persona per : listaPersonas) {
            System.out.println(per.getNombre());
        }
        
    }
        
        
        
        
    }
    
    
    


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Profe Hernán
 * @version 29-08-2024
 */
public class PersonaPpal {
    
    //main + tab
    //psvm + tab
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int opcion,edad;
        boolean valido = false;
        Persona per = new Persona();
        Validaciones val = new Validaciones();
        
//        Persona per1 = new Persona("maria", "Valpo",20,'f');
//        Validaciones val = new Validaciones();
//        //if (val.validarEdad(per1.getEdad())== true) es lo mismo que abajo
//        if (val.validarEdad(per1.getEdad()))
//        {
//            System.out.println(per1.toString());
//            per1.clasificacionEdad();
//        }
//        
        do {            
            System.out.println("1. Ingrese Datos:");
            System.out.println("2. Ver datos:");
            System.out.println("3. Salir:");
            opcion = leer.nextInt();
            
            if (opcion == 1) {
                System.out.println("Ingrese Nombre:");
                String nombre = leer.next();
                per.setNombre(nombre);
                
                System.out.println("Ingrese Direccion:");
                String direccion = leer.next();
                per.setDireccion(direccion);
                
                System.out.println("Ingrese Edad:");
                edad = leer.nextInt();
                do
                {
                    if (val.validarEdad(edad)== false) {
                         System.out.println("Ingrese Edad:");
                         edad = leer.nextInt();
                    }
                    else{
                        per.setEdad(edad);
                        break;
                    }
                    
                    
                }while (val.validarEdad(edad) == false);
                
                
                
                System.out.println("Ingrese Género (m/f):");
                char genero = leer.next().charAt(0);
                per.setGenero(genero);
                
            }
            else{
                if (opcion == 2){
                    //System.out.println(per.toString()); es lo mismo de abajo
                    System.out.println(per);
                }
            }
            
            
        } while (opcion != 3);
    
        

    }
    
}

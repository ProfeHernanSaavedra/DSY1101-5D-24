/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Profe Hernán
 * @version 29-08-2024
 * 
 */
public class Validaciones {
    
      public boolean  validarEdad(int edad)
    {
         if( edad > 0 )
        {
            System.out.println("Edad válida");
            return true;
        }
        else{
            System.out.println("la edad debe ser mayor a cero");
            return false;
            
        }
    }
    
}

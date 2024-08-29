/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Profe Hernán
 * @version 29-08-2024
 */
public class Persona {
    
    private String nombre,direccion;
    private int edad  = 0;
    private char genero;
    

    public Persona() {
        
        nombre = "juan";
    }

    public Persona(String nombre, String direccion, int edad, char genero) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
        this.genero = genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        
//        if( edad > 0 )
//        {
//            this.edad = edad;
//        }
//        else{
//            System.out.println("la edad debe ser mayor a cero");
//            this.edad = 0;
//        }
        this.edad = edad;
        
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Persona{Nombre=" + nombre + "vive en la Direccion=" + direccion + ", y tiene " + edad + " años}, Genero=" + genero + '}';
    }
    
    public void clasificacionEdad()
    {
        if (this.getEdad() >= 18) 
        {
            System.out.println("Ud es mayor de edad");
            
        } 
        else 
        {
            if (this.getEdad()>=12 && this.getEdad() <= 17) {
                System.out.println("UD es un adolescente");
                
            }
            else{
                if (this.getEdad() < 12)
                {
                    System.out.println("Ud es un bebe");
                }
            }
            
        }
    }
   
  
    
   
    
    
}

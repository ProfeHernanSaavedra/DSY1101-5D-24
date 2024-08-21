/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Profe Hernán
 * @version 21-08-2024
 */
public class Pizza {
    
    //atributos
    public String nombre;
    //private int edad;
    private String tamaño;
    private String masa;
    
    
    //metodos
    
    public void calentar()
    {
        System.out.println("Calentando");
    }
    
    public void preparar()
    {
        //sout + tab
        System.out.println("Preparando");
    }
    
//    public int saludo()
//    {
//       return 1; 
//    }
    
    //main + tab
    public static void main(String[] args) {
        
        Pizza pizza1 = new Pizza();
        pizza1.nombre = "Peperoni";
        pizza1.tamaño = "Mediana";
        pizza1.masa = "delgada";
        
        System.out.println("Pizza: " + pizza1.nombre + " de tamaño: " + pizza1.tamaño);
        System.out.println("Pizza: " + pizza1.nombre + " con masa: " + pizza1.masa);
        
        System.out.println("");
        
        Pizza pizza2 = new Pizza();
        pizza2.nombre = "Vegetariana";
        pizza2.tamaño = "Familiar";
        pizza2.masa = "borde queso";
        
        System.out.println("Pizza: " + pizza2.nombre + " de tamaño: " + pizza2.tamaño);
        System.out.println("Pizza: " + pizza2.nombre + " con masa: " + pizza2.masa);
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USRVI-LC2
 */
public class PizzaPpal {
    
    //main + tab
    public static void main(String[] args) {
        
        Pizza pizza1 = new Pizza(); //construccion del objeto pizza1
        
        
        pizza1.setNombre("Peperoni");//pizza1.nombre = "Peperoni"; 
        pizza1.setTamaño("Mediana");//pizza1.tamaño = "Mediana";
        pizza1.setMasa("delgada");//pizza1.masa = "delgada";
        
        System.out.println("Pizza: " + pizza1.getNombre() + " de tamaño: " + pizza1.getTamaño());
        System.out.println("Pizza: " + pizza1.getNombre() + " con masa: " + pizza1.getMasa());
        
        System.out.println(""); //linea en blanco
        
        Pizza pizza2 = new Pizza();//construccion del objeto pizza2
        pizza2.setNombre("Vegetariana");//pizza2.nombre = "Vegetariana";
        pizza2.setTamaño("Famliar");//pizza2.tamaño = "Familiar";
        pizza2.setMasa("Borde queso");//pizza2.masa = "borde queso";
        
        System.out.println("Pizza: " + pizza2.getNombre() + " de tamaño: " + pizza2.getTamaño());
        System.out.println("Pizza: " + pizza2.getNombre() + " con masa: " + pizza2.getMasa());
        
        pizza1.preparar();
        pizza1.calentar();
        System.out.println("");
        pizza2.preparar();
        pizza2.calentar();
        
        Pizza pizza3 = new Pizza("Hawaiana", "Mediana", "Gruesa");
        pizza3.preparar();
        pizza3.calentar();
        
        
        
    }
    
}

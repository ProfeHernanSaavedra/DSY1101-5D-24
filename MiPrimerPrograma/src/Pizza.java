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
    private String nombre;
    //private int edad;
    private String tamaño;
    private String masa;
    
    //metodos constructores
    //constructor sin parametros

    public Pizza() {
    }

    public Pizza(String nombre, String tamaño, String masa) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.masa = masa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    //metodos customer o personalizables
    
    public void calentar()
    {
        System.out.println("Calentando Pizza " + nombre );
    }
    
    public void preparar()
    {
        //sout + tab
        System.out.println("Preparando Pizza " + nombre);
    }
    
    public int saludo()
    {
       return 1; 
    }
    
    
    
}

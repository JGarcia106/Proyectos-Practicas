/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2025.quinta.clase;

import javax.swing.JOptionPane;

/**
 *
 * @author Joel
 */
class Estudiante {
   // atributos
    public String id;
    private String nombre;
    public Carrera carrera;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
    public void analizaNombre(){
        if (nombre.compareTo("juan")==0){
            JOptionPane.showMessageDialog(null, "El nombre si es aceptado  " + this.nombre);
        
        }else{
            JOptionPane.showMessageDialog(null, "ERRROOOORRRR BOORRAR TODOO");
        
        }
        
    }
            
            
     /**
     * 
     */
    public void metodo1(){
        System.out.println("HOLA ESTOY EN CONSOLA");
    }
    
    
    /**
     * Esto es un metodo de prueba 
     * @return siempre retorna 0
     */
    public int metodo2(){
        System.out.println("HOLA ESTOY EN CONSOLA y soy el metodo 2");
        return 0;
    }
    
    /**
     * Es un metodo igual al anterior pero recibe parametros
     * @param param1 recibe un valor booleano
     * @return devuelve 1 si true o 0 si false
     */
    public int metodo2(boolean param1){
        System.out.println("HOLA ESTOY EN CONSOLA y soy el metodo 2 "+ param1);
        if (param1){
            return 1;
        }
        return 0;
        
    }
    
    
    
    
    
}
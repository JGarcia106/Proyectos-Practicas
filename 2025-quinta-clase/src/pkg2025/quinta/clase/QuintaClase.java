/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2025.quinta.clase;

import javax.swing.JOptionPane;

/**
 *
 * @author Joel
 */
public class QuintaClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Estudiante juan = new Estudiante();
        //juan.nombre // no existe pq esta privado utilizo el seter para asignar valor
        juan.setNombre("juan");
        
        Estudiante carlos = new Estudiante();
        carlos.setNombre("carlos");
        juan.id="20";
        
        JOptionPane.showMessageDialog(null, juan);
        JOptionPane.showMessageDialog(null, juan.id);

        JOptionPane.showMessageDialog(null, carlos.id);
        
        Carrera administracion= new Carrera();
        administracion.nombreCarrera="Administración";
        Universidad fidelitas = new Universidad();
        fidelitas.nombreUniversad="fidelitas";
        administracion.universidad=fidelitas;
        juan.carrera= administracion;
        Carrera enfermeria = new Carrera();
        carlos.carrera=enfermeria;
        
        
        JOptionPane.showMessageDialog(null, juan.carrera.nombreCarrera);
        JOptionPane.showMessageDialog(null, juan.carrera.universidad.nombreUniversad);
        metodo1();
        metodo2();
        metodo2(true);
        metodo2(false);
        
       juan.analizaNombre();
       carlos.analizaNombre();
       
       Soda lapul = new Soda();
       System.out.println("la data es "+ lapul.calculoIngreso("Configurador"));  
       System.out.println("la data es "+ lapul.calculoIngreso("Admin"));  
               
    }
    
    /**
     * 
     */
    public static void metodo1(){
        System.out.println("HOLA ESTOY EN CONSOLA");
    }
    
    
    /**
     * Esto es un metodo de prueba 
     * @return siempre retorna 0
     */
    public static int metodo2(){
        System.out.println("HOLA ESTOY EN CONSOLA y soy el metodo 2");
        return 0;
    }
    
    /**
     * Es un metodo igual al anterior pero recibe parametros
     * @param param1 recibe un valor booleano
     * @return devuelve 1 si true o 0 si false
     */
    public static int metodo2(boolean param1){
        System.out.println("HOLA ESTOY EN CONSOLA y soy el metodo 2 "+ param1);
        metodo3();
        
        if (param1){
            return 1;
        }
        return 0;
        
    }
    
    
    public static Universidad metodo3(){
        Universidad nueva = new Universidad();
        return nueva;
    }
    
    
}
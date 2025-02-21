/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaclase15enero;

import javax.swing.JOptionPane;

/**
 *
 * @author Joel
 */
public class Practicaclase15enero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 5;
        int b = 10;
        int c = 15;      
        int d = 20;
        int suma = a + b + c + d;
        int promedio = suma/4;
        JOptionPane.showMessageDialog(null,"El resultado de la suma es: "+suma);
        JOptionPane.showMessageDialog(null,"El resultado del promedio es: "+promedio);
        
        String nombre;
        nombre = JOptionPane.showInputDialog("Escriba su nombre: ");
        JOptionPane.showMessageDialog(null,"Hola "+nombre+" ,Bienvenida a este programa desarollado en Java con Netbeans");
    }
    
}
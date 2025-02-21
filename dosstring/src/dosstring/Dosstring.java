/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dosstring;

import javax.swing.JOptionPane;

/**
 *
 * @author Joel
 */
public class Dosstring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String saludo = "Hola, "; // Primer String
        String nombre = "Mundo"; // Segundo String
        String mensaje = saludo + nombre; // Conecto los Strings
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
}

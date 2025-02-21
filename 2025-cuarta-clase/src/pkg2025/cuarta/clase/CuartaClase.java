/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2025.cuarta.clase;

import javax.swing.JOptionPane;

/**
 *
 * @author Joel
 */
public class CuartaClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean salida=true;
        do {            
            JOptionPane.showMessageDialog(null, "Valor de la variable salida: " + salida);
            for (int i = 0; i < 3; i++) {
                JOptionPane.showMessageDialog(null, "Valor de la variable i: " + i);
                if (i==2){
                    salida=false;
                }
            }
        } while (salida);
    }
    
}

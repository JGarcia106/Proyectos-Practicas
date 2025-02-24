/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2025.sexta.clase;

import javax.swing.JOptionPane;

/**
 *
 * @author Joel
 */
public class SextaClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(Usuario.company);
        Cita nuevaCita = new Cita();
        nuevaCita.crearCita1();

        Usuario uno = new Usuario();

        System.out.println(uno.toString());
        System.out.println(uno);
        Usuario dos = new Usuario("PEDRO", "1234", "chavo@hotmail.com");
        dos.setPwd("NuevoPWD");
        JOptionPane.showMessageDialog(null, dos);
        
        System.out.println( Estados.activo);
        Usuario tres = new Usuario("Pri", "123", "pri@nose.com", Estados.cancelado);
        JOptionPane.showConfirmDialog(null, tres);
        
    }

}
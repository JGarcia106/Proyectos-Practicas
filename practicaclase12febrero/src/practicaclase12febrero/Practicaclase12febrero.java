/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaclase12febrero;

import javax.swing.JOptionPane;

/**
 *
 * @author Joel
 */
public class Practicaclase12febrero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        informacion Maria = new informacion();
        
        Maria.cedula = "101011";
        Maria.residencia = "Heredia Centro";
        membresia VIP = new membresia();
        VIP.tipoMembresia = "Tipo de membresia VIP";
        membresia pago = new membresia();
        pago.costoMembresia = "10.000 Colones";
        horario noche = new horario();
        noche.noche = "Noche";
        
        JOptionPane.showMessageDialog(null, Maria);
        JOptionPane.showMessageDialog(null, "El ID de Maria es: "+Maria.cedula);
        JOptionPane.showMessageDialog(null, "Maria vive en: "+Maria.residencia);
        JOptionPane.showMessageDialog(null, "La membresia seleccionada por Maria fue: "+VIP.tipoMembresia);
        JOptionPane.showMessageDialog(null, "El costo de la membresia es: "+pago.costoMembresia);
        JOptionPane.showMessageDialog(null, "El horario que escogio fue"+noche.noche);
        
    }
    
}
    
    

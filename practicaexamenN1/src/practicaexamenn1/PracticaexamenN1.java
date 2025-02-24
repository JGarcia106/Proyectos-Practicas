/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaexamenn1;

import javax.swing.JOptionPane;

/**
 *
 * @author Joel
 */
public class PracticaexamenN1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Nombre del conductor:");
        String cedula = JOptionPane.showInputDialog("Cédula:");
        String codigo = JOptionPane.showInputDialog("Código de empleado:");
        String ruta = JOptionPane.showInputDialog("Ruta asignada:");
        boolean licencia = JOptionPane.showInputDialog("¿Tiene licencia profesional? (Sí/No)").equalsIgnoreCase("Sí");
        
        Conductor conductor = new Conductor(nombre, cedula, codigo, ruta, licencia);
        
        double totalComisiones = 0;
        int totalPuntos = 0, totalDistancia = 0, cantidadViajes = 0;
        boolean bonoExtra = false;
        
        while (true) {
            int distancia = Integer.parseInt(JOptionPane.showInputDialog("Distancia recorrida en km:"));
            boolean internacional = JOptionPane.showInputDialog("¿Fue un viaje internacional? (Sí/No)").equalsIgnoreCase("Sí");
            boolean nocturno = JOptionPane.showInputDialog("¿Fue un viaje nocturno? (Sí/No)").equalsIgnoreCase("Sí");
            boolean carga = JOptionPane.showInputDialog("¿Fue un viaje de carga pesada? (Sí/No)").equalsIgnoreCase("Sí");
            String estado = JOptionPane.showInputDialog("Estado del viaje (Completado/Cancelado/En proceso):");
            
            Viaje viaje = new Viaje(distancia, internacional, nocturno, carga, estado);
            totalComisiones += viaje.calcularMonto();
            totalPuntos += viaje.calcularPuntos();
            totalDistancia += distancia;
            cantidadViajes++;
            
            if (JOptionPane.showInputDialog("¿Desea ingresar otro viaje? (Sí/No)").equalsIgnoreCase("No")) break;
        }
        
        if (cantidadViajes > 5 || totalDistancia > 1000) {
            totalComisiones += 5000;
            totalPuntos += 5;
            bonoExtra = true;
        }
        
        String mensaje = "El Conductor \"" + conductor.getNombre() + "\" código: " + conductor.getCodigo() + "\n" +
                         "Recorrió un total de " + totalDistancia + " km.\n" +
                         "Obtuvo un total en comisiones de $" + totalComisiones + "\n" +
                         "El conductor " + (bonoExtra ? "logró" : "no logró") + " el BONO EXTRA.\n" +
                         "Puntos obtenidos por el conductor: " + totalPuntos + "\n" +
                         "El conductor " + (conductor.tieneLicencia() ? "cuenta" : "no cuenta") + " con licencia profesional.\n" +
                         "Ruta asignada: " + conductor.getRuta();
        
        JOptionPane.showMessageDialog(null, mensaje);
    }
}

   
   

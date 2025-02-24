/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaexamenn2;

import javax.swing.JOptionPane;

/**
 *
 * @author Joel
 */
public class PracticaexamenN2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Nombre del estudiante:");
        String cedula = JOptionPane.showInputDialog("Cédula:");
        String codigo = JOptionPane.showInputDialog("Código de estudiante:");
        String grupo = JOptionPane.showInputDialog("Grupo:");
        boolean beca = JOptionPane.showInputDialog("¿Tiene beca? (Si/No)").equalsIgnoreCase("Si");

        Estudiante estudiante = new Estudiante(nombre, cedula, codigo, grupo, beca);

        int totalPuntos = 0, totalCalificaciones = 0, cantidadActividades = 0, entregasATiempo = 0;
        boolean bonoExtra = false;

        while (true) {
            int calificacion = Integer.parseInt(JOptionPane.showInputDialog("Calificación obtenida (0-100):"));
            boolean entregadaATiempo = JOptionPane.showInputDialog("¿Fue entregada a tiempo? (Si/No)").equalsIgnoreCase("Si");
            boolean enGrupo = JOptionPane.showInputDialog("¿Fue realizada en grupo? (Si/No)").equalsIgnoreCase("Si");
            boolean revisada = JOptionPane.showInputDialog("¿Fue revisada por el profesor? (Si/No)").equalsIgnoreCase("Si");

            Actividad actividad = new Actividad(calificacion, entregadaATiempo, enGrupo, revisada);
            totalPuntos += actividad.calcularPuntos();
            totalCalificaciones += calificacion;
            cantidadActividades++;
            if (entregadaATiempo) {
                entregasATiempo++;
            }

            String respuesta = JOptionPane.showInputDialog("¿Desea ingresar otra actividad? (Si/No)");
            if (respuesta.equalsIgnoreCase("No")) {
                break;
            }
        }

        double promedio = (double) totalCalificaciones / cantidadActividades;
        if (entregasATiempo > 5 || promedio > 85) {
            totalPuntos += 10;
            bonoExtra = true;
        }

        String mensaje = "El Estudiante " + estudiante.getNombre() + " con código " + estudiante.getCodigo() + " obtuvo:\n"
                + "Promedio final: " + promedio + "\n"
                + "Puntos de participación: " + totalPuntos + "\n"
                + (bonoExtra ? "Obtuvo el BONO EXTRA\n" : "No obtuvo el BONO EXTRA\n")
                + "Beca: " + (estudiante.tieneBeca() ? "Si\n" : "No\n")
                + "Grupo: " + estudiante.getGrupo();

        JOptionPane.showMessageDialog(null, mensaje);
    }
}

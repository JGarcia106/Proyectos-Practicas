/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2025.decima.clase;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Joel
 */
public class DecimaClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de estudiantes: "));

        //Llenar estudiantes
        Estudiante estudiantes[] = new Estudiante[cantidad];
        estudiantes = llenar_estudiantes(estudiantes);

        //Ordenar estudiantes por nota de menor a mayor
        //Arrays.sort(estudiantes, (e1, e2) -> Integer.parseInt(e1.getNota(), e2.getNota()));
        //Ordenar estudiantes
        Arrays.sort(estudiantes, (e1, e2) -> e2.getNombre().compareTo(e1.getNombre()));

        //Mostrar estudiantes
        mostrar_estudiantes(estudiantes);
    }

    public static Estudiante[] llenar_estudiantes(Estudiante[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            String nombre = JOptionPane.showInputDialog("Nombre del estudiante: " + (i + 1));
            String apellido = JOptionPane.showInputDialog("Apellidos del estudiante: " + (i + 1));
            int nota = Integer.parseInt(JOptionPane.showInputDialog("Nota del estudiante: " + (i + 1)));
            Estudiante estudiante_i = new Estudiante(nombre, apellido, nota);
            arreglo[i] = estudiante_i;
        }
        return arreglo;
    }

    public static void mostrar_estudiantes(Estudiante[] arreglo) {
        String reporte = "";
        for(int i = 0; i < arreglo.length; i++) {
            reporte = reporte + arreglo[i] + "\n";
        }
        
        JOptionPane.showInputDialog(null, reporte);
    }
}

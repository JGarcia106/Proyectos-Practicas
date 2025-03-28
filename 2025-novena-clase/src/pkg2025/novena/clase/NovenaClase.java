/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2025.novena.clase;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Joel
 */
public class NovenaClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tamanio = Integer.parseInt(JOptionPane.showInputDialog("Tamaño del arreglo: "));
        Estudiante arrEstudiantes[] = new Estudiante[tamanio];

        // Llenando el arreglo
        arrEstudiantes = llenar_arreglo(arrEstudiantes);
        // Mostrando arreglo
        mostrar_arreglo(arrEstudiantes);
    }

    public static String generar_nombre() {
        String nombre = "";
        String nombres[] = {
            "Ana",
            "Maria",
            "Jimena",
            "Raul",
            "Pedro",
            "Joaquin",
            "Juan",
            "Ignacio"
        };
        Random rand = new Random();
        int num = rand.nextInt(nombres.length);
        nombre = nombres[num];
        return nombre;
    }

    public static Estudiante[] llenar_arreglo(Estudiante arreglo[]) {
        for (int i = 0; i < arreglo.length; i++) {
            int cedula = Integer.parseInt(
                    JOptionPane.showInputDialog("Digite la cedula del estudiante: " + (i + 1))
            );
            String nombre = generar_nombre();
            String apellidos = JOptionPane.showInputDialog("Digite los apellidos del estudiante: " + (i + 1));

            // Crear la instancia y agregarla al arreglo
            Estudiante estudiante_i = new Estudiante(cedula, nombre, apellidos);
            arreglo[i] = estudiante_i;
        }
        return arreglo;
    }

    public static void mostrar_arreglo(Estudiante arreglo[]) {
        for (int i = 0; i < arreglo.length; i++) {
            JOptionPane.showMessageDialog(null, "Estudiante " + (i + 1) + ": "
                    + arreglo[i]
            );
        }
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofinal;

import java.util.Arrays;
import java.util.Comparator;
import javax.swing.JOptionPane;

/**
 *
 * @author Joel
 */
public class ProyectoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de personas a registrar:"));
        Persona[] personas = new Persona[cantidad];

        for (int i = 0; i < cantidad; i++) {
            int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la ID de la persona " + (i + 1) + ":"));
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la persona " + (i + 1) + ":");
            String tipo;
            while (true) {
                tipo = JOptionPane.showInputDialog("Ingrese el tipo (Director, Invitado, Discapacitado) de la persona " + (i+1) + ":");
                if (tipo.equalsIgnoreCase("Director") || tipo.equalsIgnoreCase("Invitado") || tipo.equalsIgnoreCase("Discapacitado")) {
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Error: Tipo inválido. Debe de ser Director, Invitado o Discapacitado");
                }
            }

            personas[i] = new Persona(id, nombre, tipo);
        }

        // Ordenar por tipo: Director > Invitado > Discapacitado
        Arrays.sort(personas, Comparator.comparingInt(p -> {
            switch (p.getTipo().toLowerCase()) {
                case "director":
                    return 1;
                case "invitado":
                    return 2;
                case "discapacitado":
                    return 3;
                default:
                    return 4;
            }
        }));

        // Mostrar los datos ordenados
        String resultado = "Lista de personas ordenadas:\n";
        for (Persona p : personas) {
            resultado += "ID: " + p.getId() + " | Nombre: " + p.getNombre() + " | Tipo: " + p.getTipo() + "\n";
        }
        JOptionPane.showMessageDialog(null, resultado);
    }
}

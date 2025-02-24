/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaclase29enero;

import javax.swing.JOptionPane;

/**
 *
 * @author Joel
 */
public class Practicaclase29enero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String linea = "@@@@@@@@@@";
        for (int i = 0; i < 5; i++) {
            System.out.println(linea);
        }
        String dato = JOptionPane.showInputDialog("Digite un número para ver su tabla de multiplicar:");
        int numero = Integer.parseInt(dato);

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        String dato1 = JOptionPane.showInputDialog("Digite el número de filas para el triángulo:");
        int filas = Integer.parseInt(dato);

        for (int i = 1; i <= filas; i++) {

            String linea1 = "";
            for (int j = 0; j < i; j++) {
                linea += "*";
            }
            System.out.println(linea);
        }
        for (int i = 20; i <= 30; i++) {
            System.out.println("Valor: " + i + " - Cuadrado: " + (i * i));
        }
        String dato2 = JOptionPane.showInputDialog("Digite la cantidad de estudiantes:");
        int cantidad = Integer.parseInt(dato);

        int suma = 0, notaMayor = 0, notaMenor = 100, aprobados = 0;

        for (int i = 0; i < cantidad; i++) {
            String notaStr = JOptionPane.showInputDialog("Digite la nota del estudiante " + (i + 1) + ":");
            int nota = Integer.parseInt(notaStr);

            suma += nota;
            if (nota > notaMayor) {
                notaMayor = nota;
            }
            if (nota < notaMenor) {
                notaMenor = nota;
            }
            if (nota >= 70) {
                aprobados++;
            }
        }

        double promedio = suma / (double) cantidad;

        String mensaje = "Nota Promedio: " + promedio + "\n"
                + "Nota Mayor: " + notaMayor + "\n"
                + "Nota Menor: " + notaMenor + "\n"
                + "Cantidad de aprobados: " + aprobados;

        JOptionPane.showMessageDialog(null, mensaje);
        int suma1;
        suma1 = 0;
        int notaMayor1;
        notaMayor = 0;
        int notaMenor1;
        notaMenor = 100;
        int aprobados1;
        aprobados = 0;
        int contador = 0;

        while (true) {
            String notaStr = JOptionPane.showInputDialog("Digite la nota del estudiante (nota negativa para terminar):");
            int nota = Integer.parseInt(notaStr);

            // Termina el ciclo si la nota es negativa
            if (nota < 0) {
                break;
            }

            suma += nota;
            contador++;
            if (nota > notaMayor) {
                notaMayor = nota;
            }
            if (nota < notaMenor) {
                notaMenor = nota;
            }
            if (nota >= 70) {
                aprobados++;
            }
        }

        if (contador > 0) {
            double promedio1 = suma / (double) contador;
            String mensaje1 = "Nota Promedio: " + promedio + "\n"
                    + "Nota Mayor: " + notaMayor + "\n"
                    + "Nota Menor: " + notaMenor + "\n"
                    + "Cantidad de aprobados: " + aprobados;
            JOptionPane.showMessageDialog(null, mensaje);
        } else {
            JOptionPane.showMessageDialog(null, "No se ingresaron notas.");
        }
    }
}
  
  


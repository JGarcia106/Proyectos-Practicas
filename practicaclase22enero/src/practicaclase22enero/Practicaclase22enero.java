/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaclase22enero;

import javax.swing.JOptionPane;

/**
 *
 * @author Joel
 */
public class Practicaclase22enero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Desarrolle un ejercicio que le solicite al usuario los años de antigüedad
        //la cantidad de horas laboradas por semana y el precio que se le paga por hora
        //con estos datos debe calcular el salario bruto.

        String edad;
        String horas;
        String paga;
        int antigüedadEmpleado;
        int salario;
        int horasPagadas;
        int salarioEmpleado;
        double bono1 = 0.0;
        double bono2 = 0.0;
        double bono3 = 0.0;
        double mas12 = 0.0;
        double mas2500 = 0.0;
        double mas3500 = 0.0;

        edad = JOptionPane.showInputDialog("Digite sus años de laburo: ");
        antigüedadEmpleado = Integer.parseInt(edad);
        horas = JOptionPane.showInputDialog("Digite la cantidad de horas trabajadas: ");
        salario = Integer.parseInt(horas);
        paga = JOptionPane.showInputDialog("¿Cuánto se le paga por hora?");
        horasPagadas = Integer.parseInt(paga);

        salarioEmpleado = salario * horasPagadas;

        // Calcular bono si tiene más de 12 años
        if (antigüedadEmpleado > 12) {
            bono1 = salarioEmpleado * 0.055;
            mas12 = salarioEmpleado + bono1;
        } else {
            mas12 = salarioEmpleado;
        }

        // Calcular deducciones si el salario supera los límites establecidos
        if (mas12 > 3500) {
            bono3 = mas12 * 0.038;
            mas3500 = mas12 - bono3;
            JOptionPane.showMessageDialog(null, "El salario neto final es de: " + mas3500);
        } else if (mas12 > 2500) {
            bono2 = mas12 * 0.027;
            mas2500 = mas12 - bono2;
            JOptionPane.showMessageDialog(null, "El salario neto final es de: " + mas2500);
        } else {
            JOptionPane.showMessageDialog(null, "El salario neto final es de: " + mas12);
        }
    }
} 


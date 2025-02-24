/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enunciadocasoestudio;

import javax.swing.JOptionPane;

/**
 *
 * @author Joel
 */
class Persona {

    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private int añoNacimiento;
    private int edad;

    public Persona(String nombre, String primerApellido, String segundoApellido, int anioNacimiento) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        if (anioNacimiento > 0) {
            this.añoNacimiento = anioNacimiento;
            calcularEdad();
        } else {
            JOptionPane.showMessageDialog(null, "El año de nacimiento debe ser mayor a cero.");
        }
    }

    private void calcularEdad() {
        int anioActual = java.time.Year.now().getValue();
        this.edad = anioActual - this.añoNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void mostrarDatos() {
        String mensaje = "Nombre: " + nombre + " " + primerApellido + " " + segundoApellido + "\n"
                + "Año de Nacimiento: " + añoNacimiento + "\n"
                + "Edad: " + edad + " años\n"
                + (edad >= 18 ? "Es mayor de edad." : "Es menor de edad.");
        JOptionPane.showMessageDialog(null, mensaje);
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enunciadocasoestudio;

import javax.swing.JOptionPane;

/**
 *
 * @author Joel
 */
public class EnunciadoCasoEstudio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menuPrincipal();
    }

    public static void menuPrincipal() {
        while (true) {
            String opcion = JOptionPane.showInputDialog("Menú Principal:\n1. Verificar edad de una persona\n2. Calcular Factorial de un número\n3. Calcular el precio final de un producto\n4. Salir");
            switch (opcion) {
                case "1":
                    ejercicio_1();
                    break;
                case "2":
                    calcularFactorial();
                    break;
                case "3":
                    calcularPrecioFinalProducto();
                    break;
                case "4":
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        }
    }

    public static void ejercicio_1() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre:");
        String primerApellido = JOptionPane.showInputDialog("Ingrese el primer apellido:");
        String segundoApellido = JOptionPane.showInputDialog("Ingrese el segundo apellido:");
        int añoNacimiento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de nacimiento:"));
      
        Persona persona = new Persona(nombre, primerApellido, segundoApellido, añoNacimiento);
        persona.mostrarDatos();
    }

    public static void calcularFactorial() {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero positivo:"));
        if (numero < 0) {
            JOptionPane.showMessageDialog(null, "El número no es entero positivo.");
            return;
        }

        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        JOptionPane.showMessageDialog(null, "El factorial de " + numero + " es: " + factorial);
    }

    public static void calcularPrecioFinalProducto() {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del producto:");
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad disponible:"));
        double precioCompra = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio de compra:"));
        double ganancia = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la ganancia esperada:"));
        String marca = JOptionPane.showInputDialog("Ingrese la marca del producto:");

        Producto producto = new Producto(nombre, cantidad, precioCompra, ganancia, marca);
        producto.mostrarDatos();
    }
}

    


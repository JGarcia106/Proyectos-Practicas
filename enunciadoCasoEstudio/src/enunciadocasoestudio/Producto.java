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
class Producto {

    private String nombre;
    private int cantidadDisponible;
    private double precioCompra;
    private double ganancia;
    private double precioConImpuesto;
    private String marca;

    public Producto(String nombre, int cantidadDisponible, double precioCompra, double ganancia, String marca) {
        this.nombre = nombre;
        this.cantidadDisponible = cantidadDisponible;
        this.precioCompra = precioCompra;
        this.ganancia = ganancia;
        this.marca = marca;
        calcularPrecioFinal();
    }

    private void calcularPrecioFinal() {
        this.precioConImpuesto = (precioCompra + ganancia) * 1.13;
    }

    public void mostrarDatos() {
        String mensaje = "Producto: " + nombre + "\n"
                + "Marca: " + marca + "\n"
                + "Cantidad Disponible: " + cantidadDisponible + "\n"
                + "Precio de Compra: $" + precioCompra + "\n"
                + "Ganancia: $" + ganancia + "\n"
                + "Precio Final con Impuesto: $" + precioConImpuesto;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}


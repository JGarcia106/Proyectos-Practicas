/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2025.novena.clase;

/**
 *
 * @author Joel
 */
class Estudiante {

    private int cedula;
    private String nombre;
    private String apellidos;

    public Estudiante(int cedula, String nombre, String apellidos) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public Estudiante() {

    }

    @Override

    public String toString() {
        return "Cedula: " + cedula + "Nombre: " + nombre + "Apellidos: " + apellidos;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}

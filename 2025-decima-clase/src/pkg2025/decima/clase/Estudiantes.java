/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2025.decima.clase;

/**
 *
 * @author Joel
 */
class Estudiantes {
    private String nombre;
    private String apellidos;
    private int nota;

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

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", nota=" + nota + '}';
    }

    public Estudiantes(String nombre, String apellidos, int nota) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nota = nota;
    }
}


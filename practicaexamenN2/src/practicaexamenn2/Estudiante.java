/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaexamenn2;

/**
 *
 * @author Joel
 */
class Estudiante {

    private String nombre;
    private String cedula;
    private String codigo;
    private String grupo;
    private boolean beca;
    private static final String INSTITUCION = "Universidad ABC";

    public Estudiante(String nombre, String cedula, String codigo, String grupo, boolean beca) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.codigo = codigo;
        this.grupo = grupo;
        this.beca = beca;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getGrupo() {
        return grupo;
    }

    public boolean tieneBeca() {
        return this.beca;
    }

    public static String getInstitucion() {
        return INSTITUCION;
    }
}

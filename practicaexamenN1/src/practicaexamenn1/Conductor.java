/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaexamenn1;

/**
 *
 * @author Joel
 */
class Conductor {
    private String nombre;
    private String cedula;
    private String codigo;
    private String ruta;
    private boolean licencia;
    private static final String EMPRESA = "Transporte S.A.";

    public Conductor(String nombre, String cedula, String codigo, String ruta, boolean licencia) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.codigo = codigo;
        this.ruta = ruta;
        this.licencia = licencia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getRuta() {
        return ruta;
    }

    public boolean tieneLicencia() {
        return licencia;
    }

    public static String getEmpresa() {
        return EMPRESA;
    }
}


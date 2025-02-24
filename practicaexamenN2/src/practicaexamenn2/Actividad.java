/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaexamenn2;

/**
 *
 * @author Joel
 */
class Actividad {

    private int calificacion;
    private boolean entregadaATiempo, enGrupo, revisada;

    public Actividad(int calificacion, boolean entregadaATiempo, boolean enGrupo, boolean revisada) {
        this.calificacion = calificacion;
        this.entregadaATiempo = entregadaATiempo;
        this.enGrupo = enGrupo;
        this.revisada = revisada;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public boolean esEntregadaATiempo() {
        return entregadaATiempo;
    }

    public boolean esEnGrupo() {
        return enGrupo;
    }

    public boolean esRevisada() {
        return revisada;
    }

    public int calcularPuntos() {
        int puntos = 0;
        if (entregadaATiempo) {
            puntos += 1;
        }
        if (enGrupo) {
            puntos += 2;
        }
        if (revisada) {
            puntos += 1;
        }
        if (calificacion >= 90) {
            puntos += 2;
        }
        if (calificacion < 70) {
            puntos -= 1;
        }
        return puntos;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaexamenn1;

/**
 *
 * @author Joel
 */
class Viaje {

    private int distancia;
    private boolean internacional, nocturno, carga;
    private String estado;

    public Viaje(int distancia, boolean internacional, boolean nocturno, boolean carga, String estado) {
        this.distancia = distancia;
        this.internacional = internacional;
        this.nocturno = nocturno;
        this.carga = carga;
        this.estado = estado;
    }

    public int getDistancia() {
        return distancia;
    }

    public boolean esInternacional() {
        return internacional;
    }

    public boolean esNocturno() {
        return nocturno;
    }

    public boolean esCarga() {
        return carga;
    }

    public String getEstado() {
        return estado;
    }

    public double calcularMonto() {
        double monto = distancia * 10;
        if (internacional) {
            monto += monto * 0.15;
        }
        if (nocturno) {
            monto += monto * 0.10;
        }
        if (carga) {
            monto += monto * 0.20;
        }
        if (distancia > 200) {
            monto += monto * 0.05;
        }
        return monto;
    }

    public int calcularPuntos() {
        int puntos = 0;
        if (nocturno) {
            puntos += 2;
        }
        if (carga) {
            puntos += 3;
        }
        if (distancia > 200) {
            puntos += 1;
        }
        return puntos;
    }
}


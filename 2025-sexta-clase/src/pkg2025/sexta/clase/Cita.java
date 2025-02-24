/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2025.sexta.clase;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Joel
 */
class Cita {
    private String persona;
    private Date fechaCita;
    private int espacio;

    public String getPersona() {
        return persona;
    }

    @Override
    public String toString() {
        return "Cita{" + "persona=" + persona + ", fechaCita=" + fechaCita + ", espacio=" + espacio + '}';
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public Date getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(Date fechaCita) {
        this.fechaCita = fechaCita;
    }

    public int getEspacio() {
        return espacio;
    }

    public void setEspacio(int espacio) {
        this.espacio = espacio;
    }
    
    /**
     * Este metodo solo va crear la primera cita del día siguiente
     */
    public void crearCita1(){
        persona="Juan Cita 1";
        Date fechaHoy = new Date();
        JOptionPane.showMessageDialog(null, "Esto es la fecha de hoy" + fechaHoy );
        
        
        espacio=5;
    }
    
    
    
}

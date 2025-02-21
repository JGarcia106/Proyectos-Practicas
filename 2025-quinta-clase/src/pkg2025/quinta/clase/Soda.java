/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2025.quinta.clase;

/**
 *
 * @author Joel
 */
class Soda {
    //atributo
    public String nombre;
    public String lugar;
    private double ingresoDiario ;
    public int cantidadVentasDiarias;
    
    /**
     * Metodo solo permito para administradores
     * @param rol recibe el rol del usuario
     * @return retora el valor correspondite
     */
    
    public double calculoIngreso (String rol){
        if (rol.equals("Admin")){
            this.ingresoDiario=50000;
            return ingresoDiario;
        }
        return 0;
        
        
    }
    
    
    
    
}

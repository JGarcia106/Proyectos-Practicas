/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2025.segunda.clase;

import javax.swing.JOptionPane;

/**
 *
 * @author Joel
 */
public class SegundaClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Esto es un comentario vamos a clase1
        /**
         * //Esto tambien es un comentario
         */
        /*
        int edad =20;
        double salario = 1000000.00;
        String texto ="Esto es un texto";
        
        System.out.println("Esto imprime en consola ");
        System.out.println(texto );
        
        texto=JOptionPane.showInputDialog("Datos a solicitar remplaso de texto");
        
        JOptionPane.showMessageDialog(null, texto);
        //System.out.println(texto );
         */
 /*
            Escriba un programa que lea el nombre del trabajador  listo
            y su salario semanal, con esta información listo 
            calcule su salario mensual sin deducciones (salario bruto)listo 
        , el monto de las deducciones (que corresponden a un 9.34%)   listo
        y el salario después de aplicadas las deducciones (salario neto),  listo
        finalmente 
            debe mostrar los datos al usuario de la siguiente manera listo
         */
 /*
        String nombreTrabajador = ""; // Declaramos la variable del nombre
        double salarioSemanal =0.0;
        double salarioMensual = 0; //Salario bruto
        double salarioMensualDeducciones = 0; //Salario neto
        String variableTemporal="";
        nombreTrabajador= JOptionPane.showInputDialog("Digite su nombre");
        variableTemporal= JOptionPane.showInputDialog("Digite su salario semanal");
        
        salarioSemanal=Double.parseDouble(variableTemporal);
        
        salarioMensual=salarioSemanal*4;
        salarioMensualDeducciones =  salarioMensual*0.934;
        
        JOptionPane.showMessageDialog(null, "El nombre es " + nombreTrabajador + "\n" +
                                            "El salario semanal es "+ salarioSemanal + "\n" +
                                            "El salario mensual (salario bruto)es "+ salarioMensual + "\n" +
                                            "El salario mensual con deducciones (salario neto)es "+ salarioMensualDeducciones + "\n");
         */
        // Clase 2 
        // logica booleana operadores logicos e IF
        /*
        if (true && 1==0){
             JOptionPane.showMessageDialog(null, "Entre ");
        }
        
        if (true || 1==0){
             JOptionPane.showMessageDialog(null, "Entra por el OR ");
        }*/
 /*
        if (!false){
            JOptionPane.showMessageDialog(null, "Entra por la negación ");
        }*/
 /*
        if (1==1){
             JOptionPane.showMessageDialog(null, "Entre 2");
        }*/
 /*
        if (false){
             JOptionPane.showMessageDialog(null, "Entre ");
        }*/
 /*
        boolean bandera= true;
        int edad = 0;
        
        if (!bandera){
            JOptionPane.showMessageDialog(null, "True ");
        } 
        else{
            JOptionPane.showMessageDialog(null, "False ");
        }
         
        edad = Integer.parseInt(JOptionPane.showInputDialog("Dime la edad"));
        if (edad >= 18){
            boolean hola=true;
            JOptionPane.showMessageDialog(null, "Tomar alcohol ");
            JOptionPane.showMessageDialog(null, "Casarse  ");
            if (edad >65){
                JOptionPane.showMessageDialog(null, "Pensionado como el maestro Rochi  ");
            }else
                JOptionPane.showMessageDialog(null, "Obligado a trabajar para poder comer  ");
        }
        if (true) 
            JOptionPane.showMessageDialog(null, "Casarse  "); 
        else 
            JOptionPane.showMessageDialog(null, "ASDsa  ");
        
        if (1 == 0) {
            JOptionPane.showMessageDialog(null, "ASDsa  ");
        }
        JOptionPane.showMessageDialog(null, "ASDsa  ");*/
        //hola;
        //////*////////*/ switch
        int diaSemana = 1000;

        switch (diaSemana) {
            case 1:
                JOptionPane.showMessageDialog(null, "Lunes  ");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Martes  ");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Miercoles  ");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Jueves  ");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Party Time  ");
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "Dato no valido  ");
        }

    }

}

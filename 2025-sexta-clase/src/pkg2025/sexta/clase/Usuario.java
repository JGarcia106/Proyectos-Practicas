/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2025.sexta.clase;

/**
 *
 * @author Joel
 */
class Usuario {
    private String usr;
    private String pwd;
    private String mail;
    public static String company="AMD";
    private Estados estado;
    

    public Usuario() {
        usr="GENERICO";
        pwd="123";
        mail="N/A";
    }


    public Usuario(String usr, String pwd, String mail) {
        this.usr = usr;
        this.pwd = pwd;
        this.mail = mail;
    }

    public Usuario(String usr, String mail) {
        this.usr = usr;
        this.mail = mail;
    }

    public Usuario(String usr, String pwd, String mail, Estados estado) {
        this.usr = usr;
        this.pwd = pwd;
        this.mail = mail;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Usuario{" + "usr=" + usr + ", pwd=" + pwd + ", mail=" + mail + ", estado=" + estado + '}';
    }

   
    
    

    public String getUsr() {
        return usr;
    }

    public void setUsr(String usr) {
        this.usr = usr;
    }

    public String getPwd() {
        String resultado;
        //realizar un for que recorra todo el pwd y lo cambie *
        return "******";
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail+"@miPrimer.com";
    }

     

}

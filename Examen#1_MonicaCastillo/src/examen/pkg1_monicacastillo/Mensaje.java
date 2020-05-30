/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg1_monicacastillo;

/**
 *
 * @author Monica
 */
public class Mensaje {
    private String Receptor;
    private String Emisor;
    private String Mensaje;

    public Mensaje() {
    }

    public Mensaje(String Receptor, String Emisor, String Mensaje) {
        this.Receptor = Receptor;
        this.Emisor = Emisor;
        this.Mensaje = Mensaje;
    }

    public String getReceptor() {
        return Receptor;
    }

    public void setReceptor(String Receptor) {
        this.Receptor = Receptor;
    }

    public String getEmisor() {
        return Emisor;
    }

    public void setEmisor(String Emisor) {
        this.Emisor = Emisor;
    }

    public String getMensaje() {
        return Mensaje;
    }

    public void setMensaje(String Mensaje) {
        this.Mensaje = Mensaje;
    }

    @Override
    public String toString() {
        return "Mensaje{" + "Receptor=" + Receptor + ", Emisor=" + Emisor + ", Mensaje=" + Mensaje + '}';
    }
    
}

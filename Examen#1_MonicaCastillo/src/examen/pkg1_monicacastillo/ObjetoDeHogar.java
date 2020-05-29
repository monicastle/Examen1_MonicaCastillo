/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg1_monicacastillo;

import java.awt.Color;
import java.util.Date;

/**
 *
 * @author Monica
 */
public class ObjetoDeHogar extends Objeto {

    private String descripcion;
    private String instrucciones;
    private String garantia;

    public ObjetoDeHogar() {
        super();
    }

    public ObjetoDeHogar(String descripcion, String instrucciones, String garantia, Color color, String direccion, String marca, String tamaño, String calidad, Persona persona) {
        super(color, direccion, marca, tamaño, calidad, persona);
        this.descripcion = descripcion;
        this.instrucciones = instrucciones;
        this.garantia = garantia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    @Override
    public String toString() {
        return "ObjetoDeHogar{" + "descripcion=" + descripcion + ", instrucciones=" + instrucciones + ", garantia=" + garantia + '}';
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg1_monicacastillo;

import java.awt.Color;

/**
 *
 * @author Monica
 */
public class Objeto {

    private Color color;
    private String direccion;
    private String marca;
    private String tamaño;
    private String calidad;
    private Persona persona;

    public Objeto() {
    }

    public Objeto(Color color, String direccion, String marca, String tamaño, String calidad, Persona persona) {
        this.color = color;
        this.direccion = direccion;
        this.marca = marca;
        this.tamaño = tamaño;
        this.calidad = calidad;
        this.persona = persona;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Objeto{" + "color=" + color + ", direccion=" + direccion + ", marca=" + marca + ", tama\u00f1o=" + tamaño + ", calidad=" + calidad + ", persona=" + persona + '}';
    }

}

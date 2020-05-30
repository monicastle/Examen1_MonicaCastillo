/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg1_monicacastillo;

import java.util.ArrayList;

/**
 *
 * @author Monica
 */
public class Persona {

    private int ID;
    private String nombre;
    private int edad;
    private String sexo;
    private String estadocivil;
    private double altura;
    private double peso;
    private ArrayList<Mensaje> mensajes;

    public Persona() {
    }

    public Persona(int ID, String nombre, int edad, String sexo, String estadocivil, double altura, double peso) {
        this.ID = ID;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.estadocivil = estadocivil;
        this.altura = altura;
        this.peso = peso;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public ArrayList getMensajes() {
        return mensajes;
    }

    public void setMensajes(ArrayList mensajes) {
        this.mensajes = mensajes;
    }

    @Override
    public String toString() {
        return "ID: " + ID + ", Nombre: " + nombre + ", Edad: " + edad + ", Sexo=: " + sexo + ", Estado Civil: " + estadocivil + ", Altura: " + altura + ", Peso; " + peso + ", Mensajes: " + mensajes;
    }

}

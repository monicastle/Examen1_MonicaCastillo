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
public class Gerente extends Persona {

    String usuario;
    String contraseña;
    String cargo;

    public Gerente() {
        super();
    }

    public Gerente(String usuario, String contraseña, String cargo, int ID, String nombre, int edad, String sexo, String estadocivil, double altura, double peso) {
        super(ID, nombre, edad, sexo, estadocivil, altura, peso);
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.cargo = cargo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Gerente{" + "usuario=" + usuario + ", contrase\u00f1a=" + contraseña + ", cargo=" + cargo + '}';
    }

}

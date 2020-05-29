/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg1_monicacastillo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Monica
 */
public class PersonalGeneral extends Persona {

    private String ocupacion;
    private String horario;
    private int semanas;
    private double sueldo;

    public PersonalGeneral() {
        super();
    }

    public PersonalGeneral(String ocupacion, String horario, int semanas, double sueldo, int ID, String nombre, int edad, String sexo, String estadocivil, double altura, double peso, ArrayList mensajes) {
        super(ID, nombre, edad, sexo, estadocivil, altura, peso, mensajes);
        this.ocupacion = ocupacion;
        this.horario = horario;
        this.semanas = semanas;
        this.sueldo = sueldo;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getSemanas() {
        return semanas;
    }

    public void setSemanas(int semanas) {
        this.semanas = semanas;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "PersonalGeneral{" + "ocupacion=" + ocupacion + ", horario=" + horario + ", semanas=" + semanas + ", sueldo=" + sueldo + '}';
    }

}

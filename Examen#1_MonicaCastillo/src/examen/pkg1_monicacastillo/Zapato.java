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
public class Zapato extends Objeto {

    private double talla;
    private String descripcion;
    private int comodidad;

    public Zapato() {
        super();
    }

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getComodidad() {
        return comodidad;
    }

    public void setComodidad(int comodidad) {
        this.comodidad = comodidad;
    }

    @Override
    public String toString() {
        return "Zapato{" + "talla=" + talla + ", descripcion=" + descripcion + ", comodidad=" + comodidad + '}';
    }

}

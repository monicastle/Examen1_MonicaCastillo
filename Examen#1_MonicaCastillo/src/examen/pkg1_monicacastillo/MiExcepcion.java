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
public class MiExcepcion extends Exception {

    public MiExcepcion() {
        super();
    }

    public MiExcepcion(String string) {
        super(string);
    }

    @Override
    public String toString() {
        return "MiExcepcion{" + '}';
    }

}

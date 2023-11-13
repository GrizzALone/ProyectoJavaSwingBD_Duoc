/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import modelo.Persona;

/**
 *
 * @author GrizzALone
 */
public class ManejadoraProvisional {
    private ArrayList<Persona> mane = new ArrayList<Persona>();

    public ManejadoraProvisional() {
    }

    public ArrayList<Persona> getMane() {
        return mane;
    }

    public void setMane(ArrayList<Persona> mane) {
        this.mane = mane;
    }
    
    
}

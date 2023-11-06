/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author GrizzALone
 */
public class Trabajador extends Persona{
    private int sueldo;
    private String cargo;

    public Trabajador(int sueldo, String cargo, String rut, String nombre, int edad, int telefono) {
        super(rut, nombre, edad, telefono);
        this.sueldo = sueldo;
        this.cargo = cargo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    @Override
    public String movimientoDinero(){
        return "Hacer algo";
    }
}

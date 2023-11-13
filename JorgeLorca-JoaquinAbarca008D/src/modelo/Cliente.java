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
public class Cliente extends Persona{
    private int saldo;
    private String numCuenta;

    public Cliente(String rut, String nombre, int edad, int telefono, int saldo, String numCuenta) {
        super(rut, nombre, edad, telefono);
        this.saldo = saldo;
        this.numCuenta = numCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }
    
    @Override
    public String movimientoDinero(){
        return "Hacer algo";
    }
}

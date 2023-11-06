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
    private boolean tieneTarjetaCred;

    public Cliente(int saldo, boolean tieneTarjetaCred, String rut, String nombre, int edad, int telefono) {
        super(rut, nombre, edad, telefono);
        this.saldo = saldo;
        this.tieneTarjetaCred = tieneTarjetaCred;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public boolean isTieneTarjetaCred() {
        return tieneTarjetaCred;
    }

    public void setTieneTarjetaCred(boolean tieneTarjetaCred) {
        this.tieneTarjetaCred = tieneTarjetaCred;
    }
    
    @Override
    public String movimientoDinero(){
        return "Hacer algo";
    }
}

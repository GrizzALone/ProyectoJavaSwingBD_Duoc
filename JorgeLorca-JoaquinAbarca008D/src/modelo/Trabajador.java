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
    private int sueldoBase;
    private String cargo; // Gerente/Ejecutivo/Analista/Cajero

    public Trabajador(String rut, String nombre, int edad, int telefono, int sueldoBase, String cargo) {
        super(rut, nombre, edad, telefono);
        this.sueldoBase = sueldoBase;
        this.cargo = cargo;
    }

    public int getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(int sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public int calcularSueldo(){ //El sueldo es dinamico
        switch(cargo){
            case "GERENTE":
                return (int)(sueldoBase*1.15);
            case "ANALISTA":
                return (int)(sueldoBase*1.12);
            case "EJECUTIVO":
                return (int)(sueldoBase*1.10);
            default: //cajero
                return (int)(sueldoBase*1.07);
        }
    }
    
    @Override
    public String movimientoDinero(){
        return "Hacer algo";
    }
}

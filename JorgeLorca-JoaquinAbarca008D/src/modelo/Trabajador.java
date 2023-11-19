package modelo;

import controlador.ClienteDAO;

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
    
    public int calcularSueldo(){
        switch(cargo){
            case "Gerente":
                return (int)(sueldoBase*1.15);
            case "Analista":
                return (int)(sueldoBase*1.12);
            case "Ejecutivo":
                return (int)(sueldoBase*1.10);
            default: //cajero
                return (int)(sueldoBase*1.07);
        }
    }
    
    @Override
    public void migrar(int saldo, String numCuenta){//Migrando a cliente
        Cliente cc = new Cliente(super.getRut(), super.getNombre(), super.getEdad(), super.getTelefono(), saldo, numCuenta);
        ClienteDAO cli= new ClienteDAO();
        
        cli.ingresarCliente(cc);
    }
}

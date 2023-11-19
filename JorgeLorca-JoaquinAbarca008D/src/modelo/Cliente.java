package modelo;

import controlador.ClienteDAO;
import controlador.Conexion;
import controlador.TrabajadorDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

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
    
    public boolean transferencia(Cliente cc, int cantidad){
        if(cantidad>saldo){
            return false;
        }
        boolean resultado=false;
        try {
                Connection con=Conexion.getConexion();
                PreparedStatement ps=con.prepareStatement("update tbcliente set saldo=?  where rut=?");
                
                ps.setInt(1, saldo-cantidad);
                ps.setString(2, super.getRut());

                resultado=ps.executeUpdate()==1;
                ps.close();
                
                Connection con2=Conexion.getConexion();
                PreparedStatement ps2=con2.prepareStatement("update tbcliente set saldo=?  where rut=?");
                
                ps2.setInt(1, cc.getSaldo()+cantidad);
                ps2.setString(2, cc.getRut());

                resultado=ps2.executeUpdate()==1;
                ps2.close();

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return  resultado;
    }
    
    @Override
    public void migrar(int sueldoBase, String cargo){ //Migrando de cliente a trabajador
        Trabajador tt = new Trabajador(super.getRut(), super.getNombre(), super.getEdad(), super.getTelefono(), sueldoBase, cargo);
        TrabajadorDAO tra= new TrabajadorDAO();
        
        tra.ingresarTrabajador(tt);
    }
}

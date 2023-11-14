/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.*;
/**
 *
 * @author PC23
 */

public class ClienteDAO 
{
   public boolean ingresarCliente(Cliente cc) //LISTO
   {
       boolean resultado=false;
       try
         {
            Connection con=Conexion.getConexion();
            String query="insert into tbcliente (rut, nombre, edad, telefono, saldo, numCuenta) values(?,?,?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(query);

            ps.setString(1, cc.getRut());
            ps.setString(2, cc.getNombre());
            ps.setInt(3, cc.getEdad());
            ps.setInt(4, cc.getTelefono());
            ps.setInt(5, cc.getSaldo());
            ps.setString(6, cc.getNumCuenta());
                
            resultado=ps.executeUpdate()==1;
            ps.close();
            
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        return resultado;
             
    }
   
   public boolean modificarCliente(Cliente cc) //LISTO
    {
        boolean resultado=false;
        try {
                Connection con=Conexion.getConexion();
                String query="update tbcliente set saldo=?, numCuenta=?, nombre=?, edad=?, telefono=?  where rut=?";
                PreparedStatement ps=con.prepareStatement(query);
                
                ps.setInt(1, cc.getSaldo());
                ps.setString(2, cc.getNumCuenta());
                ps.setString(3, cc.getNombre());
                ps.setInt(4, cc.getEdad());
                ps.setInt(5, cc.getTelefono());
                ps.setString(6, cc.getRut());

                resultado=ps.executeUpdate()==1;
                ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return  resultado;
    }
   
   public boolean eliminarCliente(String rut) //Listo
    {
        boolean resultado=false;
        try {
            Connection con=Conexion.getConexion();
            String query="delete from tbcliente where rut='"+rut+"'";
            PreparedStatement ps=con.prepareStatement(query);

            resultado=ps.executeUpdate()==1;
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    
    public ArrayList <Cliente> obtenerClientes(){ //LISTO
        ArrayList <Cliente> cc=new ArrayList<>();
        try{
            Connection con=Conexion.getConexion();
            String query="Select * from tbcliente";
            PreparedStatement ps=con.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            Cliente cli;
            while(rs.next())
            {
                cli=new Cliente(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getInt(5),rs.getString(6));
                cc.add(cli);
            }
            
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cc;
    }

    public Cliente buscarCliente(String rut) //LISTO
    {   
        Cliente cli=null;
        try {
            Connection con=Conexion.getConexion();
            String query="select * from tbcliente where rut='"+rut+"'";
            PreparedStatement ps=con.prepareStatement(query);
         //   ps.setString(1, rut);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
                cli=new Cliente(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getInt(5),rs.getString(6));
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cli;
    }


}


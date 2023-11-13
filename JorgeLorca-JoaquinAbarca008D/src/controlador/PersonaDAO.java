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

public class PersonaDAO 
{
   public boolean ingresarPersona(Persona per) //LISTO
   {
       boolean resultado=false;
       try
         {
            Connection con=Conexion.getConexion();
            
            if(per instanceof Cliente){
                String query="insert into tbCliente (saldo, numCuenta, rut, nombre, edad, telefono) values(?,?,?,?,?,?)";
                PreparedStatement ps=con.prepareStatement(query);
                
                ps.setInt(1, (((Cliente) per).getSaldo()));
                ps.setString(2, (((Cliente) per).getNumCuenta()));
                ps.setString(3, (((Cliente) per).getRut()));
                ps.setString(4, (((Cliente) per).getNombre()));
                ps.setInt(5, (((Cliente) per).getEdad()));
                ps.setInt(6, (((Cliente) per).getTelefono()));
                
                resultado=ps.executeUpdate()==1;
                ps.close();
            }else{
                String query="insert into tbTrabajador (sueldoBase, cargo, rut, nombre, edad, telefono) values(?,?,?,?,?,?)";
                PreparedStatement ps=con.prepareStatement(query);

                ps.setInt(1, (((Trabajador) per).getSueldoBase()));
                ps.setString(2, (((Trabajador) per).getCargo()));
                ps.setString(3, (((Trabajador) per).getRut()));
                ps.setString(4, (((Trabajador) per).getNombre()));
                ps.setInt(5, (((Trabajador) per).getEdad()));
                ps.setInt(6, (((Trabajador) per).getTelefono()));
                
                resultado=ps.executeUpdate()==1;
                ps.close();
            }
            
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(PersonaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        return resultado;
             
    }
   
   public boolean modificarPersona(Persona per) //LISTO
    {
        boolean resultado=false;
        try {
            if(per instanceof Cliente){
                Connection con=Conexion.getConexion();
                String query="update tbCliente set saldo=?, numCuenta=?, nombre=?, edad=?, telefono=?  where rut=?";
                PreparedStatement ps=con.prepareStatement(query);
                
                ps.setInt(1, ((Cliente) per).getSaldo());
                ps.setString(2, ((Cliente) per).getNumCuenta());
                ps.setString(3, ((Cliente) per).getNombre());
                ps.setInt(4, ((Cliente) per).getEdad());
                ps.setInt(5, ((Cliente) per).getTelefono());
                ps.setString(6, ((Cliente) per).getRut());

                resultado=ps.executeUpdate()==1;
                ps.close();
            }else{
                Connection con=Conexion.getConexion();
                String query="update tbTrabajador set sueldoBase=?, cargo=?, nombre=?, edad=?, telefono=?  where rut=?";
                PreparedStatement ps=con.prepareStatement(query);
                
                ps.setInt(1, ((Trabajador) per).getSueldoBase());
                ps.setString(2, ((Trabajador) per).getCargo());
                ps.setString(3, ((Trabajador) per).getNombre());
                ps.setInt(4, ((Trabajador) per).getEdad());
                ps.setInt(5, ((Trabajador) per).getTelefono());
                ps.setString(6, ((Trabajador) per).getRut());

                resultado=ps.executeUpdate()==1;
                ps.close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(PersonaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PersonaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return  resultado;
    }
   
   public boolean eliminarPersona(String rut) //REVISAR(MISMO PROBLEMA QUE bUSCAR)
    {
        boolean resultado=false;
        try {
            //NO ESTA BIEN, YA QUE SI EN LA PRIMERA VUELTA NO ES CLIENTE CAERIA EN ERROR
            for (int i = 0; i < 2; i++) {
                if(i==1){
                    Connection con=Conexion.getConexion();
                    String query="delete from tbCliente where rut='"+rut+"'";
                    PreparedStatement ps=con.prepareStatement(query);

                    resultado=ps.executeUpdate()==1;
                    ps.close();
                    break;
                }else{
                    Connection con=Conexion.getConexion();
                    String query="delete from tbTrabajador where rut='"+rut+"'";
                    PreparedStatement ps=con.prepareStatement(query);

                    resultado=ps.executeUpdate()==1;
                    ps.close();
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(PersonaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PersonaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    
    public ArrayList <Persona> obtenerCLientes(){
        ArrayList <Persona> cc=new ArrayList<>();
        try{
            Connection con=Conexion.getConexion();
            String query="Select * from tbCliente";
            PreparedStatement ps=con.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            Cliente cli;
            while(rs.next())
            {
                cli=new Cliente(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getInt(6));
                cc.add(cli);
            }
            
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PersonaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PersonaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cc;
    }
    
    public ArrayList <Persona> obtenerTrabajadores(){
        ArrayList <Persona> tt=new ArrayList<>();
        try{
            Connection con=Conexion.getConexion();
            String query="Select * from tbTrabajador";
            PreparedStatement ps=con.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            Trabajador tra;
            while(rs.next())
            {
                tra=new Trabajador(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),rs.getInt(6));
                tt.add(tra);
            }
            
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PersonaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PersonaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tt;
    }

    public Persona buscarPersona(String rut) //REVISAR(MISMO PROBLEMA QUE ELIMINAR)
    {   
        Cliente cli=null;
        Trabajador tra=null;
        for()
        try {
            Connection con=Conexion.getConexion();
            String query="select * from tbAlumno where rut='"+rut+"'";
            PreparedStatement ps=con.prepareStatement(query);
         //   ps.setString(1, rut);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
                alu=new Alumno(rs.getString(2),rs.getString(1),rs.getInt(3),rs.getInt(4),rs.getInt(5),rs.getInt(6));
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PersonaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PersonaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return alu;
    }


}


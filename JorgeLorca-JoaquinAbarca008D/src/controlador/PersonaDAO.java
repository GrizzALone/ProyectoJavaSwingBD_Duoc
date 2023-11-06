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
import modelo.Persona;
/**
 *
 * @author PC23
 */


//Toca revisar todo esto, no se como afecta el que el proyecto tenga una clase madre y dos hijas



public class PersonaDAO 
{
   public boolean ingresarPersona(Persona per) 
   {
       boolean resultado=false;
       try
         {
            Connection con=Conexion.getConexion();
            String query="insert into tbPersona (rut,nombre,nota1,nota2,nota3,notaPromedioControles) values(?,?,?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(query);
            
            ps.setString(1, alu.getRut());
            ps.setString(2, alu.getNombre());
            ps.setInt(3, alu.getNota1());
            ps.setInt(4, alu.getNota2());
            ps.setInt(5, alu.getNota3());
            ps.setInt(6, alu.getNotaPromedioControles());
            
            resultado=ps.executeUpdate()==1;
            ps.close();
            
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(PersonaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        return resultado;
             
    }
   public boolean modificarColores(Alumno alu)
    {
        boolean resultado=false;
        try {
            Connection con=Conexion.getConexion();
            String query="update tbALumno set nombre=?,nota1=?,nota2=?,nota3=?,notaPromedioControles=?  where rut=?";
            PreparedStatement ps=con.prepareStatement(query);

            ps.setString(1, alu.getNombre());
            ps.setInt(2, alu.getNota1());
            ps.setInt(3, alu.getNota2());
            ps.setInt(4, alu.getNota3());
            ps.setInt(5, alu.getNotaPromedioControles());
            ps.setString(6, alu.getRut());

            resultado=ps.executeUpdate()==1;
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(PersonaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PersonaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return  resultado;
    }
   public boolean eliminarColor(String rut)
    {
        boolean resultado=false;
        try {
            Connection con=Conexion.getConexion();
            String query="delete from tbAlumno where rut='"+rut+"'";
            PreparedStatement ps=con.prepareStatement(query);

          //  ps.setString(1, rut);
            resultado=ps.executeUpdate()==1;
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(PersonaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PersonaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }

    public ArrayList <Alumno> obtenerTodos()
    {
        ArrayList <Alumno> alu=new ArrayList<>();
        try {
            Connection con=Conexion.getConexion();
            String query="Select * from tbAlumno";
            PreparedStatement ps=con.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            Alumno aa;
            while(rs.next())
            {
                aa=new Alumno(rs.getString(2),rs.getString(1),rs.getInt(3),rs.getInt(4),rs.getInt(5),rs.getInt(6));
                alu.add(aa);
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PersonaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PersonaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return alu;
    }

    public Alumno buscarAlumno(String rut)
    {
        Alumno alu=null;
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


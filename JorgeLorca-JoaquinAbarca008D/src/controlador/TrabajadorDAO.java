package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.*;

public class TrabajadorDAO 
{
   public boolean ingresarTrabajador(Trabajador tt)
   {
       boolean resultado=false;
       try
         {
            Connection con=Conexion.getConexion();
            String query="insert into tbTrabajador (rut, nombre, edad, telefono, sueldoBase, cargo) values(?,?,?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(query);

            ps.setString(1, tt.getRut());
            ps.setString(2, tt.getNombre());
            ps.setInt(3, tt.getEdad());
            ps.setInt(4, tt.getTelefono());
            ps.setInt(5, tt.getSueldoBase());
            ps.setString(6, tt.getCargo());

            resultado=ps.executeUpdate()==1;
            ps.close();
                
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(TrabajadorDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        return resultado;
             
    }
   
   public boolean modificarTrabajador(Trabajador tt)
    {
        boolean resultado=false;
        try {
            Connection con=Conexion.getConexion();
            String query="update tbTrabajador set sueldoBase=?, cargo=?, nombre=?, edad=?, telefono=?  where rut=?";
            PreparedStatement ps=con.prepareStatement(query);

            ps.setInt(1, tt.getSueldoBase());
            ps.setString(2, tt.getCargo());
            ps.setString(3, tt.getNombre());
            ps.setInt(4, tt.getEdad());
            ps.setInt(5, tt.getTelefono());
            ps.setString(6, tt.getRut());

            resultado=ps.executeUpdate()==1;
            ps.close();
                
        } catch (SQLException ex) {
            Logger.getLogger(TrabajadorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TrabajadorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return  resultado;
    }
   
   public boolean eliminarTrabajador(String rut)
    {
        boolean resultado=false;
        try {
            Connection con=Conexion.getConexion();
            String query="delete from tbTrabajador where rut='"+rut+"'";
            PreparedStatement ps=con.prepareStatement(query);

            resultado=ps.executeUpdate()==1;
            ps.close();

        } catch (SQLException ex) {
            Logger.getLogger(TrabajadorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TrabajadorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    
    public ArrayList <Trabajador> obtenerTrabajadores(){
        ArrayList <Trabajador> tt=new ArrayList<>();
        try{
            Connection con=Conexion.getConexion();
            String query="Select * from tbTrabajador";
            PreparedStatement ps=con.prepareStatement(query);
            ResultSet rs=ps.executeQuery();
            Trabajador tra;
            while(rs.next())
            {
                tra=new Trabajador(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getInt(5),rs.getString(6));
                tt.add(tra);
            }
            
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(TrabajadorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TrabajadorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tt;
    }

    public Trabajador buscarTrabajador(String rut)
    {   
        Trabajador tra=null;
        try {
            Connection con=Conexion.getConexion();
            String query="select * from tbTrabajador where rut='"+rut+"'";
            PreparedStatement ps=con.prepareStatement(query);
         //   ps.setString(1, rut);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
                tra=new Trabajador(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getInt(4),rs.getInt(5),rs.getString(6));
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(TrabajadorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TrabajadorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tra;
    }


}
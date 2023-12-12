
package trabajofinalcac.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Connection;
import trabajofinalcac.Entidad.Orador;



public class OradorData {
    
    private java.sql.Connection connection = null;
    
     public OradorData() { //cada vez que creas un obj de tipo Orador estamos creando una conexión a la base de datos
        this.connection = Conexion.getConexion();
    }
    
        public Orador buscarOradorPorId(int id){
            
        Orador orador = null;
        
        String sql = "SELECT id_Orador, nombre, apellido, mail, tema, fecha_alta FROM oradores WHERE id_Orador = ? ";
        
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                orador = new Orador();
                orador.setIdOrador(rs.getInt("id_Orador"));
                orador.setNombre(rs.getString("nombre"));
                orador.setApellido(rs.getString("apellido"));
                orador.setMail(rs.getString("mail"));
                // Obtener la fecha de alta del ResultSet como LocalDate
            LocalDate fechaAlta = rs.getDate("fecha_alta").toLocalDate();
            orador.setFecha_alta(fechaAlta);
            } 
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Oradores" + ex.getMessage());
        }
        return orador;
    }
        
    public List<Orador> listarOradoresPorTema(String Tema) {

        List<Orador> oradores = new ArrayList<>();
        String sql = "SELECT id_orador, nombre, apellido, mail, fecha_alta FROM oradores WHERE tema = ?";
        PreparedStatement ps;
        try {
            Connection connection = (Connection) Conexion.getConexion();
            ps = connection.prepareStatement(sql);
            ps.setString(1, Tema);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Orador orador = new Orador();
                orador.setIdOrador(rs.getInt("id_Orador"));
                orador.setNombre(rs.getString("nombre"));
                orador.setApellido(rs.getString("apellido"));
                orador.setMail(rs.getString("mail"));
                // Obtener la fecha de alta del ResultSet como LocalDate
                LocalDate fechaAlta = rs.getDate("fecha_alta").toLocalDate();
                orador.setFecha_alta(fechaAlta);

                // Agregar el orador a la lista
                oradores.add(orador);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla prestador" + ex.getMessage());
        }

        return oradores;
    }
    
    public List<Orador> listarOradores(){
                List<Orador> oradores = new ArrayList<>();
        String sql = "SELECT id_orador, nombre, apellido, mail, tema, fecha_alta FROM oradores";
        PreparedStatement ps;
        try {
            Connection connection = (Connection) Conexion.getConexion();
            ps = connection.prepareStatement(sql);            
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Orador orador = new Orador();
                orador.setIdOrador(rs.getInt("id_Orador"));
                orador.setNombre(rs.getString("nombre"));
                orador.setApellido(rs.getString("apellido"));
                orador.setMail(rs.getString("mail"));
                orador.setTema(rs.getString("tema"));
                // Obtener la fecha de alta del ResultSet como LocalDate
                LocalDate fechaAlta = rs.getDate("fecha_alta").toLocalDate();
                orador.setFecha_alta(fechaAlta);

                // Agregar el orador a la lista
                oradores.add(orador);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla prestador" + ex.getMessage());
        }

        return oradores;
    }

}

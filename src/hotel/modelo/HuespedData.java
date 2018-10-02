/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Marcelo
 */
public class HuespedData {
 private Connection connection = null;
 
     public HuespedData(Conexion conexion) {
        try {
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
       }
     
    /* @author Jesica*/
    public void guardarHuesped(Huesped huesped){
        try {
            
            String sql = "INSERT INTO huesped (HuespedDni, HuespedNombre, HuespedDomicilio, HuespedEmail, HuespedCelular) VALUES ( ? , ? , ?, ?, ? );";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, huesped.getHuespedDni());
            statement.setString(2, huesped.getHuespedNombre());
            statement.setString(3, huesped.getHuespedDomicilio());
            statement.setString (4, huesped.getHuespedEmail());
            statement.setString(5, huesped.getHuespedCelular());
            
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();

            if (rs.next()) {
                huesped.setHuespedId(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar un huesped");
            }
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un huesped: " + ex.getMessage());
        }
    }
}

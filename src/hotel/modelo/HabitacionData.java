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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author clara
 */
public class HabitacionData {
    
    
    private Connection connection = null;

    public HabitacionData(Conexion conexion) {
        try {
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al obtener la conexion");
        }
    }
     public List<Habitacion> obtenerHabitaciones(){
        List<Habitacion> habitaciones = new ArrayList<Habitacion>();
            

        try {
            String sql = "SELECT * FROM habitacion;";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            Habitacion habitacion;
            while(resultSet.next()){
                habitacion = new Habitacion();
                habitacion.setHabitacionId(resultSet.getInt("habitacionId"));
                habitacion.setHabitacioCapacidadMax(resultSet.getInt("habitacioCapacidadMax"));
                habitacion.setHabitacionCantidadCamas(resultSet.getInt("habitacionCantidadCamas"));
                habitacion.setHabitacionEstado(resultSet.getBoolean("habitacionEstado"));
              
                habitacion.setHabitacionPrecio(resultSet.getDouble("habitacionPrecio"));
               // habitacion.setTipoHabitacionId(resultSet.getInt(1));                

                habitaciones.add(habitacion);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener las habitaciones: " + ex.getMessage());
        }
        
        
        return habitaciones;
    }
}

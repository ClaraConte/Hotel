/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.modelo;

/**
 *
 * @author clara
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TipoHabitacionData {
    
    private Connection connection = null;
    private Conexion conexion;

    public TipoHabitacionData(Conexion conexion) {
        try {
            this.conexion = conexion;
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }

    public TipoHabitacion buscarTipoHabitacion(int tipoHabitacionId){
    TipoHabitacion tipoHabitacion=null;
        try {
            
            String sql = "SELECT * FROM tipohabitacion WHERE tipoHabitacionId =?;";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, tipoHabitacionId);
            ResultSet resultSet=statement.executeQuery();
            
            while(resultSet.next()){
                tipoHabitacion = new TipoHabitacion();
                tipoHabitacion.setTipoHabitacionId(resultSet.getInt("tipoHabitacionId"));
                tipoHabitacion.setTipoHabitacionNombre(resultSet.getString("tipoHabitacionNombre"));
                tipoHabitacion.setTipoHabitacioCapacidadMax(resultSet.getInt("tipoHabitacioCapacidadMax"));
                tipoHabitacion.setTipoHabitacionPrecio(resultSet.getDouble("tipoHabitacionPrecio"));
            }      
            statement.close();
            
             } catch (SQLException ex) {
            System.out.println("Error al mostrar tipoHabitacion por ID: " + ex.getMessage());
        }
        
        return tipoHabitacion;
    }
 
    public List<TipoHabitacion> obtenerTipoHabitacion(){
        List<TipoHabitacion> tipoHabitaciones = new ArrayList<TipoHabitacion>();

        try {
            String sql = "SELECT * FROM tipohabitacion;";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            TipoHabitacion tipoHabitacion;
            while(resultSet.next()){
                tipoHabitacion = new TipoHabitacion();
                tipoHabitacion.setTipoHabitacionId(resultSet.getInt("tipoHabitacionId"));
                tipoHabitacion.setTipoHabitacionNombre(resultSet.getString("tipoHabitacionNombre"));
                tipoHabitacion.setTipoHabitacioCapacidadMax(resultSet.getInt("tipoHabitacioCapacidadMax"));
                tipoHabitacion.setTipoHabitacionPrecio(resultSet.getDouble("tipoHabitacionPrecio"));

                tipoHabitaciones.add(tipoHabitacion);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los tipos de habitacion: " + ex.getMessage());
        }

        return tipoHabitaciones;
    }
    public int TipoHabitacionCapacidadMax(){
        int max = 0;
        try {
            
            String sql = "SELECT MAX(tipoHabitacioCapacidadMax) as value FROM tipohabitacion";

            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){
                max= resultSet.getInt("value");
            }
                statement.close();
            } catch (SQLException ex) {
            System.out.println("Error al mostrar tipoHabitacion por ID: " + ex.getMessage());
        }
        return max;
    }
}

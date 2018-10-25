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

    public TipoHabitacionData(Conexion conexion) {
        try {
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al obtener la conexion");
        }}

    public TipoHabitacion buscarTipoHabitacion(int id){
    TipoHabitacion tipoHabitacion=null;
        try {
            
            String sql = "SELECT * FROM tipoHabitacion WHERE id =?;";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
           
            
            ResultSet resultSet=statement.executeQuery();
            
            while(resultSet.next()){
                tipoHabitacion = new TipoHabitacion();
                tipoHabitacion.setTipoHabitacionId(resultSet.getInt("id"));
                tipoHabitacion.setTipoHabitacionNombre(resultSet.getString("nombre"));
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
            String sql = "SELECT * FROM tipoHabitacion;";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            TipoHabitacion tipoHabitacion;
            while(resultSet.next()){
                tipoHabitacion = new TipoHabitacion();
                tipoHabitacion.setTipoHabitacionId(resultSet.getInt("id"));
                tipoHabitacion.setTipoHabitacionNombre(resultSet.getString("nombre"));

                tipoHabitaciones.add(tipoHabitacion);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los tipos de habitacion: " + ex.getMessage());
        }
        
        
        return tipoHabitaciones;
    }

    public TipoHabitacion buscarTipoHabitacionPorId(int tipoHabitacionId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

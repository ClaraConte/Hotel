/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author clara
 */
public class ReservasData {
    private Connection connection = null;

    public ReservasData(Conexion conexion) {
        try {
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
    public void reservaGuardar(Reservas reservas){
        try {

            String sql = "INSERT INTO reservas (reservasFechaCheckin, reservasfechaCheckout, reservasFechaCreacion, reservasDias, reservasMonto, reservasEstado, huespedId, habitacionId) VALUES ( ? , ? , ? , ? , ? , ? , ? , ? );";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setDate(1, Date.valueOf(reservas.getReservasFechaCheckin()));
            statement.setDate(2, Date.valueOf(reservas.getReservasfechaCheckout()));
            statement.setDate(3, Date.valueOf(reservas.getReservasFechaCreacion()));
            statement.setInt(4, reservas.getReservasDias());
            statement.setDouble(5, reservas.getReservasMonto());
            statement.setBoolean(6, reservas.isReservasEstado());
            statement.setInt(7, reservas.getHuespedId().getHuespedId());
            statement.setInt(8, reservas.getHabitacionId().getHabitacionId());
            
            statement.executeUpdate();

            ResultSet rs = statement.getGeneratedKeys();

            if (rs.next()) {
                reservas.setReservasId(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar una reserva");
            }
            statement.close();

        } catch (SQLException ex) {
            System.out.println("Error al insertar una reserva: " + ex.getMessage());
        }
    }

}

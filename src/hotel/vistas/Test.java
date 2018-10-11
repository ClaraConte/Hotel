/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.vistas;

import hotel.modelo.Conexion;
import hotel.modelo.Habitacion;
import hotel.modelo.HabitacionData;
import hotel.modelo.Huesped;
import hotel.modelo.HuespedData;
import hotel.modelo.TipoHabitacion;

/**
 *
 * @author clara
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        Conexion connection;
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        Conexion conexion;

        try {
            conexion = new Conexion();

            /************* TEST HUESPEDES  ************/

            // Editar --
            /*
            Huesped huesped;
            Huesped huespedEditar;
            HuespedData huespedData;
            huespedData = new HuespedData(conexion);
            int DNI = 3017871;
            huesped = new Huesped(DNI, "Claraconte", "La punta", "clara@clara.com", "2616266910");
            huespedData.editarHuesped(huesped);
            **/

            // Listar huéspedes --
            /*
            HuespedData huespedData;
            huespedData = new HuespedData(conexion);
            huespedData.obtenerHuespedes().forEach(huespedes -> {
                System.out.println("Nombre : " + huespedes.getHuespedNombre() + "  DNI : " + huespedes.getHuespedDni());
            });
            **/

            /*************  TEST HABITACIONES  ************/
            
            // Listar habitaciones --
            /*
            HabitacionData habitacionData;
            habitacionData = new HabitacionData(conexion);
            Habitacion habitacion;
            habitacion = new Habitacion();
            habitacionData.obtenerHabitaciones().forEach(habitaciones -> {
               System.out.println("id habitacion: " + habitaciones.getHabitacionId() 
               + " Cantidad de camas: " + habitaciones.getHabitacionCantidadDeCamas());
            });
            **/
            
            // Listar por ID --
            /*
            HabitacionData habitacionData;
            habitacionData = new HabitacionData(conexion);
            Habitacion habitacion;
            habitacion = new Habitacion();
            int habitacionId = 5;
            habitacion = habitacionData.buscarHabitacion(habitacionId);
            System.out.println("Habitación Número: " + habitacion.getHabitacionId()
            + "  Habitación Tipo Id : " + habitacion.getTipoHabitacionId().getTipoHabitacionId()
            );
            **/
            
            // Listar por Tipo Habitacion --
            /*
            HabitacionData habitacionData;
            habitacionData = new HabitacionData(conexion);
            Habitacion habitacion;
            habitacion = new Habitacion();
            int tipoHabitacionId = 2;
            habitacionData.obtenerHabitacionesPorTipo(tipoHabitacionId).forEach(habitacionPorTipo -> {
                System.out.println("Habitación Número: " + habitacionPorTipo.getHabitacionId()
                        + "  Habitación precio : " + habitacionPorTipo.getTipoHabitacionId().getTipoHabitacionNombre()
                        + "  Habitación Tipo Id : " + habitacionPorTipo.getTipoHabitacionId().getTipoHabitacionId()
                );
            });
            **/

            // Guardar --
            /*
            HabitacionData habitacionData;
            habitacionData = new HabitacionData(conexion);
            TipoHabitacion tipoHabitacion;
            tipoHabitacion = new TipoHabitacion();
            tipoHabitacion.setTipoHabitacionId(2);
            Habitacion habitacionAGuardar;
            habitacionAGuardar = new Habitacion(3,true,tipoHabitacion);
            habitacionData.guardarHabitacion(habitacionAGuardar);
            **/

            // Editar --
            /*
            int idEditar = 8;
            HabitacionData habitacionData;
            habitacionData = new HabitacionData(conexion);
            TipoHabitacion tipoHabitacion;
            tipoHabitacion = new TipoHabitacion();
            tipoHabitacion.setTipoHabitacionId(3);

            Habitacion habitacionAEditar;
            habitacionAEditar = new Habitacion(idEditar, 5, true, tipoHabitacion);
            habitacionData.editarHabitacion(habitacionAEditar);
            */

        } catch (Exception e) {
            System.out.println("Error al instanciar la clase conexion: " + e.getMessage());
        }

    }

}

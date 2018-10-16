/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.vistas;

import hotel.modelo.CamasHabitacion;
import hotel.modelo.CamasHabitacionData;
import hotel.modelo.Conexion;
import hotel.modelo.Habitacion;
import hotel.modelo.HabitacionData;
import hotel.modelo.Huesped;
import hotel.modelo.HuespedData;
import hotel.modelo.TipoCama;
import hotel.modelo.TipoCamaData;
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
            /*************  TEST CAMAS_HABITACIONES  ************/
            //la habitacion debe guardarse en la tabla habitacion antes de guardar en camasHabitacion
            /* CamasHabitacion  camasHabitacion;
            CamasHabitacionData  camasHabitacionData;
            camasHabitacionData = new CamasHabitacionData(conexion);
            TipoCama tipoCama1 = new TipoCama(3, "doble");
            camasHabitacionData.guardarCamasHabitacion (habitacionAGuardar ,tipoCama1);
            System.out.println("La habitacion " + habitacionAGuardar.getHabitacionId() + " tiene una cama tipo " + tipoCama1.getTipoCamaNombre() );
             */
            
            
            //OBTENER CAMAS POR HABITACION
            
            /* CamasHabitacionData camasHabitacionData;
            camasHabitacionData = new CamasHabitacionData(conexion);
            // TipoHabitacion tipoHabitacion;
            //tipoHabitacion = new TipoHabitacion();
            //tipoHabitacion.setTipoHabitacionId(3);
            // CamasHabitacion camasHabitacion;
            // Habitacion habitacion;
            // habitacion = new Habitacion(5,false,tipoHabitacion);
            //TipoCama tipoCama;
            //tipoCama = new TipoCama(3, "simple");
            int tipoCamaId = 3;
            camasHabitacionData.obtenerCamasporHabitacion(tipoCamaId).forEach(camasPorHabitacion -> {
            System.out.println("Habitación Número: " + camasPorHabitacion.getCamasHabitacionId()
            + "  Habitación Tipo Cama : " + camasPorHabitacion.getTipoCamaId().getTipoCamaId()
            + " Habitacion id: " + camasPorHabitacion.getHabitacionId().getHabitacionId());
            });
             */
            
             /*************  TEST CAMAS_HABITACIONES  ************/
             
            //consultar tipo de cama por Id
        /* TipoCamaData tipoCamaData;
         tipoCamaData = new TipoCamaData(conexion);
         int tipoCamaId = 1;
         
         System.out.println("El tipo de cama consultada es: " +  tipoCamaData.buscarTipoCamaPorId(tipoCamaId).getTipoCamaNombre());
       */
        } catch (Exception e) {
            System.out.println("Error al instanciar la clase conexion: " + e.getMessage());
        }
    }

}

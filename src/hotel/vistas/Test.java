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
            TestCase testCase;
            testCase = new TestCase(conexion);

            /**
             * *********** TEST HUESPEDES  ***********
             */
            // Editar --
            testCase.testHuespedEditar();

            // Listar huéspedes --
            testCase.testHuespedesListar();
            
            // Is Huesped DNI
            testCase.testIsHuespedDni();

            /**
             * *********** TEST HABITACIONES  ***********
             */
            // Listar habitaciones --
            testCase.testHabitacionesListar();

            // Listar por ID --
            testCase.testHabitacionesListarPorId();

            // Listar por Tipo Habitacion --
            testCase.testHabitacionesListarPorTipo();

            // Guardar --
            testCase.testHabitacionesGuardar();

            // Editar --
            testCase.testHabitacionesEditar();

            /**
             * *********** TEST CAMAS_HABITACIONES  ***********
             */
            //la habitacion debe guardarse en la tabla habitacion antes de guardar en camasHabitacion
            testCase.testCamasHabitacionGuardar();
            
            //Listar Camas de habitacion por Tipo
            testCase.testCamasHabitacionListarPorTipo();
            
            //Listar Camas de habitacion por ID habitación
            testCase.testObtenerCamasPorHabitacionId();
 
        } catch (Exception e) {
            System.out.println("Error al instanciar la clase conexion: " + e.getMessage());
        }

    }

}

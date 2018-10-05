/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.vistas;

import hotel.modelo.Conexion;
import hotel.modelo.HabitacionData;
import hotel.modelo.Huesped;
import hotel.modelo.HuespedData;

/**
 *
 * @author clara
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        menuPrincipal = new javax.swing.JMenuBar();
        submenuArchivo = new javax.swing.JMenu();
        itemSalir = new javax.swing.JMenuItem();
        submenuHuespedes = new javax.swing.JMenu();
        itemHuespedes = new javax.swing.JMenuItem();
        submenuHabitaciones = new javax.swing.JMenu();
        itemHabitaciones = new javax.swing.JMenuItem();
        submenuReservas = new javax.swing.JMenu();
        itemReservas = new javax.swing.JMenuItem();
        submenuConsultas = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setBackground(new java.awt.Color(65, 105, 160));
        escritorio.setPreferredSize(new java.awt.Dimension(800, 577));
        escritorio.setLayout(null);

        menuPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menuPrincipal.setMaximumSize(new java.awt.Dimension(546, 32771));
        menuPrincipal.setPreferredSize(new java.awt.Dimension(546, 25));

        submenuArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/vistas/resources/folder-1.png"))); // NOI18N
        submenuArchivo.setText("Archivo");

        itemSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/vistas/resources/cancel.png"))); // NOI18N
        itemSalir.setText("Salir");
        itemSalir.setMaximumSize(new java.awt.Dimension(400, 100));
        itemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSalirActionPerformed(evt);
            }
        });
        submenuArchivo.add(itemSalir);

        menuPrincipal.add(submenuArchivo);

        submenuHuespedes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/vistas/resources/user-menu.png"))); // NOI18N
        submenuHuespedes.setText("Huéspedes");

        itemHuespedes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/vistas/resources/id-card.png"))); // NOI18N
        itemHuespedes.setText("Formulario de huéspedes");
        itemHuespedes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemHuespedesActionPerformed(evt);
            }
        });
        submenuHuespedes.add(itemHuespedes);

        menuPrincipal.add(submenuHuespedes);

        submenuHabitaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/vistas/resources/bank.png"))); // NOI18N
        submenuHabitaciones.setText("Habitaciones");

        itemHabitaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/vistas/resources/calendar-29.png"))); // NOI18N
        itemHabitaciones.setText("Formulario de habitaciones");
        itemHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemHabitacionesActionPerformed(evt);
            }
        });
        submenuHabitaciones.add(itemHabitaciones);

        menuPrincipal.add(submenuHabitaciones);

        submenuReservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/vistas/resources/star.png"))); // NOI18N
        submenuReservas.setText("Reservas");

        itemReservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/vistas/resources/calendar-39.png"))); // NOI18N
        itemReservas.setText("Hacer una reserva");
        itemReservas.setActionCommand("Hacer reservas");
        itemReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemReservasActionPerformed(evt);
            }
        });
        submenuReservas.add(itemReservas);

        menuPrincipal.add(submenuReservas);

        submenuConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/vistas/resources/analytics.png"))); // NOI18N
        submenuConsultas.setText("Consultas");
        menuPrincipal.add(submenuConsultas);

        setJMenuBar(menuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemHabitacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemHabitacionesActionPerformed

    private void itemHuespedesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemHuespedesActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        VistaHuesped formularioHuesped = new VistaHuesped();
        formularioHuesped.setVisible(true);
        formularioHuesped.setLocation(250, 100);
        escritorio.add(formularioHuesped);
        escritorio.moveToFront(formularioHuesped);
    }//GEN-LAST:event_itemHuespedesActionPerformed

    private void itemReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemReservasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemReservasActionPerformed

    private void itemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_itemSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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

        HabitacionData habitacionData;

        Huesped huesped;
        Huesped huespedEditar;
        HuespedData huespedDataEditar;
        HuespedData huespedDataListar;

        int id = 1;

        try {
            conexion = new Conexion();

            habitacionData = new HabitacionData(conexion);
            huespedDataEditar = new HuespedData(conexion);
            huespedDataListar = new HuespedData(conexion);

            // Test para editar huesped
            huesped = huespedDataEditar.buscarHuesped(id);

            huespedEditar = new Huesped(id, 3017871, "Clara conte", "La punta", "clara@clara.com", "2616266910");
            huespedDataEditar.editarHuesped(huespedEditar);

            // Test para ver listado de huéspedes
            huespedDataListar.obtenerHuespedes().forEach(huespedes -> {
                System.out.println("Nombre : " + huespedes.getHuespedNombre() + "  DNI : " + huespedes.getHuespedDni());

            });

            // Test para mostrar todos los datos de la tabla de habitaciones
            habitacionData.obtenerHabitaciones().forEach(habitacion -> {
                System.out.println("id habitacion: " + habitacion.getHabitacionId());

            });

        } catch (Exception e) {
            System.out.println("Error al instanciar la clase conexionmm: " + e.getMessage());
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem itemHabitaciones;
    private javax.swing.JMenuItem itemHuespedes;
    private javax.swing.JMenuItem itemReservas;
    private javax.swing.JMenuItem itemSalir;
    private javax.swing.JMenuBar menuPrincipal;
    private javax.swing.JMenu submenuArchivo;
    private javax.swing.JMenu submenuConsultas;
    private javax.swing.JMenu submenuHabitaciones;
    private javax.swing.JMenu submenuHuespedes;
    private javax.swing.JMenu submenuReservas;
    // End of variables declaration//GEN-END:variables
}

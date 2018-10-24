/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.vistas;

import hotel.modelo.Huesped;
import hotel.modelo.HuespedData;
import hotel.modelo.Conexion;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author clara
 */
public class VistaHuesped extends javax.swing.JInternalFrame {

    /**
     * Creates new form VistaHuesped
     */
    private Conexion conexion;
    private HuespedData huespedData;

    public VistaHuesped() {
        initComponents();

        try {
            conexion = new Conexion();
            huespedData = new HuespedData(conexion);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VistaHuesped.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textTitleHuesped = new javax.swing.JLabel();
        textHuespedDni = new javax.swing.JLabel();
        textHuespedNombre = new javax.swing.JLabel();
        textHuespedDomicilio = new javax.swing.JLabel();
        textHuespedEmail = new javax.swing.JLabel();
        textHuespedCelular = new javax.swing.JLabel();
        huespedDni = new javax.swing.JTextField();
        huespedNombre = new javax.swing.JTextField();
        huespedDomicilio = new javax.swing.JTextField();
        huespedEmail = new javax.swing.JTextField();
        huespedCelular = new javax.swing.JTextField();
        huespedBuscar = new javax.swing.JButton();
        huespedGuardar = new javax.swing.JButton();
        huespedBorrar = new javax.swing.JButton();
        huespedEditar = new javax.swing.JButton();
        huespedLimpiar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        textTitleHuesped.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        textTitleHuesped.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/vistas/resources/user-49.png"))); // NOI18N
        textTitleHuesped.setText(" DATOS HUESPED");

        textHuespedDni.setText("DNI");

        textHuespedNombre.setText("NOMBRE");

        textHuespedDomicilio.setText("DOMICILIO");

        textHuespedEmail.setText("E-MAIL");

        textHuespedCelular.setText("CELULAR");

        huespedDni.setToolTipText("Campo Requerido");
        huespedDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                huespedDniActionPerformed(evt);
            }
        });

        huespedNombre.setToolTipText("Campo Requerido"); // NOI18N

        huespedDomicilio.setToolTipText("Campo Requerido");

        huespedCelular.setToolTipText("Campo Requerido");

        huespedBuscar.setText("BUSCAR");
        huespedBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                huespedBuscarActionPerformed(evt);
            }
        });

        huespedGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/vistas/resources/checked-1.png"))); // NOI18N
        huespedGuardar.setText("GUARDAR");
        huespedGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                huespedGuardarActionPerformed(evt);
            }
        });

        huespedBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/vistas/resources/cancel.png"))); // NOI18N
        huespedBorrar.setText("BORRAR");
        huespedBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                huespedBorrarActionPerformed(evt);
            }
        });

        huespedEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/vistas/resources/pencil.png"))); // NOI18N
        huespedEditar.setText("EDITAR");
        huespedEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                huespedEditarActionPerformed(evt);
            }
        });

        huespedLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotel/vistas/resources/escoba.png"))); // NOI18N
        huespedLimpiar.setText("LIMPIAR");
        huespedLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                huespedLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textHuespedDni, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textHuespedNombre)
                            .addComponent(textHuespedDomicilio)
                            .addComponent(textHuespedEmail)
                            .addComponent(textHuespedCelular))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(huespedGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(huespedEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(huespedLimpiar)
                                .addGap(26, 26, 26)
                                .addComponent(huespedBorrar))
                            .addComponent(huespedNombre)
                            .addComponent(huespedDomicilio)
                            .addComponent(huespedEmail)
                            .addComponent(huespedCelular)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(huespedDni, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(huespedBuscar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(textTitleHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(textTitleHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(huespedDni, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(huespedBuscar)
                    .addComponent(textHuespedDni))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(huespedNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textHuespedNombre))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textHuespedDomicilio)
                    .addComponent(huespedDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textHuespedEmail)
                    .addComponent(huespedEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(huespedCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textHuespedCelular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(huespedBorrar)
                    .addComponent(huespedGuardar)
                    .addComponent(huespedLimpiar)
                    .addComponent(huespedEditar))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void huespedGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_huespedGuardarActionPerformed
        // Guarda un huesped nuevo
        if (huespedDni.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, " Dni no puede estar vacio ");
        } else if (!validarCampoNumEntero(huespedDni.getText())) {
            JOptionPane.showMessageDialog(null, " Dni solo ingrese valores numéricos ");
        } else if (huespedNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, " Nombre no puede estar vacio ");
        } else if (huespedDomicilio.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, " Domicilio no puede estar vacio ");
        } else if (huespedCelular.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, " Teléfono no puede estar vacio ");
        } else {
            int dni = Integer.parseInt(huespedDni.getText());
            String nombre = huespedNombre.getText();
            String domicilio = huespedDomicilio.getText();
            String email = huespedEmail.getText();
            String celular = huespedCelular.getText();

            if (!huespedData.isHuespedDni(dni)) {
                Huesped huesped = new Huesped(dni, nombre, domicilio, email, celular);
                huespedData.guardarHuesped(huesped);
                JOptionPane.showMessageDialog(null, " Nuevo huesped agregado ");
            } else {
                JOptionPane.showMessageDialog(null, " El huesped ya existe ");
            }
        }
    }//GEN-LAST:event_huespedGuardarActionPerformed

    private void huespedBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_huespedBuscarActionPerformed

        // Búsca un huesped por DNI
        // Falta validar si el campo DNI está vacio
        int buscarHuespedDni = Integer.parseInt(huespedDni.getText());
        Huesped huesped = huespedData.buscarHuesped(buscarHuespedDni);

        if (huesped != null) {
            huespedNombre.setText(huesped.getHuespedNombre());
            huespedDomicilio.setText(huesped.getHuespedDomicilio());
            huespedEmail.setText(huesped.getHuespedEmail());
            huespedCelular.setText(huesped.getHuespedCelular());

        } else {
            JOptionPane.showMessageDialog(huespedBuscar, "El DNI no existe, o ha introducido caracteres no válidos. Solo ingrese números. ");
        }

    }//GEN-LAST:event_huespedBuscarActionPerformed

    private void huespedBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_huespedBorrarActionPerformed

        int Dni = Integer.parseInt(huespedDni.getText());
        huespedData.borrarHuesped(Dni);

        vaciarCampos();

        JOptionPane.showMessageDialog(huespedBorrar, "Huesped borrado");
    }//GEN-LAST:event_huespedBorrarActionPerformed

    private void huespedEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_huespedEditarActionPerformed

        int buscarHuespedDni = Integer.parseInt(huespedDni.getText());
        Huesped huesped = huespedData.buscarHuesped(buscarHuespedDni);

        if (huesped != null) {

            huesped.setHuespedNombre(huespedNombre.getText());
            huesped.setHuespedDomicilio(huespedDomicilio.getText());
            huesped.setHuespedEmail(huespedEmail.getText());
            huesped.setHuespedCelular(huespedCelular.getText());

            huespedData.editarHuesped(huesped);

            JOptionPane.showMessageDialog(huespedBuscar, " Datos editados! ");

        } else {
            JOptionPane.showMessageDialog(huespedBuscar, "El DNI no existe, o ha introducido caracteres no válidos. Solo ingrese números. ");
        } // TODO add your handling code here:
    }//GEN-LAST:event_huespedEditarActionPerformed

    private void huespedLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_huespedLimpiarActionPerformed
        vaciarCampos();
    }//GEN-LAST:event_huespedLimpiarActionPerformed

    private void huespedDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_huespedDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_huespedDniActionPerformed

    /**
     * Métodos Auxiliares *
     */
    // Valida que un números como texto se pueden convertir en entero
    private boolean validarCampoNumEntero(String value) {
        try {
            int num = Integer.parseInt(value);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    // Vacia campos en formulario
    private void vaciarCampos() {
        huespedDni.setText("");
        huespedNombre.setText("");
        huespedDomicilio.setText("");
        huespedEmail.setText("");
        huespedCelular.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton huespedBorrar;
    private javax.swing.JButton huespedBuscar;
    private javax.swing.JTextField huespedCelular;
    private javax.swing.JTextField huespedDni;
    private javax.swing.JTextField huespedDomicilio;
    private javax.swing.JButton huespedEditar;
    private javax.swing.JTextField huespedEmail;
    private javax.swing.JButton huespedGuardar;
    private javax.swing.JButton huespedLimpiar;
    private javax.swing.JTextField huespedNombre;
    private javax.swing.JLabel textHuespedCelular;
    private javax.swing.JLabel textHuespedDni;
    private javax.swing.JLabel textHuespedDomicilio;
    private javax.swing.JLabel textHuespedEmail;
    private javax.swing.JLabel textHuespedNombre;
    private javax.swing.JLabel textTitleHuesped;
    // End of variables declaration//GEN-END:variables
}

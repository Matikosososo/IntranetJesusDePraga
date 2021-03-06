/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import factories.MySQL_AlumnoDAO;
import factories.MySQL_ObservacionDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Alumno;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class JFrameMenuAlumno extends javax.swing.JFrame {

    private String rutVar;
    private MySQL_AlumnoDAO al;
    private MySQL_ObservacionDAO o;

    public JFrameMenuAlumno() {

        try {

            initComponents();

//            lbl_Alum.setText("Hola" + jInvisibleAlumno.getText());
//            System.out.println(" MENU "+ jInvisibleAlumno.getText()+" AQUI");
            this.setLocationRelativeTo(null);
//            jInvisibleAlumno.setVisible(false);
//            lbl_Alum.setText(rutVar);
            System.out.println();
            al = new MySQL_AlumnoDAO();
            o = new MySQL_ObservacionDAO();
//            setRutjFrame(jInvisibleAlumno.getText());

//            lbl_Alum.setText("Hola" + jInvisibleAlumno.getText() );
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JFrameMenuAlumno.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JFrameMenuAlumno.class.getName()).log(Level.SEVERE, null, ex);
        }
//        String rutString = jInvisibleAlumno.getText();
//        System.out.println();
//        String rutString = jInvisibleAlumno.getText();
//        System.out.println();

    }
//

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btnVerNotaAlumno = new javax.swing.JButton();
        btnVerMensajeAlumno = new javax.swing.JButton();
        btnCerrarSesionAlumno = new javax.swing.JButton();
        btnCambiarPassAlumno = new javax.swing.JButton();
        btnCambiarPassAlumno1 = new javax.swing.JButton();
        jInvisibleAlumno = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbl_Alum = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alumno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 24))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel11.setText("Bienvenido/a");

        btnVerNotaAlumno.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnVerNotaAlumno.setText("Ver Notas");
        btnVerNotaAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerNotaAlumnoActionPerformed(evt);
            }
        });

        btnVerMensajeAlumno.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnVerMensajeAlumno.setText("Ver Mensajes De profesores");
        btnVerMensajeAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerMensajeAlumnoActionPerformed(evt);
            }
        });

        btnCerrarSesionAlumno.setText("Cerrar Sesión");
        btnCerrarSesionAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionAlumnoActionPerformed(evt);
            }
        });

        btnCambiarPassAlumno.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnCambiarPassAlumno.setText("Horario");
        btnCambiarPassAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarPassAlumnoActionPerformed(evt);
            }
        });

        btnCambiarPassAlumno1.setText("Cambiar Contraseña");
        btnCambiarPassAlumno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarPassAlumno1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icon/alumno.png"))); // NOI18N

        lbl_Alum.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lbl_Alum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(175, 175, 175))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(161, 161, 161))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jInvisibleAlumno)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnVerMensajeAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVerNotaAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCambiarPassAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCambiarPassAlumno1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCerrarSesionAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(100, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_Alum, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_Alum, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnVerNotaAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCambiarPassAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVerMensajeAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCambiarPassAlumno1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCerrarSesionAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jInvisibleAlumno))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCambiarPassAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarPassAlumnoActionPerformed

    }//GEN-LAST:event_btnCambiarPassAlumnoActionPerformed

    private void btnCambiarPassAlumno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarPassAlumno1ActionPerformed
        JFramePassword verFormPass = new JFramePassword();
        verFormPass.setVisible(true);
        String rutVaribale = jInvisibleAlumno.getText();
        verFormPass.jInsivisiblePass.setText(rutVaribale);
        System.out.println("La wea esss" + rutVaribale);
    }//GEN-LAST:event_btnCambiarPassAlumno1ActionPerformed

    private void btnVerNotaAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerNotaAlumnoActionPerformed
        JFrameAsignatura verFormNotas = new JFrameAsignatura();

        verFormNotas.setRutjFrame(rutVar);
        verFormNotas.setVisible(true);
    }//GEN-LAST:event_btnVerNotaAlumnoActionPerformed

    private void btnVerMensajeAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerMensajeAlumnoActionPerformed
        
        JFrameMensaje verFormMensaje = new JFrameMensaje();
        verFormMensaje.setVisible(true);
        String rutVaribale = jInvisibleAlumno.getText();
        verFormMensaje.lblInvisibleRut.setText(rutVaribale);
//        String rutVaribale = jInvisibleAlumno.getText();
//        verFormMensaje.lblInvisibleRut.setText(rutVaribale);
//        cargarNombre();
    }//GEN-LAST:event_btnVerMensajeAlumnoActionPerformed

    private void btnCerrarSesionAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionAlumnoActionPerformed
        this.setVisible(false);
        IntranetJesusDePraga inicio = new IntranetJesusDePraga();
        inicio.setVisible(true);

    }//GEN-LAST:event_btnCerrarSesionAlumnoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameMenuAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMenuAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMenuAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMenuAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMenuAlumno().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCambiarPassAlumno;
    private javax.swing.JButton btnCambiarPassAlumno1;
    private javax.swing.JButton btnCerrarSesionAlumno;
    private javax.swing.JButton btnVerMensajeAlumno;
    private javax.swing.JButton btnVerNotaAlumno;
    public static javax.swing.JLabel jInvisibleAlumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbl_Alum;
    // End of variables declaration//GEN-END:variables
    
    public String getRut(String rut){
        String rutAL = rut;
        return rutAL;
    }
    public void setRutjFrame(String rut) {
        rutVar = rut;
        jInvisibleAlumno.setText(rut);
        jInvisibleAlumno.setVisible(false);
        System.out.println("RUT-->" + rutVar);
    }
        
    public void cargarNombre() {
        String nombre = al.getByNombre(rutVar);
        lbl_Alum.setText(nombre);
    }
}

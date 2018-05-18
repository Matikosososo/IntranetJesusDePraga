/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import exception.MotorNoSoportadoException;
import factories.DAOFactory;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Asignatura;
import model.Nota;
import model.TMModificarNota;
import model.Usuario;

/**
 *
 * @author valvarado
 */
public class JFrameModificarNotas extends javax.swing.JFrame {

    /**
     * Creates new form JFrameModificarNotas
     */
    private String rutVar;
    private List<Asignatura> listaAsig;
    private Usuario user;
    private int idAsig;
    private List<Nota> listaNota;
    private String asig;
    private boolean activo = false;

    public JFrameModificarNotas() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbox_asignatura = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable_modificar_notas = new javax.swing.JTable();
        btn_modificar = new javax.swing.JButton();
        btn_volver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jInvisibleModificarNotas = new javax.swing.JLabel();
        cbox_nota = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modificar Notas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 24))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icon/notas.png"))); // NOI18N

        cbox_asignatura.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbox_asignatura.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione una asignatura" }));
        cbox_asignatura.setToolTipText("Seleccione una asignatura");
        cbox_asignatura.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbox_asignaturaItemStateChanged(evt);
            }
        });
        cbox_asignatura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbox_asignaturaMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbox_asignaturaMousePressed(evt);
            }
        });
        cbox_asignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_asignaturaActionPerformed(evt);
            }
        });

        jtable_modificar_notas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jtable_modificar_notas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtable_modificar_notas);

        btn_modificar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_modificar.setText("Modificar");

        btn_volver.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btn_volver.setText("Volver");
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Asignatura: ");

        cbox_nota.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cbox_nota.setToolTipText("Seleccione la nota");
        cbox_nota.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbox_notaItemStateChanged(evt);
            }
        });
        cbox_nota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbox_notaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cbox_notaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cbox_notaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbox_notaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cbox_notaMouseReleased(evt);
            }
        });
        cbox_nota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_notaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_modificar)
                        .addGap(290, 290, 290)
                        .addComponent(btn_volver)
                        .addGap(0, 80, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jInvisibleModificarNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cbox_asignatura, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbox_nota, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbox_asignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbox_nota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jInvisibleModificarNotas, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_modificar)
                    .addComponent(btn_volver))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbox_asignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_asignaturaActionPerformed
//        a = (Asignatura) cbox_asignatura.getSelectedItem();

    }//GEN-LAST:event_cbox_asignaturaActionPerformed

    private void cbox_asignaturaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbox_asignaturaMousePressed

        if (activo == false) {
            cargarAsignaturas();
            cbox_asignatura.removeItemAt(0);
            activo = true;
        }
    }//GEN-LAST:event_cbox_asignaturaMousePressed

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btn_volverActionPerformed

    private void cbox_asignaturaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbox_asignaturaItemStateChanged
        cbox_nota.removeAllItems();
        Asignatura a = (Asignatura) cbox_asignatura.getSelectedItem();
        cargarCantNotas(a);


    }//GEN-LAST:event_cbox_asignaturaItemStateChanged

    private void cbox_notaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbox_notaMousePressed


    }//GEN-LAST:event_cbox_notaMousePressed

    private void cbox_asignaturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbox_asignaturaMouseClicked

    }//GEN-LAST:event_cbox_asignaturaMouseClicked

    private void cbox_notaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbox_notaMouseClicked

    }//GEN-LAST:event_cbox_notaMouseClicked

    private void cbox_notaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_notaActionPerformed

    }//GEN-LAST:event_cbox_notaActionPerformed

    private void cbox_notaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbox_notaItemStateChanged
        if (evt.getStateChange() == evt.SELECTED) {
            Asignatura a = (Asignatura) cbox_asignatura.getSelectedItem();
            Nota n = (Nota) cbox_nota.getSelectedItem();
            cargarNotasTabla(a, n);
        }else{
            
        }
    }//GEN-LAST:event_cbox_notaItemStateChanged

    private void cbox_notaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbox_notaMouseReleased

    }//GEN-LAST:event_cbox_notaMouseReleased

    private void cbox_notaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbox_notaMouseEntered

    }//GEN-LAST:event_cbox_notaMouseEntered

    private void cbox_notaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbox_notaMouseExited

    }//GEN-LAST:event_cbox_notaMouseExited

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
            java.util.logging.Logger.getLogger(JFrameModificarNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameModificarNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameModificarNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameModificarNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameModificarNotas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_volver;
    private javax.swing.JComboBox cbox_asignatura;
    private javax.swing.JComboBox cbox_nota;
    private javax.swing.JLabel jInvisibleModificarNotas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtable_modificar_notas;
    // End of variables declaration//GEN-END:variables

    private void init() {
    }

    private void cargarAsignaturas() {

        try {

            String rut = jInvisibleModificarNotas.getText();
            user = DAOFactory.getInstance().getUsuarioDAO(DAOFactory.Motor.MY_SQL).search(rut).get(0);
            listaAsig = DAOFactory.getInstance().getAsignaturaDAO(DAOFactory.Motor.MY_SQL).getByProfe(user.getId());

            for (Asignatura a : listaAsig) {
                cbox_asignatura.addItem(a);

            }

        } catch (MotorNoSoportadoException ex) {
            Logger.getLogger(JFrameModificarNotas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JFrameModificarNotas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JFrameModificarNotas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void setRutjFrame(String txt) {
        this.rutVar = txt;
        jInvisibleModificarNotas.setText(txt);
        jInvisibleModificarNotas.setVisible(false);
        jInvisibleModificarNotas.setEnabled(false);
    }

    private void cargarCantNotas(Asignatura a) {
        try {

            listaNota = DAOFactory.getInstance().getNotaDAO(DAOFactory.Motor.MY_SQL).getIdentificador(a.getNombre());
            System.out.println(listaNota);

            for (Nota n : listaNota) {
                cbox_nota.addItem(n);
            }

        } catch (MotorNoSoportadoException ex) {
            Logger.getLogger(JFrameModificarNotas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JFrameModificarNotas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JFrameModificarNotas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void cargarNotasTabla(Asignatura a, Nota n) {

        try {

            List<Nota> lista = DAOFactory.getInstance().getNotaDAO(DAOFactory.Motor.MY_SQL).getNotaByAsig(a.getNombre(), n.getIdentificador());
            TMModificarNota tm;
            for (Nota nota : lista) {
                System.out.println("Lista notas " + lista);
                tm = new TMModificarNota(lista);
                jtable_modificar_notas.setModel(tm);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JFrameModificarNotas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JFrameModificarNotas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MotorNoSoportadoException ex) {
            Logger.getLogger(JFrameModificarNotas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}

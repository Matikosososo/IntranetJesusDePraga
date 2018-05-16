package gui;

import exception.MotorNoSoportadoException;
import factories.DAOFactory;
import factories.MySQL_AlumnoDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import model.Usuario;

public class IntranetJesusDePraga extends javax.swing.JFrame {

    Usuario user;
    
    private MySQL_AlumnoDAO al;
    
    public IntranetJesusDePraga() {
        try {
            initComponents();
            this.setLocationRelativeTo(null);
            
            al = new MySQL_AlumnoDAO();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(IntranetJesusDePraga.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(IntranetJesusDePraga.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanelInicio = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_login_ingresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_login_usuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_login_clave = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        btn_login_limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelInicio.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Intranet Jesús de Praga");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_login_ingresar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_login_ingresar.setText("Ingresar");
        btn_login_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_login_ingresarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Bienvenido a nuestra intranet, identifíquese por favor.");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Usuario:");

        txt_login_usuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_login_usuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_login_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_login_usuarioKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Clave:");

        txt_login_clave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_login_clave.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_login_clave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_login_claveKeyPressed(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/icon/intranet.png"))); // NOI18N

        btn_login_limpiar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_login_limpiar.setText("Limpiar");

        javax.swing.GroupLayout jPanelInicioLayout = new javax.swing.GroupLayout(jPanelInicio);
        jPanelInicio.setLayout(jPanelInicioLayout);
        jPanelInicioLayout.setHorizontalGroup(
            jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInicioLayout.createSequentialGroup()
                .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInicioLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                            .addGroup(jPanelInicioLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanelInicioLayout.createSequentialGroup()
                                        .addComponent(btn_login_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                                        .addComponent(btn_login_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelInicioLayout.createSequentialGroup()
                                        .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(47, 47, 47)
                                        .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_login_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                            .addComponent(txt_login_clave))))
                                .addGap(30, 30, 30))))
                    .addGroup(jPanelInicioLayout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel5)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanelInicioLayout.setVerticalGroup(
            jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_login_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_login_clave, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(jPanelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_login_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_login_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_login_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_login_ingresarActionPerformed

        try {
            String rut = txt_login_usuario.getText();
            String password = new String(txt_login_clave.getPassword());

            password = md5(password);
            
            jFrameMenuAdmin menuAdmin = new jFrameMenuAdmin();
            jFrameMenuAlumno menuAlumno = new jFrameMenuAlumno();
            jFrameMenuProfesor menuProfesor = new jFrameMenuProfesor();
            

            if (rut.equals("") || !rut.equals(DAOFactory.getInstance().getUsuarioDAO(DAOFactory.Motor.MY_SQL).getByRut(rut))) {
                JOptionPane.showMessageDialog(null, "Usuario Invalido", "ERROR", JOptionPane.OK_OPTION);
                txt_login_usuario.select(0, txt_login_usuario.getText().length());
                txt_login_usuario.requestFocus();
                txt_login_clave.setText(null);
            } else if (!password.equals(DAOFactory.getInstance().getUsuarioDAO(DAOFactory.Motor.MY_SQL).search(rut).get(0).getContrasenia()) || (password.equals(""))) {
                JOptionPane.showMessageDialog(null, "Contraseña Incorrecta", "ERROR", JOptionPane.OK_OPTION);
                txt_login_clave.setText(null);
                txt_login_clave.requestFocus();
            } else {
                user = DAOFactory.getInstance().getUsuarioDAO(DAOFactory.Motor.MY_SQL).search(rut).get(0);
                System.out.println(user.getTipo());
                switch (user.getTipo()) {
                    case 1:
                        menuProfesor.setLocationRelativeTo(null);
                        menuProfesor.setVisible(true);

                        menuProfesor.getRutjFrame(rut);//hacer para todos
                        this.setVisible(false);
                        txt_login_clave.setText(null);
                        break;

                    case 2:
                        
                        menuAlumno.setLocationRelativeTo(null);
                        menuAlumno.setVisible(true);
                        menuAlumno.setRutjFrame(rut);
                        
//                        System.out.println(rut);
//                        menuAlumno.init();
                        
                        
                        this.setVisible(false);
                        txt_login_clave.setText(null);
                        break;
                    case 3:
                        menuAdmin.setLocationRelativeTo(null);
                        menuAdmin.setVisible(true);

                        menuAdmin.setRutjFrame(rut);
                        this.setVisible(false);
                        txt_login_clave.setText(null);
                        break;
                }
            }
        } catch (MotorNoSoportadoException ex) {
            Logger.getLogger(IntranetJesusDePraga.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(IntranetJesusDePraga.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(IntranetJesusDePraga.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btn_login_ingresarActionPerformed

    private void txt_login_claveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_login_claveKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            try {
                String rut = txt_login_usuario.getText();
                String password = new String(txt_login_clave.getPassword());

                password = md5(password);

                jFrameMenuAdmin menuAdmin = new jFrameMenuAdmin();
                jFrameMenuAlumno menuAlumno = new jFrameMenuAlumno();
                jFrameMenuProfesor menuProfe = new jFrameMenuProfesor();

                if (rut.equals("") || !rut.equals(DAOFactory.getInstance().getUsuarioDAO(DAOFactory.Motor.MY_SQL).getByRut(rut))) {
                    JOptionPane.showMessageDialog(null, "Usuario Invalido", "ERROR", JOptionPane.OK_OPTION);
                    txt_login_usuario.select(0, txt_login_usuario.getText().length());
                    txt_login_usuario.requestFocus();
                    txt_login_clave.setText(null);
                } else if (!password.equals(DAOFactory.getInstance().getUsuarioDAO(DAOFactory.Motor.MY_SQL).search(rut).get(0).getContrasenia()) || (password.equals(""))) {
                    JOptionPane.showMessageDialog(null, "Contraseña Incorrecta", "ERROR", JOptionPane.OK_OPTION);
                    txt_login_clave.setText(null);
                    txt_login_clave.requestFocus();
                } else {
                    user = DAOFactory.getInstance().getUsuarioDAO(DAOFactory.Motor.MY_SQL).search(rut).get(0);
                    System.out.println(user.getTipo());
                    switch (user.getTipo()) {
                        case 1:
                            menuProfe.setVisible(true);
                            menuProfe.getRutjFrame(rut);//hacer para todos
                            this.setVisible(false);
                            txt_login_clave.setText(null);
                            break;

                        case 2:
                            menuAlumno.setVisible(true);
                            menuAlumno.setRutjFrame(rut);
                            this.setVisible(false);
                            txt_login_clave.setText(null);
                            break;
                        case 3:
                            menuAdmin.setVisible(true);
                            menuAdmin.setRutjFrame(rut);
                            this.setVisible(false);
                            txt_login_clave.setText(null);
                            break;
                    }
                }
            } catch (MotorNoSoportadoException ex) {
                Logger.getLogger(IntranetJesusDePraga.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(IntranetJesusDePraga.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(IntranetJesusDePraga.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_txt_login_claveKeyPressed

    private void txt_login_usuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_login_usuarioKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER) {
            try {
                String rut = txt_login_usuario.getText();
                String password = new String(txt_login_clave.getPassword());

                password = md5(password);

                jFrameMenuAdmin menuAdmin = new jFrameMenuAdmin();
                jFrameMenuAlumno menuAlumno = new jFrameMenuAlumno();
                jFrameMenuProfesor menuProfe = new jFrameMenuProfesor();

                if (rut.equals("") || !rut.equals(DAOFactory.getInstance().getUsuarioDAO(DAOFactory.Motor.MY_SQL).getByRut(rut))) {
                    JOptionPane.showMessageDialog(null, "Usuario Invalido", "ERROR", JOptionPane.OK_OPTION);
                    txt_login_usuario.select(0, txt_login_usuario.getText().length());
                    txt_login_usuario.requestFocus();
                    txt_login_clave.setText(null);
                } else if (!password.equals(DAOFactory.getInstance().getUsuarioDAO(DAOFactory.Motor.MY_SQL).search(rut).get(0).getContrasenia()) || (password.equals(""))) {
                    JOptionPane.showMessageDialog(null, "Contraseña Incorrecta", "ERROR", JOptionPane.OK_OPTION);
                    txt_login_clave.setText(null);
                    txt_login_clave.requestFocus();
                } else {
                    user = DAOFactory.getInstance().getUsuarioDAO(DAOFactory.Motor.MY_SQL).search(rut).get(0);
                    System.out.println(user.getTipo());
                    switch (user.getTipo()) {
                        case 1:
                            menuProfe.setVisible(true);
                            menuProfe.getRutjFrame(rut);//hacer para todos
                            this.setVisible(false);
                            txt_login_clave.setText(null);
                            break;

                        case 2:
                            menuAlumno.setVisible(true);
                            menuAlumno.setRutjFrame(rut);
                            this.setVisible(false);
                            txt_login_clave.setText(null);
                            break;
                        case 3:
                            menuAdmin.setVisible(true);
                            menuAdmin.setRutjFrame(rut);
                            this.setVisible(false);
                            txt_login_clave.setText(null);
                            break;
                    }
                }
            } catch (MotorNoSoportadoException ex) {
                Logger.getLogger(IntranetJesusDePraga.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(IntranetJesusDePraga.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(IntranetJesusDePraga.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_txt_login_usuarioKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            /* Set the Nimbus look and feel */
            //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
            /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
            * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
             */
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            //</editor-fold>
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(IntranetJesusDePraga.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(IntranetJesusDePraga.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(IntranetJesusDePraga.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(IntranetJesusDePraga.class.getName()).log(Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IntranetJesusDePraga().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login_ingresar;
    private javax.swing.JButton btn_login_limpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanelInicio;
    private javax.swing.JPasswordField txt_login_clave;
    private javax.swing.JTextField txt_login_usuario;
    // End of variables declaration//GEN-END:variables

    private static String getHash(String txt, String hashType) {
        try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance(hashType);
            byte[] array = md.digest(txt.getBytes());
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < array.length; ++i) {
                sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1, 3));
            }
            return sb.toString();
        } catch (java.security.NoSuchAlgorithmException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    private String md5(String txt) {
        return getHash(txt, "MD5");
    }
}

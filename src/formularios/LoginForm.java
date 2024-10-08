/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formularios;

import Clases.consultas;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.event.MouseEvent;

/**
 *
 * @author angel
 */

public class LoginForm extends javax.swing.JFrame {

    /**
     * Creates new form LoginForm
     */
    
    public LoginForm() {
        
        // Eliminar la barra de título
        setUndecorated(true); 
        initComponents();
        
        // Establecer el título de la ventana
        this.setTitle("Recursos Humanos - Inicio de Sesion");

        //Centrar el formulario
        this.setLocationRelativeTo(this);

        // Cargar el logo como icono de la ventana desde los recursos del proyecto
        ImageIcon logo = new ImageIcon(getClass().getResource("/imagenes/icono.png"));
        this.setIconImage(logo.getImage());

        // Configurar KeyListener para el campo de texto jTextNuevo
        jTextUsuario.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                // Convertir el carácter a minúscula si es una letra mayúscula
                if (Character.isUpperCase(c)) {
                    e.setKeyChar(Character.toLowerCase(c));
                }
                // Verificar si el carácter ingresado es una letra sin acento
                if (!Character.isLetter(c) || !isLatinLetter(c)) {
                    e.consume(); // Si no es válido, lo eliminamos
                }
                // Verificar el tamaño máximo de caracteres
                if (jTextUsuario.getText().length() >= 10) {
                    e.consume(); // Si el tamaño es mayor o igual a 10, no permitir más caracteres
                }
            }

            private boolean isLatinLetter(char c) {
                // Comprobar si el carácter es una letra del alfabeto latino básico sin acentos
                return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
            }
        });
        jTextClave.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                // Verificar el tamaño máximo de caracteres
                if (jTextClave.getText().length() >= 10) {
                    e.consume(); // Si el tamaño es mayor o igual a 10, no permitir más caracteres
                }
            }
        });
        

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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextClave = new javax.swing.JPasswordField();
        jbtnAceder = new javax.swing.JButton();
        jLRegistro = new javax.swing.JLabel();
        jLPwd = new javax.swing.JLabel();
        jRegion = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLMessage = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLCerrar = new javax.swing.JLabel();
        jLMinimizar = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(jLabel1.getFont().deriveFont((float)24));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("HUMAN ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 106, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/image.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 204));
        jLabel3.setText("Usuario:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        jTextUsuario.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jTextUsuario.setForeground(new java.awt.Color(0, 204, 204));
        jTextUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextUsuario.setBorder(null);
        jTextUsuario.setName("jTextUsuario"); // NOI18N
        jTextUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(jTextUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 200, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 204));
        jLabel4.setText("Clave:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jTextClave.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jTextClave.setForeground(new java.awt.Color(0, 204, 204));
        jTextClave.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextClave.setBorder(null);
        jTextClave.setName("jTextPass"); // NOI18N
        jPanel1.add(jTextClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 200, -1));

        jbtnAceder.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 18)); // NOI18N
        jbtnAceder.setForeground(new java.awt.Color(255, 255, 255));
        jbtnAceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/image (8).png"))); // NOI18N
        jbtnAceder.setToolTipText("");
        jbtnAceder.setBorder(null);
        jbtnAceder.setBorderPainted(false);
        jbtnAceder.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbtnAceder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtnAcederMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnAcederMouseExited(evt);
            }
        });
        jbtnAceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAcederActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnAceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, -1));

        jLRegistro.setText(" ¿No tienes cuenta? Registrate");
        jLRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLRegistroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLRegistroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLRegistroMouseExited(evt);
            }
        });
        jPanel1.add(jLRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 170, -1));

        jLPwd.setText(" ¿Olvidaste tu clave?");
        jLPwd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLPwdMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLPwdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLPwdMouseExited(evt);
            }
        });
        jPanel1.add(jLPwd, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 130, -1));

        jRegion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Globe_32px.png"))); // NOI18N
        jRegion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jRegionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jRegionMouseExited(evt);
            }
        });
        jPanel1.add(jRegion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 30, 40));

        jLabel7.setBackground(new java.awt.Color(0, 204, 204));
        jLabel7.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 204, 204));
        jLabel7.setText(" INICIO DE SESION");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        jLMessage.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 10)); // NOI18N
        jPanel1.add(jLMessage, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 190, 20));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("RESOURCES");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("HUMAN");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título(1).png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-250, 0, 550, 60));

        jLCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Multiply_32px.png"))); // NOI18N
        jLCerrar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLCerrarMouseMoved(evt);
            }
        });
        jLCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLCerrarMouseExited(evt);
            }
        });
        jPanel1.add(jLCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 30, 30));

        jLMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8_Expand_Arrow_32px.png"))); // NOI18N
        jLMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLMinimizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLMinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLMinimizarMouseExited(evt);
            }
        });
        jPanel1.add(jLMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, 30, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 204, 204));
        jSeparator2.setForeground(new java.awt.Color(0, 204, 204));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 200, 10));

        jSeparator3.setBackground(new java.awt.Color(0, 204, 204));
        jSeparator3.setForeground(new java.awt.Color(0, 204, 204));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 200, 10));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título(2).png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 600, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jTextUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextUsuarioActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextUsuarioActionPerformed

    private void jbtnAcederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAcederActionPerformed
        // TODO add your handling code here:
        String user = jTextUsuario.getText();
        String clave = new String(jTextClave.getPassword());

        // Verificar que todos los campos estén llenos
        if (user.isEmpty() || clave.isEmpty()) {
            // Mostrar mensaje de advertencia si algún campo está vacío
            JOptionPane.showMessageDialog(null, "Todos los campos deben llenarse");
            return; // Salir del método sin realizar el registro
        } else {
            consultas con = new consultas();
            con.consultarUsuario(jTextUsuario.getText(), jTextClave.getText());
            
    }//GEN-LAST:event_jbtnAcederActionPerformed
            }
    
    private void jLPwdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLPwdMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        RecuperarForm f3=new RecuperarForm();
        f3.setVisible(true);
    }//GEN-LAST:event_jLPwdMouseClicked

    private void jLPwdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLPwdMouseEntered
        // TODO add your handling code here:
        jLPwd.setForeground(new java.awt.Color(0, 204, 204));
        // Cambiar el cursor a la mano cuando el mouse entra en la etiqueta
        jLPwd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLPwdMouseEntered

    private void jLPwdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLPwdMouseExited
        // TODO add your handling code here:
        jLPwd.setForeground(new java.awt.Color(0, 0, 0));
        // Restaurar el cursor predeterminado cuando el mouse sale de la etiqueta
        jLPwd.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jLPwdMouseExited

    private void jLRegistroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLRegistroMouseExited
        // TODO add your handling code here:
        jLRegistro.setForeground(new java.awt.Color(0, 0, 0));
        jLRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jLRegistroMouseExited

    private void jLRegistroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLRegistroMouseEntered
        // TODO add your handling code here:
        jLRegistro.setForeground(new java.awt.Color(0, 204, 204));
        jLRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLRegistroMouseEntered

    private void jLRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLRegistroMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        registroForm f1=new registroForm();
        f1.setVisible(true);
    }//GEN-LAST:event_jLRegistroMouseClicked

    private void jRegionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRegionMouseEntered
        // TODO add your handling code here:
        jLMessage.setText("Región: Latinoamérica");
    }//GEN-LAST:event_jRegionMouseEntered

    private void jRegionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRegionMouseExited
        // TODO add your handling code here:
        jLMessage.setText("");
    }//GEN-LAST:event_jRegionMouseExited

    private void jbtnAcederMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnAcederMouseEntered
        // TODO add your handling code here:
         jbtnAceder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jbtnAcederMouseEntered

    private void jbtnAcederMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnAcederMouseExited
        // TODO add your handling code here:
        jbtnAceder.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jbtnAcederMouseExited

    private void jLMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLMinimizarMouseClicked
        // TODO add your handling code here:
        this.setState(LoginForm.ICONIFIED);
    }//GEN-LAST:event_jLMinimizarMouseClicked

    private void jLCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCerrarMouseClicked
        // TODO add your handling code here:
         System.exit(0);
         jLCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLCerrarMouseClicked

    private void jLMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLMinimizarMouseEntered
        // TODO add your handling code here:
        jLMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLMinimizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
    }//GEN-LAST:event_jLMinimizarMouseEntered

    private void jLMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLMinimizarMouseExited
        // TODO add your handling code here:
        jLMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLMinimizar.setBorder(null);
    }//GEN-LAST:event_jLMinimizarMouseExited

    private void jLCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCerrarMouseEntered
        // TODO add your handling code here:
        jLCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLCerrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153,153,153)));
    }//GEN-LAST:event_jLCerrarMouseEntered

    private void jLCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCerrarMouseExited
        // TODO add your handling code here:
        jLCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLCerrar.setBorder(null);
    }//GEN-LAST:event_jLCerrarMouseExited

    private void jLCerrarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLCerrarMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLCerrarMouseMoved

    
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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLCerrar;
    private javax.swing.JLabel jLMessage;
    private javax.swing.JLabel jLMinimizar;
    private javax.swing.JLabel jLPwd;
    private javax.swing.JLabel jLRegistro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jRegion;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPasswordField jTextClave;
    private javax.swing.JTextField jTextUsuario;
    private javax.swing.JButton jbtnAceder;
    // End of variables declaration//GEN-END:variables

}

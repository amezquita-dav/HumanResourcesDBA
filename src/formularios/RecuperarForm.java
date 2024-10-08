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

/**
 *
 * @author angel
 */
public class RecuperarForm extends javax.swing.JFrame {

    /**
     * Creates new form RecuperarForm
     */
    public RecuperarForm() {
        initComponents();
        //Centrar el formulario
        // Establecer el título de la ventana
        this.setTitle("Recursos Humanos - Recuperar Contraseña");
        
        //Centrar el formulario
        this.setLocationRelativeTo(this);
        
        // Cargar el logo como icono de la ventana desde los recursos del proyecto
        ImageIcon logo = new ImageIcon(getClass().getResource("/imagenes/icono.png"));
        this.setIconImage(logo.getImage());
        
        jTextUser2.addKeyListener(new KeyAdapter() {
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
                if (jTextUser2.getText().length() >= 10) {
                    e.consume(); // Si el tamaño es mayor o igual a 10, no permitir más caracteres
                }
            }

            private boolean isLatinLetter(char c) {
                // Comprobar si el carácter es una letra del alfabeto latino básico sin acentos
                return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
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
        jLabel3 = new javax.swing.JLabel();
        jTextUser2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextRecordar = new javax.swing.JTextField();
        jbtnvolver2 = new javax.swing.JButton();
        jbtnrecuperar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextRecordar1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 204));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/userLabel.png"))); // NOI18N
        jLabel3.setText("Usuario:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, -1, -1));

        jTextUser2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jTextUser2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextUser2.setName("jTextUsuario"); // NOI18N
        jTextUser2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextUser2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextUser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, 234, -1));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 204));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/key.png"))); // NOI18N
        jLabel4.setText("Telefono");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, -1, -1));

        jTextRecordar.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jTextRecordar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextRecordar.setName("jTextUsuario"); // NOI18N
        jTextRecordar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextRecordarActionPerformed(evt);
            }
        });
        jPanel1.add(jTextRecordar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, 234, -1));

        jbtnvolver2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jbtnvolver2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/previous.png"))); // NOI18N
        jbtnvolver2.setBorder(null);
        jbtnvolver2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnvolver2ActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnvolver2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 430, 30, 30));

        jbtnrecuperar.setBackground(new java.awt.Color(204, 255, 255));
        jbtnrecuperar.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jbtnrecuperar.setText("Recuperar");
        jbtnrecuperar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnrecuperarActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnrecuperar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 430, -1, -1));

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 204));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/key.png"))); // NOI18N
        jLabel6.setText("Correo Electronico");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 340, -1, -1));

        jTextRecordar1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        jTextRecordar1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextRecordar1.setName("jTextUsuario"); // NOI18N
        jTextRecordar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextRecordar1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextRecordar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 360, 234, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("HResources");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("GESTIONA EL FUTURO DE TU EQUIPO, HOY");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título(2).png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 500));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Sin título(1).png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 730, 60));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/candado.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, -1, 80));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 204, 204));
        jLabel9.setText("RECUPERAR CONTRASEÑA ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 80, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextUser2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextUser2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextUser2ActionPerformed

    private void jTextRecordarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextRecordarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextRecordarActionPerformed

    private void jbtnvolver2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnvolver2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        LoginForm f2=new LoginForm();
        f2.setVisible(true); 
    }//GEN-LAST:event_jbtnvolver2ActionPerformed

    private void jbtnrecuperarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnrecuperarActionPerformed
        consultas con = new consultas();
    String usuario = jTextUser2.getText(); // Obtener el usuario del campo de texto
    String contraseña = con.obtenerContraseñaPorUsuario(usuario); // Obtener la contraseña
    
    // Verificar si se encontró la contraseña
    if (contraseña != null) {
        jTextRecordar.setText(contraseña); // Mostrar la contraseña en el campo jTextRecordar
    } else {
        jTextRecordar.setText(""); // Limpiar el campo si no se encontró el usuario
         // Mostrar mensaje de error
    }

    }//GEN-LAST:event_jbtnrecuperarActionPerformed

    private void jTextRecordar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextRecordar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextRecordar1ActionPerformed

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
            java.util.logging.Logger.getLogger(RecuperarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecuperarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecuperarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecuperarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecuperarForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextRecordar;
    private javax.swing.JTextField jTextRecordar1;
    private javax.swing.JTextField jTextUser2;
    private javax.swing.JButton jbtnrecuperar;
    private javax.swing.JButton jbtnvolver2;
    // End of variables declaration//GEN-END:variables
}

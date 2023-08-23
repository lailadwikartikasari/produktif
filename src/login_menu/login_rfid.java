/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login_menu;

import Halaman_Utama.Halaman_utama;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Administrator
 */
public class login_rfid extends javax.swing.JFrame {

    /**
     * Creates new form login_rfid
     */
    public login_rfid() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login = new javax.swing.JButton();
        btn_CloseRfid1 = new javax.swing.JButton();
        btn_MinimizeRfid = new javax.swing.JButton();
        btn_masukLoginUsername = new javax.swing.JButton();
        card_code = new javax.swing.JPasswordField();
        Label_LoginRfid = new javax.swing.JLabel();

        login.setText("jButton1");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_CloseRfid1.setOpaque(false);
        btn_CloseRfid1.setContentAreaFilled(false);
        btn_CloseRfid1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_CloseRfid1MouseClicked(evt);
            }
        });
        btn_CloseRfid1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CloseRfid1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn_CloseRfid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(702, 20, 20, 30));

        btn_MinimizeRfid.setOpaque(false); btn_MinimizeRfid.setContentAreaFilled(false);
        btn_MinimizeRfid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_MinimizeRfidMouseClicked(evt);
            }
        });
        btn_MinimizeRfid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MinimizeRfidActionPerformed(evt);
            }
        });
        getContentPane().add(btn_MinimizeRfid, new org.netbeans.lib.awtextra.AbsoluteConstraints(672, 20, 20, 30));

        btn_masukLoginUsername.setOpaque(false); btn_masukLoginUsername.setContentAreaFilled(false);
        btn_masukLoginUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_masukLoginUsernameActionPerformed(evt);
            }
        });
        getContentPane().add(btn_masukLoginUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 230, 20));

        card_code.getCaret().setVisible(false);
        card_code.setFocusable(true);
        card_code.setEditable(true);
        card_code.setBackground(new java.awt.Color(244, 243, 243));
        card_code.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        card_code.setBorder(null);
        card_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                card_codeActionPerformed(evt);
            }
        });
        card_code.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                card_codeKeyTyped(evt);
            }
        });
        getContentPane().add(card_code, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 282, 180, 20));

        Label_LoginRfid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login_menu/pictures/login_rfid_1.png"))); // NOI18N
        getContentPane().add(Label_LoginRfid, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_MinimizeRfidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MinimizeRfidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_MinimizeRfidActionPerformed

    private void btn_CloseRfid1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CloseRfid1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_CloseRfid1ActionPerformed

    private void btn_CloseRfid1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CloseRfid1MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btn_CloseRfid1MouseClicked

    private void btn_MinimizeRfidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_MinimizeRfidMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btn_MinimizeRfidMouseClicked

    private void card_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_card_codeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_card_codeActionPerformed
    Timer timer = null;
    private void card_codeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_card_codeKeyTyped
        // TODO add your handling code here:
        timer = new Timer(500, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                login.doClick();
            }
        });
        timer.setRepeats(false);
        timer.start();
        
    }//GEN-LAST:event_card_codeKeyTyped

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
        try {
            // Connection Connect = (Connection) koneksi.getConDB();
            card_code.requestFocus();
            java.sql.Connection conn = (Connection) connector_mysql.configDB();
            java.sql.Statement stat = conn.createStatement();
            ResultSet result = stat.executeQuery("select * from login_rfid where "
                    + "rfid_code='" + card_code.getText() + "'");

            if (result.next()) {
                Halaman_utama mn = new Halaman_utama();
                mn.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Terjadi Kesalahan pada nomor kartu");
                card_code.setText("");
                card_code.requestFocus();
            }

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(rootPane, "Gagal masuk Aplikasi, coba nyalakan Xampp browser terlebih dahulu");
        }

    }//GEN-LAST:event_loginActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        card_code.requestFocus();
    }//GEN-LAST:event_formWindowOpened

    private void btn_masukLoginUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_masukLoginUsernameActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new login_username().setVisible(true);
    }//GEN-LAST:event_btn_masukLoginUsernameActionPerformed

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
            java.util.logging.Logger.getLogger(login_rfid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login_rfid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login_rfid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login_rfid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login_rfid().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_LoginRfid;
    private javax.swing.JButton btn_CloseRfid1;
    private javax.swing.JButton btn_MinimizeRfid;
    private javax.swing.JButton btn_masukLoginUsername;
    private javax.swing.JPasswordField card_code;
    private javax.swing.JButton login;
    // End of variables declaration//GEN-END:variables
}

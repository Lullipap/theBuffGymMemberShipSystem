/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static login.Dashboard.lblUser;

/**
 *
 * @author lulli
 */
public class paymentUser extends javax.swing.JFrame {

    /**
     * Creates new form paymentUser
     */
    public paymentUser() {
        initComponents();
        txtPay.setBackground(new Color(0, 0, 0, 0));
        
        balance();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAmount = new javax.swing.JLabel();
        txtPay = new javax.swing.JTextField();
        btnClose = new javax.swing.JLabel();
        btnPay = new javax.swing.JLabel();
        lblMonth = new javax.swing.JLabel();
        jlabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(650, 350));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAmount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblAmount.setForeground(new java.awt.Color(255, 255, 255));
        lblAmount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 220, 40));

        txtPay.setBackground(new java.awt.Color(51, 51, 51));
        txtPay.setColumns(1);
        txtPay.setFont(txtPay.getFont().deriveFont((float)16));
        txtPay.setForeground(new java.awt.Color(255, 255, 255));
        txtPay.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPay.setBorder(null);
        txtPay.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPayFocusGained(evt);
            }
        });
        txtPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPayActionPerformed(evt);
            }
        });
        txtPay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPayKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPayKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPayKeyTyped(evt);
            }
        });
        getContentPane().add(txtPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 220, 40));

        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        btnPay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPayMouseClicked(evt);
            }
        });
        getContentPane().add(btnPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 70, 40));

        lblMonth.setBackground(new java.awt.Color(204, 204, 204));
        lblMonth.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblMonth.setForeground(new java.awt.Color(204, 204, 204));
        lblMonth.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lblMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 160, 40));

        jlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/payment.png"))); // NOI18N
        getContentPane().add(jlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        setVisible(false);
    }//GEN-LAST:event_btnCloseMouseClicked

    private void btnPayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPayMouseClicked
        String pay = txtPay.getText();
        String amount = lblAmount.getText();

        if (pay.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter an amount.", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (Integer.parseInt(pay) > Integer.parseInt(amount)) {
            JOptionPane.showMessageDialog(this, "You do not have enough balance.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else {
            int a = JOptionPane.showConfirmDialog(null, "Do you really want to pay " + pay + "?", "Select", JOptionPane.YES_NO_OPTION);
            if (a == 0) {
                payment();
                setVisible(false);
                new paymentUser().setVisible(true);
            }
        }       
    }//GEN-LAST:event_btnPayMouseClicked

    private void txtPayFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPayFocusGained

    }//GEN-LAST:event_txtPayFocusGained

    private void txtPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPayActionPerformed

    private void txtPayKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPayKeyPressed

    }//GEN-LAST:event_txtPayKeyPressed

    private void txtPayKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPayKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPayKeyReleased

    private void txtPayKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPayKeyTyped
        
    }//GEN-LAST:event_txtPayKeyTyped
    private void payment(){
        String pay = txtPay.getText();
        if (pay.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter an amount.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            int decreaseAmount = Integer.parseInt(pay); // Convert the entered amount to an integer
            String userId = lblUser.getText();
            Connection dbconn = DBConnection.connectDB();

                try {
                    // Update the amount in the balance table by subtracting the entered amount
                    PreparedStatement st = dbconn.prepareStatement("UPDATE balance SET amount = amount - ? WHERE id = ?");
                    st.setInt(1, decreaseAmount);
                    st.setString(2, userId);
                    int rowsAffected = st.executeUpdate();

                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(this, "Balance paid successfully. You paid " + decreaseAmount, "Success", JOptionPane.INFORMATION_MESSAGE);
                    }
                    st.close();
                    dbconn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }
    /**
     * @param args the command line arguments
     */
    
    private void balance() {
        String id = lblUser.getText();
        Connection dbconn = DBConnection.connectDB();
            try {
                PreparedStatement st = dbconn.prepareStatement("SELECT * FROM users u INNER JOIN balance b ON u.id = b.id WHERE u.id = ?");
                st.setString(1, id);
                ResultSet rs = st.executeQuery();

                if (rs.next()) {
                    int amount = rs.getInt("b.amount");
                    String month = rs.getString("expiration");

                // Update your text fields with the retrieved data
                lblAmount.setText(String.valueOf(amount));
                lblMonth.setText(month);

                if (amount == 0) {
                    JOptionPane.showMessageDialog(this, "You are fully paid.", "Error", JOptionPane.ERROR_MESSAGE);
                    txtPay.setEnabled(false); // Disable the text field if fully paid
                } else {
                    txtPay.setEnabled(true); // Enable the text field if not fully paid
                    // Allow the user to edit the text field and perform the payment action
                }
            }
                rs.close();
                st.close();
                dbconn.close();
            } catch (SQLException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }
    }    
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
            java.util.logging.Logger.getLogger(paymentUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(paymentUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(paymentUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(paymentUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new paymentUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnClose;
    private javax.swing.JLabel btnPay;
    private javax.swing.JLabel jlabel;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblMonth;
    private javax.swing.JTextField txtPay;
    // End of variables declaration//GEN-END:variables
}
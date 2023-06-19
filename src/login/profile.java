/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package login;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static login.Dashboard.btnProfile;

/**
 *
 * @author lulli
 */
public class profile extends javax.swing.JFrame {
    /**
     * Creates new form profile
     */
    public profile() {
        initComponents();
        txtName.setBackground(new Color(0, 0, 0, 0));
        txtPassword.setBackground(new Color(0, 0, 0, 0));
        txtGender.setBackground(new Color(0, 0, 0, 0));
        txtAge.setBackground(new Color(0, 0, 0, 0));
        txtPlan.setBackground(new Color(0, 0, 0, 0));
        txtAddress.setBackground(new Color(0, 0, 0, 0));
        profile();
     }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtName = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        txtPlan = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JLabel();
        btnClose = new javax.swing.JLabel();
        btnInsert = new javax.swing.JLabel();
        lblPicture = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(650, 350));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtName.setBackground(new java.awt.Color(51, 51, 51));
        txtName.setColumns(1);
        txtName.setFont(txtName.getFont().deriveFont((float)11));
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.setBorder(null);
        txtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNameFocusGained(evt);
            }
        });
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 200, 30));

        txtGender.setBackground(new java.awt.Color(51, 51, 51));
        txtGender.setColumns(1);
        txtGender.setFont(txtGender.getFont().deriveFont((float)11));
        txtGender.setForeground(new java.awt.Color(255, 255, 255));
        txtGender.setBorder(null);
        txtGender.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtGenderFocusGained(evt);
            }
        });
        txtGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenderActionPerformed(evt);
            }
        });
        txtGender.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtGenderKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtGenderKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtGenderKeyTyped(evt);
            }
        });
        getContentPane().add(txtGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 200, 30));

        txtPlan.setBackground(new java.awt.Color(51, 51, 51));
        txtPlan.setColumns(1);
        txtPlan.setFont(txtPlan.getFont().deriveFont((float)11));
        txtPlan.setForeground(new java.awt.Color(255, 255, 255));
        txtPlan.setBorder(null);
        txtPlan.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPlanFocusGained(evt);
            }
        });
        txtPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlanActionPerformed(evt);
            }
        });
        txtPlan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPlanKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPlanKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPlanKeyTyped(evt);
            }
        });
        getContentPane().add(txtPlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 200, 30));

        txtPassword.setBackground(new java.awt.Color(51, 51, 51));
        txtPassword.setColumns(1);
        txtPassword.setFont(txtPassword.getFont().deriveFont((float)11));
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setBorder(null);
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
        });
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasswordKeyTyped(evt);
            }
        });
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, 200, 30));

        txtAge.setBackground(new java.awt.Color(51, 51, 51));
        txtAge.setColumns(1);
        txtAge.setFont(txtAge.getFont().deriveFont((float)11));
        txtAge.setForeground(new java.awt.Color(255, 255, 255));
        txtAge.setBorder(null);
        txtAge.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAgeFocusGained(evt);
            }
        });
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });
        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAgeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAgeKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAgeKeyTyped(evt);
            }
        });
        getContentPane().add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 200, 30));

        txtAddress.setBackground(new java.awt.Color(51, 51, 51));
        txtAddress.setColumns(1);
        txtAddress.setFont(txtAddress.getFont().deriveFont((float)11));
        txtAddress.setForeground(new java.awt.Color(255, 255, 255));
        txtAddress.setBorder(null);
        txtAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAddressFocusGained(evt);
            }
        });
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        txtAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddressKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddressKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAddressKeyTyped(evt);
            }
        });
        getContentPane().add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 200, 30));

        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
            }
        });
        getContentPane().add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 70, 40));

        btnClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        btnInsert.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInsert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInsertMouseClicked(evt);
            }
        });
        getContentPane().add(btnInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 50, 30));

        lblPicture.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(lblPicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 140, 140));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/profile.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusGained

    }//GEN-LAST:event_txtNameFocusGained

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyPressed

    }//GEN-LAST:event_txtNameKeyPressed

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped

    }//GEN-LAST:event_txtNameKeyTyped

    private void txtGenderFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtGenderFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderFocusGained

    private void txtGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderActionPerformed

    private void txtGenderKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGenderKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderKeyPressed

    private void txtGenderKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGenderKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderKeyReleased

    private void txtGenderKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGenderKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderKeyTyped

    private void txtPlanFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPlanFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlanFocusGained

    private void txtPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlanActionPerformed

    private void txtPlanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlanKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlanKeyPressed

    private void txtPlanKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlanKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlanKeyReleased

    private void txtPlanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPlanKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlanKeyTyped

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordKeyReleased

    private void txtPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordKeyTyped

    private void txtAgeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAgeFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeFocusGained

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtAgeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeKeyPressed

    private void txtAgeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeKeyReleased

    private void txtAgeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeKeyTyped

    private void txtAddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAddressFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressFocusGained

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtAddressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressKeyPressed

    private void txtAddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressKeyReleased

    private void txtAddressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressKeyTyped

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        setVisible(false);
    }//GEN-LAST:event_btnCloseMouseClicked

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked
    String name = txtName.getText();
    String password = txtPassword.getText();
    String gender = txtGender.getText();
    String age = txtAge.getText();
    String plan = txtPlan.getText();
    String address = txtAddress.getText();
    String userId = btnProfile.getText(); // Assuming btnProfile is a JButton containing the user's ID
    Connection dbconn = DBConnection.connectDB();
            try {
                PreparedStatement st = dbconn.prepareStatement("UPDATE users SET name = ?, password = ?, gender = ?, age = ?, plan = ?, address = ? WHERE name = ?");
                st.setString(1, name);
                st.setString(2, password);
                st.setString(3, gender);
                st.setString(4, age);
                st.setString(5, plan);
                st.setString(6, address);
                st.setString(7, userId); // Set the correct value for the userId parameter
                int rowsAffected = st.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "User data updated.", "Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "No rows affected.", "Error", JOptionPane.ERROR_MESSAGE);
                }

                st.close();
                dbconn.close();
            } catch (SQLException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            } 
    }//GEN-LAST:event_btnUpdateMouseClicked

    private void btnInsertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInsertMouseClicked
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null); 
        File f = chooser.getSelectedFile();
        String path = f.getAbsolutePath();
        try {
            BufferedImage bi = ImageIO.read(new File(path));
            Image img = bi.getScaledInstance(210, 210, Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(img);
            lblPicture.setIcon(icon);
            
        } catch (IOException ex) {
            Logger.getLogger(profile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnInsertMouseClicked

    private void profile(){
        String id = btnProfile.getText();
        Connection dbconn = DBConnection.connectDB();
            try {
                PreparedStatement st = dbconn.prepareStatement("SELECT * FROM users WHERE name = ?");
                st.setString(1, id);
                ResultSet rs = st.executeQuery();

                if (rs.next()) {
                    String name = rs.getString("name");
                    String password = rs.getString("password");
                    String gender = rs.getString("gender");
                    String age = rs.getString("age");
                    String plan = rs.getString("plan");
                    String address = rs.getString("address");

                    // Update your text fields with the retrieved data
                    txtName.setText(name);
                    txtPassword.setText(password);
                    txtGender.setText(gender);
                    txtAge.setText(age);
                    txtPlan.setText(plan);
                    txtAddress.setText(address);
                }
                rs.close();
                st.close();
                dbconn.close();
            } catch (SQLException ex) {
                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
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
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnClose;
    private javax.swing.JLabel btnInsert;
    private javax.swing.JLabel btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblPicture;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPlan;
    // End of variables declaration//GEN-END:variables
}

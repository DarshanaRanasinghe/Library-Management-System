/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import Model.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;


/**
 *
 * @author Darshana_Lap
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
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

        jPanel1 = new javax.swing.JPanel();
        chkRegiShowPassword = new javax.swing.JRadioButton();
        btnRegiRegister = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtRegiUserName = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtRegiConPassword = new javax.swing.JPasswordField();
        txtRegiPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setMinimumSize(new java.awt.Dimension(492, 263));
        jPanel1.setPreferredSize(new java.awt.Dimension(743, 363));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chkRegiShowPassword.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        chkRegiShowPassword.setText("Show Password");
        chkRegiShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkRegiShowPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(chkRegiShowPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, -1, -1));

        btnRegiRegister.setBackground(new java.awt.Color(0, 153, 153));
        btnRegiRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegiRegister.setText("Register");
        btnRegiRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegiRegisterActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegiRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Username :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 194, 22));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Password:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 88, -1));
        jPanel1.add(txtRegiUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 127, -1));

        btnBack.setBackground(new java.awt.Color(0, 153, 153));
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Confirm pass:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 125, -1));
        jPanel1.add(txtRegiConPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 127, -1));
        jPanel1.add(txtRegiPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 127, -1));

        jLabel1.setBackground(new java.awt.Color(0, 0, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("User Registration ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 266, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, -1));

        setSize(new java.awt.Dimension(759, 371));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        LoginFrame objLoginFrame=new LoginFrame();
        objLoginFrame.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRegiRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegiRegisterActionPerformed
        String username = txtRegiUserName.getText();
        String password = new String(txtRegiPassword.getPassword());
    String comPassword = new String (txtRegiConPassword.getPassword());  
 
    if(username.isEmpty()||password.isEmpty()||comPassword.isEmpty() ){
        JOptionPane.showMessageDialog(this,"all fields are required");
    
    
    if(!password.equals(comPassword)){
        JOptionPane.showMessageDialog(this,"password did not match");
    }}else{
         try{
        Connection conn=DatabaseConnection.getConnection();
                String sql = "INSERT INTO Users (username, password) VALUES (?, ?)";
         PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, username);
        pst.setString(2, password);
        
          int status = pst.executeUpdate();
        
           if (status == 1) {
            JOptionPane.showMessageDialog(rootPane, "User registered successfully.");
        }

        // Close connection
        pst.close();
        
    }catch(Exception ee){JOptionPane.showMessageDialog(rootPane,"error" +ee.getMessage());}
    
    }
    
   
    
    }//GEN-LAST:event_btnRegiRegisterActionPerformed

    private void chkRegiShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkRegiShowPasswordActionPerformed
          if (chkRegiShowPassword.isSelected()) {
       
        txtRegiPassword.setEchoChar((char) 0); 
        txtRegiConPassword.setEchoChar((char) 0); 
    } else {
      
        txtRegiPassword.setEchoChar('•');
        txtRegiConPassword.setEchoChar('•'); 
    }
        
            
    }//GEN-LAST:event_chkRegiShowPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRegiRegister;
    private javax.swing.JRadioButton chkRegiShowPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtRegiConPassword;
    private javax.swing.JPasswordField txtRegiPassword;
    private javax.swing.JTextField txtRegiUserName;
    // End of variables declaration//GEN-END:variables
}

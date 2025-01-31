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
public class AddBook extends javax.swing.JFrame {

    /**
     * Creates new form AddBook
     */
    public AddBook() {
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

        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        txtISBN = new javax.swing.JTextField();
        txtBookName = new javax.swing.JTextField();
        txtAuthor = new javax.swing.JTextField();
        txtPublisher = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Category = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbCategory = new javax.swing.JComboBox<>();
        txtBackToHome = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jLabel1.setText("ISBN");

        jLabel3.setText("Book Name");

        jLabel4.setText("Author");

        jLabel5.setText("Publisher");

        jLabel2.setText("Category");

        cmbCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fiction", "NonFiction", "Science fiction", "Historical", "Horror", "Fantasy", "Romance" }));

        txtBackToHome.setText("Back To Home");
        txtBackToHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBackToHomeActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 24)); // NOI18N
        jLabel6.setText("Book Detail ");
        jLabel6.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBackToHome)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Category)
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtBookName)
                            .addComponent(txtAuthor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPublisher, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbCategory, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(171, 171, 171)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnReset, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRemove, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(143, 143, 143))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(Category))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel2))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnAdd)
                                    .addGap(26, 26, 26)
                                    .addComponent(btnRemove)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnUpdate)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnReset))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(90, 90, 90)
                                            .addComponent(txtPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(txtBookName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel3))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGap(18, 18, 18)
                                    .addComponent(cmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(txtBackToHome)
                .addGap(32, 32, 32))
        );

        setSize(new java.awt.Dimension(759, 371));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
         
        String ISBN = txtISBN.getText();
    String bookName = txtBookName.getText();
    String author =  txtAuthor.getText();
    String Publisher =txtPublisher.getText();
    String Category =cmbCategory.getSelectedItem().toString();
 
    if(ISBN.isEmpty()||bookName.isEmpty()||author.isEmpty()||Publisher.isEmpty()||Category.isEmpty() ){
        JOptionPane.showMessageDialog(this,"all fields are required");
    }
    else{
         try{
        Connection conn=DatabaseConnection.getConnection();
                String sql = "Update Books set BookName = ?,Author = ?,Publisher = ? ,Category = ? Where ISBN = ?";
         PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(5,ISBN );
        pst.setString(1,bookName);
        pst.setString(2,author );  
        pst.setString(3,Publisher ); 
        pst.setString(4,Category );
        
          int status = pst.executeUpdate();
        
           if (status == 1) {
            JOptionPane.showMessageDialog(rootPane, "Books update successfully.");
        }

      
        pst.close();
       
    }
         catch(Exception ee){JOptionPane.showMessageDialog(rootPane,"error" +ee.getMessage());}
    
    }
    
    
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
         txtBookName.setText("");    
         txtAuthor.setText("");  
         txtISBN.setText("");   
         txtPublisher.setText("");  
         cmbCategory.setSelectedIndex(0);
    }//GEN-LAST:event_btnResetActionPerformed

    private void txtBackToHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBackToHomeActionPerformed
        DashBoard db=new DashBoard();
    db.setVisible(true);
    this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_txtBackToHomeActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String ISBN = txtISBN.getText();
        String bookName = txtBookName.getText();
    String author =  txtAuthor.getText();
    String Publisher =txtPublisher.getText();
    String Category =cmbCategory.getSelectedItem().toString();
 
    if(ISBN.isEmpty()||bookName.isEmpty()||author.isEmpty()||Publisher.isEmpty()||Category.isEmpty() ){
        JOptionPane.showMessageDialog(this,"all fields are required");
    
    
    
    }else{
         try{
        Connection conn=DatabaseConnection.getConnection();
                String sql = "INSERT INTO Books (ISBN,BookName,Author,Publisher,Category) VALUES (?,?,?,?,?)";
         PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1,ISBN );
        pst.setString(2,bookName);
        pst.setString(3,author );  
        pst.setString(4,Publisher ); 
        pst.setString(5,Category );
        
          int status = pst.executeUpdate();
        
           if (status == 1) {
            JOptionPane.showMessageDialog(rootPane, "Books save successfully.");
        }

      
        pst.close();
       
    }catch(Exception ee){JOptionPane.showMessageDialog(rootPane,"error" +ee.getMessage());}
    
    }
            // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
      
        String ISBN=txtISBN.getText();
      
      if(ISBN.isEmpty()){
            JOptionPane.showMessageDialog(this,"Please fill the ISBN");
      }
      else {
          try{
          Connection conn=DatabaseConnection.getConnection();
                String sql = "Delete from Books Where ISBN = ? ";
         PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1,ISBN );
        int status = pst.executeUpdate();
        
           if (status == 1) {
            JOptionPane.showMessageDialog(rootPane, "Data Delete successfully");  }
           pst.close();
          }catch(Exception ee){JOptionPane.showMessageDialog(rootPane,"error" +ee.getMessage());}
      }
      
      
      
      
    }//GEN-LAST:event_btnRemoveActionPerformed

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
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Category;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JButton txtBackToHome;
    private javax.swing.JTextField txtBookName;
    private javax.swing.JTextField txtISBN;
    private javax.swing.JTextField txtPublisher;
    // End of variables declaration//GEN-END:variables
}

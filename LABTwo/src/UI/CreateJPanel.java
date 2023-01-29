/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Panzi
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */

    private DeliveryPackage delPackage;
    public CreateJPanel() {
        initComponents();
//        custId.setText();
    }

    public CreateJPanel(DeliveryPackage deliveryPackage){
         initComponents();
         this.delPackage = deliveryPackage;

}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        custId = new javax.swing.JTextField();
        packageId = new javax.swing.JTextField();
        packageWt = new javax.swing.JTextField();
        productId = new javax.swing.JTextField();
        productName1 = new javax.swing.JTextField();
        productPrice1 = new javax.swing.JTextField();
        custName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(custId, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 180, 40));
        add(packageId, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 180, 40));
        add(packageWt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 180, 40));
        add(productId, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 180, 40));
        add(productName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 180, 40));
        add(productPrice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 180, 40));
        add(custName, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 180, 40));

        jLabel1.setFont(new java.awt.Font("微软雅黑", 1, 18)); // NOI18N
        jLabel1.setText("Product Price");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, -1, -1));

        jLabel2.setFont(new java.awt.Font("微软雅黑", 1, 18)); // NOI18N
        jLabel2.setText("Package Id");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("微软雅黑", 1, 18)); // NOI18N
        jLabel3.setText("Package Weight");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("微软雅黑", 1, 18)); // NOI18N
        jLabel4.setText("Product Id");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        jLabel5.setFont(new java.awt.Font("微软雅黑", 1, 18)); // NOI18N
        jLabel5.setText("Product Name");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        jLabel6.setFont(new java.awt.Font("微软雅黑", 1, 18)); // NOI18N
        jLabel6.setText("Cutomer Name");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, -1, -1));

        jLabel7.setFont(new java.awt.Font("微软雅黑", 1, 18)); // NOI18N
        jLabel7.setText("Customer Id");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, -1, -1));

        btnSave.setFont(new java.awt.Font("宋体", 1, 24)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(629, 390, 100, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
         String id = packageId.getText();
         String weight = packageWt.getText();
         String pId = productId.getText();
         String pName = productName1.getText();
         String pPrice = productPrice1.getText();
         String cName = custName.getText();
         String cId = custId.getText();


         this.delPackage.setPackageId(Integer.valueOf(id));
         this.delPackage.setPackageWeight(Double.valueOf(weight));

         Product product = this.delPackage.getProduct();
         product.setProductId(Integer.valueOf(pId));
         product.setProductName(pName);
         product.setPrice(Double.valueOf(pPrice));

         Customer customer = this.delPackage.getCustomer();
         customer.setCustomerId(Integer.valueOf(cId));
         customer.setFullName(cName);

        JOptionPane.showMessageDialog(null, "Saved!");
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JTextField custId;
    private javax.swing.JTextField custName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField packageId;
    private javax.swing.JTextField packageWt;
    private javax.swing.JTextField productId;
    private javax.swing.JTextField productName1;
    private javax.swing.JTextField productPrice1;
    // End of variables declaration//GEN-END:variables
}
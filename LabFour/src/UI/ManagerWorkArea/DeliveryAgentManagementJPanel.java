/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.ManagerWorkArea;

import Business.Business;
import Business.UserAccount;
import Business.UserAccountDirectory;
import Customer.Customer;
import Restaurant.DeliveryAgent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Panzi
 */
public class DeliveryAgentManagementJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DeliveryAgentManagementJPanel
     */
    private Business business;
    private UserAccount userAccout;
    DefaultTableModel tableModel;
    public DeliveryAgentManagementJPanel() {
        initComponents();
    }

    public DeliveryAgentManagementJPanel(Business business, UserAccount userAccount) {
        initComponents();
        this.business = business;
        this.userAccout = userAccount;
        this.tableModel = (DefaultTableModel)jTable1.getModel();

        populate();

    }


    public void populate(){
        tableModel.setRowCount(0);
        for(DeliveryAgent d:this.business.getDeliveryAgentDirectory().getAgentList()){
              UserAccount u = this.business.getUserAccountDirectory().findById(d.getPersonId());
              Object[] row = new Object[4];
              row[0] = d.getPersonId();
              row[1] = d.getName();
              row[2] = u.getUsername();
              row[3] = u.getPassword();
              tableModel.addRow(row);
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

        jLabel1 = new javax.swing.JLabel();
        fieldUsername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fieldPassword = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fieldName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fieldAge = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Username");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));
        add(fieldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 150, -1));

        jLabel2.setText("Password");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));
        add(fieldPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 150, -1));

        jLabel3.setText("Name");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));
        add(fieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 150, -1));

        jLabel4.setText("Age");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));
        add(fieldAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 150, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Username", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, -1));

        btnAdd.setText("ADD AGENT");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        UserAccountDirectory ua = this.business.getUserAccountDirectory();
        if(ua.accountExists(fieldUsername.getText(), fieldPassword.getText(), "agent")){
            JOptionPane.showMessageDialog(null, "Sorry credentials are taken.");
        } else{
            UserAccount user = this.business.getUserAccountDirectory().createUserAccount(fieldUsername.getText(), fieldPassword.getText(), "agent");
            this.business.getDeliveryAgentDirectory().createAgent(user.getAccountId(), fieldName.getText(), fieldAge.getText());
            populate();
        }
    }//GEN-LAST:event_btnAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JTextField fieldAge;
    private javax.swing.JTextField fieldName;
    private javax.swing.JTextField fieldPassword;
    private javax.swing.JTextField fieldUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;
import Model.*;
import javax.swing.Action;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
/**
 *
 * @author Panzi
 */
public class CatalogJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CatalogJPanel
     */
    private Application application;
    DefaultTableModel medTableModel;
    public CatalogJPanel(Application application) {
        initComponents();
        this.application = application;
        this.medTableModel = (DefaultTableModel) medicineCatalog.getModel();

        displayMedicineCatalog();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        medicineCatalog = new javax.swing.JTable();
        fieldDosage = new javax.swing.JTextField();
        fieldName = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        medicineCatalog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Dosage"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(medicineCatalog);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, -1, -1));
        add(fieldDosage, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 140, 50));

        fieldName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldNameFocusLost(evt);
            }
        });
        add(fieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 140, 50));

        btnAdd.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, -1, -1));

        btnDelete.setFont(new java.awt.Font("宋体", 0, 24)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 580, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String name = fieldName.getText();
        String dosage = fieldDosage.getText();

        MedicineCatalog catalog = this.application.getCatalog();
        if(catalog.checkIfMedicineUnique(name)){
           catalog.createMedicine(name,Double.valueOf(dosage));

           displayMedicineCatalog();
        } else{
           JOptionPane.showMessageDialog(null, "Medicine already exists");
        }
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void fieldNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldNameFocusLost
        // TODO add your handling code here:
        String name = fieldName.getText();
        boolean isUnique = this.application.getCatalog().checkIfMedicineUnique(name);

        if(isUnique){

         }else{
            fieldName.setText("");
            JOptionPane.showMessageDialog(null, "Medicine already exists");
       }
    }//GEN-LAST:event_fieldNameFocusLost

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = medicineCatalog.getSelectedRow();
        if(selectedRow >= 0){
             Medicine med = (Medicine)medicineCatalog.getValueAt(selectedRow, 0);
             this.application.getCatalog().removeMedicine(med.getMedicineName());

             displayMedicineCatalog();
        }else{
           JOptionPane.showMessageDialog(null, "Please select a row!");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed


    public void displayMedicineCatalog(){
        //check if catalog is not empty
        ArrayList<Medicine> medicines = this.application.getCatalog().getMedicineList();

        if(medicines.size() > 0){
           medTableModel.setRowCount(0);
           for(Medicine med : medicines){
              Object row[] = new Object[2];
              row[0] = med;
              row[1] = med.getDosage();
              medTableModel.addRow(row);
           }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JTextField fieldDosage;
    private javax.swing.JTextField fieldName;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable medicineCatalog;
    // End of variables declaration//GEN-END:variables
}

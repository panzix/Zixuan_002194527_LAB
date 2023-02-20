/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.LibrarianWorkArea;

import AppSystem.AppSystem;
import Book.GenreDirectory;

/**
 *
 * @author Panzi
 */
public class AddGenresJPanel extends javax.swing.JPanel {
    private AppSystem appSystem;
    /**
     * Creates new form AddGenresJPanel
     */
    public AddGenresJPanel() {
        initComponents();
    }

    public AddGenresJPanel(AppSystem appSystem) {
        initComponents();
        this.appSystem = appSystem;
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
        descTxt = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Genre Description");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, -1));
        add(descTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 190, -1));

        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String desc = descTxt.getText();
        GenreDirectory gd = this.appSystem.getGenreDirectory();
        gd.createGenre(desc);
    }//GEN-LAST:event_btnAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JTextField descTxt;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
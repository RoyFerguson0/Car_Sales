/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oop_template;

/**
 *
 * @author anastasiaridge
 */
public class Modify_Customer extends javax.swing.JFrame {

    /**
     * Creates new form Modify_Customer
     */
    public Modify_Customer() {
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

        lblModifyCustomer = new javax.swing.JLabel();
        pnlModifyCustomer = new javax.swing.JPanel();
        lblCustomerID = new javax.swing.JLabel();
        lblCustTitle = new javax.swing.JLabel();
        lblCustForename = new javax.swing.JLabel();
        lblCustSurname = new javax.swing.JLabel();
        lblCustGender = new javax.swing.JLabel();
        lblCustMobile = new javax.swing.JLabel();
        lblCustAddress = new javax.swing.JLabel();
        txtCustomerID = new javax.swing.JTextField();
        txtCustTitle = new javax.swing.JTextField();
        txtCustForename = new javax.swing.JTextField();
        txtCustSurname = new javax.swing.JTextField();
        txtCustGender = new javax.swing.JTextField();
        txtCustMobile = new javax.swing.JTextField();
        txtCustAddress = new javax.swing.JTextField();
        btnEmpMenu = new javax.swing.JButton();
        btnCustReset = new javax.swing.JButton();
        btnCustSave = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblModifyCustomer.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblModifyCustomer.setText("Modify Customer");

        pnlModifyCustomer.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Details:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Helvetica Neue", 1, 12))); // NOI18N

        lblCustomerID.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblCustomerID.setText("Customer ID:");

        lblCustTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblCustTitle.setText("Title:");

        lblCustForename.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblCustForename.setText("Forename:");

        lblCustSurname.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblCustSurname.setText("Surname:");

        lblCustGender.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblCustGender.setText("Gender:");

        lblCustMobile.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblCustMobile.setText("Mobile:");

        lblCustAddress.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblCustAddress.setText("Address:");

        txtCustomerID.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        txtCustTitle.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        txtCustForename.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        txtCustSurname.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        txtCustGender.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        txtCustMobile.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        txtCustAddress.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

        btnEmpMenu.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnEmpMenu.setText("->");

        btnCustReset.setFont(new java.awt.Font("Helvetica Neue", 2, 14)); // NOI18N
        btnCustReset.setText("Reset");
        btnCustReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustResetActionPerformed(evt);
            }
        });

        btnCustSave.setFont(new java.awt.Font("Helvetica Neue", 2, 14)); // NOI18N
        btnCustSave.setText("Save");

        javax.swing.GroupLayout pnlModifyCustomerLayout = new javax.swing.GroupLayout(pnlModifyCustomer);
        pnlModifyCustomer.setLayout(pnlModifyCustomerLayout);
        pnlModifyCustomerLayout.setHorizontalGroup(
            pnlModifyCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlModifyCustomerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlModifyCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCustomerID)
                    .addComponent(lblCustTitle)
                    .addComponent(lblCustForename)
                    .addComponent(lblCustSurname)
                    .addComponent(lblCustGender)
                    .addComponent(lblCustMobile)
                    .addComponent(lblCustAddress)
                    .addComponent(btnCustReset))
                .addGap(77, 77, 77)
                .addGroup(pnlModifyCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlModifyCustomerLayout.createSequentialGroup()
                        .addGroup(pnlModifyCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCustomerID)
                            .addComponent(txtCustTitle)
                            .addComponent(txtCustForename)
                            .addComponent(txtCustSurname)
                            .addComponent(txtCustGender)
                            .addComponent(txtCustMobile)
                            .addComponent(txtCustAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlModifyCustomerLayout.createSequentialGroup()
                        .addComponent(btnCustSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addComponent(btnEmpMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlModifyCustomerLayout.setVerticalGroup(
            pnlModifyCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlModifyCustomerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlModifyCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustomerID)
                    .addComponent(txtCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlModifyCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustTitle)
                    .addComponent(txtCustTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlModifyCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustForename)
                    .addComponent(txtCustForename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlModifyCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustSurname)
                    .addComponent(txtCustSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlModifyCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustGender)
                    .addComponent(txtCustGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlModifyCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustMobile)
                    .addComponent(txtCustMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlModifyCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustAddress)
                    .addComponent(txtCustAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlModifyCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlModifyCustomerLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(btnEmpMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(pnlModifyCustomerLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pnlModifyCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCustReset)
                            .addComponent(btnCustSave))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(lblModifyCustomer))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(pnlModifyCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblModifyCustomer)
                .addGap(30, 30, 30)
                .addComponent(pnlModifyCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCustResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustResetActionPerformed
        // Clear all text fields
        txtCustomerID.setText("");
        txtCustTitle.setText("");
        txtCustForename.setText("");
        txtCustSurname.setText("");
        txtCustGender.setText("");
        txtCustMobile.setText("");
        txtCustAddress.setText("");
    }//GEN-LAST:event_btnCustResetActionPerformed

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
            java.util.logging.Logger.getLogger(Modify_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modify_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modify_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modify_Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modify_Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCustReset;
    private javax.swing.JButton btnCustSave;
    private javax.swing.JButton btnEmpMenu;
    private javax.swing.JLabel lblCustAddress;
    private javax.swing.JLabel lblCustForename;
    private javax.swing.JLabel lblCustGender;
    private javax.swing.JLabel lblCustMobile;
    private javax.swing.JLabel lblCustSurname;
    private javax.swing.JLabel lblCustTitle;
    private javax.swing.JLabel lblCustomerID;
    private javax.swing.JLabel lblModifyCustomer;
    private javax.swing.JPanel pnlModifyCustomer;
    private javax.swing.JTextField txtCustAddress;
    private javax.swing.JTextField txtCustForename;
    private javax.swing.JTextField txtCustGender;
    private javax.swing.JTextField txtCustMobile;
    private javax.swing.JTextField txtCustSurname;
    private javax.swing.JTextField txtCustTitle;
    private javax.swing.JTextField txtCustomerID;
    // End of variables declaration//GEN-END:variables
}

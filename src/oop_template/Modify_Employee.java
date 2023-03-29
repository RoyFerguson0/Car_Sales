/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oop_template;


import javax.swing.JOptionPane;
import javax.swing.JTextField;



/**
 *
 * @author Jackh
 */
public class Modify_Employee extends javax.swing.JFrame {

    

    /**
     * Creates new form Modify_Employee
     */
    public Modify_Employee() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
   private void inputLettersOnly(JTextField textField) {
    String input = textField.getText();
    if (input.matches("^[a-zA-Z]*$")) {
        // Allows the user to input letters
    } else {
        // Error message displayed if user enters numbers
        JOptionPane.showMessageDialog(this, "Please Enter Letters Only!");
        textField.setText("");
    }
}
   
   private void inputNumbersOnly(JTextField textField) {
    String input = textField.getText();
    if (input.matches("^[0-9]*$")) {
        // Allows the user to input numbers
    } else {
        // Error message displayed if user enters letters
        JOptionPane.showMessageDialog(this, "Please Enter Numbers Only!");
        textField.setText("");
    }
}


     


    /**
     * This method is called from within the constructor to initialize the form.WARNING: Do NOT modify this code.
     * The content of this method is always
 regenerated by the Form Editor.
     * @param evt
     */
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblModifyEmployee = new javax.swing.JLabel();
        pnlModifyEmployee = new javax.swing.JPanel();
        lblEmpTitle = new javax.swing.JLabel();
        lblEmployeeID1 = new javax.swing.JLabel();
        lblEmpForename = new javax.swing.JLabel();
        lblEmpSurname = new javax.swing.JLabel();
        lblEmpGender = new javax.swing.JLabel();
        lblEmpJobTitle = new javax.swing.JLabel();
        lblEmpContract = new javax.swing.JLabel();
        lblEmpHourlyRate = new javax.swing.JLabel();
        btnEmpSave = new javax.swing.JButton();
        btnEmpReset1 = new javax.swing.JButton();
        txtEmployeeID = new javax.swing.JTextField();
        txtEmpTitle = new javax.swing.JTextField();
        txtEmpForename = new javax.swing.JTextField();
        txtEmpSurname = new javax.swing.JTextField();
        txtEmpGender = new javax.swing.JTextField();
        txtEmpJobTitle = new javax.swing.JTextField();
        txtEmpContract = new javax.swing.JTextField();
        txtEmpHourlyRate = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblModifyEmployee.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lblModifyEmployee.setText("Modify Employee");

        pnlModifyEmployee.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Details:")));

        lblEmpTitle.setText("Title:");

        lblEmployeeID1.setText("Employee ID:");

        lblEmpForename.setText("Forename:");

        lblEmpSurname.setText("Surname:");

        lblEmpGender.setText("Gender:");

        lblEmpJobTitle.setText("Job Title:");

        lblEmpContract.setText("Contracted Hours:");

        lblEmpHourlyRate.setText("Hourly Rate:");

        btnEmpSave.setText("Save");

        btnEmpReset1.setText("Reset");
        btnEmpReset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpReset1ActionPerformed(evt);
            }
        });

        txtEmpTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpTitleActionPerformed(evt);
            }
        });

        txtEmpForename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpForenameActionPerformed(evt);
            }
        });

        txtEmpSurname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpSurnameActionPerformed(evt);
            }
        });

        txtEmpGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpGenderActionPerformed(evt);
            }
        });

        txtEmpJobTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpJobTitleActionPerformed(evt);
            }
        });

        txtEmpContract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpContractActionPerformed(evt);
            }
        });

        txtEmpHourlyRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpHourlyRateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlModifyEmployeeLayout = new javax.swing.GroupLayout(pnlModifyEmployee);
        pnlModifyEmployee.setLayout(pnlModifyEmployeeLayout);
        pnlModifyEmployeeLayout.setHorizontalGroup(
            pnlModifyEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlModifyEmployeeLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlModifyEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlModifyEmployeeLayout.createSequentialGroup()
                        .addComponent(lblEmpContract, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtEmpContract))
                    .addGroup(pnlModifyEmployeeLayout.createSequentialGroup()
                        .addComponent(lblEmpJobTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtEmpJobTitle))
                    .addGroup(pnlModifyEmployeeLayout.createSequentialGroup()
                        .addComponent(lblEmpGender, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtEmpGender))
                    .addGroup(pnlModifyEmployeeLayout.createSequentialGroup()
                        .addComponent(lblEmpSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtEmpSurname))
                    .addGroup(pnlModifyEmployeeLayout.createSequentialGroup()
                        .addComponent(lblEmpForename, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtEmpForename))
                    .addGroup(pnlModifyEmployeeLayout.createSequentialGroup()
                        .addComponent(lblEmployeeID1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlModifyEmployeeLayout.createSequentialGroup()
                        .addComponent(lblEmpTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtEmpTitle))
                    .addGroup(pnlModifyEmployeeLayout.createSequentialGroup()
                        .addGroup(pnlModifyEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmpHourlyRate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEmpReset1))
                        .addGap(18, 18, 18)
                        .addGroup(pnlModifyEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEmpSave)
                            .addComponent(txtEmpHourlyRate))))
                .addContainerGap(192, Short.MAX_VALUE))
        );
        pnlModifyEmployeeLayout.setVerticalGroup(
            pnlModifyEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlModifyEmployeeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlModifyEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmployeeID1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlModifyEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmpTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmpTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlModifyEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmpForename, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmpForename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlModifyEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmpSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmpSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlModifyEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmpGender, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmpGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlModifyEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmpJobTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmpJobTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlModifyEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmpContract, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmpContract, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlModifyEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmpHourlyRate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmpHourlyRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlModifyEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEmpSave)
                    .addComponent(btnEmpReset1))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblModifyEmployee)
                .addGap(131, 131, 131))
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(pnlModifyEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblModifyEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlModifyEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmpTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpTitleActionPerformed
        // TODO add your handling code here:
     inputLettersOnly(txtEmpTitle);
    }//GEN-LAST:event_txtEmpTitleActionPerformed

    private void txtEmpForenameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpForenameActionPerformed
        // TODO add your handling code here:
        inputLettersOnly(txtEmpForename);
    }//GEN-LAST:event_txtEmpForenameActionPerformed

    private void txtEmpSurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpSurnameActionPerformed
        // TODO add your handling code here:
        inputLettersOnly(txtEmpSurname);
    }//GEN-LAST:event_txtEmpSurnameActionPerformed

    private void txtEmpGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpGenderActionPerformed
        // TODO add your handling code here:
        inputLettersOnly(txtEmpGender);
    }//GEN-LAST:event_txtEmpGenderActionPerformed

    private void txtEmpJobTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpJobTitleActionPerformed
        // TODO add your handling code here:
        inputLettersOnly(txtEmpJobTitle);
    }//GEN-LAST:event_txtEmpJobTitleActionPerformed

    private void txtEmpContractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpContractActionPerformed
        inputNumbersOnly(txtEmpContract);
    }//GEN-LAST:event_txtEmpContractActionPerformed

    private void txtEmpHourlyRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpHourlyRateActionPerformed
        inputNumbersOnly(txtEmpHourlyRate);
    }//GEN-LAST:event_txtEmpHourlyRateActionPerformed

    private void btnEmpReset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpReset1ActionPerformed
        // TODO add your handling code here:
        txtEmployeeID.setText("");
        txtEmpTitle.setText("");
        txtEmpForename.setText("");
        txtEmpSurname.setText("");
        txtEmpGender.setText("");
        txtEmpJobTitle.setText("");
        txtEmpContract.setText("");
        txtEmpHourlyRate.setText("");
        
    }//GEN-LAST:event_btnEmpReset1ActionPerformed

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
            java.util.logging.Logger.getLogger(Modify_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modify_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modify_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modify_Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modify_Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmpReset1;
    private javax.swing.JButton btnEmpSave;
    private javax.swing.JLabel lblEmpContract;
    private javax.swing.JLabel lblEmpForename;
    private javax.swing.JLabel lblEmpGender;
    private javax.swing.JLabel lblEmpHourlyRate;
    private javax.swing.JLabel lblEmpJobTitle;
    private javax.swing.JLabel lblEmpSurname;
    private javax.swing.JLabel lblEmpTitle;
    private javax.swing.JLabel lblEmployeeID1;
    private javax.swing.JLabel lblModifyEmployee;
    private javax.swing.JPanel pnlModifyEmployee;
    private javax.swing.JTextField txtEmpContract;
    private javax.swing.JTextField txtEmpForename;
    private javax.swing.JTextField txtEmpGender;
    private javax.swing.JTextField txtEmpHourlyRate;
    private javax.swing.JTextField txtEmpJobTitle;
    private javax.swing.JTextField txtEmpSurname;
    private javax.swing.JTextField txtEmpTitle;
    private javax.swing.JTextField txtEmployeeID;
    // End of variables declaration//GEN-END:variables
}

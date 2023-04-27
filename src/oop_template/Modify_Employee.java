/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oop_template;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
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
    

public void setEmployeeDetails(Employee_Details employeeDetails) {
    txtEmployeeID.setText(Integer.toString(employeeDetails.getEmployeeID()));
    txtEmpTitle.setText(employeeDetails.getTitle());
    txtEmpForename.setText(employeeDetails.getForename());
    txtEmpSurname.setText(employeeDetails.getSurname());
    txtEmpGender.setText(employeeDetails.getGender());
    txtEmpJobTitle.setText(employeeDetails.getJobTitle());
    txtEmpContract.setText(Integer.toString(employeeDetails.getContractedHours()));
    txtEmpHourlyRate.setText(Integer.toString(employeeDetails.getHourlyRate()));
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

        jPanel1 = new javax.swing.JPanel();
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
        btnEmpMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        lblModifyEmployee.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lblModifyEmployee.setText("Modify Employee");

        pnlModifyEmployee.setBackground(new java.awt.Color(153, 255, 255));
        pnlModifyEmployee.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblEmpTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEmpTitle.setText("Title:");

        lblEmployeeID1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEmployeeID1.setText("Employee ID:");

        lblEmpForename.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEmpForename.setText("Forename:");

        lblEmpSurname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEmpSurname.setText("Surname:");

        lblEmpGender.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEmpGender.setText("Gender:");

        lblEmpJobTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEmpJobTitle.setText("Job Title:");

        lblEmpContract.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEmpContract.setText("Contracted Hours:");

        lblEmpHourlyRate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEmpHourlyRate.setText("Hourly Rate:");

        btnEmpSave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEmpSave.setText("Save");
        btnEmpSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpSaveActionPerformed(evt);
            }
        });

        btnEmpReset1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEmpReset1.setText("Reset");
        btnEmpReset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpReset1ActionPerformed(evt);
            }
        });

        txtEmployeeID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        txtEmpTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEmpTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpTitleActionPerformed(evt);
            }
        });

        txtEmpForename.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEmpForename.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpForenameActionPerformed(evt);
            }
        });

        txtEmpSurname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEmpSurname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpSurnameActionPerformed(evt);
            }
        });

        txtEmpGender.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEmpGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpGenderActionPerformed(evt);
            }
        });

        txtEmpJobTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEmpJobTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpJobTitleActionPerformed(evt);
            }
        });

        txtEmpContract.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEmpContract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpContractActionPerformed(evt);
            }
        });

        txtEmpHourlyRate.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEmpHourlyRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpHourlyRateActionPerformed(evt);
            }
        });

        btnEmpMenu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEmpMenu.setText("Return Menu");
        btnEmpMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlModifyEmployeeLayout = new javax.swing.GroupLayout(pnlModifyEmployee);
        pnlModifyEmployee.setLayout(pnlModifyEmployeeLayout);
        pnlModifyEmployeeLayout.setHorizontalGroup(
            pnlModifyEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlModifyEmployeeLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlModifyEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlModifyEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblEmployeeID1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblEmpTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblEmpHourlyRate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEmpReset1)
                    .addComponent(lblEmpForename, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmpSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmpGender, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmpJobTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmpContract))
                .addGroup(pnlModifyEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlModifyEmployeeLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEmpMenu)
                        .addGap(48, 48, 48))
                    .addGroup(pnlModifyEmployeeLayout.createSequentialGroup()
                        .addGroup(pnlModifyEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlModifyEmployeeLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnEmpSave))
                            .addGroup(pnlModifyEmployeeLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(pnlModifyEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmpHourlyRate, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlModifyEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(txtEmpForename, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtEmpSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtEmpGender, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtEmpJobTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtEmpContract, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtEmpTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(190, Short.MAX_VALUE))))
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
                    .addComponent(btnEmpReset1)
                    .addComponent(btnEmpMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(pnlModifyEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(lblModifyEmployee)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblModifyEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(pnlModifyEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
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

    private void btnEmpSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpSaveActionPerformed
    // Check if all text fields are filled
    if(txtEmployeeID.getText().isEmpty() || txtEmpTitle.getText().isEmpty() || txtEmpForename.getText().isEmpty()
            || txtEmpSurname.getText().isEmpty() || txtEmpGender.getText().isEmpty() || txtEmpJobTitle.getText().isEmpty()
            || txtEmpContract.getText().isEmpty() || txtEmpHourlyRate.getText().isEmpty()) {
        // Display a pop-up message if any text field is empty
        JOptionPane.showMessageDialog(null, "Please fill in all fields.");
    } else {
        // Check if the employee ID already exists in file
        boolean idExists = false;
        try {
            Scanner scanner = new Scanner(new File("storage/employee_data.txt"));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split(",");
                if (data[0].equals(txtEmployeeID.getText())) {
                    idExists = true;
                    break;
                }
            }
            scanner.close();
        } catch(IOException ex) {
            // Display a pop-up message if there is an error reading the file
            JOptionPane.showMessageDialog(null, "Error reading file.");
        }
        
        if (idExists) {
            // Ask the user if they want to overwrite the current employee data
            int choice = JOptionPane.showConfirmDialog(null, "Employee ID already exists. Do you want to overwrite the current employee data?", 
                                                        "Confirm Overwrite", JOptionPane.YES_NO_OPTION);

            if (choice == JOptionPane.YES_OPTION) {
                try {
                    // Read the contents of the file into a list
                    List<String> lines = Files.readAllLines(Paths.get("storage/employee_data.txt"), StandardCharsets.UTF_8);

                    // Read over the lines and modify the old employee data
                    for (int i = 0; i < lines.size(); i++) {
                        String[] parts = lines.get(i).split(",");
                        if (parts[0].equals(txtEmployeeID.getText())) {
                            lines.set(i, txtEmployeeID.getText() + "," + txtEmpTitle.getText() + "," + txtEmpForename.getText() + ","
                                    + txtEmpSurname.getText() + "," + txtEmpGender.getText() + "," + txtEmpJobTitle.getText() + ","
                                    + txtEmpContract.getText() + "," + txtEmpHourlyRate.getText());
                            break;
                        }
                    }

                    // Write the updated contents back to the file
                    Files.write(Paths.get("storage/employee_data.txt"), lines, StandardCharsets.UTF_8);

                    // Display a pop-up message to confirm the data has been saved
                    JOptionPane.showMessageDialog(null, "Employee data overwritten.");
                } catch (IOException ex) {
                    // Display a pop-up message if there was an error writing to the file
                    JOptionPane.showMessageDialog(null, "Error writing to file.");
                }
            } else {
                // Clear employee ID field to allow user to enter a new ID
                txtEmployeeID.setText("");
                // Display a pop-up message to inform the user to enter a new ID
                JOptionPane.showMessageDialog(null, "Please choose a different employee ID.");
            }
        } else {
            try {
                // Create a FileWriter object that writes to a file called "employee_data.txt"
                FileWriter emptxtfile = new FileWriter("storage/employee_data.txt", true);
                // Write the data to the file
                emptxtfile.write(txtEmployeeID.getText() + "," + txtEmpTitle.getText() + "," + txtEmpForename.getText() + ","
                        + txtEmpSurname.getText() + "," + txtEmpGender.getText() + "," + txtEmpJobTitle.getText() + ","
                        + txtEmpContract.getText() + "," + txtEmpHourlyRate.getText() + "\n");
                // Close the FileWriter object
                emptxtfile.close();
                // Display a pop-up message to confirm the data has been saved
                JOptionPane.showMessageDialog(null, "Employee data saved to file.");
            } catch(IOException ex) {
                // Display a pop-up message if there was an error writing to the file
                JOptionPane.showMessageDialog(null, "Error writing to file.");
            }
        }
    }

    }//GEN-LAST:event_btnEmpSaveActionPerformed

    private void btnEmpMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpMenuActionPerformed
        Employee_Main_Menu employeeMenu = new Employee_Main_Menu();
        // Makes the View_Employee frame visible
        
        employeeMenu.setVisible(true);
        // Makes the current frame invisible if needed
        
        this.setVisible(false);
    }//GEN-LAST:event_btnEmpMenuActionPerformed

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
    private javax.swing.JButton btnEmpMenu;
    private javax.swing.JButton btnEmpReset1;
    private javax.swing.JButton btnEmpSave;
    private javax.swing.JPanel jPanel1;
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

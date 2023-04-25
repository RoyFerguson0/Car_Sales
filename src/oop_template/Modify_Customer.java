/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oop_template;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author anastasiaridge
 */
public class Modify_Customer extends javax.swing.JFrame {
    private boolean isCustomerIDValid = false;
    private boolean isCustomerTitleValid = false;
    private boolean isCustomerForenameValid = false;
    private boolean isCustomerSurnameValid = false;
    private boolean isCustomerGenderValid = false;
    private boolean isCustomerMobileValid = false;
    private boolean isCustomerAddressValid = false;
    
    public void setAllValid(){
        isCustomerIDValid = true;
        isCustomerTitleValid = true;
        isCustomerForenameValid = true;
        isCustomerSurnameValid = true;
        isCustomerGenderValid = true;
        isCustomerMobileValid = true;
        isCustomerAddressValid = true;
    }
    
    /**
     * Creates new form Modify_Customer
     */
    public Modify_Customer() {
        initComponents();
        //change customerID from int to string
        String customerID = Integer.toString(appData.Customer_Details.getCustomerID());
        //use getters and setters to fill text boxes with data from the text file
        txtCustomerID.setText(customerID);
        txtCustTitle.setText(appData.Customer_Details.getCustomerTitle());
        txtCustForename.setText(appData.Customer_Details.getCustomerForename());
        txtCustSurname.setText(appData.Customer_Details.getCustomerSurname());
        txtCustGender.setText(appData.Customer_Details.getCustomerGender());
        txtCustMobile.setText(appData.Customer_Details.getCustomerMobile());
        txtCustAddress.setText(appData.Customer_Details.getCustomerAddress());
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
        lblCustomerIDValidation = new javax.swing.JLabel();
        lblCustomerTitleValidation = new javax.swing.JLabel();
        lblCustomerForenameValidation = new javax.swing.JLabel();
        lblCustomerSurnameValidation = new javax.swing.JLabel();
        lblCustomerGenderValidation = new javax.swing.JLabel();
        lblCustomerMobileValidation = new javax.swing.JLabel();
        lblCustomerAddressValidation = new javax.swing.JLabel();
        jcbTitle = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

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
        txtCustomerID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCustomerIDKeyReleased(evt);
            }
        });

        txtCustTitle.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        txtCustTitle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCustTitleKeyReleased(evt);
            }
        });

        txtCustForename.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        txtCustForename.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCustForenameKeyReleased(evt);
            }
        });

        txtCustSurname.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        txtCustSurname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCustSurnameKeyReleased(evt);
            }
        });

        txtCustGender.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        txtCustGender.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCustGenderKeyReleased(evt);
            }
        });

        txtCustMobile.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        txtCustMobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCustMobileKeyReleased(evt);
            }
        });

        txtCustAddress.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        txtCustAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCustAddressKeyReleased(evt);
            }
        });

        btnEmpMenu.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnEmpMenu.setText("->");
        btnEmpMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpMenuActionPerformed(evt);
            }
        });

        btnCustReset.setFont(new java.awt.Font("Helvetica Neue", 2, 14)); // NOI18N
        btnCustReset.setText("Reset");
        btnCustReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustResetActionPerformed(evt);
            }
        });

        btnCustSave.setFont(new java.awt.Font("Helvetica Neue", 2, 14)); // NOI18N
        btnCustSave.setText("Save");
        btnCustSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustSaveActionPerformed(evt);
            }
        });

        lblCustomerIDValidation.setForeground(new java.awt.Color(255, 0, 0));

        lblCustomerTitleValidation.setForeground(new java.awt.Color(255, 0, 0));

        lblCustomerForenameValidation.setForeground(new java.awt.Color(255, 0, 0));

        lblCustomerSurnameValidation.setForeground(new java.awt.Color(255, 0, 0));

        lblCustomerGenderValidation.setForeground(new java.awt.Color(255, 0, 0));

        lblCustomerMobileValidation.setForeground(new java.awt.Color(255, 0, 0));

        lblCustomerAddressValidation.setForeground(new java.awt.Color(255, 0, 0));

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
                    .addComponent(lblCustomerMobileValidation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCustomerGenderValidation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCustomerSurnameValidation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCustomerTitleValidation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCustomerIDValidation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCustomerID)
                    .addComponent(txtCustTitle)
                    .addComponent(txtCustForename)
                    .addComponent(txtCustSurname)
                    .addComponent(txtCustGender)
                    .addComponent(txtCustMobile, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCustomerAddressValidation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlModifyCustomerLayout.createSequentialGroup()
                        .addComponent(btnCustSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                        .addComponent(btnEmpMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblCustomerForenameValidation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCustAddress, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        pnlModifyCustomerLayout.setVerticalGroup(
            pnlModifyCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlModifyCustomerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlModifyCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustomerID)
                    .addComponent(txtCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCustomerIDValidation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlModifyCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustTitle)
                    .addComponent(txtCustTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCustomerTitleValidation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlModifyCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustForename)
                    .addComponent(txtCustForename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCustomerForenameValidation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlModifyCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustSurname)
                    .addComponent(txtCustSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCustomerSurnameValidation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlModifyCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustGender)
                    .addComponent(txtCustGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCustomerGenderValidation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlModifyCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustMobile)
                    .addComponent(txtCustMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCustomerMobileValidation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlModifyCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustAddress)
                    .addComponent(txtCustAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCustomerAddressValidation)
                .addGroup(pnlModifyCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlModifyCustomerLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btnEmpMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(pnlModifyCustomerLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(pnlModifyCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCustReset)
                            .addComponent(btnCustSave))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jcbTitle.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jcbTitle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(Title)", "Miss", "Mrs", "Ms", "Mr" }));
        jcbTitle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jcbTitleKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(lblModifyCustomer))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(pnlModifyCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jcbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblModifyCustomer)
                .addGap(1, 1, 1)
                .addComponent(jcbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlModifyCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
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

    private void btnCustSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustSaveActionPerformed
        if(isCustomerIDValid && isCustomerTitleValid && isCustomerForenameValid && isCustomerSurnameValid
                             && isCustomerGenderValid && isCustomerMobileValid && isCustomerAddressValid){
            //all valid, saving to appData, file, then clearing text fields
            //appData.Customer_Details.setCustomerID(txtCustomerID());
            
            try{
                File customerTextFile = new File("storage/Customer_Details.txt");
                if (customerTextFile.createNewFile()) {
                    System.out.println("File has been created " + customerTextFile.getName() + ".");
                } else {
                    System.out.println("This file already exists.");
                }
                //always has to end with a line break
                String line = txtCustomerID.getText() + "," 
                            + txtCustTitle.getText() + ", "
                            + txtCustForename.getText() + ", "
                            + txtCustSurname.getText() + ", "
                            + txtCustGender.getText() + ", "
                            + txtCustMobile.getText() + ", "
                            + txtCustAddress.getText();
                
                FileWriter customerDetailsFile = new FileWriter("storage/Customer_Details.txt",true);
                BufferedWriter bWriter = new BufferedWriter(customerDetailsFile);
                bWriter.write(line);
                bWriter.newLine();
                bWriter.close();
                
                
                // Clear all text fields
                 txtCustomerID.setText("");
                 txtCustTitle.setText("");
                 txtCustForename.setText("");
                 txtCustSurname.setText("");
                 txtCustGender.setText("");
                 txtCustMobile.setText("");
                 txtCustAddress.setText("");
                
            }
            catch(IOException e){
                System.out.println("Issues saving customer file.");
                e.printStackTrace();
            }
        }
        else{
            //show error message
            JOptionPane.showMessageDialog(null, "Please enter all fields correctly.");
        }
        
    }//GEN-LAST:event_btnCustSaveActionPerformed

    private void txtCustomerIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustomerIDKeyReleased
        //validating input: only numbers allowed
        String text = txtCustomerID.getText();
        Boolean isOnlyNumbers = text.matches("^[0-9]*$");
        if(text.isBlank()){
            isCustomerIDValid = false;
            lblCustomerIDValidation.setText("Please enter a value (numbers).");
        }
        else if(isOnlyNumbers){
            lblCustomerIDValidation.setText("");
            isCustomerIDValid = true;
        }
        else{
            lblCustomerIDValidation.setText("Please enter only numbers.");
            isCustomerIDValid = false;
        }
    }//GEN-LAST:event_txtCustomerIDKeyReleased

    private void txtCustTitleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustTitleKeyReleased
        //validating input: only letters allowed
        String text = txtCustTitle.getText();
        Boolean isOnlyLetters = text.matches("^[a-zA-Z]*$");
        if(isOnlyLetters){
            lblCustomerTitleValidation.setText("");
            isCustomerTitleValid = true;
        }
        else{
            lblCustomerTitleValidation.setText("Please enter only letters.");
            isCustomerTitleValid = false;
        }
    }//GEN-LAST:event_txtCustTitleKeyReleased

    private void txtCustForenameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustForenameKeyReleased
        //validating input: only letters allowed
        String text = txtCustForename.getText();
        Boolean isOnlyLetters = text.matches("^[a-zA-Z]*$");
        if(isOnlyLetters){
            lblCustomerForenameValidation.setText("");
            isCustomerForenameValid = true;
        }
        else{
            lblCustomerForenameValidation.setText("Please enter only letters.");
            isCustomerForenameValid = false;
        }
    }//GEN-LAST:event_txtCustForenameKeyReleased

    private void txtCustSurnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustSurnameKeyReleased
        //validating input: only letters allowed
        String text = txtCustSurname.getText();
        Boolean isOnlyLetters = text.matches("^[a-zA-Z]*$");
        if(isOnlyLetters){
            lblCustomerSurnameValidation.setText("");
            isCustomerSurnameValid = true;
        }
        else{
            lblCustomerSurnameValidation.setText("Please enter only letters.");
            isCustomerSurnameValid = false;
        }
    }//GEN-LAST:event_txtCustSurnameKeyReleased

    private void txtCustGenderKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustGenderKeyReleased
        //validating input: only letters allowed
        String text = txtCustGender.getText();
        Boolean isOnlyLetters = text.matches("^[a-zA-Z]*$");
        if(isOnlyLetters){
            lblCustomerGenderValidation.setText("");
            isCustomerGenderValid = true;
        }
        else{
            lblCustomerGenderValidation.setText("Please enter only letters.");
            isCustomerGenderValid = false;
        }
    }//GEN-LAST:event_txtCustGenderKeyReleased

    private void txtCustMobileKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustMobileKeyReleased
        //validating input: a string to allow for area codes 
        String text = txtCustMobile.getText();
        Boolean isOnlyNumbers = text.matches("^[0-9]*$");
        int length = text.length();
        if(isOnlyNumbers && length == 11){
            lblCustomerMobileValidation.setText("");
            isCustomerMobileValid = true;
        }
        else{
            lblCustomerMobileValidation.setText("Please enter mobile number.");
            isCustomerMobileValid = false;
        }
    }//GEN-LAST:event_txtCustMobileKeyReleased

    private void txtCustAddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustAddressKeyReleased
        //validating input: must allow for both letters and numbers
        String text = txtCustAddress.getText();
        if(text.isBlank()){
            isCustomerAddressValid = false;
            lblCustomerAddressValidation.setText("Please enter your address.");
        }
        else{
            lblCustomerAddressValidation.setText("");
            isCustomerAddressValid = true;
        }
    }//GEN-LAST:event_txtCustAddressKeyReleased

    private void btnEmpMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpMenuActionPerformed
        //return to employee menu
        this.dispose();
        new Employee_Main_Menu().setVisible(true);
    }//GEN-LAST:event_btnEmpMenuActionPerformed

    private void jcbTitleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcbTitleKeyReleased
        //validating input: only letters allowed
      /*  String text = jcbTitle.getSelectedItem().toString();
        Boolean isOnlyLetters = text.matches("^[a-zA-Z]*$");
        if(isOnlyLetters){
            lblCustomerTitleValidation.setText("");
            isCustomerTitleValid = true;
        }
        else{
            lblCustomerTitleValidation.setText("Please enter only letters.");
            isCustomerTitleValid = false;
      //  }*/
    }//GEN-LAST:event_jcbTitleKeyReleased

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
    private javax.swing.JComboBox<String> jcbTitle;
    private javax.swing.JLabel lblCustAddress;
    private javax.swing.JLabel lblCustForename;
    private javax.swing.JLabel lblCustGender;
    private javax.swing.JLabel lblCustMobile;
    private javax.swing.JLabel lblCustSurname;
    private javax.swing.JLabel lblCustTitle;
    private javax.swing.JLabel lblCustomerAddressValidation;
    private javax.swing.JLabel lblCustomerForenameValidation;
    private javax.swing.JLabel lblCustomerGenderValidation;
    private javax.swing.JLabel lblCustomerID;
    private javax.swing.JLabel lblCustomerIDValidation;
    private javax.swing.JLabel lblCustomerMobileValidation;
    private javax.swing.JLabel lblCustomerSurnameValidation;
    private javax.swing.JLabel lblCustomerTitleValidation;
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

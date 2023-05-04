/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oop_template;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.*;
import oop_template.appData;

import java.awt.event.ActionListener;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Pattern;

import static java.awt.Image.SCALE_SMOOTH;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;


/**
 *
 * @author Roy Ferguson(50004216)
 */
public class Modify_Car extends javax.swing.JFrame {


    /**
     * Creates new form Modify_Car
     * @author Roy Ferguson(50004216)
     */
    public Modify_Car() {
        initComponents();

        // Setting Form Position to Center
         setLocationRelativeTo(null);
         
        // Checking if Car Details are not Null 
        if(!Objects.equals(appData.Car_Details.getRegistration(), "null") && !Objects.equals(appData.Car_Details.getMake(), "null") &&
                !Objects.equals(appData.Car_Details.getModel(), "null") && !Objects.equals(appData.Car_Details.getColour(), "null") &&
                appData.Car_Details.getDoors() != -1 && !Objects.equals(appData.Car_Details.getEngine_size(), "null") &&
                !Objects.equals(appData.Car_Details.getDescription(), "null") && appData.Car_Details.getPrice() != -1
                && !Objects.equals(appData.Car_Details.getImageLocation(), "null")){
            
            // If Not Null you set all the textfields with all the stored values from the Car_Details.java
            txtRegistration.setText(appData.Car_Details.getRegistration());
            txtMake.setText(appData.Car_Details.getMake());
            txtModel.setText(appData.Car_Details.getModel());
            txtColour.setText(appData.Car_Details.getColour());
            txtDoors.setText(String.valueOf(appData.Car_Details.getDoors()));
            txtEngine.setText(appData.Car_Details.getEngine_size());
            txtDescription.setText(appData.Car_Details.getDescription());
            txtPrice.setText(String.valueOf(appData.Car_Details.getPrice()));


            System.out.println(appData.Car_Details.getMake());
            System.out.println(appData.Car_Details.getImageLocation());
            System.out.println("hi");
            String image = appData.Car_Details.getImageLocation();
            if(appData.Car_Details.getImageLocation() == null){
                appData.Car_Details.setImageLocation("NoImage");
            }

            if(!appData.Car_Details.getImageLocation().equals("NoImage")) {
                // This will not run Modify Car form first (Have to Run Search) Image will show up
                ImageIcon icon = new ImageIcon(getClass().getResource(appData.Car_Details.getImageLocation()));
                // This line will run the Modify Car form first but when search won't show image
                //ImageIcon icon = new ImageIcon(appData.Car_Details.getImageLocation());
                //Gets the image
                Image img = icon.getImage();
                //Used to scale the image to fit within the label
                Image imgScale = img.getScaledInstance(lblPic.getWidth(), lblPic.getHeight(), SCALE_SMOOTH);
                //creates a new image with the new scale
                ImageIcon scaledIcon = new ImageIcon(imgScale);
                //sets the scaled image within the label
                lblPic.setIcon(scaledIcon);
            }


        }else{
            
            // If Car Details are null 
            // Set all textfields as blank apart from Registration which was saved in Search Car Form
            txtRegistration.setText(appData.Car_Details.getRegistration());
            txtMake.setText("");
            txtModel.setText("");
            txtColour.setText("");
            txtDoors.setText("");
            txtEngine.setText("");
            txtDescription.setText("");
            txtPrice.setText("");

        }

    }

    
    /**
     * Validation input Text Fields - No Digits or Special Characters
     * @param s returns true or false
     * @return s
     * @author Roy Ferguson(50004216)
     */
    public static boolean isAlpha(String s) {
        return s != null && s.chars().allMatch(Character::isLetter);
    }

   
    /**
     * Validation input Text Fields - No Letters allowed or special characters
     * @param str  returns true or false
     * @return str
     * @author Roy Ferguson(50004216)
     */
    public static boolean isNumeric(String str) {
        return str != null && str.chars().allMatch(Character::isDigit);
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
        lblModifyCar = new javax.swing.JLabel();
        pnlModifyCar = new javax.swing.JPanel();
        lblRegistration = new javax.swing.JLabel();
        lblMake = new javax.swing.JLabel();
        lblModel = new javax.swing.JLabel();
        lblColour = new javax.swing.JLabel();
        lblDoors = new javax.swing.JLabel();
        lblEngine = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        txtRegistration = new javax.swing.JTextField();
        txtMake = new javax.swing.JTextField();
        txtModel = new javax.swing.JTextField();
        txtColour = new javax.swing.JTextField();
        txtDoors = new javax.swing.JTextField();
        txtEngine = new javax.swing.JTextField();
        txtDescription = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        lblImage = new javax.swing.JLabel();
        cboCarImage = new javax.swing.JComboBox<>();
        lblPic = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSold = new javax.swing.JButton();
        btnSearchCar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(590, 590));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        lblModifyCar.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lblModifyCar.setText("Modify Car");

        pnlModifyCar.setBackground(new java.awt.Color(153, 255, 255));
        pnlModifyCar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Details:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        lblRegistration.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRegistration.setText("Registration:");

        lblMake.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMake.setText("Make: ");

        lblModel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblModel.setText("Model:");

        lblColour.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblColour.setText("Colour:");

        lblDoors.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDoors.setText("Doors: ");

        lblEngine.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblEngine.setText("Engine:");

        lblDescription.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDescription.setText("Description:");

        lblPrice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPrice.setText("Price:");

        txtRegistration.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        txtMake.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtMake.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMakeKeyReleased(evt);
            }
        });

        txtModel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        txtColour.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtColour.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtColourKeyReleased(evt);
            }
        });

        txtDoors.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtDoors.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDoorsKeyReleased(evt);
            }
        });

        txtEngine.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        txtDescription.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        txtPrice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPriceKeyReleased(evt);
            }
        });

        lblImage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblImage.setText("Image:");

        cboCarImage.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cboCarImage.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Image", "Ford Ranger 2022", "Honda Civic Type R Sportline 2023", "Ford Focus 2022" }));
        cboCarImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCarImageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlModifyCarLayout = new javax.swing.GroupLayout(pnlModifyCar);
        pnlModifyCar.setLayout(pnlModifyCarLayout);
        pnlModifyCarLayout.setHorizontalGroup(
            pnlModifyCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlModifyCarLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pnlModifyCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPrice)
                    .addComponent(lblDescription)
                    .addComponent(lblEngine)
                    .addComponent(lblDoors)
                    .addComponent(lblColour)
                    .addComponent(lblModel)
                    .addComponent(lblMake)
                    .addComponent(lblRegistration)
                    .addComponent(lblImage))
                .addGap(18, 18, 18)
                .addGroup(pnlModifyCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlModifyCarLayout.createSequentialGroup()
                        .addComponent(lblPic, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlModifyCarLayout.createSequentialGroup()
                        .addGroup(pnlModifyCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlModifyCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtRegistration, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                                .addComponent(txtMake, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtModel, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtColour, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtDoors, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtEngine, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtDescription, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPrice, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(cboCarImage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 12, Short.MAX_VALUE))))
        );
        pnlModifyCarLayout.setVerticalGroup(
            pnlModifyCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlModifyCarLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(pnlModifyCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegistration)
                    .addComponent(txtRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlModifyCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMake)
                    .addComponent(txtMake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlModifyCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModel)
                    .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlModifyCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblColour)
                    .addComponent(txtColour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlModifyCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDoors)
                    .addComponent(txtDoors, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlModifyCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEngine)
                    .addComponent(txtEngine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlModifyCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescription)
                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlModifyCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrice)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlModifyCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblImage)
                    .addComponent(cboCarImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPic, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnReset.setBackground(new java.awt.Color(0, 0, 0));
        btnReset.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(0, 0, 0));
        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(0, 0, 0));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSold.setBackground(new java.awt.Color(0, 0, 0));
        btnSold.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSold.setForeground(new java.awt.Color(255, 255, 255));
        btnSold.setText("Sold");
        btnSold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSoldActionPerformed(evt);
            }
        });

        btnSearchCar.setBackground(new java.awt.Color(0, 0, 0));
        btnSearchCar.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        btnSearchCar.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchCar.setText("⬅");
        btnSearchCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchCarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblModifyCar)
                .addGap(228, 228, 228))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pnlModifyCar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(btnSold)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnReset)
                        .addGap(80, 80, 80)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSave)
                            .addComponent(btnDelete))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSearchCar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(lblModifyCar)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pnlModifyCar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSold, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnReset)
                            .addComponent(btnSave))
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSearchCar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    /**
     * Reset Button Which is used to clear all text boxes.
     * @author Roy Ferguson(50004216)
     */
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed

        // Pop up Making sure you want to clear textboxes
        int resetValue = JOptionPane.showConfirmDialog(null,"Are You sure you want to clear all Textboxes?", "Question",JOptionPane.YES_NO_OPTION);

        // If answer is yes - Want to clear textboxes
        if(resetValue == 0){
            
            // Resetting All Text Boxes to Empty
            txtMake.setText("");
            txtModel.setText("");
            txtColour.setText("");
            txtDoors.setText("");
            txtEngine.setText("");
            txtDescription.setText("");
            txtPrice.setText("");
            lblPic.setVisible(false);
           
            lblPic.setSize(213, 131);
            
        }

    }//GEN-LAST:event_btnResetActionPerformed

    
    /**
     * Validating the Make Text Field so that there are no numbers in text
     * @author Roy Ferguson(50004216)
     */
    private void txtMakeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMakeKeyReleased
        
        // Storing Make in Variable and removing any spaces in text
        String makeOne = txtMake.getText();
        String make = makeOne.replace(" ","");
        
        // Calling Function
        if(isAlpha(make)){
            // If text is Good
            txtMake.setText(makeOne);
            txtMake.setEditable(true);
        }
        else{
            // Not able to enter in text field if value a number
            txtMake.setEditable(false);
            // Set Error Message
            JOptionPane.showMessageDialog(null, "Cannot Enter Digits or Special Characters?", "Error Message",JOptionPane.PLAIN_MESSAGE);
            txtMake.setText("");
            txtMake.grabFocus();
        }


    }//GEN-LAST:event_txtMakeKeyReleased

    
    /**
     * Validating the Colour Text Field so that there are no numbers in text
     * @author Roy Ferguson(50004216)
     */
    private void txtColourKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColourKeyReleased
        
        // Storing colour in variable and removing and spaces in text
        String colour = txtColour.getText().replace(" ","");
        // Calling Function
        if(isAlpha(colour)){
            // If text is good
            txtColour.setEditable(true);
        }
        else{
            // Not able to enter in text field if value a number
            txtColour.setEditable(false);
            // Set Error Message
            JOptionPane.showMessageDialog(null, "Cannot Enter Digits or Special Characters?", "Error Message",JOptionPane.PLAIN_MESSAGE);
            txtColour.setText("");
            txtColour.grabFocus();
        }

    }//GEN-LAST:event_txtColourKeyReleased

    
    /**
     * Validating the Door Text Field so that there are no letters in text
     * @author Roy Ferguson(50004216)
     */
    private void txtDoorsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDoorsKeyReleased

        // Storing doors in string variable and removing spaces in text.
        String doors = txtDoors.getText().replace(" ", "");
        // Calling Function
        if(isNumeric(doors)){
            // If text is Good
            txtDoors.setEditable(true);
        }
        else{
            // Not able to enter in text field if value a letter or special character
            txtDoors.setEditable(false);
            // Set Error Message
            JOptionPane.showMessageDialog(null, "Cannot Enter Letters or Special Characters?", "Error Message",JOptionPane.PLAIN_MESSAGE);
            txtDoors.setText("");
            txtDoors.grabFocus();

        }
    }//GEN-LAST:event_txtDoorsKeyReleased

    
    /**
     * Validating the Price Text Field so that there are no Letters in text.
     * @author Roy Ferguson(50004216)
     */
    private void txtPriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyReleased

        // Storing price in string variable and removing spaces in text.
        String price = txtPrice.getText().replace(" ", "");
        // Calling Function
        if(isNumeric(price)){
            // If text is Good
            txtPrice.setEditable(true);
        }
        else{
            // Not able to enter in text field if value a letter or special character
            txtPrice.setEditable(false);
            // Set Error Message
            JOptionPane.showMessageDialog(null, "Cannot Enter Letters or Special Characters?", "Error Message",JOptionPane.PLAIN_MESSAGE);
            txtPrice.setText("");
            txtPrice.grabFocus();
        }
    }//GEN-LAST:event_txtPriceKeyReleased

    
    /**
     * Save Button which is able to save data in text fields to Car_Details.txt
     * If reg already exists it will give the option to re-write over the exact lines of code.
     * @author Roy Ferguson(50004216)
     */
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        // Checking Text Boxes aren't Empty
        if(txtRegistration.getText().equalsIgnoreCase("") || txtMake.getText().equalsIgnoreCase("") || txtModel.getText().equalsIgnoreCase("") ||
                txtColour.getText().equalsIgnoreCase("") || txtDoors.getText().equalsIgnoreCase("")||
                txtEngine.getText().equalsIgnoreCase("") || txtDescription.getText().equalsIgnoreCase("") ||
                txtPrice.getText().equalsIgnoreCase(""))
        {
            // If text boxes are empty will pop up a message
            JOptionPane.showMessageDialog(null, "Fill all Fields in?", "Error Message",JOptionPane.PLAIN_MESSAGE);
        }else {
            // If text boces aren't empty

            // Saving Data to Objects in Car Details
            appData.Car_Details.setRegistration(txtRegistration.getText().replace(" ", ""));
            appData.Car_Details.setMake(txtMake.getText().replace(" ", ""));
            appData.Car_Details.setModel(txtModel.getText().trim());
            appData.Car_Details.setColour(txtColour.getText().replace(" ", ""));
            appData.Car_Details.setDoors(Integer.parseInt(txtDoors.getText().replace(" ", "")));
            appData.Car_Details.setEngine_size(txtEngine.getText().replace(" ", ""));
            appData.Car_Details.setDescription(txtDescription.getText().trim());
            appData.Car_Details.setPrice(Integer.parseInt(txtPrice.getText().replace(" ", "")));

            // Saving all Car Details (Objects) in string variables
            String Reg = appData.Car_Details.getRegistration();
            String Make = appData.Car_Details.getMake();
            String Model = appData.Car_Details.getModel();
            String Colour = appData.Car_Details.getColour();
            String Doors = String.valueOf(appData.Car_Details.getDoors());
            String EngineSize = appData.Car_Details.getEngine_size();
            String Description = appData.Car_Details.getDescription();
            String Price = String.valueOf(appData.Car_Details.getPrice());
            
            // Checking that the door of motor are in range
            int validateDoors = appData.Car_Details.getDoors();
            if (validateDoors <= 6 && validateDoors >= 1) {

                // If doors are between 6 and 1
                
                // Create a (Cars_Sold.txt) file if it doesn't already exist
                try {
                File carSoldFile = new File("storage/Cars_Sold.txt");
                if (carSoldFile.createNewFile()) {
                    System.out.println("File Created " + carSoldFile.getName());
                } else {
                    System.out.println("File aleardy exists");
                }
                
                // Variables used to read file
                String[] words2 = null;
                String eachLine2;
                int count2 = 0;
                int lines2 = 0;
                int RegistationLine2 = 0;

                // Reading through each line in text file
                FileReader fr2 = null;
                try {
                    fr2 = new FileReader("storage/Cars_Sold.txt");
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }
                BufferedReader line2 = new BufferedReader(fr2);
                while (true) {
                    try {
                        if (!((eachLine2 = line2.readLine()) != null)) break;
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    lines2++;
                    words2 = eachLine2.split("\n");
                    
                    // Looking at each word in line 
                    for (String word : words2) {
                        // If the words in line equal Registration i am looking for 
                        // Plus One is add to count2
                        // And registration2 saves the line the registration was found
                        if (word.equals("Registration: " + Reg)) {
                            count2++;
                            RegistationLine2 = lines2;

                        }
                    }
                }
                
                // If registration was found in (Cars_Sold.txt)
                if (count2 != 0) {
                    // Output an error message - Cause Can't add a registration that already exists to system.
                    // As it is a car that was sold with the number plate.
                    JOptionPane.showMessageDialog(null, "ERROR - Registration Exists in Cars Sold!!!!","ERROR!!!!!", JOptionPane.PLAIN_MESSAGE);
                }else{
                // If the registration wasn't found in (Cars_Sold.txt)
                
                // Create a text file (Car_Details.txt) if it doesn't exist already
                try {
                    File carTextFile = new File("storage/Car_Details.txt");
                    if (carTextFile.createNewFile()) {
                       // System.out.println("File Created" + carTextFile.getName());
                        JOptionPane.showMessageDialog(null, "The Text File created is: " + carTextFile, "Text File Created?", JOptionPane.PLAIN_MESSAGE);
                    } else {
                       // System.out.println("File aleardy exists");
                        JOptionPane.showMessageDialog(null, "Text File: " + carTextFile + " already exists?", "Text File Already Exists?", JOptionPane.PLAIN_MESSAGE);
                    }

                    // Check if Reg Already Exists in Text File
                    // Variable used to read through text file
                    String[] words = null;
                    String eachLine;
                    int count = 0;
                    int lines = 0;
                    int numLines = 0;

                    // Creating File and Buffer Reader
                    FileReader fr = new FileReader("storage/Car_Details.txt");
                    BufferedReader line = new BufferedReader(fr);
                    while ((eachLine = line.readLine()) != null) {
                        lines++;
                        words = eachLine.split("\n");
                        // Reads each lines words.
                        for (String word : words) {
                            // if the word equals registration i am looking for 
                            // counter goes up by one 
                            // and line number is saved (numLines)
                            if (word.equals("Registration: " + Reg)) {
                                count++;
                                numLines = lines;
                            }
                        }
                    }
                    
                    // If registration exists in (Car_Details.txt)
                    if (count != 0) {
                        
                        // Pop up making sure you want to re-write The Car Registration details
                        int reWriteLinesValue = JOptionPane.showConfirmDialog(null, Reg + " Exists Already! Do You Want to Rewrite Registration Details?", "Important Question?", JOptionPane.YES_NO_OPTION);

                        // ReWriting The Exact lines of Code
                        if (reWriteLinesValue == 0) {
                            Path path = Paths.get("storage/Car_Details.txt");
                            List<String> lines1 = Files.readAllLines(path, StandardCharsets.UTF_8);
                            // Make
                            lines1.set(numLines, "Make: " + txtMake.getText());
                            Files.write(path, lines1, StandardCharsets.UTF_8);
                            // Model
                            lines1.set(numLines + 1, "Model: " + txtModel.getText());
                            Files.write(path, lines1, StandardCharsets.UTF_8);
                            // Colour
                            lines1.set(numLines + 2, "Colour: " + txtColour.getText());
                            Files.write(path, lines1, StandardCharsets.UTF_8);
                            // Number of Doors
                            lines1.set(numLines + 3, "Number of Doors: " + txtDoors.getText());
                            Files.write(path, lines1, StandardCharsets.UTF_8);
                            // Engine Size
                            lines1.set(numLines + 4, "Engine Size: " + txtEngine.getText());
                            Files.write(path, lines1, StandardCharsets.UTF_8);
                            // Description
                            lines1.set(numLines + 5, "Description: " + txtDescription.getText());
                            Files.write(path, lines1, StandardCharsets.UTF_8);
                            // Price
                            lines1.set(numLines + 6, "Price: " + txtPrice.getText());
                            Files.write(path, lines1, StandardCharsets.UTF_8);
                            // Image
                            lines1.set(numLines + 7, "Image: " + appData.Car_Details.getImageLocation());
                            Files.write(path, lines1, StandardCharsets.UTF_8);

                            // pop up to let you know write was successful
                            // then setting the textfields to empty for a new car to be added
                            // or modify another existing car
                            JOptionPane.showMessageDialog(null, "Write Successful?", "Writing to File?", JOptionPane.PLAIN_MESSAGE);
                            txtRegistration.setText("");
                            txtMake.setText("");
                            txtModel.setText("");
                            txtColour.setText("");
                            txtDoors.setText("");
                            txtEngine.setText("");
                            txtDescription.setText("");
                            txtPrice.setText("");
                            lblPic.setVisible(false);
                        }
                        fr.close();
                        
                    } else {
                        // If Registration Doesn't Exists in (Car_Details.txt)
                        
                        // Pop up making sure you want to save new car details.
                        int reWriteLinesValue = JOptionPane.showConfirmDialog(null, "Do You want to Save New Car Details?", "Important Question?", JOptionPane.YES_NO_OPTION);
                        
                        // If answer is yes - add new car
                        if (reWriteLinesValue == 0) {
                            // writing data to (Car_Details.txt)
                            
                            // Creating the File Writer and Buffer Writer
                            FileWriter carFile = new FileWriter("storage/Car_Details.txt", true);
                            BufferedWriter output = new BufferedWriter(carFile);

                            // Write String to Text File - Next Empty Line
                            output.write("Registration: " + Reg + "\nMake: " + Make + "\nModel: " + Model + "\nColour: " + Colour + "\nNumber of Doors: " + Doors +
                                    "\nEngine Size: " + EngineSize + "\nDescription: " + Description + "\nPrice: " + Price + "\nImage: " +
                                    appData.Car_Details.getImageLocation() + "\n\n\n\n");

                            // Pop up to let you know write was successful
                            // then set all text boxes to empty
                            JOptionPane.showMessageDialog(null, "Write Successful?", "Writing to File?", JOptionPane.PLAIN_MESSAGE);
                            txtRegistration.setText("");
                            txtMake.setText("");
                            txtModel.setText("");
                            txtColour.setText("");
                            txtDoors.setText("");
                            txtEngine.setText("");
                            txtDescription.setText("");
                            txtPrice.setText("");
                            lblPic.setVisible(false);

                            output.close();
                        }
                    }
                    


                } catch (IOException e) {
                    System.out.println("An error occurred");
                    e.printStackTrace();
                }
                
                }
            
            } catch (IOException e) {
                System.out.println("An error occurred");
                e.printStackTrace();
            }
            }else{
                // If number of doors is not in range
                // Pop up message
                JOptionPane.showMessageDialog(null, "Number of Doors - Not in Range? 1-6", "Error?", JOptionPane.PLAIN_MESSAGE);
                txtDoors.setText("");
                txtDoors.grabFocus();
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    /**
     * Delete button which is used to remove a specific car from the text file (Car_Details.txt)
     * @author Roy Ferguson(50004216)
     */
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        
        // check if registration textbox is empty
        if(txtRegistration.getText().equalsIgnoreCase(""))
        {
            // If empty output a message
            JOptionPane.showMessageDialog(null, "Fill in Registration?", "Error Message",JOptionPane.PLAIN_MESSAGE);
        }else {
            // If registration textbox isn't empty

            // Saving Data to Objects in Car Details (Setters)
            appData.Car_Details.setRegistration(txtRegistration.getText().replace(" ", ""));

            // Saving Car Registration (Objects) in string variable
            String Reg = appData.Car_Details.getRegistration();
 
                // Creating (Car_Details.txt) if it doesn't exist already
                try {
                    File carTextFile = new File("storage/Car_Details.txt");
                    if (carTextFile.createNewFile()) {
                    //    System.out.println("File Created" + carTextFile.getName());
                        JOptionPane.showMessageDialog(null, "The Text File created is: " + carTextFile, "Text File Created?", JOptionPane.PLAIN_MESSAGE);
                    } else {
                    //    System.out.println("File aleardy exists");
                    //    JOptionPane.showMessageDialog(null, "Text File: " + carTextFile + " already exists?", "Text File Already Exists?", JOptionPane.PLAIN_MESSAGE);
                    }

                    // Check if Reg Already Exists in Text File
                    // Variables used to read though text file
                    String[] words = null;
                    String eachLine;
                    int count = 0;
                    int lines = 0;
                    int numLines = 0;

                    // Creating File and Buffer Reader
                    FileReader fr = new FileReader("storage/Car_Details.txt");
                    BufferedReader line = new BufferedReader(fr);
                    // Reading through eachline in text file
                    while ((eachLine = line.readLine()) != null) {
                        lines++;
                        words = eachLine.split("\n");
                        
                        // Reads words on each line checking 
                        // if the registration already exists in (Car_Details.txt)
                        for (String word : words) {
                            // If registration present count goes up by one and line number is 
                            // saved (numLines)
                            if (word.equals("Registration: " + Reg)) {
                                count++;
                                numLines = lines;
                            }
                        }
                    }

                    // If count is anything other than zero
                    // means the Reg is present
                    if (count != 0) {
                        // Pop up saying that the registration exists in file and do you want
                        // to delete the car details to do with that registration.
                        int reWriteLinesValue = JOptionPane.showConfirmDialog(null, Reg + " Exists Delete Car Details?", "Important Question?", JOptionPane.YES_NO_OPTION);
                        

                        // If answer is yes - Delete Car from (Car_Details.txt)
                        if (reWriteLinesValue == 0) {
                            // finds the line with (numLines) and removes all data.
                            Path path = Paths.get("storage/Car_Details.txt");                          
                            List<String> lines1 = Files.readAllLines(path, StandardCharsets.UTF_8);
                            // Reg
                            lines1.set(numLines - 1, "");
                            Files.write(path, lines1, StandardCharsets.UTF_8);
                            // Make
                            lines1.set(numLines, "");
                            Files.write(path, lines1, StandardCharsets.UTF_8);
                            // Model
                            lines1.set(numLines + 1, "");
                            Files.write(path, lines1, StandardCharsets.UTF_8);
                            // Colour
                            lines1.set(numLines + 2, "");
                            Files.write(path, lines1, StandardCharsets.UTF_8);
                            // Number of Doors
                            lines1.set(numLines + 3, "");
                            Files.write(path, lines1, StandardCharsets.UTF_8);
                            // Engine Size
                            lines1.set(numLines + 4, "");
                            Files.write(path, lines1, StandardCharsets.UTF_8);
                            // Description
                            lines1.set(numLines + 5, "");
                            Files.write(path, lines1, StandardCharsets.UTF_8);
                            // Price
                            lines1.set(numLines + 6, "");
                            Files.write(path, lines1, StandardCharsets.UTF_8);
                            // Image
                            lines1.set(numLines + 7, "");
                            Files.write(path, lines1, StandardCharsets.UTF_8);

                            // Pop up to let you know lines have been deleted.
                            // Then Setting all textboxes to empty
                            JOptionPane.showMessageDialog(null, "Deleted Lines?", "Writing to File?", JOptionPane.PLAIN_MESSAGE);
                            txtRegistration.setText("");
                            txtMake.setText("");
                            txtModel.setText("");
                            txtColour.setText("");
                            txtDoors.setText("");
                            txtEngine.setText("");
                            txtDescription.setText("");
                            txtPrice.setText("");
                            lblPic.setVisible(false);

                        }
                        fr.close();
                        
                    } else {
                        // Registration isn't Present in (Car_Details.txt)
                        // Pop up saying reg doesn't exist in file
                        JOptionPane.showMessageDialog(null, "Regstration doesn't exist in file?", "Important?", JOptionPane.PLAIN_MESSAGE);
                    }
                    
                } catch (IOException e) {
                    System.out.println("An error occurred");
                    e.printStackTrace();
                }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    /**
     * The combo box is being used so you are able to select image to represent 
     * the motor which is being added to the system.
     * @author Roy Ferguson(50004216)
     */
    private void cboCarImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCarImageActionPerformed

        // Setting the label to visible so that you will be able to see select image
        lblPic.setVisible(true);
        // When you select an image from drop down list it look at it as an array e.g. 0,1,2,3,4 etc
        int index = cboCarImage.getSelectedIndex();
        Image pic;
        
        // Populating the array with images 
        String picSrc[] = {"no image","/images/FordRanger2022.jpeg",
        "/images/Honda_Civic_Type_R_Sportline_2023.jpeg", "/images/FordFocus2022.jpeg"};
        
        // Using switch statement to set the image to variable image created above.
        switch (index) {
            case 1:
                pic =
                Toolkit.getDefaultToolkit().getImage(getClass().getResource(picSrc[index]));
                
                break;
            case 2:
                pic =
                Toolkit.getDefaultToolkit().getImage(getClass().getResource(picSrc[index]));
                break;
            case 3:
                pic =
                Toolkit.getDefaultToolkit().getImage(getClass().getResource(picSrc[index]));
                break;
            default:
                lblPic.setIcon(null);
            return;
        }
        

        // Used to load the image from the images directory within the project
       ImageIcon icon = new ImageIcon(Objects.requireNonNull(getClass().getResource(picSrc[index])));

        //Gets the image 
       Image img = icon.getImage();
       //Used to scale the image to fit within the label
        Image imgScale = img.getScaledInstance(213, 131, SCALE_SMOOTH);
        //creates a new image with the new scale
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        //sets the scaled image within the label
        lblPic.setIcon(scaledIcon);

        // Storing the Position of image
        appData.Car_Details.setImageLocation(picSrc[index]);

    }//GEN-LAST:event_cboCarImageActionPerformed

    /**
     * The sold button is for when a motor has been bought by a customer as you are able to take the registration
     * from the motor you want and search the text file for all car details and then put them lines of text
     * into a Cars Sold text file along with the customer information and the employee information.
     * @author Roy Ferguson(50004216)
     */
    private void btnSoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSoldActionPerformed
        // TODO add your handling code here:
        
        // Checking Text Registration Text Box isn't empty
        if(txtRegistration.getText().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(null, "Fill in Registration?", "Error Message",JOptionPane.PLAIN_MESSAGE);
        }else {


            // Saving Data to Objects
            appData.Car_Details.setRegistration(txtRegistration.getText().replace(" ", ""));

            // Getting the stored registration from setter and saving it in String variable
            String Reg = appData.Car_Details.getRegistration();

                // Creating a file
                try {
                    File carTextFile = new File("storage/Cars_Sold.txt");
                    if (carTextFile.createNewFile()) {
                      //  System.out.println("File Created " + carTextFile.getName());
                       // JOptionPane.showMessageDialog(null, "The Text File created is: " + carTextFile, "Text File Created?", JOptionPane.PLAIN_MESSAGE);
                    } else {
                       // System.out.println("File aleardy exists");
                       // JOptionPane.showMessageDialog(null, "Text File: " + carTextFile + " already exists?", "Text File Already Exists?", JOptionPane.PLAIN_MESSAGE);
                    }
                    
                    // Check if Reg Already Exists in Text File (Cars_Sold.txt)
                    // Variables used to read lines in text file
                    String[] words2 = null;
                    String eachLine2;
                    int count2 = 0;

                    // Creating File and Buffer Reader
                    FileReader fr2 = new FileReader("storage/Cars_Sold.txt");
                    BufferedReader line2 = new BufferedReader(fr2);
                    // Reading eachline in text file
                    while ((eachLine2 = line2.readLine()) != null) {
                        words2 = eachLine2.split("\n");
                        // Reading each word in line until it matches the Registration i am looking for.
                        // If reg found will save the line the registration was found.
                        for (String word : words2) {
                            if (word.equals("Registration: " + Reg)) {
                                count2++;
                            }
                        }
                    }
                    
                    if (count2 == 0) {

                        // Check if Reg Already Exists in Text File (Cars_Sold.txt)
                        // Variables used to read lines in text file
                        String[] words = null;
                        String eachLine;
                        int count = 0;
                        int lines = 0;
                        int RegistationLine = 0;

                        // Creating File and Buffer Reader
                        FileReader fr = new FileReader("storage/Car_Details.txt");
                        BufferedReader line = new BufferedReader(fr);
                        // Reading eachline in text file
                        while ((eachLine = line.readLine()) != null) {
                            lines++;
                            words = eachLine.split("\n");
                            // Reading each word in line until it matches the Registration i am looking for.
                            // If reg found will save the line the registration was found.
                            for (String word : words) {
                                if (word.equals("Registration: " + Reg)) {
                                    count++;

                                    RegistationLine = lines;

                                }
                            }
                        }
                        int value = 0;
                        if (count != 0) {
                            // If reg exists in (Car_Details.txt)
                            value = JOptionPane.showConfirmDialog(null, "The Registration: " + Reg + " is in Text File, Do you wish to continue?", "Question", JOptionPane.YES_NO_OPTION);

                            // If your answer is yes - Wish to Continue?
                            if (value == 0) {

                                // Will Ask you for the customer id
                                String answer = (String) JOptionPane.showInputDialog(null, "Enter Customer ID: ", "Customer ID", JOptionPane.PLAIN_MESSAGE);

                                // Variables used to read lines in (Customer_Details.txt)
                                int countCustomerID = 0;
                                int customerid = 0;
                                int counter = 0;
                                String lineCustomerId = "";

                                // Creating a buffer reader to read lines in text file (Customer_Details.txt)
                                BufferedReader reader;
                                try {
                                    //load the file
                                    reader = new BufferedReader(new FileReader("storage/Customer_Details.txt"));

                                    String currentLine = "";
                                    //iterate through file line by line using while loop until last line which will be null, loop stops
                                    while ((currentLine = reader.readLine()) != null) {
                                        countCustomerID++;
                                        String[] customerParts = currentLine.split(",");

                                        // Reads the words on each line until the array index 0 (customerParts[0]) equals the answer
                                        // I inputted which is customer ID.
                                        // Then saves the line the ID was found
                                        for (String CustomerID : customerParts) {
                                            if (CustomerID.equals(answer)) {
                                                if(answer.equals(customerParts[0])) {
                                                    counter++;
                                                    customerid = countCustomerID;
                                                }
                                            }
                                        }
                                    }// While Ends
                                //if error occurs, nothing will print
                                }catch (IOException e) {
                                    System.out.println("");
                                }

                                // If the Customer ID did exist the counter would have been incremented.
                                if (counter != 0) {
                                    // Customer Does Exist

                                    // It is reading the entire line where customer id was found
                                    try{
                                        lineCustomerId = Files.readAllLines(Paths.get("storage/Customer_Details.txt")).get(customerid -1);
                                    } catch (IOException e) {
                                        throw new RuntimeException(e);
                                    }


                                    // Getting Employee That Signed Off on Purchase
                                    String answer2 = (String) JOptionPane.showInputDialog(null, "Enter Employee ID: ", "Employee ID", JOptionPane.PLAIN_MESSAGE);

                                    // Variables used to read lines in text file (employee_data.txt)
                                    int countEmployeeID = 0;
                                    int employeeid = 0;
                                    int counter2 = 0;
                                    String lineEmployeeId = "";

                                    // Reader to read all the lines in the text file (employee_data.txt)
                                    BufferedReader readerEmp;
                                    try {
                                        //load the file
                                        readerEmp = new BufferedReader(new FileReader("storage/employee_data.txt"));

                                        String currentLine2 = "";
                                        //iterate through file line by line using while loop until last line which will be null, loop stops
                                        while ((currentLine2 = readerEmp.readLine()) != null) {
                                            countEmployeeID++;
                                            String[] employeeParts = currentLine2.split(",");

                                            // Reads each word in line until the inputted employee number is found in the array position 0
                                            // If found will increment counter by one and save the line number the employee was found.
                                            for (String EmployeeID : employeeParts) {
                                                if (EmployeeID.equals(answer2)) {
                                                    if(answer2.equals(employeeParts[0])) {
                                                        counter2++;
                                                        employeeid = countEmployeeID;
                                                    }
                                                }
                                            }
                                        }// While ends
                                    }
                                    //if error occurs, nothing will print
                                    catch (IOException e) {
                                        System.out.println("");
                                    }

                                    // If the employee id exists in text file (employee_data.txt)
                                    if (counter2 != 0) {
                                        // Employee Exists

                                        // Reading the exact line the employee id was found.
                                        try{
                                            lineEmployeeId = Files.readAllLines(Paths.get("storage/employee_data.txt")).get(employeeid -1);
                                        } catch (IOException e) {
                                            throw new RuntimeException(e);
                                        }


                                        // Variables used to store the Registration ID Data
                                        String lineReg = "";
                                        String lineMake = "";
                                        String lineModel = "";
                                        String lineColour = "";
                                        String lineDoors = "";
                                        String lineEngine = "";
                                        String lineDescription = "";
                                        String linePrice = "";
                                        String lineImage = "";


                                        try {
                                            // Reading the specific lines from the Registration id already in Text File (Car_Details.txt)
                                            lineReg = Files.readAllLines(Paths.get("storage/Car_Details.txt")).get(RegistationLine - 1);  // Reg
                                            lineMake = Files.readAllLines(Paths.get("storage/Car_Details.txt")).get(RegistationLine);  // Make
                                            lineModel = Files.readAllLines(Paths.get("storage/Car_Details.txt")).get(RegistationLine + 1);  // Model
                                            lineColour = Files.readAllLines(Paths.get("storage/Car_Details.txt")).get(RegistationLine + 2);  // Colour
                                            lineDoors = Files.readAllLines(Paths.get("storage/Car_Details.txt")).get(RegistationLine + 3);  // Doors
                                            lineEngine = Files.readAllLines(Paths.get("storage/Car_Details.txt")).get(RegistationLine + 4);  // Engine
                                            lineDescription = Files.readAllLines(Paths.get("storage/Car_Details.txt")).get(RegistationLine + 5);  // Description
                                            linePrice = Files.readAllLines(Paths.get("storage/Car_Details.txt")).get(RegistationLine + 6);  // Price
                                            lineImage = Files.readAllLines(Paths.get("storage/Car_Details.txt")).get(RegistationLine + 7);  // Image

                                            // Putting the Lines in the Arrays so that i can split the value from it.
                                            String[] regRegistration = lineReg.split(": ");
                                            String[] regMake = lineMake.split(": ");
                                            String[] regModel = lineModel.split(": ");
                                            String[] regColour = lineColour.split(": ");
                                            String[] regDoors = lineDoors.split(": ");
                                            String[] regEngine = lineEngine.split(": ");
                                            String[] regDescription = lineDescription.split(": ");
                                            String[] regPrice = linePrice.split(": ");
                                            String[] regImage = lineImage.split(": ");


                                            // Setting the Car Details
                                            appData.Car_Details.setRegistration(regRegistration[1]);
                                            appData.Car_Details.setMake(regMake[1]);
                                            appData.Car_Details.setModel(regModel[1]);
                                            appData.Car_Details.setColour(regColour[1]);
                                            appData.Car_Details.setDoors(Integer.parseInt(regDoors[1]));
                                            appData.Car_Details.setEngine_size(regEngine[1]);
                                            appData.Car_Details.setDescription(regDescription[1]);
                                            appData.Car_Details.setPrice(Integer.parseInt(regPrice[1]));
                                            appData.Car_Details.setImageLocation(regImage[1]);


                                            // write data to text file (Cars_Sold.txt)
                                            // Creating the File Writer and Buffer Writer
                                            FileWriter carFile = new FileWriter("storage/Cars_Sold.txt", true);
                                            BufferedWriter output = new BufferedWriter(carFile);

                                            // Write String to Text File - Next Empty Line
                                            output.write("Registration: " + appData.Car_Details.getRegistration() + "\nMake: " +
                                                    appData.Car_Details.getMake() + "\nModel: " + appData.Car_Details.getModel() + "\nColour: " +
                                                    appData.Car_Details.getColour() + "\nNumber of Doors: " + appData.Car_Details.getDoors() +
                                                    "\nEngine Size: " + appData.Car_Details.getEngine_size() + "\nDescription: " +
                                                    appData.Car_Details.getDescription() + "\nPrice: " + appData.Car_Details.getPrice() + "\nImage: " + appData.Car_Details.getImageLocation()
                                                    + "\nBought By: " + lineCustomerId + "\nEmployee Sign Off: " + lineEmployeeId + "\n\n\n\n");
                                            output.close();

                                            // pop up message to let user know that the car has been sold
                                            JOptionPane.showMessageDialog(null, "Vehicle Sold, Thanks For Purchasing?", "Selling Vehicle?", JOptionPane.PLAIN_MESSAGE);

                                            // Clearing all text boxes so user can enter a new motor to the system
                                            txtRegistration.setText("");
                                            txtMake.setText("");
                                            txtModel.setText("");
                                            txtColour.setText("");
                                            txtDoors.setText("");
                                            txtEngine.setText("");
                                            txtDescription.setText("");
                                            txtPrice.setText("");
                                            lblPic.setVisible(false);


                                            // Deleting all the Car Details to do with the specified registration in text file (Car_Details.txt)
                                            // As the details of car are now stored in cars sold file (Cars_Sold.txt).
                                            Path path = Paths.get("storage/Car_Details.txt");
                                            List<String> lines1 = Files.readAllLines(path, StandardCharsets.UTF_8);
                                            // Reg
                                            lines1.set(RegistationLine - 1, "");
                                            Files.write(path, lines1, StandardCharsets.UTF_8);
                                            // Make
                                            lines1.set(RegistationLine, "");
                                            Files.write(path, lines1, StandardCharsets.UTF_8);
                                            // Model
                                            lines1.set(RegistationLine + 1, "");
                                            Files.write(path, lines1, StandardCharsets.UTF_8);
                                            // Colour
                                            lines1.set(RegistationLine + 2, "");
                                            Files.write(path, lines1, StandardCharsets.UTF_8);
                                            // Number of Doors
                                            lines1.set(RegistationLine + 3, "");
                                            Files.write(path, lines1, StandardCharsets.UTF_8);
                                            // Engine Size
                                            lines1.set(RegistationLine + 4, "");
                                            Files.write(path, lines1, StandardCharsets.UTF_8);
                                            // Description
                                            lines1.set(RegistationLine + 5, "");
                                            Files.write(path, lines1, StandardCharsets.UTF_8);
                                            // Price
                                            lines1.set(RegistationLine + 6, "");
                                            Files.write(path, lines1, StandardCharsets.UTF_8);
                                            // Image
                                            lines1.set(RegistationLine + 7, "");
                                            Files.write(path, lines1, StandardCharsets.UTF_8);

                                        } catch (IOException e) {
                                            throw new RuntimeException(e);
                                        }
                                    }else{
                                        // Employee Doesn't Exist
                                        JOptionPane.showMessageDialog(null, "Employee Doesn't Exist?", "Information?", JOptionPane.PLAIN_MESSAGE);
                                    }


                                }else{
                                    // Customer Doesn't Exist
                                    JOptionPane.showMessageDialog(null, "Customer Doesn't Exist?", "Information?", JOptionPane.PLAIN_MESSAGE);
                                }

                            } 


                        } else{
                            // Reg Doesn't Exist in (Car_Detail.txt)
                            JOptionPane.showMessageDialog(null, "Vehicle Doesn't Exist?", "Information?", JOptionPane.PLAIN_MESSAGE);
                        }
                    }else{
                        // Reg Doesn't Exist in (Cars_Sold.txt)
                        JOptionPane.showMessageDialog(null, "Vehicle Already Sold?", "Information?", JOptionPane.PLAIN_MESSAGE);
                    }
                } catch (IOException e) {
                    System.out.println("An error occurred");
                    e.printStackTrace();
                }

        }
    }//GEN-LAST:event_btnSoldActionPerformed

    /**
     * Search Car button is used to take user back to Search Car Form
     * @author Roy Ferguson(50004216)
     */
    private void btnSearchCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchCarActionPerformed
        
        //close modify frame and open search car
        this.dispose();
        new Search_Car().setVisible(true);
    }//GEN-LAST:event_btnSearchCarActionPerformed

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
            java.util.logging.Logger.getLogger(Modify_Car.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modify_Car.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modify_Car.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modify_Car.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modify_Car().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearchCar;
    private javax.swing.JButton btnSold;
    private javax.swing.JComboBox<String> cboCarImage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblColour;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblDoors;
    private javax.swing.JLabel lblEngine;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblMake;
    private javax.swing.JLabel lblModel;
    private javax.swing.JLabel lblModifyCar;
    private javax.swing.JLabel lblPic;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblRegistration;
    private javax.swing.JPanel pnlModifyCar;
    private javax.swing.JTextField txtColour;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtDoors;
    private javax.swing.JTextField txtEngine;
    private javax.swing.JTextField txtMake;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtRegistration;
    // End of variables declaration//GEN-END:variables
}

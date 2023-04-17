/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oop_template;

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


/**
 *
 * @author 50004216
 */
public class Modify_Car extends javax.swing.JFrame {


    /**
     * Creates new form Modify_Car
     */
    public Modify_Car() {
        initComponents();
        // Setting Form Position to Center
         setLocationRelativeTo(null);
        System.out.println(appData.Car_Details.getModel());
        System.out.println(appData.Car_Details.getDescription());
        if(!Objects.equals(appData.Car_Details.getRegistration(), "null") && !Objects.equals(appData.Car_Details.getMake(), "null") &&
                !Objects.equals(appData.Car_Details.getModel(), "null") && !Objects.equals(appData.Car_Details.getColour(), "null") &&
                appData.Car_Details.getDoors() != -1 && !Objects.equals(appData.Car_Details.getEngine_size(), "null") &&
                !Objects.equals(appData.Car_Details.getDescription(), "null") && appData.Car_Details.getPrice() != -1){
            txtRegistration.setText(appData.Car_Details.getRegistration());
            txtMake.setText(appData.Car_Details.getMake());
            txtModel.setText(appData.Car_Details.getModel());
            txtColour.setText(appData.Car_Details.getColour());
            txtDoors.setText(String.valueOf(appData.Car_Details.getDoors()));
            txtEngine.setText(appData.Car_Details.getEngine_size());
            txtDescription.setText(appData.Car_Details.getDescription());
            txtPrice.setText(String.valueOf(appData.Car_Details.getPrice()));
        }else{

            txtRegistration.setText(appData.Car_Details.getRegistration());
            txtMake.setText("");
            txtModel.setText("");
            txtColour.setText("");
            txtDoors.setText("");
            txtEngine.setText("");
            txtDescription.setText("");
            txtPrice.setText("");
        }
//         if(!Objects.equals(appData.Car_Details.getMake(), "null")){
//             txtMake.setText(appData.Car_Details.getMake());
//         }else{
//             txtMake.setText("");
//         }
//        if(!Objects.equals(appData.Car_Details.getModel(), "null")){
//            txtModel.setText(appData.Car_Details.getModel());
//        }else{
//            txtModel.setText("");
//        }
//        if(!Objects.equals(appData.Car_Details.getColour(), "null")){
//            txtColour.setText(appData.Car_Details.getColour());
//        }else{
//            txtColour.setText("");
//        }
//        if(appData.Car_Details.getDoors() != -1){
//            txtDoors.setText(String.valueOf(appData.Car_Details.getDoors()));
//        }else{
//            txtDoors.setText("");
//        }
//        if(!Objects.equals(appData.Car_Details.getEngine_size(), "null")){
//            txtEngine.setText(appData.Car_Details.getEngine_size());
//        }else{
//            txtEngine.setText("");
//        }
//        if(!Objects.equals(appData.Car_Details.getDescription(), "null")){
//            txtDescription.setText(appData.Car_Details.getDescription());
//        }else{
//            txtDescription.setText("");
//        }
//        if(appData.Car_Details.getPrice() != -1){
//            txtPrice.setText(String.valueOf(appData.Car_Details.getPrice()));
//        }else{
//            txtPrice.setText("");
//        }

    }

    // Validation input Text Fields - No Digits or Special Characters
    public static boolean isAlpha(String s) {
        return s != null && s.chars().allMatch(Character::isLetter);
    }

   //  Validation input Text Fields - No Letters allowed or special characters
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
        lblModifyCar = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnEmpMenu = new javax.swing.JButton();
        lblTesting = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlModifyCar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Details:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        lblRegistration.setText("Registratoin:");

        lblMake.setText("Make: ");

        lblModel.setText("Model:");

        lblColour.setText("Colour:");

        lblDoors.setText("Doors: ");

        lblEngine.setText("Engine:");

        lblDescription.setText("Description:");

        lblPrice.setText("Price:");

        txtMake.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMakeKeyReleased(evt);
            }
        });

        txtColour.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtColourKeyReleased(evt);
            }
        });

        txtDoors.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDoorsKeyReleased(evt);
            }
        });

        txtPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPriceKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlModifyCarLayout = new javax.swing.GroupLayout(pnlModifyCar);
        pnlModifyCar.setLayout(pnlModifyCarLayout);
        pnlModifyCarLayout.setHorizontalGroup(
            pnlModifyCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlModifyCarLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(pnlModifyCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPrice)
                    .addComponent(lblDescription)
                    .addComponent(lblEngine)
                    .addComponent(lblDoors)
                    .addComponent(lblColour)
                    .addComponent(lblModel)
                    .addComponent(lblMake)
                    .addComponent(lblRegistration))
                .addGap(18, 18, 18)
                .addGroup(pnlModifyCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEngine, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMake, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtColour, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDoors, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(159, Short.MAX_VALUE))
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
                .addContainerGap(18, Short.MAX_VALUE))
        );

        lblModifyCar.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lblModifyCar.setText("Modify Car");

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(lblModifyCar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnReset)
                .addGap(88, 88, 88)
                .addComponent(btnSave)
                .addGap(176, 176, 176)
                .addComponent(btnEmpMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(pnlModifyCar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTesting, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblModifyCar)
                .addGap(18, 18, 18)
                .addComponent(pnlModifyCar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReset)
                    .addComponent(btnSave))
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(lblTesting, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEmpMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Reset Button - Method
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed

        int resetValue = JOptionPane.showConfirmDialog(null,"Are You sure you want to clear all Textboxes?", "Question",JOptionPane.YES_NO_OPTION);

        if(resetValue == 0){
            // Resetting All Text Boxes to Empty
            txtMake.setText("");
            txtModel.setText("");
            txtColour.setText("");
            txtDoors.setText("");
            txtEngine.setText("");
            txtDescription.setText("");
            txtPrice.setText("");
        }

    }//GEN-LAST:event_btnResetActionPerformed

    // Make - Text Field
    private void txtMakeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMakeKeyReleased
        // TODO add your handling code here:
        //inputValidation_NoNumber(evt, txtMake);
    //    appData.Car_Details.setMake(txtMake.getText().replace(" ", ""));
 //       txtMake.getText().replace(" ", "");
        String makeOne = txtMake.getText();
        String make = makeOne.replace(" ","");
        if(isAlpha(make)){
            txtMake.setText(makeOne);
            txtMake.setEditable(true);
        }
        else{
            // Not able to enter in text field if value a number
            txtMake.setEditable(false);
            // Set Error Message
            JOptionPane.showMessageDialog(null, "Cannot Enter Letters or Special Characters?", "Error Message",JOptionPane.PLAIN_MESSAGE);
            txtMake.setText("");
            txtMake.grabFocus();
        }


    }//GEN-LAST:event_txtMakeKeyReleased

    // Colour - Text Field
    private void txtColourKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtColourKeyReleased
        // TODO add your handling code here:
        String colour = txtColour.getText().replace(" ","");
        if(isAlpha(colour)){
            txtColour.setEditable(true);
        }
        else{
            // Not able to enter in text field if value a number
            txtColour.setEditable(false);
            // Set Error Message
            JOptionPane.showMessageDialog(null, "Cannot Enter Letters or Special Characters?", "Error Message",JOptionPane.PLAIN_MESSAGE);
            txtColour.setText("");
            txtColour.grabFocus();
        }

    }//GEN-LAST:event_txtColourKeyReleased

    // Doors - Text Field
    private void txtDoorsKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDoorsKeyReleased
        // TODO add your handling code here:
        

        String doors = txtDoors.getText().replace(" ", "");
        if(isNumeric(doors)){
            txtDoors.setEditable(true);
        }
        else{
            // Not able to enter in text field if value a letter or special character
            txtDoors.setEditable(false);
            // Set Error Message
            JOptionPane.showMessageDialog(null, "Cannot Enter Digits or Special Characters?", "Error Message",JOptionPane.PLAIN_MESSAGE);
            txtDoors.setText("");
            txtDoors.grabFocus();

        }


    }//GEN-LAST:event_txtDoorsKeyReleased

    // Price - Text Field
    private void txtPriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPriceKeyReleased

        String price = txtPrice.getText().replace(" ", "");
        if(isNumeric(price)){
            txtPrice.setEditable(true);
        }
        else{
            // Not able to enter in text field if value a letter or special character
            txtPrice.setEditable(false);
            // Set Error Message
            JOptionPane.showMessageDialog(null, "Cannot Enter Digits or Special Characters?", "Error Message",JOptionPane.PLAIN_MESSAGE);
            txtPrice.setText("");
            txtPrice.grabFocus();
        }
    }//GEN-LAST:event_txtPriceKeyReleased

    // Save Button - Method
    // Hi there
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:


        // Checking Text Boxes aren't Empty
        if(txtRegistration.getText().equalsIgnoreCase("") || txtMake.getText().equalsIgnoreCase("") || txtModel.getText().equalsIgnoreCase("") ||
                txtColour.getText().equalsIgnoreCase("") || txtDoors.getText().equalsIgnoreCase("")||
                txtEngine.getText().equalsIgnoreCase("") || txtDescription.getText().equalsIgnoreCase("") ||
                txtPrice.getText().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(null, "Fill all Fields in?", "Error Message",JOptionPane.PLAIN_MESSAGE);
        }else {


            // Saving Data to Objects
            appData.Car_Details.setRegistration(txtRegistration.getText().replace(" ", ""));
            appData.Car_Details.setMake(txtMake.getText().replace(" ", ""));
            appData.Car_Details.setModel(txtModel.getText().trim());
            appData.Car_Details.setColour(txtColour.getText().replace(" ", ""));
            appData.Car_Details.setDoors(Integer.parseInt(txtDoors.getText().replace(" ", "")));
            appData.Car_Details.setEngine_size(txtEngine.getText().replace(" ", ""));
            appData.Car_Details.setDescription(txtDescription.getText().trim());
            appData.Car_Details.setPrice(Integer.parseInt(txtPrice.getText().replace(" ", "")));

            // Convert the Numbers to string can saving text to string objects
            String Reg = appData.Car_Details.getRegistration();
            String Make = appData.Car_Details.getMake();
            String Model = appData.Car_Details.getModel();
            String Colour = appData.Car_Details.getColour();
            String Doors = String.valueOf(appData.Car_Details.getDoors());
            String EngineSize = appData.Car_Details.getEngine_size();
            String Description = appData.Car_Details.getDescription();
            String Price = String.valueOf(appData.Car_Details.getPrice());
            int validateDoors = appData.Car_Details.getDoors();
            if (validateDoors <= 6 && validateDoors >= 1) {


                // Creating a file
                try {
                    File carTextFile = new File("storage/Car_Details.txt");
                    if (carTextFile.createNewFile()) {
                        System.out.println("File Created" + carTextFile.getName());
                        JOptionPane.showMessageDialog(null, "The Text File created is: " + carTextFile, "Text File Created?", JOptionPane.PLAIN_MESSAGE);
                    } else {
                        System.out.println("File aleardy exists");
                        JOptionPane.showMessageDialog(null, "Text File: " + carTextFile + " already exists?", "Text File Already Exists?", JOptionPane.PLAIN_MESSAGE);
                    }

                    // Check if Reg Already Exists in Text File

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

                        // System.out.println("Each Line of Data \n" + eachLine);
                        words = eachLine.split("\n");
                        for (String word : words) {

                            if (word.equals("Registration: " + Reg)) {
                                count++;

                                numLines = lines;
//                            int takeaway = numLines + 8;
//                            System.out.println(takeaway);
//                            while (numLines != takeaway){
//                                System.out.println("This line is: " + numLines);
//                                System.out.println("Word" + eachLine);
//                            }
//                            for(int i = numLines; i < takeaway; i++){
//                                System.out.println("This line is: " + numLines);
//                                System.out.println("Word" + eachLine);
//                            }
                            }
                        }
                    }

                    if (count != 0) {
                        System.out.println("The given word is present");
                        int reWriteLinesValue = JOptionPane.showConfirmDialog(null, Reg + "Exists Already! Do You Want to Rewrite Registration Details?", "Important Question?", JOptionPane.YES_NO_OPTION);
                        // Need to add an JOptionPane asking if they want to rewrite data
                        // ReWriting The Exact lines of Code
//                    Scanner input = new Scanner(System.in);
//                    int value = input.nextInt();
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

                            System.out.println(lines1);

                            JOptionPane.showMessageDialog(null, "Write Successful?", "Writing to File?", JOptionPane.PLAIN_MESSAGE);
                            txtRegistration.setText("");
                            txtMake.setText("");
                            txtModel.setText("");
                            txtColour.setText("");
                            txtDoors.setText("");
                            txtEngine.setText("");
                            txtDescription.setText("");
                            txtPrice.setText("");
                        }


                        ////////////////////////////////
                        ///////// This Works - Reading Lines///////////
                        ////////////////////////////////
//                    System.out.println(numLines);
//                    for(int i = 0; i < 8; i++){
//                        String line32 = Files.readAllLines(Paths.get("storage/Car_Details.txt")).get((numLines-1));
//                        System.out.println(line32);
//                        numLines++;
//                    }

//                    String strLine = "";
//                    ArrayList <String> list = new ArrayList<String>();
//                    for(int j = numLines; j < (numLines + 8); j++){
//                        BufferedReader br = new BufferedReader(new FileReader("storage/Car_Details.txt"));
//                        while(strLine == Reg){
//                            strLine = br.readLine();
//                            list.add(strLine);
//                        }
//                    }
//                    System.out.println(list);
                        fr.close();
                    } else {
                        System.out.println("New Word");
                        int reWriteLinesValue = JOptionPane.showConfirmDialog(null, "Do You want to Save New Car Details?", "Important Question?", JOptionPane.YES_NO_OPTION);
                        // Need to add an JOptionPane asking if they want to rewrite data
                        // ReWriting The Exact lines of Code
//                    Scanner input = new Scanner(System.in);
//                    int value = input.nextInt();
                        if (reWriteLinesValue == 0) {
                            // write data
                            // Creating the File Writer and Buffer Writer
                            FileWriter carFile = new FileWriter("storage/Car_Details.txt", true);
                            BufferedWriter output = new BufferedWriter(carFile);

                            // Write String to Text File - Next Empty Line
                            output.write("Registration: " + Reg + "\nMake: " + Make + "\nModel: " + Model + "\nColour: " + Colour + "\nNumber of Doors: " + Doors +
                                    "\nEngine Size: " + EngineSize + "\nDescription: " + Description + "\nPrice: " + Price + "\n\n\n\n");

                            lblTesting.setText("Write Successful");
                            JOptionPane.showMessageDialog(null, "Write Successful?", "Writing to File?", JOptionPane.PLAIN_MESSAGE);
                            txtRegistration.setText("");
                            txtMake.setText("");
                            txtModel.setText("");
                            txtColour.setText("");
                            txtDoors.setText("");
                            txtEngine.setText("");
                            txtDescription.setText("");
                            txtPrice.setText("");

                            output.close();
                        }
                    }
                    // fr.close();


                } catch (IOException e) {
                    System.out.println("An error occurred");
                    e.printStackTrace();
                }
            }else{
                JOptionPane.showMessageDialog(null, "Number of Doors - Not in Range? 1-6", "Error?", JOptionPane.PLAIN_MESSAGE);
            }
        }








    }//GEN-LAST:event_btnSaveActionPerformed

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
    private javax.swing.JButton btnEmpMenu;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblColour;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblDoors;
    private javax.swing.JLabel lblEngine;
    private javax.swing.JLabel lblMake;
    private javax.swing.JLabel lblModel;
    private javax.swing.JLabel lblModifyCar;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblRegistration;
    private javax.swing.JLabel lblTesting;
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

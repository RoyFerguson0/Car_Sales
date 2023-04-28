/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oop_template;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author Roy Ferguson(50004216)
 */
public class Search_Car extends javax.swing.JFrame {

    /**
     * Creates form Car_Search
     * @Roy Ferguson(50004216)
     */
    public Search_Car() {
        initComponents();
        // Set Form Position to Middle 
        setLocationRelativeTo(null);
        
        // Getting Company Logo Image
        ImageIcon icon = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/RJFMotorsLogo.jpeg")));
        
        // Setting Copany Logo Image in lblLogoImage
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(lblLogoImage.getWidth(), lblLogoImage.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        lblLogoImage.setIcon(scaledIcon);
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
        pnlCarSearch = new javax.swing.JPanel();
        lblRegNumber = new javax.swing.JLabel();
        txtRegNumber = new javax.swing.JTextField();
        btnCarSearch = new javax.swing.JButton();
        btnEmpMenu = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblLogoImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        pnlCarSearch.setBackground(new java.awt.Color(153, 255, 255));
        pnlCarSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblRegNumber.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRegNumber.setText("Car Registration: ");

        txtRegNumber.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        btnCarSearch.setBackground(new java.awt.Color(0, 0, 0));
        btnCarSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCarSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnCarSearch.setText("Search");
        btnCarSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCarSearchLayout = new javax.swing.GroupLayout(pnlCarSearch);
        pnlCarSearch.setLayout(pnlCarSearchLayout);
        pnlCarSearchLayout.setHorizontalGroup(
            pnlCarSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCarSearchLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(lblRegNumber)
                .addGap(18, 18, 18)
                .addGroup(pnlCarSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCarSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                    .addComponent(txtRegNumber))
                .addGap(33, 33, 33))
        );
        pnlCarSearchLayout.setVerticalGroup(
            pnlCarSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCarSearchLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlCarSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegNumber)
                    .addComponent(txtRegNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCarSearch)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        btnEmpMenu.setBackground(new java.awt.Color(0, 0, 0));
        btnEmpMenu.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        btnEmpMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnEmpMenu.setText("⬅");
        btnEmpMenu.setActionCommand("←");
        btnEmpMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpMenuActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lblTitle.setText("RJA Motors");

        lblLogoImage.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTitle)
                                .addGap(18, 18, 18)
                                .addComponent(lblLogoImage, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(pnlCarSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)))
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnEmpMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblLogoImage, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(pnlCarSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEmpMenu)
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Search Button to Check if Reg Exists or Not 
     * If reg exists in Cars Sold Text File (Cars_Sold.txt) - Will Not Go any Further
     * If Reg Doesn't exist in Cars Available file (Car_Details.txt) - Will Open modify car form
     * if Reg does exists in cars available file (Car_Details.txt) - Will Open modify car form with data
     * @Roy Ferguson(50004216)
     */
    private void btnCarSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarSearchActionPerformed

        // Checking if the reg textbox is empty
        if (txtRegNumber.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Fill Car Registration In?", "Error Message",JOptionPane.PLAIN_MESSAGE);
            txtRegNumber.grabFocus();
        }else{
            // If TextBox is not Empty

            // Set The Registation in Car_Deatails.java
            // Also save Registration in a variable 'String'
            appData.Car_Details.setRegistration(txtRegNumber.getText().replace(" ",""));
            String Reg = appData.Car_Details.getRegistration();

            
            // Create (Cars_Sold.txt) - Check if it exists already or not
            try {
                File carSoldFile = new File("storage/Cars_Sold.txt");
                if (carSoldFile.createNewFile()) {
                    System.out.println("File Created " + carSoldFile.getName());
                } else {
                    System.out.println("File aleardy exists");
                }
                
                // Variables used for Reading Through text file
                String[] words2 = null;
                String eachLine2;
                int count2 = 0;
                int lines2 = 0;
                int RegistationLine2 = 0;


                FileReader fr2 = null;
                try {
                    fr2 = new FileReader("storage/Cars_Sold.txt");
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }
                
                // Creating a reader of file - buffered reader
                BufferedReader line2 = new BufferedReader(fr2);
                
                // Looping through the file reading each line 
                while (true) {
                    try {
                        if (!((eachLine2 = line2.readLine()) != null)) break;
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    lines2++;
                    words2 = eachLine2.split("\n");
                    for (String word : words2) {
                        System.out.println("EachLine: " + eachLine2);
                        
                        // When text file line equals the reg im looking for will add 1 to counter (count2).
                        // Also saving the line number registration was found
                        if (word.equals("Registration: " + Reg)) {
                            count2++;
                            RegistationLine2 = lines2;

                        }
                    } // End For Loop
                } // End While Loop
                
                // If reg exists in (Cars_Sold.txt) will output and error message.
                if (count2 != 0) {
                    JOptionPane.showMessageDialog(null, "ERROR - Registration Exists in Cars Sold!!!!","ERROR!!!!!", JOptionPane.PLAIN_MESSAGE);
                }else{
//                  // If Reg Doesn't Exist in (Cars_Sold.txt)
                    
                    // Create (Car_Details.txt) if it doesn't exist
                    try {
                        File carTextFile = new File("storage/Car_Details.txt");
                        if (carTextFile.createNewFile()) {
                            System.out.println("File Created" + carTextFile.getName());
                        } else {
                            System.out.println("File aleardy exists");
                        }
                        
                        // Variabes used for reading through Text file
                        String[] words = null;
                        String eachLine;
                        int count = 0;
                        int lines = 0;
                        int RegistationLine = 0;

                        // Reading lines in (Car_Details.txt) file.
                        FileReader fr = null;
                        try {
                            fr = new FileReader("storage/Car_Details.txt");
                        } catch (FileNotFoundException e) {
                            throw new RuntimeException(e);
                        }
                        BufferedReader line = new BufferedReader(fr);
                        while (true) {
                            try {
                                if (!((eachLine = line.readLine()) != null)) break;
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                            lines++;
                            words = eachLine.split("\n");
                            
                            // Looping through words on each line until it equals Registration
                            for (String word : words) {
                                if (word.equals("Registration: " + Reg)) {
                                    // If reg is present count goes up by one and number of line is saved 
                                    // in RegistationLine
                                    count++; 
                                    RegistationLine = lines;

                                }
                            }
                        }
                        
                        int value = 0;
                        // If count is not zero
                        if (count != 0) {
                            // If registration is Present
                            // Output a message asking if u want to continue
                            value = JOptionPane.showConfirmDialog(null, "The Registration: " + Reg + " is in Text File, Do you wish to continue?", "Question", JOptionPane.YES_NO_OPTION);
                            
                            // if answer is yes 
                            if (value == 0) {
                                
                                // Creating String Variables to store specific lines of data
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
                                    // Reading the specific lines from the Registration id already in Text File
                                    lineReg = Files.readAllLines(Paths.get("storage/Car_Details.txt")).get(RegistationLine - 1);  // Reg
                                    lineMake = Files.readAllLines(Paths.get("storage/Car_Details.txt")).get(RegistationLine);  // Make
                                    lineModel = Files.readAllLines(Paths.get("storage/Car_Details.txt")).get(RegistationLine + 1);  // Model
                                    lineColour = Files.readAllLines(Paths.get("storage/Car_Details.txt")).get(RegistationLine + 2);  // Color
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

                                    System.out.println("Car = " + appData.Car_Details.getImageLocation());
                                    // Opening the Modify Car Screen
                                    this.dispose();
                                    new Modify_Car().setVisible(true);

                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }

                            }// If answer is no

                        } else{
                            // If registration isn't present
                            // It's a New Registration 
                            // Setting all Car Details to null except Reg which is being stored.
                            // For Later Use
                            appData.Car_Details.setRegistration(Reg);
                            appData.Car_Details.setMake("null");
                            appData.Car_Details.setModel("null");
                            appData.Car_Details.setColour("null");
                            appData.Car_Details.setDoors(-1);
                            appData.Car_Details.setEngine_size("null");
                            appData.Car_Details.setDescription("null");
                            appData.Car_Details.setPrice(-1);
                            appData.Car_Details.setImageLocation(("null"));

                            // Open Modify Car Form
                            this.dispose();
                            new Modify_Car().setVisible(true);

                    }
            // fr.close();
            } catch (IOException e) {
                System.out.println("An error occurred");
                e.printStackTrace();
            }

            }
            
            } catch (IOException e) {
                System.out.println("An error occurred");
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnCarSearchActionPerformed

    /**
     * Employee Menu Button to take you back to Employee Main Menu
     * @Roy Ferguson(50004216)
     */
    private void btnEmpMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpMenuActionPerformed
        
        //close search frame and open Employee Main Menu
        this.dispose();
        new Employee_Main_Menu().setVisible(true);
        
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
            java.util.logging.Logger.getLogger(Search_Car.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search_Car.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search_Car.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search_Car.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search_Car().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCarSearch;
    private javax.swing.JButton btnEmpMenu;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLogoImage;
    private javax.swing.JLabel lblRegNumber;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlCarSearch;
    private javax.swing.JTextField txtRegNumber;
    // End of variables declaration//GEN-END:variables
}

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
 * @author Roy Ferguson
 */
public class Search_Car extends javax.swing.JFrame {

    /**
     * Creates new form Car_Search
     */
    public Search_Car() {
        initComponents();
        setLocationRelativeTo(null);

        ImageIcon icon = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/RJFMotorsLogo.jpeg")));

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

        lblTitle = new javax.swing.JLabel();
        lblLogoImage = new javax.swing.JLabel();
        pnlCarSearch = new javax.swing.JPanel();
        lblRegNumber = new javax.swing.JLabel();
        txtRegNumber = new javax.swing.JTextField();
        btnCarSearch = new javax.swing.JButton();
        btnEmpMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblTitle.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lblTitle.setText("RJA Motors");

        lblLogoImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/RJFMotorsLogo.jpeg"))); // NOI18N
        lblLogoImage.setToolTipText("");

        pnlCarSearch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblRegNumber.setText("Car Registration: ");

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
            .addGroup(pnlCarSearchLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(pnlCarSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCarSearch)
                    .addGroup(pnlCarSearchLayout.createSequentialGroup()
                        .addComponent(lblRegNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtRegNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
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

        btnEmpMenu.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        btnEmpMenu.setText("⬅");
        btnEmpMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblTitle)
                        .addGap(29, 29, 29)
                        .addComponent(lblLogoImage, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(pnlCarSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnEmpMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLogoImage, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(pnlCarSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(btnEmpMenu)
                .addGap(28, 28, 28))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCarSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarSearchActionPerformed
        // TODO add your handling code here:


        // Checking if the textbox is empty
        if (txtRegNumber.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Fill all Fields in?", "Error Message",JOptionPane.PLAIN_MESSAGE);
            txtRegNumber.grabFocus();
        }else{
            // If TextBox is not Empty

            // Set The Registation in Car_Deatails.java
            // Also save Registration in a variable 'String'
            appData.Car_Details.setRegistration(txtRegNumber.getText().replace(" ",""));
            String Reg = appData.Car_Details.getRegistration();
            
            
            
            
            
            
            try {
                File carSoldFile = new File("storage/Cars_Sold.txt");
                if (carSoldFile.createNewFile()) {
                    System.out.println("File Created " + carSoldFile.getName());
                } else {
                    System.out.println("File aleardy exists");
                }
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
                BufferedReader line2 = new BufferedReader(fr2);
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
                        if (word.equals("Registration: " + Reg)) {
                            count2++;
                            RegistationLine2 = lines2;

                        }
                    }
                }
                
                if (count2 != 0) {
                    JOptionPane.showMessageDialog(null, "ERROR - Registration Exists in Cars Sold!!!!","ERROR!!!!!", JOptionPane.PLAIN_MESSAGE);
                }else{
//            
//            
//            } catch (IOException e) {
//                System.out.println("An error occurred");
//                e.printStackTrace();
//            }
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            

            try {
                File carTextFile = new File("storage/Car_Details.txt");
                if (carTextFile.createNewFile()) {
                    System.out.println("File Created" + carTextFile.getName());
                } else {
                    System.out.println("File aleardy exists");
                }
                String[] words = null;
                String eachLine;
                int count = 0;
                int lines = 0;
                int RegistationLine = 0;


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
                    for (String word : words) {
                        System.out.println("EachLine: " + eachLine);
                        if (word.equals("Registration: " + Reg)) {
                            count++;
                            RegistationLine = lines;

                        }
                    }
                }
                int value = 0;
                if (count != 0) {
                    System.out.println("The given word is present");
                    value = JOptionPane.showConfirmDialog(null, "The Registration: " + Reg + " is in Text File, Do you wish to continue?", "Question", JOptionPane.YES_NO_OPTION);
                    System.out.println(value);
                    // Need to add an JOptionPane asking if they want to rewrite data
                    // ReWriting The Exact lines of Code
//                Scanner input = new Scanner(System.in);
//                int value = input.nextInt();
                    if (value == 0) {
                        String lineReg = "";
                        String lineMake = "";
                        String lineModel = "";
                        String lineColour = "";
                        String lineDoors = "";
                        String lineEngine = "";
                        String lineDescription = "";
                        String linePrice = "";

                        try {
                            // Reading the specific lines from the Registration id already in Text File
                            lineReg = Files.readAllLines(Paths.get("storage/Car_Details.txt")).get(RegistationLine - 1);  // Reg
                            lineMake = Files.readAllLines(Paths.get("storage/Car_Details.txt")).get(RegistationLine);  // Make
                            lineModel = Files.readAllLines(Paths.get("storage/Car_Details.txt")).get(RegistationLine + 1);  // Make
                            lineColour = Files.readAllLines(Paths.get("storage/Car_Details.txt")).get(RegistationLine + 2);  // Make
                            lineDoors = Files.readAllLines(Paths.get("storage/Car_Details.txt")).get(RegistationLine + 3);  // Make
                            lineEngine = Files.readAllLines(Paths.get("storage/Car_Details.txt")).get(RegistationLine + 4);  // Make
                            lineDescription = Files.readAllLines(Paths.get("storage/Car_Details.txt")).get(RegistationLine + 5);  // Make
                            linePrice = Files.readAllLines(Paths.get("storage/Car_Details.txt")).get(RegistationLine + 6);  // Make

                            // Putting the Lines in the Arrays so that i can split the value from it.
                            String[] regRegistration = lineReg.split(": ");
                            String[] regMake = lineMake.split(": ");
                            String[] regModel = lineModel.split(": ");
                            String[] regColour = lineColour.split(": ");
                            String[] regDoors = lineDoors.split(": ");
                            String[] regEngine = lineEngine.split(": ");
                            String[] regDescription = lineDescription.split(": ");
                            String[] regPrice = linePrice.split(": ");

                            System.out.println(regMake[1]);

                            // Setting the Car Details
                            appData.Car_Details.setRegistration(regRegistration[1]);
                            appData.Car_Details.setMake(regMake[1]);
                            appData.Car_Details.setModel(regModel[1]);
                            appData.Car_Details.setColour(regColour[1]);
                            appData.Car_Details.setDoors(Integer.parseInt(regDoors[1]));
                            appData.Car_Details.setEngine_size(regEngine[1]);
                            appData.Car_Details.setDescription(regDescription[1]);
                            appData.Car_Details.setPrice(Integer.parseInt(regPrice[1]));

                            this.dispose();
                            new Modify_Car().setVisible(true);

                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }

                        System.out.println("\n\n");

                    }

                } else if (value == 1) {

                }else{

                System.out.println("New Word");
                appData.Car_Details.setRegistration(Reg);
                appData.Car_Details.setMake("null");
                appData.Car_Details.setModel("null");
                appData.Car_Details.setColour("null");
                appData.Car_Details.setDoors(-1);
                appData.Car_Details.setEngine_size("null");
                appData.Car_Details.setDescription("null");
                appData.Car_Details.setPrice(-1);

                this.dispose();
                new Modify_Car().setVisible(true);
                
            }
            // fr.close();
            } catch (IOException e) {
                System.out.println("An error occurred");
                e.printStackTrace();
            }

// here
            }
            
            } catch (IOException e) {
                System.out.println("An error occurred");
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnCarSearchActionPerformed

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
    private javax.swing.JLabel lblLogoImage;
    private javax.swing.JLabel lblRegNumber;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlCarSearch;
    private javax.swing.JTextField txtRegNumber;
    // End of variables declaration//GEN-END:variables
}

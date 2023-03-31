/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oop_template;

import javax.swing.*;
import oop_template.appData;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(pnlModifyCar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(lblTesting, javax.swing.GroupLayout.DEFAULT_SIZE, 9, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(lblModifyCar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnReset)
                .addGap(88, 88, 88)
                .addComponent(btnSave)
                .addGap(176, 176, 176)
                .addComponent(btnEmpMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblModifyCar)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(lblTesting, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(pnlModifyCar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnReset)
                            .addComponent(btnSave))
                        .addContainerGap(55, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEmpMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Reset Button - Method
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // Resetting All Text Boxes to Empty
        txtMake.setText("");
        txtModel.setText("");
        txtColour.setText("");
        txtDoors.setText("");
        txtEngine.setText("");
        txtDescription.setText("");
        txtPrice.setText("");


        
    }//GEN-LAST:event_btnResetActionPerformed

    // Make - Text Field
    private void txtMakeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMakeKeyReleased
        // TODO add your handling code here:
        //inputValidation_NoNumber(evt, txtMake);
    //    appData.Car_Details.setMake(txtMake.getText().replace(" ", ""));
 //       txtMake.getText().replace(" ", "");
        String make = txtMake.getText().replace(" ","");
        if(isAlpha(make)){
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

        // Saving Data to Objects
        appData.Car_Details.setMake(txtMake.getText().replace(" ", ""));
        appData.Car_Details.setModel(txtModel.getText().replace(" ", ""));
        appData.Car_Details.setColour(txtColour.getText().replace(" ", ""));
        appData.Car_Details.setDoors(Integer.parseInt(txtDoors.getText().replace(" ", "")));
        appData.Car_Details.setEngine_size(txtEngine.getText().replace(" ", ""));
        appData.Car_Details.setDescription(txtDescription.getText().replace(" ", ""));
        appData.Car_Details.setPrice(Integer.parseInt(txtPrice.getText().replace(" ", "")));

        // Convert the Numbers to string
        String Doors = String.valueOf(appData.Car_Details.getDoors());
        String Price = String.valueOf(appData.Car_Details.getPrice());

        // Checking Text Boxes aren't Empty
        if(appData.Car_Details.getMake().equalsIgnoreCase("") || appData.Car_Details.getModel().equalsIgnoreCase("") ||
                appData.Car_Details.getColour().equalsIgnoreCase("") || Doors.equalsIgnoreCase("")||
                appData.Car_Details.getEngine_size().equalsIgnoreCase("") || appData.Car_Details.getDescription().equalsIgnoreCase("") ||
                Price.equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(null, "Fill all Fields in?", "Error Message",JOptionPane.PLAIN_MESSAGE);
        }else {
            // Creating a file
            try {
                File carTextFile = new File("D:\\Users\\Roy Ferguson\\Documents\\FDSE\\Odject_Oriented_Programming\\IdeaProjects\\Assignment\\OOP-GP-MINE\\oop-group-project-roy_ana_jack_group_3\\src\\storage\\Car_Details.txt");
                if (carTextFile.createNewFile()) {
                    System.out.println("File Created" + carTextFile.getName());
                } else {
                    System.out.println("File aleardy exists");
                }
            } catch (IOException e) {
                System.out.println("An error occurred");
                e.printStackTrace();
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

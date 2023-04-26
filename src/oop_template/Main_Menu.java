/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oop_template;

import java.awt.Image;
import javax.swing.*;

/**
 *
 * @Roy Ferguson (50004216)
 */
public class Main_Menu extends javax.swing.JFrame {

    /**
     * Creates new form Main_Menu
     * @Roy Ferguson(50004216)
     */
    public Main_Menu() {
        initComponents();
        ImageIcon icon = new ImageIcon(getClass().getResource("/images/RJFMotorsLogo.jpeg"));
            //Gets the image 
           Image img = icon.getImage();
           //Used to scale the image to fit within the label
            Image imgScale = img.getScaledInstance(lblLogoImage.getWidth(), lblLogoImage.getHeight(), Image.SCALE_SMOOTH);
            //creates a new image with the new scale
            ImageIcon scaledIcon = new ImageIcon(imgScale);
            //sets the scaled image within the label
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
        btnCustomerView = new javax.swing.JButton();
        btnLogon = new javax.swing.JButton();
        btnContactUs = new javax.swing.JButton();
        btnShutDown = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(400, 300));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 300));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lblTitle.setText("RJA Motors");

        btnCustomerView.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        btnCustomerView.setText("View Available Motors");
        btnCustomerView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerViewActionPerformed(evt);
            }
        });

        btnLogon.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        btnLogon.setText("Login");

        btnContactUs.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        btnContactUs.setText("Contact Us");
        btnContactUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContactUsActionPerformed(evt);
            }
        });

        btnShutDown.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        btnShutDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShutDownActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLogon, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCustomerView, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnContactUs, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(lblTitle)
                        .addGap(47, 47, 47)
                        .addComponent(lblLogoImage, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(343, 343, 343)
                        .addComponent(btnShutDown, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblLogoImage, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitle)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCustomerView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnContactUs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(btnShutDown, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Button used to open the contact us form.
     * @Roy Ferguson(50004216)
     */
    private void btnContactUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContactUsActionPerformed
        //close main menu, open contact us page
        this.dispose();
        new Contact_Us().setVisible(true);
    }//GEN-LAST:event_btnContactUsActionPerformed

    /**
     * Button used to view all available motors as it opens View_Car
     * @Roy Ferguson(50004216)
     */
    private void btnCustomerViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerViewActionPerformed
        
        //close main menu, open Available Cars
        this.dispose();
        new View_Car().setVisible(true);
    }//GEN-LAST:event_btnCustomerViewActionPerformed

    /**
     * Shut Down button to close the entire application.
     * @Roy Ferguson(50004216)
     */
    private void btnShutDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShutDownActionPerformed

        // Pop up Making sure you want to shut down application
        int inputtedAnswer = JOptionPane.showConfirmDialog(null,"Are You sure you want to SHUT DOWN?", "Question",JOptionPane.YES_NO_OPTION);

        // If answer is yes - Application is shut down
        if(inputtedAnswer == 0) {
            // Closes the entire application
            System.exit(0);
        }
    }//GEN-LAST:event_btnShutDownActionPerformed

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
            java.util.logging.Logger.getLogger(Main_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContactUs;
    private javax.swing.JButton btnCustomerView;
    private javax.swing.JButton btnLogon;
    private javax.swing.JButton btnShutDown;
    private javax.swing.JLabel lblLogoImage;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}

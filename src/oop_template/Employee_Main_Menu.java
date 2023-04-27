/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oop_template;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Jackh
 */
public class Employee_Main_Menu extends javax.swing.JFrame {

    /**
     * Creates new form Employee_Main_Menu
     */
    public Employee_Main_Menu() {
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
            
            // Setting lblCarImage
            ImageIcon icon2 = new ImageIcon(getClass().getResource("/images/Car_Image.jpeg"));
            //Gets the image 
           Image img2 = icon2.getImage();
           //Used to scale the image to fit within the label
            Image imgScale2 = img2.getScaledInstance(lblLogoImage.getWidth(), lblLogoImage.getHeight(), Image.SCALE_SMOOTH);
            //creates a new image with the new scale
            ImageIcon scaledIcon2 = new ImageIcon(imgScale2);
            //sets the scaled image within the label
            lblCarImage.setIcon(scaledIcon2);
            
            
        //    lblCustomerLogoImage
        //    Access the image within the images folder
            ImageIcon customerLogo = new ImageIcon(getClass().getResource("/images/CustomerImage.jpeg"));
            //assign an image variable to the picture
            Image customerLogoVar = customerLogo.getImage();
           //Scale the picture to fit within the labal
            Image customerLogoScale = customerLogoVar.getScaledInstance(lblCustomerImage.getWidth(), lblCustomerImage.getHeight(), Image.SCALE_SMOOTH);
            //Remakes the image to fit in the labal
            ImageIcon  customerLogoSized = new ImageIcon(customerLogoScale);
            //Puts the image in the label
            lblCustomerImage.setIcon(customerLogoSized);
            
            
           //Employee Image
            //Using Employee image from the imags folder
            ImageIcon employeeLogo = new ImageIcon(getClass().getResource("/images/employeeIMG.jpeg"));
            //creating a variable for the image
            Image employeeIMG = employeeLogo.getImage();
            //Setting the image size
            Image employeeIMGScale = employeeIMG.getScaledInstance(lblEmployeeImage.getWidth(), lblEmployeeImage.getHeight(), Image.SCALE_SMOOTH);
            //Resizes the logo for the label
            ImageIcon employeeIMGSize = new ImageIcon(employeeIMGScale);
            //Using the image in the label
            lblEmployeeImage.setIcon(employeeIMGSize);
            
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBackground = new javax.swing.JPanel();
        pnlCustomer = new javax.swing.JPanel();
        btnViewCustomer = new javax.swing.JButton();
        btnSearchCustomer = new javax.swing.JButton();
        lblCustomerImage = new javax.swing.JLabel();
        pnlCar = new javax.swing.JPanel();
        btnViewCar = new javax.swing.JButton();
        btnSearchCar = new javax.swing.JButton();
        lblCarImage = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblLogoImage = new javax.swing.JLabel();
        pnlEmployeeImage = new javax.swing.JPanel();
        btnViewEmployee = new javax.swing.JButton();
        btnSearchEmployee = new javax.swing.JButton();
        lblEmployeeImage = new javax.swing.JLabel();
        lblEmployeeMenu = new javax.swing.JLabel();
        btnReturnMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pnlBackground.setBackground(new java.awt.Color(204, 255, 204));

        pnlCustomer.setBackground(new java.awt.Color(153, 255, 204));
        pnlCustomer.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Customer Details")));

        btnViewCustomer.setBackground(new java.awt.Color(0, 0, 0));
        btnViewCustomer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnViewCustomer.setForeground(new java.awt.Color(255, 255, 255));
        btnViewCustomer.setText("View Customer");
        btnViewCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCustomerActionPerformed(evt);
            }
        });

        btnSearchCustomer.setBackground(new java.awt.Color(0, 0, 0));
        btnSearchCustomer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSearchCustomer.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchCustomer.setText("<html>\nSearch <br>Customer\n</html>");
        btnSearchCustomer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSearchCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchCustomerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCustomerLayout = new javax.swing.GroupLayout(pnlCustomer);
        pnlCustomer.setLayout(pnlCustomerLayout);
        pnlCustomerLayout.setHorizontalGroup(
            pnlCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCustomerLayout.createSequentialGroup()
                .addGroup(pnlCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCustomerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnViewCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearchCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlCustomerLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lblCustomerImage, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        pnlCustomerLayout.setVerticalGroup(
            pnlCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCustomerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnViewCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearchCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCustomerImage, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlCar.setBackground(new java.awt.Color(153, 255, 204));
        pnlCar.setBorder(javax.swing.BorderFactory.createTitledBorder("Car Details"));

        btnViewCar.setBackground(new java.awt.Color(0, 0, 0));
        btnViewCar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnViewCar.setForeground(new java.awt.Color(255, 255, 255));
        btnViewCar.setText("View Cars Sold");
        btnViewCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCarActionPerformed(evt);
            }
        });

        btnSearchCar.setBackground(new java.awt.Color(0, 0, 0));
        btnSearchCar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSearchCar.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchCar.setText("Search Car");
        btnSearchCar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSearchCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchCarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCarLayout = new javax.swing.GroupLayout(pnlCar);
        pnlCar.setLayout(pnlCarLayout);
        pnlCarLayout.setHorizontalGroup(
            pnlCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCarLayout.createSequentialGroup()
                .addGroup(pnlCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnViewCar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearchCar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlCarLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(lblCarImage, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        pnlCarLayout.setVerticalGroup(
            pnlCarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnViewCar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearchCar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCarImage, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblTitle.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        lblTitle.setText("RJA Motors");

        lblLogoImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/RJFMotorsLogo.jpeg"))); // NOI18N
        lblLogoImage.setToolTipText("");

        pnlEmployeeImage.setBackground(new java.awt.Color(153, 255, 204));
        pnlEmployeeImage.setBorder(javax.swing.BorderFactory.createTitledBorder("Employee Details"));
        pnlEmployeeImage.setName(""); // NOI18N

        btnViewEmployee.setBackground(new java.awt.Color(0, 0, 0));
        btnViewEmployee.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnViewEmployee.setForeground(new java.awt.Color(255, 255, 255));
        btnViewEmployee.setText("View Employee");
        btnViewEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewEmployeeActionPerformed(evt);
            }
        });

        btnSearchEmployee.setBackground(new java.awt.Color(0, 0, 0));
        btnSearchEmployee.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSearchEmployee.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchEmployee.setText("Search Employee");
        btnSearchEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchEmployeeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlEmployeeImageLayout = new javax.swing.GroupLayout(pnlEmployeeImage);
        pnlEmployeeImage.setLayout(pnlEmployeeImageLayout);
        pnlEmployeeImageLayout.setHorizontalGroup(
            pnlEmployeeImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEmployeeImageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEmployeeImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSearchEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEmployeeImageLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnViewEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(pnlEmployeeImageLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblEmployeeImage, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlEmployeeImageLayout.setVerticalGroup(
            pnlEmployeeImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEmployeeImageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnViewEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearchEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEmployeeImage, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addGap(9, 9, 9))
        );

        lblEmployeeMenu.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        lblEmployeeMenu.setText("Employee Menu");

        btnReturnMenu.setBackground(new java.awt.Color(0, 0, 0));
        btnReturnMenu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnReturnMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnReturnMenu.setText("Return");
        btnReturnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBackgroundLayout = new javax.swing.GroupLayout(pnlBackground);
        pnlBackground.setLayout(pnlBackgroundLayout);
        pnlBackgroundLayout.setHorizontalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackgroundLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnReturnMenu)
                .addGap(28, 28, 28))
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(pnlCar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmployeeMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTitle))
                        .addGap(25, 25, 25)
                        .addComponent(lblLogoImage, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBackgroundLayout.createSequentialGroup()
                        .addComponent(pnlEmployeeImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        pnlBackgroundLayout.setVerticalGroup(
            pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackgroundLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLogoImage, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEmployeeMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlBackgroundLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(pnlBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pnlCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlCar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(pnlEmployeeImage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReturnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCustomerActionPerformed
        // close employee main menu, open view customer
        this.dispose();
        new View_Customer().setVisible(true);
    }//GEN-LAST:event_btnViewCustomerActionPerformed

    private void btnSearchCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchCustomerActionPerformed
        // close main menu, open search customer page
        this.dispose();
        new Search_Customer().setVisible(true);
    }//GEN-LAST:event_btnSearchCustomerActionPerformed

    private void btnViewCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCarActionPerformed

        // close Employee Menu, open View Cars Sold
        this.dispose();
        new View_Car_Sold().setVisible(true);
    }//GEN-LAST:event_btnViewCarActionPerformed

    private void btnSearchCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchCarActionPerformed

        // close Employee Menu, open Search Cars 
        this.dispose();
        new Search_Car().setVisible(true);
        
    }//GEN-LAST:event_btnSearchCarActionPerformed

    private void btnSearchEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchEmployeeActionPerformed
        Search_Employee searchEmployee = new Search_Employee();
        // Makes the View_Employee frame visible

        searchEmployee.setVisible(true);
        // Makes the current frame invisible if needed

        this.setVisible(false);
    }//GEN-LAST:event_btnSearchEmployeeActionPerformed

    private void btnViewEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewEmployeeActionPerformed
        View_Employee viewEmployee = new View_Employee();
        // Makes the View_Employee frame visible

        viewEmployee.setVisible(true);
        // Makes the current frame invisible if needed

        this.setVisible(false);
    }//GEN-LAST:event_btnViewEmployeeActionPerformed

    
    private void btnReturnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnMenuActionPerformed
        
        // close Employee Menu, open Main Menu
        this.dispose();
        new Main_Menu().setVisible(true);
    }//GEN-LAST:event_btnReturnMenuActionPerformed

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
            java.util.logging.Logger.getLogger(Employee_Main_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee_Main_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee_Main_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee_Main_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee_Main_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReturnMenu;
    private javax.swing.JButton btnSearchCar;
    private javax.swing.JButton btnSearchCustomer;
    private javax.swing.JButton btnSearchEmployee;
    private javax.swing.JButton btnViewCar;
    private javax.swing.JButton btnViewCustomer;
    private javax.swing.JButton btnViewEmployee;
    private javax.swing.JLabel lblCarImage;
    private javax.swing.JLabel lblCustomerImage;
    private javax.swing.JLabel lblEmployeeImage;
    private javax.swing.JLabel lblEmployeeMenu;
    private javax.swing.JLabel lblLogoImage;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlBackground;
    private javax.swing.JPanel pnlCar;
    private javax.swing.JPanel pnlCustomer;
    private javax.swing.JPanel pnlEmployeeImage;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oop_template;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Roy Ferguson
 */
public class Testing_Images extends javax.swing.JFrame {
private javax.swing.DefaultListModel listCars;
    /**
     * Creates new form Testing_Images
     */
    public Testing_Images() {
        initComponents();
        String picSrc[] = {"no image","/images/FordRanger2022.jpeg",
        "/images/Honda_Civic_Type_R_Sportline_2023.jpeg", "/images/FordFocus2022.jpeg"};
        
        
        // Used to load the image from the images directory within the project
       ImageIcon icon = new ImageIcon(getClass().getResource(picSrc[2]));

        //Gets the image 
       Image img = icon.getImage();
       //Used to scale the image to fit within the label
        Image imgScale = img.getScaledInstance(lblPic.getWidth(), lblPic.getHeight(), Image.SCALE_SMOOTH);
        //creates a new image with the new scale
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        //sets the scaled image within the label
        lblPic.setIcon(scaledIcon);
        
        
        try {
                    File carTextFile = new File("storage/Testing_Image.txt");
                    if (carTextFile.createNewFile()) {
                        System.out.println("File Created " + carTextFile.getName());
                        JOptionPane.showMessageDialog(null, "The Text File created is: " + carTextFile, "Text File Created?", JOptionPane.PLAIN_MESSAGE);
                    } else {
                        System.out.println("File aleardy exists");
                        JOptionPane.showMessageDialog(null, "Text File: " + carTextFile + " already exists?", "Text File Already Exists?", JOptionPane.PLAIN_MESSAGE);
                    }
                    
//                    try{
//                    // write data
//                                    // Creating the File Writer and Buffer Writer
//                                    FileWriter carFile = new FileWriter("storage/Testing_Image.txt", true);
//                                    BufferedWriter output = new BufferedWriter(carFile);
//                                    
//                                    // Write String to Text File - Next Empty Line
//                                    output.write("Image " + picSrc[2]);
//                                    output.write("Hi there");
//                                    System.out.println("write succsul");
//                                    
//                 
//                                    
//                    }catch(IOException e){
//                        System.out.println("Error");
//                    }
                    
                    
                    
                    } catch (IOException e) {
                    System.out.println("An error occurred");
                    e.printStackTrace();
                }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPic = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstCarDetails = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblPic1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(lstCarDetails);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("jButton2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblPic, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPic1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblPic, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(lblPic1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String picSrc[] = {"no image","/images/FordRanger2022.jpeg",
        "/images/Honda_Civic_Type_R_Sportline_2023.jpeg", "/images/FordFocus2022.jpeg"};
        try {
      FileWriter myWriter = new FileWriter("storage/Testing_Image.txt",true);
      myWriter.write("Files in Java might be tricky, but it is fun enough!\n");
      myWriter.write(picSrc[2]);
      myWriter.write("\n");
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
      
      appData.Car_Details.setImageLocation(picSrc[2]);
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        listCars = new javax.swing.DefaultListModel();
        String eachLine;
        int numberLinesFile = 0;
        int numberLines = 1;

        try {
            File carTextFile = new File("storage/Testing_Image.txt");
            if (carTextFile.createNewFile()) {
                System.out.println("File Created" + carTextFile.getName());
                JOptionPane.showMessageDialog(null, "The Text File created is: " + carTextFile, "Text File Created?",JOptionPane.PLAIN_MESSAGE);
            } else {
                System.out.println("File aleardy exists");
                JOptionPane.showMessageDialog(null, "Text File: " + carTextFile + " already exists?", "Text File Already Exists?",JOptionPane.PLAIN_MESSAGE);
            }
        FileReader fr = null;
        try {
            fr = new FileReader("storage/Testing_Image.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        BufferedReader line = new BufferedReader(fr);
        while(true) {
            try {
                if (!((eachLine=line.readLine())!=null)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            numberLinesFile++;
        }
        System.out.println(numberLines);
        for(int i = 0; i < numberLinesFile; i++){
            String line32 = null;
            try {
                line32 = Files.readAllLines(Paths.get("storage/Testing_Image.txt")).get((numberLines-1));
                listCars.addElement(line32);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println(line32);
            numberLines++;
        }
        lstCarDetails.setModel(listCars);
        
        lblPic1.setText(appData.Car_Details.getImageLocation());
        
        // Used to load the image from the images directory within the project
       ImageIcon icon = new ImageIcon(getClass().getResource(appData.Car_Details.getImageLocation()));

        //Gets the image 
       Image img = icon.getImage();
       //Used to scale the image to fit within the label
        Image imgScale = img.getScaledInstance(lblPic1.getWidth(), lblPic1.getHeight(), Image.SCALE_SMOOTH);
        //creates a new image with the new scale
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        //sets the scaled image within the label
        lblPic1.setIcon(scaledIcon);
        
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Testing_Images.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Testing_Images.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Testing_Images.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Testing_Images.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Testing_Images().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPic;
    private javax.swing.JLabel lblPic1;
    private javax.swing.JList<String> lstCarDetails;
    // End of variables declaration//GEN-END:variables
}

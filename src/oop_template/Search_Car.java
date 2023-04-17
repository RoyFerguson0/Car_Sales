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

        btnEmpMenu.setText("Menu");

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
                        .addComponent(btnEmpMenu)
                        .addGap(23, 23, 23))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
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

                    // System.out.println("Each Line of Data \n" + eachLine);
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


//                    BufferedReader reader;
//
//                    try {
//                        reader = new BufferedReader(new FileReader("storage/Car_Details.txt"));
//                        String line3 = reader.readLine();
//
//                        while (line3 != null) {
//                            System.out.println(line3);
//                            // read next line
//
//                            line3 = reader.readLine();
//                        }
//
//                        reader.close();
//
//
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }


//
//                    Path path = Paths.get("storage/Car_Details.txt");
//                    List<String> lines1 = null;
//                    try {
//                        lines1 = Files.readAllLines(path, StandardCharsets.UTF_8);
//                    } catch (IOException e) {
//                        throw new RuntimeException(e);
//                    }
////                    lines1.set(numLines + 1, txtModel.getText());
////                    System.out.println("Output for Make: " + lines1);
//                    System.out.println(lines1);
//                    String part1 = lines1.get(0);
//                    String part2 = lines1.get(1);
////
//                    System.out.println("Part1 " + part1);
//                    System.out.println("Part2 " + part2);
//
//                    String[] output0 = new String[lines];
//
//                    String[] output = new String[lines];
//                    String line5 = lines1.toString();
//                    if(line5.contains(":")){
//                        output = line5.split(":");
//                    }
//                    System.out.println("array output is: ");
//                    System.out.println(Arrays.toString(output));
//                    System.out.println();
//                    System.out.println();
//                    int position = 1;
//
//                    for(int i = 0; i <output.length; i ++){
//                        output0[0] = output[i];
//                        System.out.println(output0[0]);
//                    }
//                    System.out.println("array zero");
//                    System.out.println(Arrays.toString(output0));
//                    System.out.println();
//                    System.out.println("Clean Array");
//                    String[] cleanedAray = Arrays.stream(output0).filter(Objects::nonNull).toArray(String[]::new);
//                    System.out.println(Arrays.toString(cleanedAray));
//
//                    String reg = "";


//                    try (Stream<String> all_lines = Files.lines(Paths.get("storage/Car_Details.txt"))) {
//                        reg = all_lines.skip(newlines-1).findFirst().get(); // Reg
////                        make = all_lines.skip(newlines).findFirst().get();  // Make
////                        model = all_lines.skip(newlines+1).findFirst().get();
////                        colour = all_lines.skip(newlines+2).findFirst().get();
////                        doors = all_lines.skip(newlines+3).findFirst().get();
////                        enginesize = all_lines.skip(newlines+4).findFirst().get();
////                        description = all_lines.skip(newlines+5).findFirst().get();
////                        price = all_lines.skip(newlines+6).findFirst().get();
//
////                        System.out.println("\n");
////                        System.out.println(reg);
////                        System.out.println(make);
////                        System.out.println(model);
////                        System.out.println(colour);
////                        System.out.println(doors);
////                        System.out.println(enginesize);
////                        System.out.println(description);
////                        System.out.println(price);
////                        output1 = new String[]{reg, make, model, colour, doors, enginesize, description, price};
////                        System.out.println("\n");
////                        System.out.println(Arrays.toString(output1));
//                    } catch (IOException e) {
//                        throw new RuntimeException(e);
//                    }
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
//                    int lineNumber = 0;
//                    String regTest = "";
//                    String makeTest = "";
//                    String modelTest = "";
//                    String colourTest = "";
//                    String doorsTest = "";
//                    String enginesizeTest = "";
//                    String descriptionTest = "";
//                    String priceTest = "";
//                    String testError = "";
//                    try {
//                        FileReader readfile = new FileReader("storage/Car_Details.txt");
//                        BufferedReader readbuffer = new BufferedReader(readfile);
//                        for (lineNumber = newlines; lineNumber < (newlines+8); lineNumber++) {
//                            if (lineNumber == newlines) {
//                                regTest = readbuffer.readLine();
//                            } else if(lineNumber == newlines+1){
//                                makeTest = readbuffer.readLine();
//                            }else if (lineNumber == newlines+2){
//                                modelTest = readbuffer.readLine();
//                            }else if (lineNumber == newlines+3){
//                                colourTest = readbuffer.readLine();
//                            }else if (lineNumber == newlines+4){
//                                doorsTest = readbuffer.readLine();
//                            }else if (lineNumber == newlines+5){
//                                enginesizeTest = readbuffer.readLine();
//                            }else if (lineNumber == newlines+6){
//                                descriptionTest = readbuffer.readLine();
//                            }else if (lineNumber == newlines+7){
//                                priceTest = readbuffer.readLine();
//                            }else{
//                                testError = "Errors";
//                            }
//
//                        }
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println(" The specific Line is: " + regTest);
//                    System.out.println(" The specific Line is: " + makeTest);
//                    System.out.println(" The specific Line is: " + modelTest);
//                    System.out.println(" The specific Line is: " + colourTest);
//                    System.out.println(" The specific Line is: " + doorsTest);
//                    System.out.println(" The specific Line is: " + enginesizeTest);
//                    System.out.println(" The specific Line is: " + descriptionTest);
//                    System.out.println(" The specific Line is: " + priceTest);
//                    System.out.println(" The specific Line is: " + testError);
//
//                    String[] outputTestArray = new String[]{regTest,makeTest,modelTest,colourTest,doorsTest,enginesizeTest,descriptionTest,priceTest};
//                    System.out.println(Arrays.toString(outputTestArray));
//                    String convertArray = Arrays.toString(outputTestArray);
//                    System.out.println("Conver Array");
//                    System.out.println(convertArray);
//                    String[] newArray = convertArray.split(": ");
//                    String convertArray2 = Arrays.toString(newArray);
//                    System.out.println("Conver Array 22222");
//                    System.out.println(convertArray2);
//                    String[] secondNewArray = convertArray.split(",");
//                    System.out.println(secondNewArray[0]);
//                    System.out.println(secondNewArray[1]);
////                    String[] newArray = new String[16];
////                    for(int j = 0; j < 16; j++){
////                        newArray = convertArray.split(": ");
////                    }
//                    for (String s : newArray) {
//                        System.out.println("Testing: ==== " + s);
//                    }
//                    System.out.println("New Array");
//                    System.out.println(Arrays.toString(newArray));
//
//                    System.out.println(newArray[0]);
//                    System.out.println(newArray[1]);
//                    System.out.println(newArray[2]);
//                    appData.Car_Details.setMake(newArray[3]);
//                    System.out.println(appData.Car_Details.getMake());
                        //     System.out.println(Arrays.toString(output1));


//                    Files.write(path, lines1, StandardCharsets.UTF_8);
//                    lines1.set(numLines + 1, txtModel.getText());
//                    Files.write(path, lines1, StandardCharsets.UTF_8);
//                    lines1.set(numLines + 2, txtColour.getText());
//                    Files.write(path, lines1, StandardCharsets.UTF_8);
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
                    //   fr.close();
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
                // write data
                // Creating the File Writer and Buffer Writer
          //      FileWriter carFile = new FileWriter("storage/Car_Details.txt",true);
           //     BufferedWriter output = new BufferedWriter(carFile);

                // Write String to Text File - Next Empty Line
         //       output.write(Reg + "\n" + Make + "\n" + Model + "\n" + Colour + "\n" + Doors + "\n" + EngineSize + "\n" + Description + "\n" + Price + "\n");

         //       lblTesting.setText("Write Successful");

        //        output.close();
            }
            // fr.close();
            } catch (IOException e) {
                System.out.println("An error occurred");
                e.printStackTrace();
            }


        }
    }//GEN-LAST:event_btnCarSearchActionPerformed

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

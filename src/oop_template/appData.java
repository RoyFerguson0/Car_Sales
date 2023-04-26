/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_template;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 50004216
 */
public class appData {
    public static Car_Details Car_Details = new Car_Details();
    
    public static Customer_Details Customer_Details = new Customer_Details();
    public static List<Customer_Details> allCustomerDetails = new ArrayList();
    
    public static Employee_Details Employee_Details = new Employee_Details();
    
    public static void loadAllCustomerDetails(){
        BufferedReader reader;
        //clearing the list so that duplicate data doesn't occur
        allCustomerDetails.clear();
        try{
            //load the file
            reader = new BufferedReader (new FileReader("storage/Customer_Details.txt"));
            
            String currentLine = "";
            
            //https://stackoverflow.com/questions/62614024/how-to-implement-hasnext-method-with-bufferedreader-stringtokenizer
            
            //iterate through file line by line using while loop until last line which will be null, loop stops
            while((currentLine = reader.readLine()) != null){
                
                String[] customerParts = currentLine.split(",");
                
                Customer_Details customer = new Customer_Details();
                customer.setCustomerID(Integer.parseInt(customerParts[0]));
                customer.setCustomerTitle(customerParts[1]);
                customer.setCustomerForename(customerParts[2]);
                customer.setCustomerSurname(customerParts[3]);
                customer.setCustomerGender(customerParts[4]);
                customer.setCustomerMobile(customerParts[5]);
                customer.setCustomerAddress(customerParts[6]);
                
                
                allCustomerDetails.add(customer);
            }
        }
        //if error occurs, nothing will print
        catch(IOException e){
            System.out.println("");
        }
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_template;

/**
 * Create public class Customer_Details
 * @author anastasiaridge (50017135)
 */
public class Customer_Details {
    //Set Variables
    private int customerID;
    private String cTitle;
    private String cForename;
    private String cSurname;
    private String cGender;
    private String cMobile;
    private String cAddress;
    
    //create method
    public Customer_Details(){
        
    }
    
    /**
     * Create an override method, this is to be called in the view customer form
     * @author Ana Ridge (50017135)
     */
    
    @Override
    public String toString(){
        //Override the toString method so that I can show just the name on the list screen
        return cTitle + " " + cForename + " " + cSurname;
    }
    
    //create setters & getters for each variable
    
    /**
     * Setting the Customer ID - Integer
     * @param customerID int
     * @author Ana Ridge (50017135)
     */
    //setter & getter customerID
    public void setCustomerID(int customerID){
        this.customerID = customerID;
    }
    /**
     * Getting the Customer ID - Integer
     * @return customerID int
     * @author Ana Ridge (50017135)
     */
    public int getCustomerID(){
        return customerID;
    }
    /**
     * Setting the Customer Title - String
     * @param cTitle String
     * @author Ana Ridge (50017135)
     */
    //setter & getter cTitle
    public void setCustomerTitle(String cTitle){
        this.cTitle = cTitle;
    }
    /**
     * Getting the Customer Title - String
     * @return c_Title String
     * @author  Ana Ridge (50017135)
     */
    public String getCustomerTitle(){
        return cTitle;
    }
    
    /**
     * Setting the Customer Forename - String
     * @param cForename String
     * @author  Ana Ridge (50017135)
     */
    //setter & getter cForename
    public void setCustomerForename(String cForename){
        this.cForename = cForename;
    }
    /**
     * Getting the Customer Forename - String
     * @return cForename String
     * @author  Ana Ridge (50017135)
     */
    public String getCustomerForename(){
        return cForename;
    }
    
    /**
     * Setting the Customer Surname - String
     * @param cSurname String
     * @author  Ana Ridge (50017135)
     */
    //setter & getter cSurname
    public void setCustomerSurname(String cSurname){
        this.cSurname = cSurname;
    }
    /**
     * Getting the Customer Surname - String
     * @return cSurname String
     * @author  Ana Ridge (50017135)
     */
    public String getCustomerSurname(){
        return cSurname;
    }
    
    /**
     * Setting the Customer Gender - String
     * @param cGender String
     * @author  Ana Ridge (50017135)
     */
    //setter & getter cGender
    public void setCustomerGender(String cGender){
        this.cGender = cGender;
    }
    /**
     * Getting the Customer Gender - String
     * @return cGender
     * @author  Ana Ridge (50017135)
     */
    public String getCustomerGender(){
        return cGender;
    }
    
    /**
     * Setting the Customer Mobile - String
     * @param cMobile 
     * @author  Ana Ridge (50017135)
     */
    //setter & getter cMobile
    public void setCustomerMobile(String cMobile){
        this.cMobile = cMobile;
    }
    /**
     * Getting the Customer Mobile - String
     * @return cMobile String
     * @author  Ana Ridge (50017135)
     */
    public String getCustomerMobile(){
        return cMobile;
    }
    
    /**
     * Setting the Customer Address - String
     * @param cAddress String
     * @author  Ana Ridge (50017135)
     */
    //setter & getter cAddress
    public void setCustomerAddress(String cAddress){
        this.cAddress = cAddress;
    }
    /**
     * Getting the Customer Address - String
     * @return cAddress
     * @author  Ana Ridge (50017135)
     */
    public String getCustomerAddress(){
        return cAddress;
    }
    
}

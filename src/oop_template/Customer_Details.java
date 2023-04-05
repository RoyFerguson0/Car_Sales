/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_template;

/**
 *
 * @author anastasiaridge
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
    
    @Override
    public String toString(){
        //Override the toString method so that I can show just the name on the list screen
        return cTitle + " " + cForename + " " + cSurname;
    }
    
    //create setters & getters for each variable
    
    //setter & getter customerID
    public void setCustomerID(int customerID){
        this.customerID = customerID;
    }
    public int getCustomerID(){
        return customerID;
    }
    
    //setter & getter cTitle
    public void setCustomerTitle(String cTitle){
        this.cTitle = cTitle;
    }
    public String getCustomerTitle(){
        return cTitle;
    }
    
    //setter & getter cForename
    public void setCustomerForename(String cForename){
        this.cForename = cForename;
    }
    public String getCustomerForename(){
        return cForename;
    }
    
    //setter & getter cSurname
    public void setCustomerSurname(String cSurname){
        this.cSurname = cSurname;
    }
    public String getCustomerSurname(){
        return cSurname;
    }
    
    //setter & getter cGender
    public void setCustomerGender(String cGender){
        this.cGender = cGender;
    }
    public String getCustomerGender(){
        return cGender;
    }
    
    //setter & getter cMobile
    public void setCustomerMobile(String cMobile){
        this.cMobile = cMobile;
    }
    public String getCustomerMobile(){
        return cMobile;
    }
    
    //setter & getter cAddress
    public void setCustomerAddress(String cAddress){
        this.cAddress = cAddress;
    }
    public String getCustomerAddress(){
        return cAddress;
    }
    
}

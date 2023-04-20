/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_template;

/**
 *
 * @author Jackh
 */
public class Employee_Details {
    
    private int employeeID;
    private String title;
    private String forename;
    private String surname;
    private String gender;
    private String job_title;
    private int contracted_hours;
    private int hourly_rate;


 public Employee_Details(){
}



//Setting Objects
 @Override
public String toString(){
        //Override the toString method so that I can show just the name on the list screen
        return title + " " + forename + " " + surname;
    }
        
//Employee ID      
public void setEmployeeID(int employeeID) {
    this.employeeID = employeeID;
}

//Title
public void setTitle(String title){
    this.title = title;
}

//Forename
public void setForename(String forename){
    this.forename = forename;
}

//Surname
public void setSurname(String surname){
    this.surname = surname;
}

//Gender
public void setGender(String gender){
    this.gender = gender;
}

//Job Title
public void setJobTitle(String job_title){
    this.job_title = job_title;
}

//Contracted hours
public void setContractedHours(int contracted_hours){
    this.contracted_hours = contracted_hours;
}

//Hourly Rate
public void setHourlyRate(int hourly_rate){
    this.hourly_rate = hourly_rate;

}




//Getters

//EmployeeID
public int getEmployeeID() {
    return employeeID;
}

//Title
public String getTitle() {
    return title;
}

//Forename
public String getForename() {
    return forename;
}

//Surname
public String getSurname() {
    return surname;
}

//Gender
public String getGender() {
    return gender;
}

//Job Title
public String getJobTitle() {
    return job_title;
}

//Contracted Hours
public int getContractedHours() {
    return contracted_hours;
}

//Hourly Rate
public int getHourlyRate() {
    return hourly_rate;
}

}


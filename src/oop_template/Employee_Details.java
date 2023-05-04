/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_template;

/**
 *
 * @author Jackh
 */
/**
     * Creating public class Employee Details
     * @author Jack Holmes (50053641)
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

/**
     * Overwriting toString to ensure that it is viewed in the list correct 
     * @author Jack Holmes (50053641)
     */

//Setting Objects
 @Override
public String toString(){
        //Override the toString method so that I can show just the name on the list screen
        return title + " " + forename + " " + surname;
    }
        
/**
     * Setting the Employee ID - Integer 
     * @param employeeID int
     * @author Jack Holmes (50053641)
     */
//Employee ID      
public void setEmployeeID(int employeeID) {
    this.employeeID = employeeID;
}

/**
     * Setting the Employee Title - String
     * @param title String
     * @author Jack Holmes (50053641)
     */
//Title
public void setTitle(String title){
    this.title = title;
}

/**
     * Setting the Employee Forename - String
     * @param forename String
     * @author Jack Holmes (50053641)
     */
//Forename
public void setForename(String forename){
    this.forename = forename;
}

/**
     * Setting the Employee Surname - String
     * @param surname String
     * @author Jack Holmes (50053641)
     */
//Surname
public void setSurname(String surname){
    this.surname = surname;
}

/**
     * Setting the Employee Gender - String
     * @param gender String
     * @author Jack Holmes (50053641)
     */
//Gender
public void setGender(String gender){
    this.gender = gender;
}

/**
     * Setting the Employee Job Title - String
     * @param job_title String
     * @author Jack Holmes (50053641)
     */
//Job Title
public void setJobTitle(String job_title){
    this.job_title = job_title;
}

/**
     * Setting the Employee Forename - String
     * @param contracted_hours Int
     * @author Jack Holmes (50053641)
     */
//Contracted hours
public void setContractedHours(int contracted_hours){
    this.contracted_hours = contracted_hours;
}

/**
     * Setting the Employee Forename - String
     * @param hourly_rate int
     * @author Jack Holmes (50053641)
     */
//Hourly Rate
public void setHourlyRate(int hourly_rate){
    this.hourly_rate = hourly_rate;

}




//Getters

/**
     * Getting the EmployeeID - int
     * @return employeeID Int
     * @author Jack Holmes (50053641)
     */
//EmployeeID
public int getEmployeeID() {
    return employeeID;
}

/**
     * Getting the Employee Title - String
     * @return title String
     * @author Jack Holmes (50053641)
     */
//Title
public String getTitle() {
    return title;
}

/**
     * Getting the Employee Forename - String
     * @return forename String
     * @author Jack Holmes (50053641)
     */
//Forename
public String getForename() {
    return forename;
}

/**
     * Getting the Employee Surname - String
     * @return surname String
     * @author Jack Holmes (50053641)
     */
//Surname
public String getSurname() {
    return surname;
}

/**
     * Getting the Employee Gender - String
     * @return gender String
     * @author Jack Holmes (50053641)
     */
//Gender
public String getGender() {
    return gender;
}

/**
     * Getting the Employee Job Title - String
     * @return job_title String
     * @author Jack Holmes (50053641)
     */
//Job Title
public String getJobTitle() {
    return job_title;
}

/**
     * Getting the Employee Contracted Hours - int
     * @return contracted_hours int
     * @author Jack Holmes (50053641)
     */
//Contracted Hours
public int getContractedHours() {
    return contracted_hours;
}

/**
     * Getting the Employee Hourly Rate - int
     * @return hourly_rate int
     * @author Jack Holmes (50053641)
     */
//Hourly Rate
public int getHourlyRate() {
    return hourly_rate;
}

}


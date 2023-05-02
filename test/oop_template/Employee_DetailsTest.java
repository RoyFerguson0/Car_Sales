/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_template;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Jackh
 */
public class Employee_DetailsTest {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test of toString method, of class Employee_Details.
     */
    @Test
    public void testToString() {
        
        Employee_Details instance = new Employee_Details();
        String expResult = "Hello";
        String result = instance.toString();
        assertEquals(expResult, "Hello");
        
    }

    /**
     * Test of setEmployeeID method, of class Employee_Details.
     */
    @Test
    public void testSetEmployeeID() {
        System.out.println("setEmployeeID");
        int employeeID = 0;
        Employee_Details instance = new Employee_Details();
        instance.setEmployeeID(employeeID);
        assertEquals(employeeID, instance.getEmployeeID());
    }

    /**
     * Test of setTitle method, of class Employee_Details.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = "Mr";
        Employee_Details instance = new Employee_Details();
        instance.setTitle(title);
        assertEquals(title, instance.getTitle());

        
    }

    /**
     * Test of setForename method, of class Employee_Details.
     */
    @Test
    public void testSetForename() {
        String forename = "Jack";
        Employee_Details instance = new Employee_Details();
        instance.setForename(forename);
        assertEquals(forename, instance.getForename());
    }

    /**
     * Test of setSurname method, of class Employee_Details.
     */
    @Test
    public void testSetSurname() {
        
        String surname = "Holmes";
        Employee_Details instance = new Employee_Details();
        instance.setSurname(surname);
        assertEquals(surname, instance.getSurname());
        
    }

    /**
     * Test of setGender method, of class Employee_Details.
     */
    @Test
    public void testSetGender() {
        
        String gender = "Male";
        Employee_Details instance = new Employee_Details();
        instance.setGender(gender);
        assertEquals(gender, instance.getGender());
    }

    /**
     * Test of setJobTitle method, of class Employee_Details.
     */
    @Test
    public void testSetJobTitle() {
        
        String job_title = "FDSE";
        Employee_Details instance = new Employee_Details();
        instance.setJobTitle(job_title);
        assertEquals(job_title, instance.getJobTitle());
    }

    /**
     * Test of setContractedHours method, of class Employee_Details.
     */
    @Test
    public void testSetContractedHours() {
        
        int contracted_hours = 0;
        Employee_Details instance = new Employee_Details();
        instance.setContractedHours(contracted_hours);
        assertEquals(contracted_hours, instance.getContractedHours());
    }

    /**
     * Test of setHourlyRate method, of class Employee_Details.
     */
    @Test
    public void testSetHourlyRate() {
       
        int hourly_rate = 0;
        Employee_Details instance = new Employee_Details();
        instance.setHourlyRate(hourly_rate);
        assertEquals(hourly_rate, instance.getHourlyRate());
    }

    /**
     * Test of getEmployeeID method, of class Employee_Details.
     */
    @Test
    public void testGetEmployeeID() {
        
        Employee_Details instance = new Employee_Details();
        instance.setEmployeeID(1);
        int expResult = 1;
        int result = instance.getEmployeeID();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getTitle method, of class Employee_Details.
     */
    @Test
    public void testGetTitle() {
        
        Employee_Details instance = new Employee_Details();
        instance.setTitle("Mr");
        String expResult = "Mr";
        String result = instance.getTitle();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getForename method, of class Employee_Details.
     */
    @Test
    public void testGetForename() {
        
        Employee_Details instance = new Employee_Details();
        instance.setForename("Jack");
        String expResult = "Jack";
        String result = instance.getForename();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getSurname method, of class Employee_Details.
     */
    @Test
    public void testGetSurname() {
        
        Employee_Details instance = new Employee_Details();
        instance.setSurname("Holmes");
        String expResult = "Holmes";
        String result = instance.getSurname();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getGender method, of class Employee_Details.
     */
    @Test
    public void testGetGender() {
        
        Employee_Details instance = new Employee_Details();
        instance.setGender("Male");
        String expResult = "Male";
        String result = instance.getGender();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getJobTitle method, of class Employee_Details.
     */
    @Test
    public void testGetJobTitle() {
        
        Employee_Details instance = new Employee_Details();
        instance.setJobTitle("FDSE");
        String expResult = "FDSE";
        String result = instance.getJobTitle();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getContractedHours method, of class Employee_Details.
     */
    @Test
    public void testGetContractedHours() {
        
        Employee_Details instance = new Employee_Details();
        instance.setContractedHours(40);
        int expResult = 40;
        int result = instance.getContractedHours();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getHourlyRate method, of class Employee_Details.
     */
    @Test
    public void testGetHourlyRate() {
        
        Employee_Details instance = new Employee_Details();
        instance.setHourlyRate(10);
        int expResult = 10;
        int result = instance.getHourlyRate();
        assertEquals(expResult, result);
        
    }
    
}

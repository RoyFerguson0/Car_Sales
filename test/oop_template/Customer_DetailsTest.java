/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package oop_template;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author anastasiaridge
 */
public class Customer_DetailsTest {
    
    public Customer_DetailsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of toString method, of class Customer_Details.
     */
    @Test
    public void testToStringWhenNoValuesSet() {
        System.out.println("toString");
        Customer_Details instance = new Customer_Details();
        String expResult = "null null null";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    @Test
    public void testToStringWhenAllValuesSet() {
        System.out.println("toString");
        Customer_Details instance = new Customer_Details();
        instance.setCustomerTitle("Mr");
        instance.setCustomerForename("John");
        instance.setCustomerSurname("Doe");
        String expResult = "Mr John Doe";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCustomerID method, of class Customer_Details.
     */
    @Test
    public void testSetCustomerID() {
        System.out.println("setCustomerID");
        int customerID = 0;
        Customer_Details instance = new Customer_Details();
        instance.setCustomerID(customerID);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomerID method, of class Customer_Details.
     */
    @Test
    public void testGetCustomerID() {
        System.out.println("getCustomerID");
        Customer_Details instance = new Customer_Details();
        instance.setCustomerID(1);
        int expResult = 1;
        int result = instance.getCustomerID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCustomerTitle method, of class Customer_Details.
     */
    @Test
    public void testSetCustomerTitle() {
        System.out.println("setCustomerTitle");
        String cTitle = "Miss";
        Customer_Details instance = new Customer_Details();
        instance.setCustomerTitle(cTitle);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomerTitle method, of class Customer_Details.
     */
    @Test
    public void testGetCustomerTitle() {
        System.out.println("getCustomerTitle");
        Customer_Details instance = new Customer_Details();
        instance.setCustomerTitle("Miss");
        String expResult = "Miss";
        String result = instance.getCustomerTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCustomerForename method, of class Customer_Details.
     */
    @Test
    public void testSetCustomerForename() {
        System.out.println("setCustomerForename");
        String cForename = "Stacey";
        Customer_Details instance = new Customer_Details();
        instance.setCustomerForename(cForename);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomerForename method, of class Customer_Details.
     */
    @Test
    public void testGetCustomerForename() {
        System.out.println("getCustomerForename");
        Customer_Details instance = new Customer_Details();
        instance.setCustomerForename("Stacey");
        String expResult = "Stacey";
        String result = instance.getCustomerForename();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCustomerSurname method, of class Customer_Details.
     */
    @Test
    public void testSetCustomerSurname() {
        System.out.println("setCustomerSurname");
        String cSurname = "Brown";
        Customer_Details instance = new Customer_Details();
        instance.setCustomerSurname(cSurname);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomerSurname method, of class Customer_Details.
     */
    @Test
    public void testGetCustomerSurname() {
        System.out.println("getCustomerSurname");
        Customer_Details instance = new Customer_Details();
        instance.setCustomerSurname("Brown");
        String expResult = "Brown";
        String result = instance.getCustomerSurname();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCustomerGender method, of class Customer_Details.
     */
    @Test
    public void testSetCustomerGender() {
        System.out.println("setCustomerGender");
        String cGender = "Female";
        Customer_Details instance = new Customer_Details();
        instance.setCustomerGender(cGender);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomerGender method, of class Customer_Details.
     */
    @Test
    public void testGetCustomerGender() {
        System.out.println("getCustomerGender");
        Customer_Details instance = new Customer_Details();
        instance.setCustomerGender("Female");
        String expResult = "Female";
        String result = instance.getCustomerGender();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCustomerMobile method, of class Customer_Details.
     */
    @Test
    public void testSetCustomerMobile() {
        System.out.println("setCustomerMobile");
        String cMobile = "07123456789";
        Customer_Details instance = new Customer_Details();
        instance.setCustomerMobile(cMobile);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomerMobile method, of class Customer_Details.
     */
    @Test
    public void testGetCustomerMobile() {
        System.out.println("getCustomerMobile");
        Customer_Details instance = new Customer_Details();
        instance.setCustomerMobile("07123456789");
        String expResult = "07123456789";
        String result = instance.getCustomerMobile();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCustomerAddress method, of class Customer_Details.
     */
    @Test
    public void testSetCustomerAddress() {
        System.out.println("setCustomerAddress");
        String cAddress = "123 Forest Lane";
        Customer_Details instance = new Customer_Details();
        instance.setCustomerAddress(cAddress);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomerAddress method, of class Customer_Details.
     */
    @Test
    public void testGetCustomerAddress() {
        System.out.println("getCustomerAddress");
        Customer_Details instance = new Customer_Details();
        instance.setCustomerAddress("123 Forest Lane");
        String expResult = "123 Forest Lane";
        String result = instance.getCustomerAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

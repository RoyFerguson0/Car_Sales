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
 * @author Roy Ferguson
 */
public class Car_DetailsTest {
    
    public Car_DetailsTest() {
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
     * Test of setRegistration method, of class Car_Details.
     */
    @Test
    public void testSetRegistration() {
        String registration = "REG1";
        Car_Details instance = new Car_Details();
        instance.setRegistration(registration);
        assertEquals(registration, instance.getRegistration());
    }

    /**
     * Test of setMake method, of class Car_Details.
     */
    @Test
    public void testSetMake() {
        String make = "Ford";
        Car_Details instance = new Car_Details();
        instance.setMake(make);
        assertEquals(make, instance.getMake());
    }

    /**
     * Test of setModel method, of class Car_Details.
     */
    @Test
    public void testSetModel() {
        String model = "Corolla SR";
        Car_Details instance = new Car_Details();
        instance.setModel(model);
        assertEquals(model, instance.getModel());
    }

    /**
     * Test of setColour method, of class Car_Details.
     */
    @Test
    public void testSetColour() {
        String colour = "Black";
        Car_Details instance = new Car_Details();
        instance.setColour(colour);
        assertEquals(colour, instance.getColour());
    }

    /**
     * Test of setDoors method, of class Car_Details.
     * set Doors with Positive Number
     */
    @Test
    public void testSetDoors() {
        int doors = 4;
        Car_Details instance = new Car_Details();
        instance.setDoors(doors);
        assertEquals(doors, instance.getDoors());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of setDoors method, of class Car_Details.
     * set Doors with negative Number
     */
    @Test
    public void testSetDoors2() {
        // You shouldn't be able to have negative doors 
        // but validation was carried out before doors was set.
        int doors = -4;
        Car_Details instance = new Car_Details();
        instance.setDoors(doors);
        assertEquals(doors, instance.getDoors());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEngine_size method, of class Car_Details.
     */
    @Test
    public void testSetEngine_size() {
        String engine_size = "1.6L";
        Car_Details instance = new Car_Details();
        instance.setEngine_size(engine_size);
        assertEquals(engine_size, instance.getEngine_size());
    }

    /**
     * Test of setDescription method, of class Car_Details.
     */
    @Test
    public void testSetDescription() {
        String description = "This is a Second Hand Motor?";
        Car_Details instance = new Car_Details();
        instance.setDescription(description);
        assertEquals(description, instance.getDescription());
    }

    /**
     * Test of setPrice method, of class Car_Details.
     */
    @Test
    public void testSetPrice() {
        int price = 1050;
        Car_Details instance = new Car_Details();
        instance.setPrice(price);
        assertEquals(price, instance.getPrice());
    }

    /**
     * Test of setImageLocation method, of class Car_Details.
     */
    @Test
    public void testSetImageLocation() {
        String imageLocation = "/images/FordRanger2022.jpeg";
        Car_Details instance = new Car_Details();
        instance.setImageLocation(imageLocation);
        assertEquals(imageLocation, instance.getImageLocation());
    }

    /**
     * Test of getRegistration method, of class Car_Details.
     */
    @Test
    public void testGetRegistration() {
        Car_Details instance = new Car_Details();
        instance.setRegistration("REG1");
        String expResult = "REG1";
        String result = instance.getRegistration();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMake method, of class Car_Details.
     */
    @Test
    public void testGetMake() {
        Car_Details instance = new Car_Details();
        instance.setMake("Toyota");
        String expResult = "Toyota";
        String result = instance.getMake();
        assertEquals(expResult, result);
    }

    /**
     * Test of getModel method, of class Car_Details.
     */
    @Test
    public void testGetModel() {
        Car_Details instance = new Car_Details();
        instance.setModel("Fiesta");
        String expResult = "Fiesta";
        String result = instance.getModel();
        assertEquals(expResult, result);
    }

    /**
     * Test of getColour method, of class Car_Details.
     */
    @Test
    public void testGetColour() {
        Car_Details instance = new Car_Details();
        instance.setColour("Blue");
        String expResult = "Blue";
        String result = instance.getColour();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDoors method, of class Car_Details.
     */
    @Test
    public void testGetDoors() {
        Car_Details instance = new Car_Details();
        instance.setDoors(3);
        int expResult = 3;
        int result = instance.getDoors();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEngine_size method, of class Car_Details.
     */
    @Test
    public void testGetEngine_size() {
        Car_Details instance = new Car_Details();
        instance.setEngine_size("3.4L");
        String expResult = "3.4L";
        String result = instance.getEngine_size();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDescription method, of class Car_Details.
     */
    @Test
    public void testGetDescription() {
        Car_Details instance = new Car_Details();
        instance.setDescription("Smoothes Ride There is!!!!");
        String expResult = "Smoothes Ride There is!!!!";
        String result = instance.getDescription();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPrice method, of class Car_Details.
     */
    @Test
    public void testGetPrice() {
        Car_Details instance = new Car_Details();
        instance.setPrice(3453);
        int expResult = 3453;
        int result = instance.getPrice();
        assertEquals(expResult, result);
    }

    /**
     * Test of getImageLocation method, of class Car_Details.
     */
    @Test
    public void testGetImageLocation() {
        Car_Details instance = new Car_Details();
        instance.setImageLocation("/images/FordRanger2022.jpeg");
        String expResult = "/images/FordRanger2022.jpeg";
        String result = instance.getImageLocation();
        assertEquals(expResult, result);
    }
    
}

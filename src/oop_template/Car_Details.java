/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_template;

/**
 *
 * @author Roy Ferguson (50004216)
 */

/**
 * It is the class / method called Car_Details
 * @author Roy Ferguson (50004216)
 */
public class Car_Details {

    // Objects State
    private String registration;
    private String make;
    private String model;
    private String colour;
    private int doors;
    private String engine_size;
    private String description;
    private int price;
    private String imageLocation;


    // Objects Behaviours
    public Car_Details(){

    }

    /////////////////////////////////////////////
    /////////////// Setters /////////////////////
    /////////////////////////////////////////////

    /**
     * Setting the Registration
    * @param registration - String
    * @author Roy Ferguson (50004216)
    */
    // Set Registration
    public void setRegistration(String registration){
        this.registration = registration;
    }
    
    /**
     * Setting the Make
    * @param make - String
    * @author Roy Ferguson (50004216)
    */
    // Set Make
    public void setMake(String make){
        this.make = make;
    }

    /**
     * Setting the Model
    * @param model - String
    * @author Roy Ferguson (50004216)
    */
    // Set Model
    public void setModel(String model){
        this.model = model;
    }

    /**
     * Setting the colour
    * @param colour - String
    * @author Roy Ferguson (50004216)
    */
    // Set Colour
    public void setColour(String colour){
        this.colour = colour;
    }

    /**
     * Setting the doors
    * @param doors - int
    * @author Roy Ferguson (50004216)
    */
    // Set Doors
    public void setDoors(int doors){
        this.doors = doors;
    }

    /**
     * Setting the engine size
    * @param engine_size - String
    * @author Roy Ferguson (50004216)
    */
    // Set Engine Size
    public void setEngine_size(String engine_size){
        this.engine_size = engine_size;
    }

    /**
     * Setting the description
    * @param description - String
    * @author Roy Ferguson (50004216)
    */
    // Set Description
    public void setDescription(String description){
        this.description = description;
    }

    /**
     * Setting the price
    * @param price - int
    * @author Roy Ferguson (50004216)
    */
    // Set Price - int
    public void setPrice(int price){
        this.price = price;
    }

    /**
     * Setting the image location
    * @param imageLocation - String
    * @author Roy Ferguson (50004216)
    */
    // Set Image Location - String
    public void setImageLocation(String imageLocation){
        this.imageLocation = imageLocation;
    }




    ///////////////////////////////
    ///////// Getters /////////////
    ///////////////////////////////

    /**
     * Getting the Registration
    * @return Registration - String
    * @author Roy Ferguson (50004216)
    */
    // Get Registration
    public String getRegistration(){
        return registration;
    }

    /**
     * Getting the Make
    * @return Make - String
    * @author Roy Ferguson (50004216)
    */
    // Get Make
    public String getMake(){
        return make;
    }

    /**
     * Getting the Model
    * @return Model - String
    * @author Roy Ferguson (50004216)
    */
    // Get Model
    public String getModel(){
        return model;
    }

    /**
     * Getting the Colour
    * @return Colour - String
    * @author Roy Ferguson (50004216)
    */
    // Get  Colour
    public String getColour(){
        return colour;
    }

    /**
     * Getting the Doors
    * @return Doors - int
    * @author Roy Ferguson (50004216)
    */
    // Get Doors
    public int getDoors(){
        return doors;
    }

    /**
     * Getting the Engine Size
    * @return Engine Size - String
    * @author Roy Ferguson (50004216)
    */
    // Get Engine
    public String getEngine_size(){
        return engine_size;
    }

    /**
     * Getting the Description
    * @return Description - String
    * @author Roy Ferguson (50004216)
    */
    // Get Description
    public String getDescription(){
        return description;
    }

    /**
     * Getting the Price
    * @return Price - int
    * @author Roy Ferguson (50004216)
    */
    // Get Price
    public int getPrice(){
        return price;
    }

    /**
     * Getting the Image Location
    * @return Image Location - String
    * @author Roy Ferguson (50004216)
    */
    // Get Image Location
    public String getImageLocation(){
        return imageLocation;
    }




}




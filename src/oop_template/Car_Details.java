/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop_template;

/**
 *
 * @author 50004216
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
    
    // Testing
    private String imageLocation;


    // Objects Behaviours
    public Car_Details(){

    }

    /////////////////////////////////////////////
    /////////////// Setters /////////////////////
    /////////////////////////////////////////////

    // Set Registration
    public void setRegistration(String registration){
        this.registration = registration;
    }
    // Set Make
    public void setMake(String make){
        this.make = make;
    }

    // Set Model
    public void setModel(String model){
        this.model = model;
    }

    // Set Colour
    public void setColour(String colour){
        this.colour = colour;
    }

    // Set Doors
    public void setDoors(int doors){
        this.doors = doors;
    }

    // Set Engine Size
    public void setEngine_size(String engine_size){
        this.engine_size = engine_size;
    }

    // Set Description
    public void setDescription(String description){
        this.description = description;
    }

    // Set Price - int
    public void setPrice(int price){
        this.price = price;
    }

    // Set Image Location - String
    public void setImageLocation(String imageLocation){
        this.imageLocation = imageLocation;
    }




    ///////////////////////////////
    ///////// Getters /////////////
    ///////////////////////////////

    // Get Registration
    public String getRegistration(){
        return registration;
    }

    // Get Make
    public String getMake(){
        return make;
    }

    // Get Model
    public String getModel(){
        return model;
    }

    // Get  Colour
    public String getColour(){
        return colour;
    }

    // Get Doors
    public int getDoors(){
        return doors;
    }

    // Get Engine
    public String getEngine_size(){
        return engine_size;
    }

    // Get Description
    public String getDescription(){
        return description;
    }

    // Get Price
    public int getPrice(){
        return price;
    }

    // Get Image Location
    public String getImageLocation(){
        return imageLocation;
    }




}




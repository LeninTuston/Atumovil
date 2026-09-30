package com.mycompany.automovil;

public class Auto {

    //contructor
    public Auto(String brand, int model, double engine, FuelType fuelType, CarType carType, int numberOfDoor, int numberOfSeat, int maximumSpeed, Color color) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.fuelType = fuelType;
        this.carType = carType;
        this.numberOfDoor = numberOfDoor;
        this.numberOfSeat = numberOfSeat;
        this.maximumSpeed = maximumSpeed;
        this.color = color;
    }
    
    
//atributos
    public String brand;
    public int model;
    public double engine;
    public FuelType fuelType;
    public CarType carType;
    public int numberOfDoor;
    public int numberOfSeat;
    public int maximumSpeed;
    public Color color;
    public double currentSpeed = 0;
    
    public void show (){
        System.out.println("brand "+brand);
        System.out.println("model "+model);
        System.out.println("engine "+engine);
        System.out.println("fuelType "+fuelType);
        System.out.println("carType "+carType);
        System.out.println("numberOfDoor "+numberOfDoor);
        System.out.println("numberOfSeat "+numberOfSeat);
        System.out.println("maximumSpeed "+maximumSpeed);
        System.out.println("color "+color);
        System.out.println("currentSpeed "+currentSpeed);
    }

}

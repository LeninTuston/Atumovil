package com.mycompany.automovil.object;

import com.mycompany.automovil.enumeration.CarType;
import com.mycompany.automovil.enumeration.Color;
import com.mycompany.automovil.enumeration.FuelType;

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
    private String brand;
    private int model;
    private double engine;
    public FuelType fuelType;
    public CarType carType;
    private int numberOfDoor;
    private int numberOfSeat;
    private int maximumSpeed;
    public Color color;
    private double currentSpeed = 0;
//getters y setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public int getNumberOfDoor() {
        return numberOfDoor;
    }

    public void setNumberOfDoor(int numberOfDoor) {
        this.numberOfDoor = numberOfDoor;
    }

    public int getNumberOfSeat() {
        return numberOfSeat;
    }

    public void setNumberOfSeat(int numberOfSeat) {
        this.numberOfSeat = numberOfSeat;
    }

    public int getMaximumSpeed() {
        return maximumSpeed;
    }

    public void setMaximumSpeed(int maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

 //metodos
    
        public void accelerate(double speed) {
        if (currentSpeed + speed > maximumSpeed) {
            System.out.println("No se puede acelerar: supera la velocidad maxima de " + maximumSpeed + " km/h");
        } else {
            currentSpeed += speed;
        }
    }

    public void decelerate(double speed) {
        if (currentSpeed - speed < 0) {
            System.out.println("No se puede desacelerar: la velocidad no puede ser negativa");
        } else {
            currentSpeed -= speed;
        }
    }

    public void calculateBrake() {
        currentSpeed = 0;
    }

    public double arrivalTime(double distance) {
        if (currentSpeed == 0) {
            System.out.println("El auto esta detenido, no se puede calcular el tiempo");
            return 0;
        }
        return distance / currentSpeed;
    }
    
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

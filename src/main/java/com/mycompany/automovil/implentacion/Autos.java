
package com.mycompany.automovil.implentacion;

import com.mycompany.automovil.object.Auto;

public class Autos {
 public void accelerate(double speed,Auto auto) {
        if (auto.getCurrentSpeed() + speed > auto.getMaximumSpeed()) {
            System.out.println("No se puede acelerar: supera la velocidad maxima de " + auto.getMaximumSpeed() + " km/h");
        } else {
            double ax = auto.getCurrentSpeed()+speed;
            auto.setCurrentSpeed(ax);
            
        }
    }

    public void decelerate(double speed,Auto auto) {
        if (auto.getCurrentSpeed() - speed < 0) {
            System.out.println("No se puede desacelerar: la velocidad no puede ser negativa");
        } else {
            double ax = auto.getCurrentSpeed()-speed;
            auto.setCurrentSpeed(ax);
            
        }
    }

    public void calculateBrake(Auto auto) {
        auto.setCurrentSpeed(0);
    }

    public double arrivalTime(double distance,Auto auto) {
        if (auto.getCurrentSpeed() == 0) {
            System.out.println("El auto esta detenido, no se puede calcular el tiempo");
            return 0;
        }
        return distance / auto.getCurrentSpeed();
    }
    
    public void show (Auto auto){
        System.out.println("brand "+auto.getBrand());
        System.out.println("model "+auto.getModel());
        System.out.println("engine "+auto.getEngine());
        System.out.println("fuelType "+auto.getFuelType());
        System.out.println("carType "+auto.getCarType());
        System.out.println("numberOfDoor "+auto.getNumberOfDoor());
        System.out.println("numberOfSeat "+auto.getNumberOfSeat());
        System.out.println("maximumSpeed "+auto.getMaximumSpeed());
        System.out.println("color "+auto.getColor());
        System.out.println("currentSpeed "+auto.getCurrentSpeed());
    }   
}

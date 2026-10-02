
package com.mycompany.automovil;

import com.mycompany.automovil.object.Auto;
import com.mycompany.automovil.enumeration.FuelType;
import com.mycompany.automovil.enumeration.Color;
import com.mycompany.automovil.enumeration.CarType;

public class Automovil {

    public static void main(String[] args) {
         Auto auto = new Auto("Nizan", 2026, 2.0, FuelType.GASOLINE, CarType.SUBCOMPACT, 4, 4, 220, Color.RED);

        auto.show();
        System.out.println();

        auto.setCurrentSpeed(100);
        System.out.println("Velocidad actual: " + auto.getCurrentSpeed() + " km/h");

        auto.accelerate(20);
        System.out.println("Velocidad actual: " + auto.getCurrentSpeed() + " km/h");

        auto.decelerate(50);
        System.out.println("Velocidad actual: " + auto.getCurrentSpeed() + " km/h");

        System.out.println("Tiempo estimado para 140 km: " + auto.arrivalTime(140) + " h");

        auto.calculateBrake();
        System.out.println("Velocidad actual: " + auto.getCurrentSpeed() + " km/h");
    
    }
}

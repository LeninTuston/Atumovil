
package com.mycompany.automovil.interfaces;

import com.mycompany.automovil.object.Auto;

public interface InterfazAuto {
     public void accelerate(double speed,Auto auto);
    

     public void decelerate(double speed,Auto auto);

     public void calculateBrake(Auto auto);

   public double arrivalTime(double distance,Auto auto);
    
    public void show (Auto auto);
}

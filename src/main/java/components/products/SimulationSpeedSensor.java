package components.products;

import components.abstractproducts.SpeedSensor;

public class SimulationSpeedSensor extends SpeedSensor {
    public SimulationSpeedSensor(){
        System.out.println("Created instance of class " + getClass().getSimpleName());
    }

    @Override
    public String productInformation() {
        return "Simulation SpeedSensor";
    }
}

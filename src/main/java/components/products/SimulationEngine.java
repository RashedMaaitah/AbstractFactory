package components.products;

import components.abstractproducts.Engine;

public class SimulationEngine extends Engine {
    public SimulationEngine(){
        System.out.println("Created instance of class " + getClass().getSimpleName());
    }

    @Override
    public String productInformation() {
        return "Simulation Engine";
    }

    @Override
    public void setAcceleration(double acceleration) {
        accelerator.setAcceleratorValue(acceleration);
    }
}

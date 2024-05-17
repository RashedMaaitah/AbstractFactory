package components.products;

import components.abstractproducts.Accelerator;

public class SimulationAccelerator extends Accelerator {

    public SimulationAccelerator(){
        System.out.println("Created instance of class " + getClass().getSimpleName());
    }


    public String productInformation() {
        return "Simulation Accelerator";
    }


    public void setAcceleratorValue(double value) {
        this.value = value;
    }


    public double getAcceleratorValue() {
        return value;
    }
}

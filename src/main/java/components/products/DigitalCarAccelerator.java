package components.products;

import components.abstractproducts.Accelerator;

public class DigitalCarAccelerator extends Accelerator {

    public DigitalCarAccelerator(){
        System.out.println("Created instance of class " + getClass().getSimpleName());
    }

    public String productInformation() {
        return "DigitalCar Accelerator";
    }

    public void setAcceleratorValue(double value) {
        this.value = value;
    }

    public double getAcceleratorValue() {
        return value;
    }
}

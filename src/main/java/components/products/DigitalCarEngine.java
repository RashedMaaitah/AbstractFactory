package components.products;

import components.abstractproducts.Engine;

public class DigitalCarEngine extends Engine {
    public DigitalCarEngine(){
        System.out.println("Created instance of class " + getClass().getSimpleName());
    }

    @Override
    public String productInformation() {
        return "DigitalCar Engine";
    }

    @Override
    public void setAcceleration(double acceleration) {
        accelerator.setAcceleratorValue(acceleration);
    }
}

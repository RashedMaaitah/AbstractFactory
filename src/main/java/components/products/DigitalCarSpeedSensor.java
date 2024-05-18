package components.products;

import components.abstractproducts.SpeedSensor;

public class DigitalCarSpeedSensor extends SpeedSensor {
    public DigitalCarSpeedSensor(){
        System.out.println("Created instance of class " + getClass().getSimpleName());
    }

    @Override
    public String productInformation() {
        return "DigitalCar SpeedSensor";
    }
}

package components.products;

import components.abstractproducts.Brake;
import components.abstractproducts.CCH;

public class DigitalCarBrake extends Brake {

    public DigitalCarBrake(CCH digitalCarCCH){
        this.cch = digitalCarCCH;
        System.out.println("Created instance of class " + getClass().getSimpleName());
    }

    @Override
    public String productInformation() {
        return "DigitalCar Brake";
    }

    @Override
    public void stopCruise() {
        cch.stopCruise();
    }
}

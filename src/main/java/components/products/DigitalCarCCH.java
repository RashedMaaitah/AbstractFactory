package components.products;

import components.abstractproducts.CCH;

public class DigitalCarCCH extends CCH {

    public DigitalCarCCH(){
        System.out.println("Created instance of class " + getClass().getSimpleName());
    }

    @Override
    public String productInformation() {
        return "DigitalCar CCH";
    }

    @Override
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    /*
     TODO implement some logic
     */
    public void stopCruise(){

    }

    /*
     TODO implement some logic
     */
    @Override
    public void startCruise() {

    }
}

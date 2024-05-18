package factories;

import components.abstractproducts.*;
import components.products.*;

public class DigitalCarCruiseControlSystemFactory implements CruiseControlSystemFactory {
    public DigitalCarCruiseControlSystemFactory() {
        System.out.println("Created instance of class " + getClass().getSimpleName());
    }

    @Override
    public Accelerator createAccelerator() {
        return new DigitalCarAccelerator();
    }

    @Override
    public Brake createBrake(CCH cch) {
        return new DigitalCarBrake(cch);
    }

    @Override
    public CCH createCch() {
        return new DigitalCarCCH();
    }

    @Override
    public Engine createEngine() {
        return new DigitalCarEngine();
    }

    @Override
    public SpeedSensor createSpeedSensor(){
        return  new DigitalCarSpeedSensor();
    }
}

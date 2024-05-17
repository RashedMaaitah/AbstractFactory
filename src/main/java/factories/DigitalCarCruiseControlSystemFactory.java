package factories;

import components.abstractproducts.Accelerator;
import components.abstractproducts.Brake;
import components.abstractproducts.CCH;
import components.abstractproducts.Engine;
import components.products.DigitalCarAccelerator;
import components.products.DigitalCarBrake;
import components.products.DigitalCarCCH;
import components.products.DigitalCarEngine;

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
}

package factories;

import components.abstractproducts.Accelerator;
import components.abstractproducts.Brake;
import components.abstractproducts.CCH;
import components.abstractproducts.Engine;
import components.products.SimulationAccelerator;
import components.products.SimulationBrake;
import components.products.SimulationCCH;
import components.products.SimulationEngine;

public class SimulationCruiseControlSystemFactory implements CruiseControlSystemFactory {
    public SimulationCruiseControlSystemFactory(){
        System.out.println("Created instance of class " + getClass().getSimpleName());
    }

    @Override
    public Accelerator createAccelerator() {
        return new SimulationAccelerator();
    }

    @Override
    public Brake createBrake(CCH cch) {
        return new SimulationBrake(cch);
    }

    @Override
    public CCH createCch() {
        return new SimulationCCH();
    }

    @Override
    public Engine createEngine() {
        return new SimulationEngine();
    }
}

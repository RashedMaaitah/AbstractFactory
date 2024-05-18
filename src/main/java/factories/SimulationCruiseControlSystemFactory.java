package factories;

import components.abstractproducts.*;
import components.products.*;

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

    @Override
    public SpeedSensor createSpeedSensor() {
        return new SimulationSpeedSensor();
    }
}

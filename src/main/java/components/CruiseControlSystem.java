package components;

import components.abstractproducts.*;
import factories.CruiseControlSystemFactory;

public class CruiseControlSystem {
    private Accelerator accelerator;
    private Brake brake;
    private CCH cch;
    private Engine engine;
    private SpeedSensor speedSensor;

    public CruiseControlSystem(CruiseControlSystemFactory cruiseControlSystemFactory) {
        accelerator = cruiseControlSystemFactory.createAccelerator();
        cch = cruiseControlSystemFactory.createCch();
        brake = cruiseControlSystemFactory.createBrake(cch);
        engine = cruiseControlSystemFactory.createEngine();
        speedSensor = cruiseControlSystemFactory.createSpeedSensor();
    }

    @Override
    public String toString() {
        return accelerator.productInformation() + ", " + brake.productInformation() + ", "
                + cch.productInformation() + ", " + engine.productInformation() + ", " + speedSensor.productInformation() + "\n";
    }
}

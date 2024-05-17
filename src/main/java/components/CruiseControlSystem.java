package components;

import components.abstractproducts.Accelerator;
import components.abstractproducts.Brake;
import components.abstractproducts.CCH;
import components.abstractproducts.Engine;
import factories.CruiseControlSystemFactory;

public class CruiseControlSystem {
    private Accelerator accelerator;
    private Brake brake;
    private CCH cch;
    private Engine engine;

    public CruiseControlSystem(CruiseControlSystemFactory cruiseControlSystemFactory) {
        accelerator = cruiseControlSystemFactory.createAccelerator();
        cch = cruiseControlSystemFactory.createCch();
        brake = cruiseControlSystemFactory.createBrake(cch);
        engine = cruiseControlSystemFactory.createEngine();
    }

    @Override
    public String toString() {
        return accelerator.productInformation() + ", " + brake.productInformation() + ", "
                + cch.productInformation() + ", " + engine.productInformation() + "\n";
    }
}

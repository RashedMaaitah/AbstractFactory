package factories;

import components.abstractproducts.*;

public interface CruiseControlSystemFactory {
    Accelerator createAccelerator();
    Brake createBrake(CCH cch);
    CCH createCch();
    Engine createEngine();
    SpeedSensor createSpeedSensor();
}

package factories;

import components.abstractproducts.Accelerator;
import components.abstractproducts.Brake;
import components.abstractproducts.CCH;
import components.abstractproducts.Engine;

public interface CruiseControlSystemFactory {
    Accelerator createAccelerator();
    Brake createBrake(CCH cch);
    CCH createCch();
    Engine createEngine();
}

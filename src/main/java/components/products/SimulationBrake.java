package components.products;

import components.abstractproducts.Brake;
import components.abstractproducts.CCH;

public class SimulationBrake extends Brake {

    public SimulationBrake(CCH cch){
        this.cch = cch;
        System.out.println("Created instance of class " + getClass().getSimpleName());
    }

    @Override
    public String productInformation() {
        return "Simulation Brake";
    }

    @Override
    public void stopCruise() {
        cch.stopCruise();
    }
}

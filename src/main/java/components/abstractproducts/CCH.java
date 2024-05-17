package components.abstractproducts;

/**
 * Cruise Control Handle Interface
 */
public abstract class CCH {
    protected double speed;

    abstract public String productInformation();
    abstract public void setSpeed(double speed);
    abstract public double getSpeed();
    abstract public void stopCruise();
    abstract public void startCruise();
}

package components.abstractproducts;

public abstract class Engine {
    protected Accelerator accelerator;

    abstract public String productInformation();
    abstract public void setAcceleration(double acceleration);
}

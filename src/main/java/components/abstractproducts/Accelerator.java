package components.abstractproducts;

public abstract class Accelerator {
    protected double value;

    abstract public String productInformation();
    abstract public double getAcceleratorValue();
    abstract public void setAcceleratorValue(double value);
}

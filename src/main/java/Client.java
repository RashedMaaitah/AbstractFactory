import components.CruiseControlSystem;
import factories.DigitalCarCruiseControlSystemFactory;
import factories.SimulationCruiseControlSystemFactory;

/**
 * @author  Rashed Khaldoon Haidar Al Maaitah
 * Entry point for the program
 * Also is the client for the Abstract factory
 */
public class Client {
    public static void main(String[] args) {
        CruiseControlSystem simulationVehicle = new CruiseControlSystem(new SimulationCruiseControlSystemFactory());
        System.out.println(simulationVehicle);

        CruiseControlSystem digitalCarVehicle = new CruiseControlSystem(new DigitalCarCruiseControlSystemFactory());
        System.out.println(digitalCarVehicle);

    }
}

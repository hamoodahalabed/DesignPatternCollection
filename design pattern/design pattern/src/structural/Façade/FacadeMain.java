package structural.Façade;

// no need to interact with each subsystem

public class FacadeMain {
    public static void main(String[] args) {
        CarFacade carFacade = new CarFacade();
        carFacade.startCar();

        System.out.println();

        carFacade.stopCar();

    }
}

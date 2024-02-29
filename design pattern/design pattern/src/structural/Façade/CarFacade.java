package structural.Façade;

public class CarFacade {
    private Engine engine;
    private AirFlowController airFlowController;

    public CarFacade() {
        this.engine = new Engine();
        this.airFlowController = new AirFlowController();
    }

    public void startCar () {
        engine.start();
        airFlowController.takeAir();
        System.out.println("Car started");
    }

    public void stopCar () {
        engine.stop();
        airFlowController.off();
        System.out.println("Car Stopped");
    }
}

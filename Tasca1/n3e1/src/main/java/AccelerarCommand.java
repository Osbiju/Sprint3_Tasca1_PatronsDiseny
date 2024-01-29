public class AccelerarCommand implements Command{

    private Vehicle vehicle;

    public AccelerarCommand(Vehicle vehicle){
        this.vehicle = vehicle;

    }
    @Override
    public void executar() {
        vehicle.accelerar();
    }
}

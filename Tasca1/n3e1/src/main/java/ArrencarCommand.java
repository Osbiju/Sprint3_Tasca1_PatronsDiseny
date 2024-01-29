public class ArrencarCommand implements Command{

    private Vehicle vehicle;

    public ArrencarCommand(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    @Override
    public void executar() {
        vehicle.arrencar();
    }
}

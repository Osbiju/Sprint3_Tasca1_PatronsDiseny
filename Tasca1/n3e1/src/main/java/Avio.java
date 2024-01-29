public class Avio implements Vehicle{
    @Override
    public void arrencar() {
        System.out.println("El avio arranca");
    }

    @Override
    public void accelerar() {
        System.out.println("El avio accelera");
    }

    @Override
    public void frenar() {
        System.out.println("El avio frena");
    }
}

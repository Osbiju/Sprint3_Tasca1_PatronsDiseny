public class Parking_Main {

    public static void main(String[] args) {
        Cotxe cotxe = new Cotxe();
        Bicicleta bicicleta = new Bicicleta();
        Avio avio = new Avio();
        Vaixell vaixell = new Vaixell();

        Invoker invoker = new Invoker();

        Command arrecarCotxe = new ArrencarCommand(cotxe);
        Command accelerarAvio = new AccelerarCommand(avio);
        Command frenarVaixell = new FrenarCommand(vaixell);
        Command arrencarBicicleta = new ArrencarCommand(bicicleta);

        invoker.setComando(arrecarCotxe);
        invoker.executarComando();

        invoker.setComando(accelerarAvio);
        invoker.executarComando();

        invoker.setComando(frenarVaixell);
        invoker.executarComando();

        invoker.setComando(arrencarBicicleta);
        invoker.executarComando();


    }
}

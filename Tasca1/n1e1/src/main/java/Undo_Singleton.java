import java.util.ArrayList;
import java.util.List;

public class Undo_Singleton {
    //Decalracio
    private static Undo_Singleton instancia;
    private List<String> comandes;

    private Undo_Singleton() {
        //constructor private i buit, per evitar instancia amb "new"
    }


    //getter de instance amb la instancia del objecte undo si es null
    public static Undo_Singleton getInstance() {
        if (instancia == null) {
            instancia = new Undo_Singleton();
        }
        return instancia;
    }

    //metode per guardar comandes

    //metode per afegir comandes

    //metode per eliminar comandes

    //metode per llistar comandes


}

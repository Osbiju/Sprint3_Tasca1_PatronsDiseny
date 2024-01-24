import java.util.ArrayList;
import java.util.List;

public class Undo_Singleton {
    //Decalracio
    private static Undo_Singleton instancia;
    private List<String> comandes; // = new ArrayList<String>(); se podria poner aqui, pero por convencion solo se declaran atributos tipo final, SE PASA A CONSTRUCTOR

    private Undo_Singleton() {
        comandes = new ArrayList<>(); //es podria instanciar aqui tmb en comptes de com atribut

        //constructor private i "buit"(NO SEMPRE), per evitar instancia amb "new"
    }


    //getter de instance amb la instancia del objecte undo si es null
    public static Undo_Singleton getInstancia() {
        if (instancia == null) {
            instancia = new Undo_Singleton();
        }
        return instancia;
    }


    //metode per afegir comandes
    public void afegirComanda(String comanda){
        comandes.add(comanda);
    }

    //metode per eliminar comandes
    public void eliminarComanda(){
        if(!comandes.isEmpty()){
            comandes.remove(comandes.size() - 1);
        } else {
            System.out.println("No tenim comandes a eliminar");
        }
    }

    //metode per llistar comandes
    public void llistarComanda(){
        if(!comandes.isEmpty()){
            System.out.println("Llistat de comandes:");
            for (String comanda : comandes){
                System.out.println(comanda);
            }
        } else {
            System.out.println("No hi ha comandes per llistar");
        }
    }


}

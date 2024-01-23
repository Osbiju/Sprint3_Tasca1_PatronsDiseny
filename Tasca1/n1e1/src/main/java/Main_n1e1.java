import java.util.Scanner;

public class Main_n1e1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        boolean menu = true;
        int opcio = 0;

        Undo_Singleton undo = Undo_Singleton.getInstancia();

        while (menu){
            System.out.println("Escull una de les seguents opcions: \n" +
                    "1. Afegir comanda \n" +
                    "2. Esborrar ultima comanda\n" +
                    "3. Llistar historial\n" +
                    "4. Sortir");

            opcio = entrada.nextInt();
            entrada.nextLine();

            switch (opcio){
                case 1:
                    System.out.println("Introdueix la comanda a afegir:");
                    String comanda = entrada.nextLine();
                    undo.afegirComanda(comanda);
                    System.out.println("Correcte, has afegit " + comanda + "\n" );
                    break;
                case 2:
                    undo.eliminarComanda();
                    break;
                case 3:
                    undo.llistarComanda();
                    break;
                case 4:
                    System.out.println("Has sortit del programa");
                    menu = false;
                default:
                    System.out.println("L'opcio seleccionada no es correcta");
            }
        }
        entrada.close();
    }

}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_App {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        List<Contactes> contactes = new ArrayList<Contactes>();
        boolean sortir = false;
        int opcio = 0;
        String nom = "";
        String telefon = "";
        String adreca = "";
        String ciutat = "";

        while (!sortir){
            System.out.println("MENU" +
                    "\n1 Afegir contacte d'Espanya" +
                    "\n2 Afegir contacte d'Australia" +
                    "\n3 Mostrar contactes" +
                    "\n4. Sortir");
            opcio = entrada.nextInt();
            entrada.nextLine(); //recarga de buffer

            FabricaContacte nouContacte = null;

            switch (opcio){
                case 1:
                    nouContacte = new FabricaContacte_Espanya();
                    break;
                case 2:
                    nouContacte = new FabricaContacte_Espanya();
                    break;
                case 3:
                    if (contactes.isEmpty()){
                        System.out.println("No hi han contactes a la agenda");
                    } else {
                        System.out.println("Llista de contactes: ");
                        for (Contactes contacte : contactes){
                            System.out.println(contacte.mostrarInfo());
                        }
                    }
                    break;
                case 4:
                    System.out.println("Adeu, fins la proxima.");
                    sortir = true;
                    break;
                default:
                    System.out.println("Selecciona una opcio valida siusplau");
                    break;
            }
            if (opcio == 1 || opcio == 2){
                System.out.println("Introdueix el nom del contacte");
                nom = entrada.nextLine();
                System.out.println("Introdueix el numero de telefon SENSE prefix");
                telefon = entrada.nextLine();
                System.out.println("Introduexi la adreça");
                adreca = entrada.nextLine();
                System.out.println("introdueix la ciutat");
                ciutat = entrada.nextLine();

                Contactes contacte = nouContacte.crearContacte(nom, telefon, adreca, ciutat);
                contactes.add(contacte);
                System.out.println("Contacte afegit correctament");

            }
        }
        entrada.close();

    }

}

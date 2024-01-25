public class Contacte_Espanya implements Contactes {

    //atributs
    private String nom;
    private String telefon;
    private String adreca;
    private String ciutat;
    private final String PAIS = "Espanya";
    private final String PREFIX = "+34";

    //constructor
    public Contacte_Espanya(String nom, String telefon, String adreca, String ciutat){
        this.nom = nom;
        this.telefon = telefon;
        this.adreca = adreca;
        this.ciutat = ciutat;

    }


    @Override
    public String mostrarInfo() {
        return "Nom: " + nom +
                "\nTelefon: " + PREFIX + " " + telefon + " (" + PAIS + ")" +
                "\nCiutat: " + ciutat +
                "\nAdreça: " + adreca + "\n";
    }
}

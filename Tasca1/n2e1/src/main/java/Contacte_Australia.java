public class Contacte_Australia implements Contactes {
    //atributs
    private String nom;
    private String telefon;
    private String adreca;
    private String ciutat;
    private final String PAIS = "Australia";
    private final String PREFIX = "+61";

    //constructor
    public Contacte_Australia (String nom, String telefon, String adreca, String ciutat){
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

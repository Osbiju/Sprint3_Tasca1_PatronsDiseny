public class FabricaContacte_Espanya implements FabricaContacte{


    @Override
    public Contactes crearContacte(String nom, String telefon, String adreca, String ciutat) {
        return new Contacte_Espanya(nom,telefon,adreca,ciutat);


    }
}

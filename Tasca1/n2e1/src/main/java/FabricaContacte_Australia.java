public class FabricaContacte_Australia implements FabricaContacte{
    @Override
    public Contactes crearContacte(String nom, String telefon, String adreca, String ciutat) {
        return new Contacte_Australia(nom,telefon,adreca,ciutat);
    }
}

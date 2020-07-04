
/**
 *
 * @author Alan <alanjuniorestudo@gmail.com>
 */
public class appPedagio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Localizacao end1 = new Localizacao("Toledo", 101);
        Guiche guiche5 = new Guiche(5555, true, 1.35f, 1000, 10);
        PracaPedagio pedagio1 = new PracaPedagio(1111, end1,guiche5);
        
        System.out.println(" --------- Informaçoes Praça Pedagio -------------");
        System.out.println(" ID ---------------: " + pedagio1.getId());
        System.out.println(" Localização ------: " + pedagio1.getLocalizacao().getRodovia());
        System.out.println(" KM ---------------: " + pedagio1.getLocalizacao().getKm());
        System.out.println(" Valor da Tarifa --: " + pedagio1.getGuiche().getValorTarifa());
        System.out.println(" Guiches ----------: " );
    }
    
}

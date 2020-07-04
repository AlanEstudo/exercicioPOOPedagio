
/**
 *
 * @author Alan <alanjuniorestudo@gmail.com>
 */
public class Localizacao {
    private String rodovia ;
    private int km;

    public Localizacao(String rodovia, int km) {
        this.setRodovia(rodovia);
        this.setKm(km);
        
    }

     
    public String getRodovia() {
        return rodovia;
    }

    public void setRodovia(String rodovia) {
        this.rodovia = rodovia;
    }

    public float getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }
    
}

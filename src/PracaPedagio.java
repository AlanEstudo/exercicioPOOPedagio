
/**
 *
 * @author Alan <alanjuniorestudo@gmail.com>
 */
public class PracaPedagio {

    private int id;
    private Localizacao localizacao;
    private Guiche guiche;

    public PracaPedagio(int id, Localizacao localizacao, Guiche guiche) {
        this.setId(id);
        this.setLocalizacao(localizacao);
        this.setGuiche(guiche);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Localizacao getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(Localizacao localizacao) {
        this.localizacao = localizacao;
    }


    public Guiche getGuiche() {
        return guiche;
    }

    public void setGuiche(Guiche guiche) {
        this.guiche = guiche;
    }

}

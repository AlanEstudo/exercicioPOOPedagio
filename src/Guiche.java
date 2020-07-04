
/**
 *
 * @author Alan <alanjuniorestudo@gmail.com>
 */
public class Guiche {

    private int id;
    private boolean disponivel;
    private float valorTarifa;
    private float totalAcumulado;
    private float totalDeVeiculos;

    public Guiche(int id, boolean disponivel, float valorTarifa, float totalAcumulado, float totalDeVeiculos) {
        this.setId(id);
        this.setDisponivel (disponivel);
        this.setValorTarifa(valorTarifa) ;
        this.setTotalAcumulado(totalAcumulado);
        this.setTotalDeVeiculos (totalDeVeiculos);
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public float getTotalAcumulado() {
        return totalAcumulado;
    }

    public void setTotalAcumulado(float totalAcumulado) {
        this.totalAcumulado = this.getValorTarifa() + this.totalDeVeiculos;
    }

    public float getTotalDeVeiculos() {
        return totalDeVeiculos;
    }

    public void setTotalDeVeiculos(float totalDeVeiculos) {
        this.totalDeVeiculos = totalDeVeiculos;
    }

    public float getValorTarifa() {
        return valorTarifa;
    }

    public void setValorTarifa(float valorTarifa) {
        this.valorTarifa = valorTarifa;
    }


    /*-------------------Metodos Especiais -----------------*/
    /*--- Metodo verificar status [disponivel ou indisponivel ]---*/
    public String status() {
        if(disponivel){
            return " Disponível ";
        }
        return "Indisponível ";
    }       
    /*--- metodo realzar pagamento ---*/
    public void realizaPagamento(float valor){
       this.setTotalAcumulado(this.getTotalAcumulado() + valor); 
    }
    
}

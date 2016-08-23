//Bárbara Izadora Alves da Cruz e Pedro Henrique Vilaça Valverde REDES2A
package TrabalhoPratico;

public class ControleGastos{
    private double caixa;
    
    public void gasto (double gasto){
        caixa-=gasto;
    }
    public void ganho (double ganho){
        caixa+=ganho;
    }
}

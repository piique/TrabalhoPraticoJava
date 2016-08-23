//Bárbara izadora Alves da Cruz e Pedro Henrique Vilaaça Valverde - REDES2A
package TrabalhoPratico;

public class TrabalhosAcademicos extends Eventos{
    private int valor;
    private String materia;
    
    public void setLocal(String local){
        this.local = local;
    }
    public String getlocal(){
        return local;
    }
    
    public void setHora(int hora){
        this.hora=  hora;
    }
    public int getHora(){
        return hora;
    }
    
    public void setValor(int valor){
        this.valor = valor;
    }
    public int getValor(){
        return valor;
    }
    
}

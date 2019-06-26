//Bárbara izadora Alves da Cruz e Pedro Henrique Vilaaça Valverde - REDES2A
package TrabalhoPratico;

public class EventosSociais extends Eventos{
    private String descricao;
    
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
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao(){
        return descricao;
    }
}

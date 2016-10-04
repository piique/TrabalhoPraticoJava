//Bárbara izadora Alves da Cruz e Pedro Henrique Vilaaça Valverde - REDES2A
package TrabalhoPratico;

public class Eventos <T>{

    String local;
    int hora;
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;  
    }
    
    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
    

}


package TrabalhoPratico;

//Bárbara Izadora Alves da Cruz e Pedro Henrique Vilaça Valverde REDES2A
//
public abstract class Usuario <T> {

    protected String usuario;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    protected String nome;
    protected String idade;
    protected String celular;
    protected String senha;
    protected  String email;
    protected String peso;
    protected String altura;
    protected String imc;
    
    public abstract void setNome(String nome);

    public abstract String getNome();
    
    public abstract void setIdade(String idade);

    public abstract String getIdade();

    public abstract void setCelular(String celular);
    
    public abstract String getCelular();
    
    public abstract void setSenha(String senha);
    
    public abstract void setEmail(String email);
    
    public abstract String getEmail();

    public abstract void setPeso(String peso);

    public abstract String getPeso();

    public abstract void setAltura(String altura);

    public abstract String getAltura();
    
    public abstract double getImc(String altura, String peso);

    
    
    
    
    
}

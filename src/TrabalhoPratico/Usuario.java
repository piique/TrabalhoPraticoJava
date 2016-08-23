package TrabalhoPratico;

//Bárbara Izadora Alves da Cruz e Pedro Henrique Vilaça Valverde REDES2A
//
public abstract class Usuario <T>{

    protected String usuario;
    protected String nome;
    protected double idade;
    protected String profissao;
    protected String snapchat;
    protected String celular;
    protected String endereco;
    protected String senha;
    protected  String email;
    protected double peso;
    protected double altura;
    protected double imc;
    
    
    
    
    
    public abstract void setNome(String nome);

    public abstract String getNome();
    
    public abstract void setIdade(double idade);

    public abstract double getIdade();
    
    public abstract void setProfissao(String profissao);

    public abstract String getProfissao();
    
    public abstract void setSnapchat(String Snapchat);

    public abstract String getSnapchat();

    public abstract void setCelular(String celular);
    
    public abstract String getCelular();
    
    public abstract void setEndereco(String endereco);
    
    public abstract String getEndereco();
    
    public abstract void setSenha(String senha);
    
    public abstract void setEmail(String email);
    
    public abstract String getEmail();

    public abstract void setPeso(double peso);

    public abstract double getPeso();

    public abstract void setAltura(double altura);

    public abstract double getAltura();
    
    public abstract double getImc(double altura, double peso);

    
    
    
    
    
}

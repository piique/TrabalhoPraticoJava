package TrabalhoPratico;

public class Perfil extends Usuario{
    public Perfil(String x, String y){
        senha = y;
        nome = x;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(double idade) {
        this.idade = idade;
    }

    public double getIdade() {
        return idade;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }


    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCelular() {
        return celular;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public double getImc(double altura, double peso) {
        this.altura = altura;
        this.peso = peso;
        if (peso != 0 && peso > 0 && altura != 0 && altura > 0) {
            double imc = peso / Math.pow(peso, 2);
        }
        return imc;
    }
}

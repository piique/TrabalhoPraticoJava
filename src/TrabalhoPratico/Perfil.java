package TrabalhoPratico;

public class Perfil extends Usuario {

    public Perfil(String x, String y) {
        usuario = x;
        senha = y;
    }

    public String getSenha() {
        return senha;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setIdade(String idade) {
        this.idade = idade;
    }

    @Override
    public String getIdade() {
        return idade;
    }

    @Override
    public void setPeso(String peso) {
        this.peso = peso;
    }

    @Override
    public String getPeso() {
        return peso;
    }

    @Override
    public void setAltura(String altura) {
        this.altura = altura;
    }

    @Override
    public String getAltura() {
        return altura;
    }

    @Override
    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public String getCelular() {
        return celular;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String getSaldo() {
        return String.valueOf(saldo);
    }

    @Override
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String getEmail() {
        return email;
    }
    
    @Override
    public double getImc(String altura, String peso) {
        double peso1 = Double.parseDouble(peso);
        double altura1 = Double.parseDouble(altura);
        double imcc = 0;
        if (peso1 != 0 && peso1 > 0 && altura1 != 0 && altura1 > 0) {
            imcc = peso1 / Math.pow(altura1, 2);
        }
        return imcc;
    }   
}

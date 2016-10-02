package TrabalhoPratico;

public class Perfil extends Usuario {

    public Perfil(String x, String y) {
        usuario = x;
        senha = y;
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
    public String getEmail() {
        return email;
    }

    @Override
    public String getImc(String altura, String peso) {
        double peso1 = Double.parseDouble(peso);
        double altura1 = Double.parseDouble(altura);
        if (peso1 != 0 && peso1 > 0 && altura1 != 0 && altura1 > 0) {
            double imc = peso1 / Math.pow(peso1, 2);
        }
        return imc;
    }
}

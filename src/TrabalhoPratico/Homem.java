package TrabalhoPratico;

//Bárbara Izadora Alves da Cruz e Pedro Henrique Vilaça Valverde REDES2A
public class Homem extends Usuario {

    private final String sexo = "Masculino";

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

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setSnapchat(String snapchat) {
        this.snapchat = snapchat;
    }

    public String getSnapchat() {
        return snapchat;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCelular() {
        return celular;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
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

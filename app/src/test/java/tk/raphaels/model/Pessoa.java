package tk.raphaels.Model;

public class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        if (idade < 0){
            throw new IllegalArgumentException("Pessoa não pode ter idade negativa");
        }
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public Boolean podeVotar(){
        return this.idade > 16;
    }
}

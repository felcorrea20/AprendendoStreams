package modulo03;

public class Pessoa {
    String nome;
    int idade;

    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return "modulo03.Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
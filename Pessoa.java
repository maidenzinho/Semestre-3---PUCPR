public class Pessoa {
    // Atributos (complete)
    private String nome;
    int idade;

    // Construtor (complete)
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método fazerAniversario (complete)
    public void fazerAniversario() {
        idade++;
    }

    // Método getNome (complete)
    public String getNome() {
        return nome;
    }
}
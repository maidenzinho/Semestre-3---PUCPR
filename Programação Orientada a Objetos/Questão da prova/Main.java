//Questão 6
abstract class Funcionario{
    private String nome;
    private int idade;

    public Funcionario(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public abstract float calcularSalario(float comissao);
}
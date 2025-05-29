/* EX 1
class Pessoa{
    String nome;
    int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Angelo", 17, 1397492);
        a1.exibirDados();
    }
}
class Aluno extends Pessoa{
    int matricula;

    public Aluno(String nome, int idade, int matricula){
        super(nome, idade);
        this.matricula = matricula;
    }

    public void exibirDados(){
        System.out.println(this.nome+ "\n" +this.idade+ "\n" +this.matricula);
    }
}
*/
/*EX 2 */
abstract class Funcionario{
    void calcularSalario(){

    }
}
class FuncionarioHorista{
    double horasTrabalhadas;
    double valorPorHora;

    double salario = horasTrabalhadas * valorPorHora;
}
class FuncionarioMensalista{

}
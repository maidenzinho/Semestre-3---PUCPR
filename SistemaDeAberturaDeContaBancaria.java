import java.util.Scanner;
class Conta{
    int n_conta;
    int agencia;

    void exibir(){
        Conta conta = new Conta();
        System.out.println("Número da Conta: " + this.n_conta);
        System.out.println("Agência: " + this.agencia);
    }
}
class main {
    public static void main(String[] args){
        Conta conta = new Conta();

        conta.n_conta = 8948579;
        conta.agencia = 4532;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu CPF sem pontos e traços: ");
        double cpf = scanner.nextDouble();

        System.out.println("Digite seu ano de nascimento:");
        int anoNasc = scanner.nextInt();

        int ano = 2025;
        int idade = ano - anoNasc;

        if (idade < 18) {
            System.out.println("Erro ao abrir conta, você é menor de idade");
        }
        else{
            System.out.println("Sua conta foi aberta com sucesso!");
            conta.exibir();

        }

        scanner.close();
    }
}
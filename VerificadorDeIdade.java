import java.util.Scanner;
class main {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu ano de nascimento: ");
        int AnoNasc = teclado.nextInt();
        int ano = 2025;

        int idade = ano - AnoNasc;

        System.out.println("Você tem: " + idade);
    }
}
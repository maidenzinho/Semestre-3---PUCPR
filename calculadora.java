import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        boolean loop = true;
        while (loop == true){
            Scanner input = new Scanner(System.in);

            System.out.println("Digite o primeiro número:");
            int num1 = input.nextInt();

            System.out.println("Digite o segundo número:");
            int num2 = input.nextInt();

            System.out.println("Escolha uma operação:");
            System.out.println("1)+");
            System.out.println("2)-");
            System.out.println("3)/");
            System.out.println("4)x");
            System.out.println("5)Sair");
            int escolha = input.nextInt();

            int soma = num1+num2;
            int subtracao = num1-num2;
            int divisao = num1/num2;
            int multiplicacao = num1*num2;

            if (escolha == 1)
            {
                System.out.println("Resultado:" +soma);
            }
            else if (escolha == 2)
            {
                System.out.println("Resultado:" +subtracao);
            }
            else if (escolha == 3)
            {
                System.out.println("Resultado:" +divisao);
            }
            else if (escolha == 4)
            {
                System.out.println("Resultado:" +multiplicacao);
            }
            else if (escolha == 5)
            {
                System.out.println("Saindo...");
                loop = false;
            }
            else
            {
                System.out.println("Opção inválida");
            }
        }
    }
}

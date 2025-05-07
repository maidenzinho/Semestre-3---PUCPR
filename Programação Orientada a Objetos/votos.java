import java.util.Scanner;

class Votos{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean loop = true;
        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;

        while (loop == true){
            System.out.println("Candidatos: ");
            System.out.println("22 - Bolsonaro");
            System.out.println("12 - Praga");
            System.out.println("14 - Lixo");
            System.out.println("0 - Sair");
            System.out.println("Escolha seu voto: ");
            int voto = input.nextInt();

            if(voto == 22){
                candidato1 += 1;
            }else if (voto == 12) {
                candidato2 += 1;
            }else if(voto == 14){
                candidato3 += 1;
            }else if (voto == 0){
                loop = false;
                System.out.println("Saindo...");
                System.out.println("Votos:\n22 - Bolsonaro: " +candidato1+ "\n12 - Praga: " +candidato2+ "\n14 - Lixo: " +candidato3);

                int totalVotos = candidato1 + candidato2 + candidato3;

                int porcentagemCandidato1 = (candidato1 * 100) / totalVotos;
                int porcentagemCandidato2 = (candidato2 * 100) / totalVotos;
                int porcentagemCandidato3 = (candidato3 * 100) / totalVotos;

                System.out.println("Porcentagem dos candidatos:");
                System.out.println("22 - Bolsonaro: " + porcentagemCandidato1 + "%");
                System.out.println("12 - Praga: " + porcentagemCandidato2 + "%");
                System.out.println("14 - Lixo: " + porcentagemCandidato3 + "%");
            }else{
                System.out.println("Opção inválida");
            }
        }
    }
}
import java.util.Random;
import java.util.Scanner;

public class RespostaDoDesafio {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("#########################################");
            System.out.println("JOGO: ADVINHE O NUMERO");
            System.out.println("#########################################");
            int acerto = 10;
            int aproximado = 5;
            System.out.println("O sistema vai gerar um numero de 1 a 10 vc precisa advinhar qual.");
            Random aleatorio = new Random();
            int numeroGerado = aleatorio.nextInt(10) + 1;
            int numeroMenor = numeroGerado - 1;
            int numeroMaior = numeroGerado + 1;
            System.out.println("o numero foi Gerado.");
            System.out.println("agora digite qual numero vc acha que o sistema gerou:");
            int numeroEscolhido = sc.nextInt();
            sc.close();
            System.out.println("#########################################");

            if(numeroGerado == numeroEscolhido){
                System.out.println("O sistema gerou: " + numeroGerado);
                System.out.println("Voce escolheu: " + numeroEscolhido);
                System.out.println("Parabens vc acertou o numero e ganhou: " + acerto + " pontos");
            } else if (numeroEscolhido == numeroMenor) {
                System.out.println("O sistema gerou: " + numeroGerado);
                System.out.println("Voce escolheu: " + numeroEscolhido);
                System.out.println("Parabens vc chegou perto e ganhou: " + aproximado + " pontos");
            } else if (numeroEscolhido == numeroMaior) {
                System.out.println("O sistema gerou: " + numeroGerado);
                System.out.println("Voce escolheu: " + numeroEscolhido);
                System.out.println("Parabens vc chegou perto e ganhou:" + aproximado + " pontos");
            }  else {
                System.out.println("O sistema gerou: " + numeroGerado);
                System.out.println("Voce escolheu: " + numeroEscolhido);
                System.out.println("vc errou ganhou 0 pontos");
            }
            System.out.println("#########################################");
        }
}

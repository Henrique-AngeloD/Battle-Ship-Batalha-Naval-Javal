import java.util.Random;
import java.util.Scanner;

public class Jogo {
    static IaPai ia;

    public static void main(String[] args) throws Exception {
        new Tabuleiro();
        int dificuldade = escolheDificuldade();
        switch (dificuldade) {
            case 1:
                ia = new Ia1();
                break;
            case 2:
                ia = new Ia2();
                break;
            case 3:
                ia = new Ia3();
                break;
            case 4:
                ia = new Ia4();
                break;
            case 5:
                ia = new Ia5();
            break;
        }
        new Player();

        do {
            Batalha();
        } while (Player.embarcacoesPlayer != 0 && IaPai.embarcacoesPC != 0);
        fimDeJogo();
    }

    public static void Batalha() {
        ia.vezdoComputador();
        Player.vezdoPlayer();

        System.out.println("Seus tabuleiro: ");
        Tabuleiro.printarMapaOceanoPlayer();

        System.out.println();
    }

    public static void fimDeJogo() {
        if (Player.embarcacoesPlayer > 0 && Ia1.embarcacoesPC <= 0)
            System.out.println("Parabens! Voce venceu a batalha :)");
        else
            System.out.println("Desculpe, voce perdeu a batalha");
        System.out.println();
    }

    public static int escolheDificuldade() {
        Scanner entrada = new Scanner(System.in);
        int opcao = 0, dificuldade = 0;
        do{
        System.out.println("Selecione uma opcao: ");
        System.out.println("1 - Escolher dificuldade");
        System.out.println("2 - Dificuldade aleatoria");
        opcao = entrada.nextInt();
        if(opcao != 1 && opcao != 2){
            System.out.println("Opcao inexistente, digite uma entrada valida");
        }
        } while (opcao < 1 || opcao > 2);
        if (opcao == 1) {
            do {
                System.out.println("Selecione a dificuldade: ");
                System.out.println("1 - linear horizontal");
                System.out.println("2 - linear vertical");
                System.out.println("3 - aleatorio");
                System.out.println("4 - aleatorio com memoria");
                System.out.println("5 - aleatorio com memoria 'inteligente'");
                dificuldade = entrada.nextInt();
                if(dificuldade != 1 && dificuldade != 2 && dificuldade != 3 && dificuldade != 4 && dificuldade != 5){
                    System.out.println("Opcao inexistente, digite uma entrada valida");
                }
            } while (dificuldade < 1 || dificuldade > 5);
                switch (dificuldade) {
                    case 1:
                        return 1;

                    case 2:
                        return 2;

                    case 3:
                        return 3;

                    case 4:
                        return 4;

                    case 5:
                        return 5;

                    default:
                        return 1;
                }
        } else {
            Random random = new Random();
            int min = 1, max = 5;
            int numeroAleatorio = random.nextInt(max - min + 1) + min;

            switch (numeroAleatorio) {
                case 1:
                    return 1;

                case 2:
                    return 2;

                case 3:
                    return 3;

                case 4:
                    return 4;

                case 5:
                    return 5;

                default:
                    return 1;
            }

        }
}
}

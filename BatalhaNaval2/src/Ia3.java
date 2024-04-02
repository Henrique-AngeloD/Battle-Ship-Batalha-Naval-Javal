//import java.util.Scanner; (deixei comentado pq n estava sendo usado).
import java.util.Random;

public class Ia3 extends IaPai{
    private boolean chutes = false;
    private int x;
    private int y;

    @Override
    public void vezdoComputador() {//aleatorio
        System.out.println("\nE A VEZ DO COMPUTADOR!");
        // Advinhe as coordenadas
        do {
            x = (int) (Math.random() * 10);
            y = (int) (Math.random() * 10);
            if ((x >= 0 && x < 10) && (y >= 0 && y < 10)) // palpite válido
            {
                if (Tabuleiro.tabuleiroPlayer[x][y] == "@") // se o navio estiver nas coordenadas, o player perde um navio
                {
                    System.out.println("O computador acertou um dos seus navios!");
                    Tabuleiro.tabuleiroPlayer[x][y] = "!";
                    --Player.embarcacoesPlayer;
                    chutes = true;

                } 
                else if (Tabuleiro.tabuleiroPlayer[x][y] == " ") {
                    System.out.println("O computador errou.");
                    Tabuleiro.tabuleiroPlayer[x][y] = "-";
                    chutes = true;
                }
            }
        } while (chutes == false); // continue solicitando até um palpite válido.
        chutes = false;
    }
    
}
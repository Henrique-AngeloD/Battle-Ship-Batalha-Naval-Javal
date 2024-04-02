//import java.util.Scanner; (deixei comentado pq n estava sendo usado).

import java.util.Random;

public class Ia4 extends IaPai{

    private static int[][] memoria = new int[10][10];
    private int x;
    private int y;
    private boolean chutes = false;
    
 
    @Override
    public void vezdoComputador() {
        System.out.println("\nE A VEZ DO COMPUTADOR!");
        // Advinhe as coordenadas
        
        do {
            x = (int) (Math.random() * 10);
            y = (int) (Math.random() * 10);
            System.out.println("Teste X "+ x);
            System.out.println("Teste Y "+ y);
            if ((x >= 0 && x < 10) && (y >= 0 && y < 10) && memoria[x][y] !=1) // palpite válido
            {
                if (Tabuleiro.tabuleiroPlayer[x][y] == "@") // se o navio estiver nas coordenadas, o player perde um navio
                {
                    System.out.println("O computador acertou um dos seus navios!");
                    Tabuleiro.tabuleiroPlayer[x][y] = "!";
                    --Player.embarcacoesPlayer;
                    memoria[x][y] = 1;
                    chutes = true;

                } 
                else if (Tabuleiro.tabuleiroPlayer[x][y] == " ") {
                    System.out.println("O computador errou.");
                    Tabuleiro.tabuleiroPlayer[x][y] = "-";
                    // salvando palpites perdidos do computador
                    memoria[x][y] = 1;
                    chutes = true;
                }
            }
        } while (chutes == false); // continue solicitando até um palpite válido.
        chutes = false;
    }
    
    public void constroiMemoria(){
        for(x = 0; x < 10; x++){
        for(y=0; y < 10; y++){
            memoria[x][y] = 0;
        }
    }
}
}
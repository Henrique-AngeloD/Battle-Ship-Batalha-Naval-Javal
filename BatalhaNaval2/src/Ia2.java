//import java.util.Scanner; (deixei comentado pq n estava sendo usado).

public class Ia2 extends IaPai{
    private int linha = 0;
    private int coluna = 0;

        
    @Override
    public void vezdoComputador() {//linear vertical
        System.out.println("\nE A VEZ DO COMPUTADOR!");
        // Advinhe as coordenadas
        int x = coluna, y = linha;
        
                if (Tabuleiro.tabuleiroPlayer[x][y] == "@") // se o navio estiver nas coordenadas, o player perde um navio
                {
                    System.out.println("O computador acertou um dos seus navios!");
                    Tabuleiro.tabuleiroPlayer[x][y] = "!";
                    --Player.embarcacoesPlayer;
                    coluna++;
                } 
                else if (Tabuleiro.tabuleiroPlayer[x][y] == " ") {
                    System.out.println("O computador errou.");
                    Tabuleiro.tabuleiroPlayer[x][y] = "-";
                    // salvando palpites perdidos do computador
                    coluna++;
                }
        if(coluna > 9){
            coluna = 0;
            linha++;
        }
        System.out.println("Tiros do computador");
        Tabuleiro.printarMapaOceanoPlayer();
    }
    
}
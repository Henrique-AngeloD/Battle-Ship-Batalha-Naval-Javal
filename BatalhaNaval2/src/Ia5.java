//import java.util.Scanner; (deixei comentado pq n estava sendo usado).

import java.util.Random;

public class Ia5 extends IaPai{

    public static int[][] memoria = new int[10][10];
    private int x, y;
    private int linha = 0, coluna = 0;
    private boolean chutes = false, acertou = false;
    private boolean auxDirecao = false;
    private int direcao;


    @Override
    public void vezdoComputador() {
        System.out.println("\nE A VEZ DO COMPUTADOR!");
        // Advinhe as coordenadas
        do {
            if(acertou == true){
                //try{
                direcao = (int) (Math.random()*4);
                do{
                    //para cima;
                    if (direcao == 1  && linha != 0 && memoria[linha-1][coluna] != 1) // palpite válido
                    {
                        auxDirecao = true;
                        if (Tabuleiro.tabuleiroPlayer[linha-1][coluna] == "@") // se o navio estiver nas coordenadas, o player perde um navio
                        {
                            System.out.println("O computador acertou um dos seus navios!");
                            Tabuleiro.tabuleiroPlayer[linha-1][coluna] = "!";
                            --Player.embarcacoesPlayer;
                            memoria[linha-1][coluna] = 1;
                            linha = x;
                            coluna = y;
                            chutes = true;
                            acertou = true;
        
                        } 
                        else if (Tabuleiro.tabuleiroPlayer[x][y] == " ") {
                            System.out.println("O computador errou.");
                            Tabuleiro.tabuleiroPlayer[linha-1][coluna] = "-";
                            // salvando palpites perdidos do computador
                            memoria[linha-1][coluna] = 1;
                            chutes = true;
                            acertou = false;
                        }
                    }
                    //para direita
                    else if (coluna != 9 && memoria[linha][coluna+1] != 1) // palpite válido
                    {
                        auxDirecao = true;
                        if (Tabuleiro.tabuleiroPlayer[linha][coluna+1] == "@") // se o navio estiver nas coordenadas, o player perde um navio
                        {
                            System.out.println("O computador acertou um dos seus navios!");
                            Tabuleiro.tabuleiroPlayer[linha][coluna+1] = "!";
                            --Player.embarcacoesPlayer;
                            memoria[linha][coluna+1] = 1;
                            linha = x;
                            coluna = y;
                            chutes = true;
                            acertou = true;
        
                        } 
                        else if (Tabuleiro.tabuleiroPlayer[linha][coluna+1] == " ") {
                            System.out.println("O computador errou.");
                            Tabuleiro.tabuleiroPlayer[linha][coluna+1] = "-";
                            // salvando palpites perdidos do computador
                            memoria[linha][coluna+1] = 1;
                            chutes = true;
                            acertou = false;
                        }
                    }

                    //para baixo
                    else if (linha != 9 && memoria[linha+1][coluna] != 1) // palpite válido
                    {
                        auxDirecao = true;
                        if (Tabuleiro.tabuleiroPlayer[linha+1][coluna] == "@") // se o navio estiver nas coordenadas, o player perde um navio
                        {
                            System.out.println("O computador acertou um dos seus navios!");
                            Tabuleiro.tabuleiroPlayer[linha][coluna+1] = "!";
                            --Player.embarcacoesPlayer;
                            memoria[linha][coluna+1] = 1;
                            linha = x;
                            coluna = y;
                            chutes = true;
                            acertou = true;
        
                        } 
                        else if (Tabuleiro.tabuleiroPlayer[linha][coluna+1] == " ") {
                            System.out.println("O computador errou.");
                            Tabuleiro.tabuleiroPlayer[linha][coluna+1] = "-";
                            // salvando palpites perdidos do computador
                            memoria[linha][coluna+1] = 1;
                            chutes = true;
                            acertou = false;
                        }
                    }
                    //para esquerda
                    else if (coluna != 0 && memoria[linha][coluna-1] != 1) // palpite válido
                    {
                        auxDirecao = true;
                        if (Tabuleiro.tabuleiroPlayer[linha][coluna-1] == "@") // se o navio estiver nas coordenadas, o player perde um navio
                        {
                            System.out.println("O computador acertou um dos seus navios!");
                            Tabuleiro.tabuleiroPlayer[linha][coluna-1] = "!";
                            --Player.embarcacoesPlayer;
                            memoria[linha][coluna-1] = 1;
                            linha = x;
                            coluna = y;
                            chutes = true;
                            acertou = true;
        
                        } 
                        else if (Tabuleiro.tabuleiroPlayer[linha][coluna-1] == " ") {
                            System.out.println("O computador errou.");
                            Tabuleiro.tabuleiroPlayer[linha][coluna-1] = "-";
                            // salvando palpites perdidos do computador
                            memoria[linha][coluna-1] = 1;
                            chutes = true;
                            acertou = false;
                        }
                    }
                    acertou = false;
                }while(auxDirecao == false);
            //}catch(ArrayIndexOutOfBoundsException MV){
    
            //}
        }
            else{
            x = (int) (Math.random() * 10);
            y = (int) (Math.random() * 10);
            if ((x >= 0 && x < 10) && (y >= 0 && y < 10) && memoria[x][y] != 1) // palpite válido
            {
                if (Tabuleiro.tabuleiroPlayer[x][y] == "@") // se o navio estiver nas coordenadas, o player perde um navio
                {
                    System.out.println("O computador acertou um dos seus navios!");
                    Tabuleiro.tabuleiroPlayer[x][y] = "!";
                    --Player.embarcacoesPlayer;
                    memoria[x][y] = 1;
                    linha = x;
                    coluna = y;
                    chutes = true;
                    acertou = true;

                } 
                else if (Tabuleiro.tabuleiroPlayer[x][y] == " ") {
                    System.out.println("O computador errou.");
                    Tabuleiro.tabuleiroPlayer[x][y] = "-";
                    // salvando palpites perdidos do computador
                    memoria[x][y] = 1;
                    chutes = true;
                    acertou = false;
                }
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
    

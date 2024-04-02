import java.util.Scanner;

public class Player {

    public static int embarcacoesPlayer = 14;
    public boolean cont1 = false, cont2 = false, cont3 = false, cont4 = false;

    public Player() {
        Scanner input = new Scanner(System.in); // importante solucionar esse aviso do Input
        Tabuleiro.criarMapaOceanoPlayer();
        Tabuleiro.criarMapaOceanoChutes();

        System.out.println("\nColocando os seus navios:");
        // Instanciando 5 navios para o jogador

        for (int i = 1; i < 5;) {//Inserindo navios
            int navio = selecionaNavio();
            int direcao = selecionaDirecao();
            int x;
            int y;
            boolean entra = false;
           do{ 
            if (navio == 1) {//O navio selecionado é porta-avião
                boolean colocado1 = false;
                do{
                    System.out.print("Coordenada X da primeira posicao do " + i + " navio: ");
                    y = input.nextInt();
                    System.out.print("Coordenada Y da primeira posicao do " + i + " navio: ");
                    x = input.nextInt();
                    if ((x >= 0 && x < 10) && (y >= 0 && y < 10) && (Tabuleiro.tabuleiroPlayer[x][y].equals(" "))){//Verifica a primeira posição para inserir o barco
                        entra = true;
                        int verifica = 0;
                        if(direcao == 1){//A posição é na horizontal
                                
                        if(y <= 5){

                            for(int k = y; k < y+5; k++){//preenche para a direita
                                if(Tabuleiro.tabuleiroPlayer[x][k].equals(" ")){
                                    verifica++;
                                }}
                                for(int k = y; k < y+5; k++){
                                if(verifica == 5){
                                Tabuleiro.tabuleiroPlayer[x][k] = "@";
                                colocado1 = true;
                            }}
                    }  
                    else{
                        for(int k = y; k > y-5; k--){//preenche para a esquerda
                            if(Tabuleiro.tabuleiroPlayer[x][k].equals(" ")){
                                verifica++;
                            }}
                        for(int k = y; k > y-5; k--){
                        if(verifica == 5){
                            Tabuleiro.tabuleiroPlayer[x][k] = "@";
                            colocado1 = true;

                        }           
                    }      
                     }
                    }
                    else{//A posição é na vertical
                        if(x <= 5){
                            for(int k = x; k < x+5; k++){//preenche para baixo
                                if(Tabuleiro.tabuleiroComputador[k][y].equals(" ")){
                                    verifica++;
                                }}
                                for(int k = x; k < x+5; k++){
                                    if(verifica == 5){
                                    Tabuleiro.tabuleiroPlayer[k][y] = "@";
                                    colocado1 = true;
                            }
                    } 
                } 
                    else{
                        for(int k = x; k > x-5; k--){//preenche para cima
                            if(Tabuleiro.tabuleiroPlayer[k][y].equals(" ")){
                                verifica++;
                            }}
                            for(int k = x; k > x-5; k--){
                        if(verifica == 5){
                            Tabuleiro.tabuleiroPlayer[k][y] = "@";
                            colocado1 = true;
                    }}
                     }
                    }
                    }
                    else if ((x >= 0 && x < 10) && (y >= 0 && y < 10) && Tabuleiro.tabuleiroPlayer[x][y] == "@")
                        System.out.println("Voce nao pode colocar dois ou mais navios na mesma posicao");
                    else if ((x < 0 || x >= 10) || (y < 0 || y >= 10))
                        System.out.println("Voce nao pode colocar navios com coordenadas maiores que " + 10 + " por "
                                + 10 + " no mapa");
                            }while(colocado1 == false);
            }

            if (navio == 2) {//O navio selecionado é contratorpedo
                boolean colocado2 = false;
                do{
                    System.out.print("Coordenada X da primeira posicao do " + i + " navio: ");
                    y = input.nextInt();
                    System.out.print("Coordenada Y da primeira posicao do " + i + " navio: ");
                    x = input.nextInt();
                if ((x >= 0 && x < 10) && (y >= 0 && y < 10) && (Tabuleiro.tabuleiroPlayer[x][y].equals(" "))){//Verifica a primeira posição para inserir o barco
                    entra = true;
                    int verifica = 0;
                    if(direcao == 1){//A posição é na horizontal
                    if(y <= 6){
                        for(int k = y; k < y+4; k++){//preenche para a direita
                            if(Tabuleiro.tabuleiroPlayer[x][k].equals(" ")){
                                verifica++;
                            }}
                            for(int k = y; k < y+4; k++){//preenche para direita
                            if(verifica == 4){
                            Tabuleiro.tabuleiroPlayer[x][k] = "@";
                            colocado2 = true;
                        }}
                }  
                else{
                    for(int k = y; k > y-4; k--){//preenche para a esquerda
                        if(Tabuleiro.tabuleiroPlayer[x][k].equals(" ")){
                            verifica++;
                        }}for(int k = y; k >= y-3; k--){//preenche para a a esquerda
                            if(verifica == 4){
                            Tabuleiro.tabuleiroPlayer[x][k] = "@";
                            colocado2 = true;
                }}
                 }
                }
                else{//A posição é na vertical
                    if(x <= 6){
                        for(int k = x; k < x+4; k++){//preenche para baixo
                            if(Tabuleiro.tabuleiroPlayer[k][y].equals(" ")){
                                verifica++;
                            }}
                            for(int k = x; k < x+4; k++){
                                if(verifica == 4){
                                Tabuleiro.tabuleiroPlayer[k][y] = "@";
                                colocado2 = true;
                        }
                    }
                }  
                else{
                    for(int k = x; k > x-4; k--){//preenche para cima
                        if(Tabuleiro.tabuleiroPlayer[k][y].equals(" ")){
                            verifica++;

                        }}
                        for(int k = x; k >= x-4; k--){
                    if(verifica == 4){
                        Tabuleiro.tabuleiroPlayer[k][y] = "@";
                        colocado2 = true;
                }
                }
                 }
                }
                }
                else if ((x >= 0 && x < 10) && (y >= 0 && y < 10) && Tabuleiro.tabuleiroPlayer[x][y] == "@")
                    System.out.println("Voce nao pode colocar dois ou mais navios na mesma posicao");
                else if ((x < 0 || x >= 10) || (y < 0 || y >= 10))
                    System.out.println("Voce nao pode colocar navios com coordenadas maiores que " + 10 + " por "
                            + 10 + " no mapa");
            }while(colocado2 ==false);      
        }
            
            if (navio == 3) {//O navio selecionado é contratorpedo
                boolean colocado3 = false;
                do{
                    System.out.print("Coordenada X da primeira posicao do " + i + " navio: ");
                    y = input.nextInt();
                    System.out.print("Coordenada Y da primeira posicao do " + i + " navio: ");
                    x = input.nextInt();
            if ((x >= 0 && x < 10) && (y >= 0 && y < 10) && (Tabuleiro.tabuleiroPlayer[x][y].equals(" "))){//Verifica a primeira posição para inserir o barco
                entra = true;
                int verifica = 0;
                if(direcao == 1){//A posição é na horizontal
                if(y <= 7){
                    for(int k = y; k < y+3; k++){//preenche para a direita
                        if(Tabuleiro.tabuleiroPlayer[x][k].equals(" ")){
                            verifica++;
                        }}
                        for(int k = y; k < y+3; k++){//preenche para direita
                        if(verifica == 3){
                        Tabuleiro.tabuleiroPlayer[x][k] = "@";
                        colocado3 = true;
                    }}
            }  
            else{
                for(int k = y; k > y-3; k--){//preenche para a esquerda
                    if(Tabuleiro.tabuleiroPlayer[x][k].equals(" ")){
                        verifica++;
                    }}
                    for(int k = y; k > y-3; k--){//preenche para a a esquerda
                        if(verifica == 3){
                        Tabuleiro.tabuleiroPlayer[x][k] = "@";
                        colocado3 = true;
            }}
             }
            }
            else{//A posição é na vertical
                if(x <= 7){
                    for(int k = x; k < x+3; k++){//preenche para baixo
                        if(Tabuleiro.tabuleiroPlayer[k][y].equals(" ")){
                        verifica++;
                }}
                    for(int k = x; k < x+3; k++){
                        if(verifica == 3){
                            Tabuleiro.tabuleiroPlayer[k][y] = "@";
                            colocado3 = true;
                        }
                    }
            }  
            else{
                for(int k = x; k > x-3; k--){//preenche para cima
                    if(Tabuleiro.tabuleiroPlayer[k][y].equals(" ")){
                        verifica++;
                }}    
                for(int k = x; k > x-3; k--){
                    if(verifica == 3){
                        Tabuleiro.tabuleiroPlayer[k][y] = "@";
                        colocado3 = true;
                    }
                }
             }
            }
            }
            else if ((x >= 0 && x < 10) && (y >= 0 && y < 10) && Tabuleiro.tabuleiroPlayer[x][y] == "@")
                System.out.println("Voce nao pode colocar dois ou mais navios na mesma posicao");
            else if ((x < 0 || x >= 10) || (y < 0 || y >= 10))
                System.out.println("Voce nao pode colocar navios com coordenadas maiores que " + 10 + " por "
                        + 10 + " no mapa");
                    }while(colocado3 == false);             
    }
            
        if (navio == 4) {//O navio selecionado é submarino
            boolean colocado4 = false;
            do{       
                System.out.print("Coordenada X da primeira posicao do " + i + " navio: ");
                y = input.nextInt();
                System.out.print("Coordenada Y da primeira posicao do " + i + " navio: ");
                x = input.nextInt();
        if ((x >= 0 && x < 10) && (y >= 0 && y < 10) && (Tabuleiro.tabuleiroPlayer[x][y].equals(" "))){//Verifica a primeira posição para inserir o barco
            entra = true;
            int verifica = 0;
            if(direcao == 1){//A posição é na horizontal

            if(y <= 8){
                for(int k = y; k < y+2; k++){//preenche para a direita
                    if(Tabuleiro.tabuleiroPlayer[x][k].equals(" ")){
                        verifica++;
                    }}
                    for(int k = y; k < y+2; k++){//preenche para direita
                    if(verifica == 2){
                    Tabuleiro.tabuleiroPlayer[x][k] = "@";
                    colocado4 = true;
                }}
        }  
        else{
            for(int k = y; k > y-2; k--){//preenche para a esquerda
                if(Tabuleiro.tabuleiroPlayer[x][k].equals(" ")){
                    verifica++;
                }}
                for(int k = y; k > y-2; k--){//preenche para a a esquerda
                    if(verifica == 2){
                    Tabuleiro.tabuleiroPlayer[x][k] = "@";
                    colocado4 = true;
        }}  
         }
        }
        else{//A posição é na vertical
            if(x <= 8){
                for(int k = x; k < x+2; k++){//preenche para baixo
                    if(Tabuleiro.tabuleiroPlayer[k][y].equals(" ")){
                    verifica++;
            }}
                for(int k = x; k < x+2; k++){
                    if(verifica == 2){
                        Tabuleiro.tabuleiroPlayer[k][y] = "@";
                        colocado4 = true;
                    }
                }
        }  
        else{
            for(int k = x; k > x-2; k--){//preenche para cima
                if(Tabuleiro.tabuleiroPlayer[k][y].equals(" ")){
                    verifica++;
            }}    
            for(int k = x; k > x-2; k--){
                if(verifica == 2){
                    Tabuleiro.tabuleiroPlayer[k][y] = "@";
                    colocado4 = true;
                }
            }     
         }
        }
        }
        else if ((x >= 0 && x < 10) && (y >= 0 && y < 10) && Tabuleiro.tabuleiroPlayer[x][y] == "@")
            System.out.println("Voce nao pode colocar dois ou mais navios na mesma posicao");
        else if ((x < 0 || x >= 10) || (y < 0 || y >= 10))
            System.out.println("Voce nao pode colocar navios com coordenadas maiores que " + 10 + " por "
                    + 10 + " no mapa");
         }while(colocado4 == false);             
}
            
}while(entra == false);
        i++;
        }
        System.out.println("Posicao dos seu navios");
        Tabuleiro.printarMapaOceanoPlayer();
    }

    public static void vezdoPlayer() {
        System.out.println("\nSUA VEZ!");
        int x = -1, y = -1;
        do {
            Scanner input = new Scanner(System.in);
            System.out.print("Digite a coordenada X: ");
            y = input.nextInt();
            System.out.print("Digite a coordenada Y: ");
            x = input.nextInt();

            if ((x >= 0 && x < 10) && (y >= 0 && y < 10)) // palpites válidos
            {
                if (Tabuleiro.tabuleiroComputador[x][y] == "X") // se o navio do computador estiver na coordenada, ele perde o navio
                {
                    System.out.println("Boom! Voce acertou um navio!");
                    verificaNavio(x,y);
                    Tabuleiro.tabuleiroComputador[x][y] = "!"; // acertou no pc
                    Tabuleiro.tabuleiroChutes[x][y] = "!"; // acertou
                    --IaPai.embarcacoesPC;
                } else if (Tabuleiro.tabuleiroComputador[x][y].equals(" ")) {
                    System.out.println("Sinto muito, voce errou.");
                    Tabuleiro.tabuleiroComputador[x][y] = "-";
                    Tabuleiro.tabuleiroChutes[x][y] = "-";
                }
            } else if ((x < 0 || x >= 10) || (y < 0 || y >= 10)) // palpites invalidos
                System.out.println("Voce nao pode colocar navios fora do tamanho " + 10 + " por " + 10 + " do mapa");
        } while ((x < 0 || x >= 10) || (y < 0 || y >= 10)); // continue solicitando até um palpite válido.
        System.out.println("----------Seus tiros:---------");
        Tabuleiro.printarMapaOceanoChutes();
        System.out.println();
    }

    public int selecionaDirecao() {
        Scanner input = new Scanner(System.in);
        int direcao;
        System.out.println("Escolha uma das direcoes: ");
        System.out.println("1 - horizontal ");
        System.out.println("2 - vertical ");
        direcao = input.nextInt();

        switch (direcao) {
            case 1:
                return 1;

            case 2:
                return 2;

            default:
                return 0;
        }
    }

    public int selecionaNavio() {
        int tipoNavio;
        
        Scanner input = new Scanner(System.in);
        do{
        System.out.println("Escolha o tipo de embarcacao:");
        if (cont1 == false) {
            System.out.println("1 - Porta-aviões (cinco quadrados)");
        }
        if (cont2 == false){
            System.out.println("2 - Navio-tanque (quatro quadrados)");
        }
        if (cont3 == false){
            System.out.println("3 - Contratorpedo (três quadrados)");

        }
        if (cont4 == false){
            System.out.println("4 - Submarino (dois quadrados)");
        }
        tipoNavio = input.nextInt();
        if(tipoNavio != 1 && tipoNavio != 2 && tipoNavio != 3 && tipoNavio != 4){
            System.out.println("Tipo inexistente, digite uma entrada valida");
        }
    }while(tipoNavio < 1 || tipoNavio > 4);

        switch (tipoNavio) {
            case 1:
                cont1 = true;
                return 1;

            case 2:
                cont2 = true;
                return 2;

            case 3:
                cont3 = true;
                return 3;

            case 4:
                cont4 = true;
                return 4;

            default:
                return 0;
        }
    }

    public static void verificaNavio(int x, int y){
        if(IaPai.tiposNavio[x][y] == 1){
            System.out.println("Voce acertou um porta-avioes");
        }
        if(IaPai.tiposNavio[x][y] == 2){
            System.out.println("Voce acertou um navio-tanque");
        }
        if(IaPai.tiposNavio[x][y] == 3){
            System.out.println("Voce acertou um contratorpedo");
        }
        if(IaPai.tiposNavio[x][y] == 4){
            System.out.println("Voce acertou um submarino");
        }

    }
}
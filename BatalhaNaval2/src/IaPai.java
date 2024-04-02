import java.util.Random;

public class IaPai {

    private int qtdNavios = 1;
    private int x;
    private int y;
    public static int embarcacoesPC = 14;
    public static int[][] tiposNavio = new int[10][10];

    public IaPai() {
        Tabuleiro.criarMapaOceanoComputador();
        VerificaTipoNavio();
        System.out.println("\nO computador esta colocando seus barcos...");
        // Colocando 4 navios
        for (int i = 1; i < 5;) {
            int navio = selecionaNavio();
            int direcao = selecionaDirecao();
            boolean entra = false;
            
           do{ 
            if (navio == 1) {//O navio selecionado é porta-avião
                boolean colocado1 = false;
                do{
                    x = (int) (Math.random() * 10);
                     y = (int) (Math.random() * 10);
                    if ((x >= 0 && x < 10) && (y >= 0 && y < 10) && (Tabuleiro.tabuleiroComputador[x][y].equals(" "))){//Verifica a primeira posição para inserir o barco
                        entra = true;
                        int verifica = 0;
                        if(direcao == 1){//A posição é na horizontal
                                
                        if(y <= 5){

                            for(int k = y; k < y+5; k++){//preenche para a direita
                                if(Tabuleiro.tabuleiroComputador[x][k].equals(" ")){
                                    verifica++;
                                }}
                                for(int k = y; k < y+5; k++){
                                if(verifica == 5){
                                Tabuleiro.tabuleiroComputador[x][k] = "X";
                                colocado1 = true;
                            }}
                    }  
                    else{
                        for(int k = y; k > y-5; k--){//preenche para a esquerda
                            if(Tabuleiro.tabuleiroComputador[x][k].equals(" ")){
                                verifica++;
                            }}
                        for(int k = y; k > y-5; k--){
                        if(verifica == 5){
                            Tabuleiro.tabuleiroComputador[x][k] = "X";
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
                                    Tabuleiro.tabuleiroComputador[k][y] = "X";
                                    colocado1 = true;
                            }
                    } 
                } 
                    else{
                        for(int k = x; k > x-5; k--){//preenche para cima
                            if(Tabuleiro.tabuleiroComputador[k][y].equals(" ")){
                                verifica++;
                            }}
                            for(int k = x; k > x-5; k--){
                        if(verifica == 5){
                            Tabuleiro.tabuleiroComputador[k][y] = "X";
                            colocado1 = true;
                    }}
                     }
                    }
                    }
                            }while(colocado1 == false);
            }

            if (navio == 2) {//O navio selecionado é contratorpedo
                boolean colocado2 = false;
                do{
                    x = (int) (Math.random() * 10);
                    y = (int) (Math.random() * 10);
                if ((x >= 0 && x < 10) && (y >= 0 && y < 10) && (Tabuleiro.tabuleiroComputador[x][y].equals(" "))){//Verifica a primeira posição para inserir o barco
                    entra = true;
                    int verifica = 0;
                    if(direcao == 1){//A posição é na horizontal
                    if(y <= 6){
                        for(int k = y; k < y+4; k++){//preenche para a direita
                            if(Tabuleiro.tabuleiroComputador[x][k].equals(" ")){
                                verifica++;
                            }}
                            for(int k = y; k < y+4; k++){//preenche para direita
                            if(verifica == 4){
                            Tabuleiro.tabuleiroComputador[x][k] = "X";
                            colocado2 = true;
                        }}
                }  
                else{
                    for(int k = y; k > y-4; k--){//preenche para a esquerda
                        if(Tabuleiro.tabuleiroComputador[x][k].equals(" ")){
                            verifica++;
                        }}for(int k = y; k >= y-3; k--){//preenche para a a esquerda
                            if(verifica == 4){
                            Tabuleiro.tabuleiroComputador[x][k] = "X";
                            colocado2 = true;
                }}
                 }
                }
                else{//A posição é na vertical
                    if(x <= 6){
                        for(int k = x; k < x+4; k++){//preenche para baixo
                            if(Tabuleiro.tabuleiroComputador[k][y].equals(" ")){
                                verifica++;
                            }}
                            for(int k = x; k < x+4; k++){
                                if(verifica == 4){
                                Tabuleiro.tabuleiroComputador[k][y] = "X";
                                colocado2 = true;
                        }
                    }
                }  
                else{
                    for(int k = x; k > x-4; k--){//preenche para cima
                        if(Tabuleiro.tabuleiroComputador[k][y].equals(" ")){
                            verifica++;
                        }}
                        for(int k = x; k >= x-4; k--){
                    if(verifica == 4){
                        Tabuleiro.tabuleiroComputador[k][y] = "X";
                        colocado2 = true;
                }
                }
                 }
                }
                }
            }while(colocado2 ==false);      
        }
            
            if (navio == 3) {//O navio selecionado é contratorpedo
                boolean colocado3 = false;
                do{
                    x = (int) (Math.random() * 10);
                    y = (int) (Math.random() * 10);
            if ((x >= 0 && x < 10) && (y >= 0 && y < 10) && (Tabuleiro.tabuleiroComputador[x][y].equals(" "))){//Verifica a primeira posição para inserir o barco
                entra = true;
                int verifica = 0;
                if(direcao == 1){//A posição é na horizontal
                if(y <= 7){
                    for(int k = y; k < y+3; k++){//preenche para a direita
                        if(Tabuleiro.tabuleiroComputador[x][k].equals(" ")){
                            verifica++;
                        }}
                        for(int k = y; k < y+3; k++){//preenche para direita
                        if(verifica == 3){
                        Tabuleiro.tabuleiroComputador[x][k] = "X";
                        colocado3 = true;
                    }}
            }  
            else{
                for(int k = y; k > y-3; k--){//preenche para a esquerda
                    if(Tabuleiro.tabuleiroComputador[x][k].equals(" ")){
                        verifica++;
                    }}
                    for(int k = y; k > y-3; k--){//preenche para a a esquerda
                        if(verifica == 3){
                        Tabuleiro.tabuleiroComputador[x][k] = "X";
                        colocado3 = true;
            }}
             }
            }
            else{//A posição é na vertical
                if(x <= 7){
                    for(int k = x; k < x+3; k++){//preenche para baixo
                        if(Tabuleiro.tabuleiroComputador[k][y].equals(" ")){
                        verifica++;
                }}
                    for(int k = x; k < x+3; k++){
                        if(verifica == 3){
                            Tabuleiro.tabuleiroComputador[k][y] = "X";
                            colocado3 = true;
                        }
                    }
            }  
            else{
                for(int k = x; k > x-3; k--){//preenche para cima
                    if(Tabuleiro.tabuleiroComputador[k][y].equals(" ")){
                        verifica++;
                }}    
                for(int k = x; k > x-3; k--){
                    if(verifica == 3){
                        Tabuleiro.tabuleiroComputador[k][y] = "X";
                        colocado3 = true;
                    }
                }
             }
            }
            }
                    }while(colocado3 == false);             
    }
            
        if (navio == 4) {//O navio selecionado é submarino
            boolean colocado4 = false;
            do{       
                x = (int) (Math.random() * 10);
                y = (int) (Math.random() * 10);
        if ((x >= 0 && x < 10) && (y >= 0 && y < 10) && (Tabuleiro.tabuleiroComputador[x][y].equals(" "))){//Verifica a primeira posição para inserir o barco
            entra = true;
            int verifica = 0;
            if(direcao == 1){//A posição é na horizontal

            if(y <= 8){
                for(int k = y; k < y+2; k++){//preenche para a direita
                    if(Tabuleiro.tabuleiroComputador[x][k].equals(" ")){
                        verifica++;
                    }}
                    for(int k = y; k < y+2; k++){//preenche para direita
                    if(verifica == 2){
                    Tabuleiro.tabuleiroComputador[x][k] = "X";
                    colocado4 = true;
                }}
        }  
        else{
            for(int k = y; k > y-2; k--){//preenche para a esquerda
                if(Tabuleiro.tabuleiroComputador[x][k].equals(" ")){
                    verifica++;
                }}
                for(int k = y; k > y-2; k--){//preenche para a a esquerda
                    if(verifica == 2){
                    Tabuleiro.tabuleiroComputador[x][k] = "X";
                    colocado4 = true;
        }}  
         }
        }
        else{//A posição é na vertical
            if(x <= 8){
                for(int k = x; k < x+2; k++){//preenche para baixo
                    if(Tabuleiro.tabuleiroComputador[k][y].equals(" ")){
                    verifica++;
            }}
                for(int k = x; k < x+2; k++){
                    if(verifica == 2){
                        Tabuleiro.tabuleiroComputador[k][y] = "X";
                        colocado4 = true;
                    }
                }
        }  
        else{
            for(int k = x; k > x-2; k--){//preenche para cima
                if(Tabuleiro.tabuleiroComputador[k][y].equals(" ")){
                    verifica++;
            }}    
            for(int k = x; k > x-2; k--){
                if(verifica == 2){
                    Tabuleiro.tabuleiroComputador[k][y] = "X";
                    colocado4 = true;
                }
            }     
         }
        }
        }
         }while(colocado4 == false);             
}
            
    }while(entra == false);
        i++;
        }
        System.out.println("TABULEIRO PARA TESTES, ESSE E O DO PC");//Não deve aparecer na versão final
        Tabuleiro.printarMapaOceanoComputador();//Não deve aparecer na versão final
    }

    public int selecionaDirecao() {
        Random random = new Random();
        int direcao = random.nextInt(2) + 1; // Gera um número aleatório entre 1 e 2
        return direcao;
    }
    public int selecionaNavio() {
        if(qtdNavios == 1){
            qtdNavios++;
            return 1;
        }
        if(qtdNavios == 2){
            qtdNavios++;
            return 2;
        }
        if(qtdNavios == 3){
            qtdNavios++;
            return 3;
        }
        if(qtdNavios == 4){
            qtdNavios++;
            return 4;
        }
        return 0;   
    }
    

    public void VerificaTipoNavio(){
        for(x = 0; x < 10; x++){
        for(y=0; y < 10; y++){
            tiposNavio[x][y] = 0;
        }
    }
    }
    
    public void vezdoComputador(){};
}

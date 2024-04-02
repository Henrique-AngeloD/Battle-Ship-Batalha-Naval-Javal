public class Tabuleiro {
    public static String tabuleiroPlayer[][] = new String[10][10];
    public static String tabuleiroComputador[][] = new String[10][10];
    public static String tabuleiroChutes[][] = new String[10][10];

    // SEÇÃO DO PLAYER
    public static void criarMapaOceanoPlayer() {
        System.out.println("Criando o tabuleiro do Player");
        // Primeira seção do mapa do oceano
        /*System.out.print("  ");
        for (int i = 0; i < 10; i++)
            System.out.print(i);
        System.out.println();*/
        // Seção do meio do mapa do oceano
        for (int i = 0; i < tabuleiroPlayer.length; i++) {
            for (int j = 0; j < tabuleiroPlayer[i].length; j++) {
                tabuleiroPlayer[i][j] = " ";
                /*if (j == 0)
                    System.out.print(i + "|" + tabuleiroPlayer[i][j]);
                else if (j == tabuleiroPlayer[i].length - 1)
                    System.out.print(tabuleiroPlayer[i][j] + "|" + i);
                else
                    System.out.print(tabuleiroPlayer[i][j]);*/
            }
            //System.out.println();
        }
        // Ultima seção do mapa do oceano
        /*System.out.print("  ");
        for (int i = 0; i < 10; i++)
            System.out.print(i);
        System.out.println();*/
    }

    public static void printarMapaOceanoPlayer() {
        System.out.println();
        // Primeira seção do mapa do oceano
        System.out.print("  ");
        for (int i = 0; i < tabuleiroPlayer.length; i++){
            if(i<tabuleiroPlayer.length-1){
            System.out.print(i+" ");
            }else{System.out.print(i);}
        }
        System.out.println();
        // Seção do meio do mapa do oceano
        for (int x = 0; x < tabuleiroPlayer.length; x++) {
            System.out.print(x + "|");

            for (int y = 0; y < tabuleiroPlayer[x].length; y++) {
                //System.out.print(tabuleiroPlayer[x][y]+" ");
                if(y<tabuleiroPlayer.length-1){
                    System.out.print(tabuleiroPlayer[x][y]+" ");
                    }else{System.out.print(tabuleiroPlayer[x][y]);}
            }

            System.out.println("|" + x);
        }
        // Ultima seção do mapa do oceano
        System.out.print("  ");
        for (int i = 0; i < 10; i++)
            System.out.print(i+" ");
        System.out.println();
    }

    public static void criarMapaOceanoChutes() {
        System.out.println("Criando mapa para mostrar tiros");
        // Primeira seção do mapa do oceano
        /*System.out.print("  ");
        for (int i = 0; i < 10; i++)
            System.out.print(i);
        System.out.println();
        */
        // Seção do meio do mapa do oceano
        for (int i = 0; i < tabuleiroChutes.length; i++) {
            for (int j = 0; j < tabuleiroChutes[i].length; j++) {
                tabuleiroChutes[i][j] = " ";
                /*if (j == 0)
                    System.out.print(i + "|" + tabuleiroChutes[i][j]);
                else if (j == tabuleiroChutes[i].length - 1)
                    System.out.print(tabuleiroChutes[i][j] + "|" + i);
                else
                    System.out.print(tabuleiroChutes[i][j]);*/
            }
           // System.out.println();
        }
        // Ultima seção do mapa do oceano
        /* 
        System.out.print("  ");
        for (int i = 0; i < 10; i++)
            System.out.print(i);
        System.out.println();*/
    }

    public static void printarMapaOceanoChutes() {
        System.out.println();
        // Primeira seção do mapa do oceano
        System.out.print("  ");
        for (int i = 0; i < tabuleiroChutes.length; i++){
            if(i<tabuleiroChutes.length-1){
            System.out.print(i+" ");
            }else{System.out.print(i);}
        }
        System.out.println();
        // Seção do meio do mapa do oceano
        for (int x = 0; x < tabuleiroChutes.length; x++) {
            System.out.print(x + "|");

            for (int y = 0; y < tabuleiroChutes[x].length; y++) {
                if(y<tabuleiroChutes.length-1){
                    System.out.print(tabuleiroChutes[x][y]+" ");
                    }else{System.out.print(tabuleiroChutes[x][y]);}
            }

            System.out.println("|" + x);
        }
        // Ultima seção do mapa do oceano
        System.out.print("  ");
        for (int i = 0; i < 10; i++)
            System.out.print(i+" ");
        System.out.println();
    }


    //SEÇÃO COMPUTADOR:
    public static void criarMapaOceanoComputador(){
        System.out.println("Criando mapa do computador");
        /*Primeira seção do mapa do oceano
        System.out.print("  ");
        for(int i = 0; i < 10; i++)
                System.out.print(i);
        System.out.println();*/

        //Seção do meio do mapa do oceano
        for(int i = 0; i < tabuleiroComputador.length; i++) {
            for (int j = 0; j < tabuleiroComputador[i].length; j++) {
                tabuleiroComputador[i][j] = " ";
                /*if (j == 0)
                    System.out.print(i + "|" + tabuleiroComputador[i][j]);
                else if (j == tabuleiroComputador[i].length - 1)
                    System.out.print(tabuleiroComputador[i][j] + "|" + i);
                else
                    System.out.print(tabuleiroComputador[i][j]);*/
            }
            //System.out.println();
        }

        //Ultima seção do mapa do oceano 
        /*System.out.print("  ");
        for(int i = 0; i < 10; i++)
            System.out.print(i);
        System.out.println();*/
    }

    public static void printarMapaOceanoComputador(){
        System.out.println();
        // Primeira seção do mapa do oceano
        System.out.print("  ");
        for (int i = 0; i < tabuleiroComputador.length; i++){
            if(i<tabuleiroChutes.length-1){
            System.out.print(i+" ");
            }else{System.out.print(i);}
        }
        System.out.println();
        // Seção do meio do mapa do oceano
        for (int x = 0; x < tabuleiroComputador.length; x++) {
            System.out.print(x + "|");

            for (int y = 0; y < tabuleiroComputador[x].length; y++) {
                if(y<tabuleiroComputador.length-1){
                    System.out.print(tabuleiroComputador[x][y]+" ");
                    }else{System.out.print(tabuleiroComputador[x][y]);}
            }

            System.out.println("|" + x);
        }
        // Ultima seção do mapa do oceano
        System.out.print("  ");
        for (int i = 0; i < 10; i++)
            System.out.print(i+" ");
        System.out.println();
    }
}

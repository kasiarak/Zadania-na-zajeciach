package PPJ.ppjz_08;

public class cw4 {
    public static void main(String[] args) {
        int tablica[][] = new int[3][5];
        System.out.println("Tablica:");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 5; j++){
                tablica[i][j] = (int)(Math.random()*10);
                System.out.print(tablica[i][j] + " ");
            }
            System.out.println();
        }
        int srednia = 0;
        for(int i = 0; i < tablica.length; i++){
            for(int j = 0; j < 5; j++){
                srednia = srednia + tablica[i][j];
            }
        }
        srednia = srednia/15;
        System.out.println("Średnia: " + srednia);
        int index1 = 0;
        int index2 = 0;
        int roznica = 10;
        for(int i = 0; i < tablica.length; i++){
            for(int j = 0; j < 5; j++){
                if(tablica[i][j] == srednia || Math.abs(tablica[i][j]-srednia)<roznica){
                    roznica = Math.abs(tablica[i][j]-srednia);
                    index1 = i;
                    index2 = j;
                }
            }
        }

        System.out.print("Element najbliższy śreniej to:");
        for(int i = 0; i < tablica.length; i++){
            for(int j = 0; j < 5; j++){
                if(tablica[i][j] == tablica[index1][index2]){
                    System.out.print(" [" + i + "][" + j + "]");
                }
            }
        }
    }
}

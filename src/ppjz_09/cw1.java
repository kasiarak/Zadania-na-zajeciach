package ppjz_09;

public class cw1 {
    public static void main(String[] args) {
        int[][]tablica = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 0},
        };
        int rozmiar1 = 1;
        int[] kolumny = new int[rozmiar1];
        int rozmiar2 = 1;
        int indeks = 0;
        int[] wiersze = new int[rozmiar2];

        for(int i = 0; i < tablica.length; i++){
            for(int j = 0; j < tablica.length; j++){
                if(tablica[i][j] == 0){
                    rozmiar1++;
                    rozmiar2++;
                    kolumny[indeks] = i;
                    wiersze[indeks] = j;
                    indeks++;
                }
            }
        }
        for (int i = 0; i < wiersze.length; i++){
            for(int x = 0; x < tablica.length; x++){
                for(int j = 0; j < tablica.length; j++){
                    if(x == wiersze[i]){
                        tablica[x][j] = 0;
                    }
                }
            }
        }
        for (int i = 0; i < kolumny.length; i++){
            for(int x = 0; x < tablica.length; x++){
                for(int j = 0; j < tablica.length; j++){
                    if(j == kolumny[i]){
                        tablica[x][j] = 0;
                    }
                }
            }
        }
        for(int i = 0; i < tablica.length; i++){
            for(int j = 0; j < tablica.length; j++){
                System.out.print(tablica[i][j] + " ");
            }
            System.out.println();
        }

     }
}

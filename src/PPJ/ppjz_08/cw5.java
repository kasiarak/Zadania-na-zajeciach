package PPJ.ppjz_08;

public class cw5 {
    public static void main(String[] args) {
        int rozmiar1 = (int)(Math.random()*25);
        int rozmiar2 = (int)(rozmiar1 + Math.random()*25);
        int[][] tablica = new int[rozmiar1][rozmiar2];
        for(int i = 0; i < rozmiar1; i++){
            for(int j = 0; j < rozmiar2; j++){
                tablica[i][j] = (int)(Math.random()*10);
                System.out.print(tablica[i][j] + " ");
            }
            System.out.println();
        }
        int min = 10;
        int max = 0;
        for(int j = 0; j < rozmiar2; j++){
            for(int i = 0; i < rozmiar1; i++){
                if(tablica[i][j]<min){
                    min = tablica[i][j];
                }
                if(tablica[i][j]>max){
                    max = tablica[i][j];
                }
            }
            System.out.println("Najmniejsza wartość kolumny " + j + " to " + min);
            System.out.println("Największa wartość kolumny " + j + " to " + max);
            min = 10;
            max = 0;
        }

    }
}

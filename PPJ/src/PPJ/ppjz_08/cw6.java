package PPJ.ppjz_08;

public class cw6 {
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
        int max = 0;
        int min = 480;
        int suma = 0;
        for(int i = 0; i < rozmiar1; i++){
            for(int j = 0; j < rozmiar2; j++){
                suma = suma + tablica[i][j];
            }
            if(suma>max) max = suma;
            suma = 0;
        }
        suma = 0;
        System.out.println("Największa suma wiersza to " + max);
        for(int j = 0; j < rozmiar2; j++){
            for(int i = 0; i < rozmiar1; i++){
                suma = suma + tablica[i][j];
            }
            if(suma<min) min = suma;
            suma = 0;
        }
        System.out.println("Najmniejsza suma kolumny to " + min);


    }
}

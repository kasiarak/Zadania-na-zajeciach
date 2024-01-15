package Powtorka_02;

public class cw5 {
    public static void main(String[] args) {
        int [][] tablica = {
                {1,3,2},
                {4,5,6},
                {8,7,9},
                {0,3,1},
                {6,9,5}
        };
        rotate(tablica);
    }
    static void rotate(int[][] tablica){
        int [][] nowaTablica = new int[tablica[0].length][tablica.length];
        for(int i = 0; i < nowaTablica.length; i++){
            int indeks = tablica.length-1;
            for (int j = 0; j < nowaTablica[0].length; j++){
                nowaTablica[i][j] = tablica[indeks][i];
                indeks--;
            }
        }
        for(int i = 0; i < nowaTablica.length; i++){
            for(int j = 0; j < nowaTablica[0].length; j++){
                System.out.print(nowaTablica[i][j] + " ");
            }
            System.out.println();
        }
    }
}

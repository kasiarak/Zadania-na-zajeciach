package PPJ.Powtorka_02;

public class cw4 {
    public static void main(String[] args) {
        int[][] tablica = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        trans(tablica);
    }
    static void trans(int[][] tablica){
        int nowatablica[][] = new int[tablica.length][tablica.length];
        for (int i = 0; i < tablica.length; i++){
            for (int j = 0; j < tablica.length; j++){
                nowatablica[j][i] = tablica[i][j];
            }
        }
        for (int i = 0; i < nowatablica.length; i++){
            for (int j = 0; j < nowatablica.length; j++){
                System.out.print(nowatablica[i][j] + " ");
            }
            System.out.println();
        }
    }
}

package ppjz_08;

public class cw3 {
    public static void main(String[] args) {
        int[][] tab = {
                {1,0,0,0,0},
                {0,1,0,0},
                {0,0,1},
        };
        int[] tablicajednowymiarowa = new int[tab.length];
        for(int i = 0; i < tab.length; i++){
            for(int j = 0; j<=2; j++){
                tablicajednowymiarowa[i] = tab[j][i];
                System.out.print(tablicajednowymiarowa[i]);
            }
        }
    }
}

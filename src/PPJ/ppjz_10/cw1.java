package PPJ.ppjz_10;

public class cw1 {
    public static void main(String[] args) {
        int[][] tab1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        int[][] tab2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        jestRowna(tab1, tab2);
    }
    public static void jestRowna(int[][] tab1, int[][] tab2){
        boolean x = true;
        for(int i = 0; i < tab1.length; i++){
            if(tab1[i].length != tab2[i].length) System.out.println("false");
        }
        if(tab1.length == tab2.length){
            for(int i = 0; i < tab1.length; i++){
                for(int j = 0; j < tab2.length; j++){
                    if(tab1[i][j] != tab2[i][j]) {
                        x = false;
                    }
                }
            }
            if(x == true) System.out.println("true");
            if(x == false) System.out.println("false");
        }else System.out.println("false");

    }
}

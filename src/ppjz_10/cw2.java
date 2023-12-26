package ppjz_10;

public class cw2 {
    public static void main(String[] args) {
        calculateSquares(20, 50, 10);
    }

    public static int calculateSquares(int screenWidth, int screenHeight, int side) {
        int polekwadratu = side * side;
        int poleekranu = screenWidth * screenHeight;
        int ilosckwadratow = poleekranu / polekwadratu;
        System.out.println("Na ekranie można umieścić " + ilosckwadratow + " kwadratów");
        int[][] wspolrzedne = new int[ilosckwadratow][2];

        int x = -10;
        for (int i = 0; i < ilosckwadratow; i++) {
                x = x + 10;
                if (x > screenWidth) {
                    x = -10;
                    x = x + 10;
                }
                wspolrzedne[i][0] = x;
        }

        int y = 10;
        for(int i = 0; i<ilosckwadratow; i++){
                y = y - 10;
                if (y <= -screenHeight) {
                    y = 0;
                }
                wspolrzedne[i][1] = y;
        }

        System.out.println("Współrzędne rogów kwadratów: ");
        for(int i = 0; i < wspolrzedne.length; i++){
            for(int j = 0; j < 2; j++){
                System.out.print(wspolrzedne[i][j] + " ");
            }
            System.out.println();
        }
        return ilosckwadratow;
    }
}

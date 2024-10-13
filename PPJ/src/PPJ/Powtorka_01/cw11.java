package PPJ.Powtorka_01;

public class cw11 {
    public static void main(String[] args) {
        int ilePierwszych = 0;
        int liczba = 2;
        while (ilePierwszych < 10) {

            int dzielniki = 0;
            for (int d = 1; d*d <= liczba && dzielniki<=2; d=d+1) {
                if (liczba % d == 0) {
                    dzielniki++;
                }
            }

            if (dzielniki == 1) {
                System.out.println(liczba);
                ilePierwszych++;
            }

            liczba++;
        }
    }
}

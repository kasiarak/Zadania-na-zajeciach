package Powtorka_01_Analiza;

public class II {
    public static void main(String[] args) {
        int x = 4;
        long y = x*4 - x++;
        if(x<10) System.out.println("za malo");
        else System.out.println("w sam raz");
    }
}

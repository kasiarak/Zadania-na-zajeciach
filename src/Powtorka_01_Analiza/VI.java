package Powtorka_01_Analiza;

public class VI {
    public static void main(String[] args) {
        boolean x = true, z = true;
        int y = 0x14;
        x = (y!=10) || (z=false);
        System.out.println(x + ", " + y + ", " + z);
    }
}

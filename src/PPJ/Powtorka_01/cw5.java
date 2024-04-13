package PPJ.Powtorka_01;

public class cw5 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Podaj kwote");
        double kwota = scanner.nextDouble();
        int kwotaWgroszach = (int) (kwota * 100);
        System.out.println(kwotaWgroszach / 100 + " * 1 zł");
        kwotaWgroszach = kwotaWgroszach % 100;
        System.out.println(kwotaWgroszach / 50 + " * 50 gr");
        kwotaWgroszach = kwotaWgroszach % 50;
        System.out.println(kwotaWgroszach / 20 + " * 20 gr");
        kwotaWgroszach = kwotaWgroszach % 20;
        System.out.println(kwotaWgroszach / 10 + " * 10 gr");
        kwotaWgroszach = kwotaWgroszach % 10;
        System.out.println(kwotaWgroszach / 5 + " * 5 gr");
        kwotaWgroszach = kwotaWgroszach % 5;
        System.out.println(kwotaWgroszach / 2 + " * 2 gr");
        kwotaWgroszach = kwotaWgroszach % 2;
        System.out.println(kwotaWgroszach / 1 + " * 1 gr");
    }
}



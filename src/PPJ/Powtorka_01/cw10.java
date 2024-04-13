package PPJ.Powtorka_01;

public class cw10 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Wprowadź nieparzystą liczbę");
        int n = scanner.nextInt();
        int iloscSpacji = 0;
        for (int i=n; i%2!=2; i=i-2) {
            if (i < 1) {
                break;
            } else {
                for (int y = iloscSpacji; y > 0; y--) {
                    System.out.print(" ");
                }
                iloscSpacji++;
                for (int x = i; x > 0; x--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        iloscSpacji--;
        for (int i=3; i<=n; i=i+2) {
            if (i > n) {
                break;
            } else {
                iloscSpacji--;
                for (int y = iloscSpacji; y > 0; y--) {
                    System.out.print(" ");
                }
                for (int x = i; x > 0; x--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

}

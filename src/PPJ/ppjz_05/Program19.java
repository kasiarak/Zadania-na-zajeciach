package PPJ.ppjz_05;

public class Program19 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Podaj liczbe");
        int a = scanner.nextInt();
        if(a > - 15 && a <= -10 || a > -5 && a < 0 || a > 5 && a < 10) System.out.println("Podana liczba należy do zbioru A");
        if(a <= -13 || a > -8 && a <= -3) System.out.println("Podana liczba należy do zbioru B");
        if(a <= -4) System.out.println("Podana liczba należy do zbioru C");
    }
}

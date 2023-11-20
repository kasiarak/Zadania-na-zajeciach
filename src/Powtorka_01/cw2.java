package Powtorka_01;

public class cw2 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Wprowadź liczbę");
        int x = scanner.nextInt();
        if(x<2 || x>3 && x<=6) System.out.println("Należy do zbioru A");
        if(x>=1 && x<4) System.out.println("Należy do zbioru B");
        if(x>=0 && x<2 || x>5) System.out.println("Należy do zbioru C");

    }
}

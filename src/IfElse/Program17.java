package IfElse;

public class Program17 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Podaj a");
        int a = scanner.nextInt();
        System.out.println("Podaj b");
        int b = scanner.nextInt();
        System.out.println("Podaj c");
        int c = scanner.nextInt();
        double delta = b*b-4*a*c;
        double x1 = 0;
        double x2 = 0;
        if(delta > 0){
            x1=(-b-Math.sqrt(delta))/2*a;
            x2=(-b-Math.sqrt(delta))/2*a;
            System.out.println("x1: " + x1 + " x2: " + x2);
        } else if(delta == 0) {
            x1=-b/2*a;
            System.out.println("x0: " + x1);
        } else if(delta < 0) {
            System.out.println("Brak miejsc zerowych");
        }
    }
}

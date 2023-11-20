package Powtorka_01;

public class cw12 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Podaj a");
        int a = scanner.nextInt();
        System.out.println("Podaj b");
        int b = scanner.nextInt();
        int proby = 0;
        for(int i=(int)(Math.random()*100); i<=100; i=(int)(Math.random()*100)){
            proby++;
            if(i>=a && i<=b){
                System.out.println("Wylosowana liczba: " + i +", Liczba prób: " + proby);
                break;
            } else {
                System.out.println("Wylosowana liczba to " + i + " znajduje się poza przedziałem ["+a+";"+b+"]");
            }
        }
    }
}

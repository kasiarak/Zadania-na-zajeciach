package ppjz_10;

import java.util.Scanner;

public class odwrocenie {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Wprowadź liczbę");
        int liczba = scanner.nextInt();
        odwrocenie(liczba);
    }
    public static void odwrocenie(int liczba){
        int iloscCyfr = 1;
        int x = liczba;
        while(x/10 != 0){
            x = x/10;
            iloscCyfr++;
        }
        int[] cyfry = new int[iloscCyfr];
        int indeks = 0;
        for(int i = iloscCyfr; i > 0; i--){
            cyfry[indeks] = (int)(liczba/Math.pow(10,i-1));
            indeks++;
            liczba = (int)(liczba%Math.pow(10,i-1));
        }
        liczba = 0;
        for(int i = cyfry.length; i>0; i--){
            liczba = liczba+(int)(cyfry[i-1]*Math.pow(10,i-1));
        }
        System.out.println("Liczba po odwróceniu: " + liczba);
    }
}

package PPJ.Powtorka_01;

import java.util.Scanner;

public class cw3 {
    public static void main(String[] args) {
       java.util.Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj współrzędną X wierzchołka");
        int xw = scanner.nextInt();
        System.out.println("Podaj współrzędną Y wierzchołka");
        int yw = scanner.nextInt();
        System.out.println("Podaj szerokość");
        int szerokosc = scanner.nextInt();
        System.out.println("Podaj wysokosc");
        int wysokosc = scanner.nextInt();
        System.out.println("Podaj współrzędną X punktu");
        int xp = scanner.nextInt();
        System.out.println("Podaj współrzędną Y punktu");
        int yp = scanner.nextInt();
        if(xp<=xw && xp<=xw+szerokosc && yp<=yw && yp>=yw-szerokosc) System.out.println("Punkt należy do tego prostokąta");
        else System.out.println("Punkt nie należy do tego prostokąta");


    }
}

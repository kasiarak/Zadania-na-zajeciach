package Powtorka_01;

import java.util.Scanner;

public class cw6 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj współrzędną X lewego górnego wierzchołka prostokąta A");
        int xLGA = scanner.nextInt();
        System.out.println("Podaj współrzędną Y lewego górnego wierzchołka prostokąta A");
        int yLGA = scanner.nextInt();
        System.out.println("Podaj współrzędną X prawego dolnego wierzchołka prostokąta A");
        int xPDA = scanner.nextInt();
        System.out.println("Podaj współrzędną Y prawego dolnego wierzchołka prostokąta A");
        int yPDA = scanner.nextInt();
        System.out.println("Podaj współrzędną X lewego górnego wierzchołka prostokąta B");
        int xLGB = scanner.nextInt();
        System.out.println("Podaj współrzędną Y lewego górnego wierzchołka prostokąta B");
        int yLGB = scanner.nextInt();
        System.out.println("Podaj współrzędną X prawego dolnego wierzchołka prostokąta B");
        int xPDB = scanner.nextInt();
        System.out.println("Podaj współrzędną X prawego dolnego wierzchołka prostokąta B");
        int yPDB = scanner.nextInt();

        int x = xLGA<xLGB?xLGB:xLGA, y = yLGA<yLGB?yLGA:yLGB,
                a = xPDA<xPDB?xPDA:xPDB, b = yPDA<yPDB?yPDA:yPDB;

        int h = y-b,
                w = a-x;

        if (h >=0 && w >=0) {
            System.out.println("Obszar wspolny A, B: " + "("+x+","+y+"), " + "("+a+","+b+").");
            System.out.println("Pole = " + h*w + ".");
        } else
            System.out.println("A i B sa rozlaczne!");

    }
    }


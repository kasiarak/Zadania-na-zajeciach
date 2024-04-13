package GUI.zadanie_03_01;

public class MyColor extends java.awt.Color implements Comparable<MyColor>{
    int suma;
    public MyColor(int r, int g, int b) {
        super(r, g, b);
        this.suma = r+g+b;
    }
    public String toString(){
       return "(" + getRed() +", " + getGreen() + ", " + getBlue() +")";
    }

    @Override
    public int compareTo(MyColor o) {
        return this.suma - o.suma;
    }

    public int getSuma() {
        return suma;
    }
}

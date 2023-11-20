package SwtichPetle;

public class Main6 {
    public static void main(String[] args) {
        double e = 0;
        double suma = 0;
        for(double i = 0; i <= 10; i++) {
            e = (1.0d / (Math.pow(2.0d, i)));
            suma = suma + e;
        }
        System.out.println(suma);
    }
}

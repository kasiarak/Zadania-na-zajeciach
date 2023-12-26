package ppjz_07;

public class cw1 {
    public static void main(String[] args) {
        double tablica[] = new double[10];

        for(int i = 0; i<tablica.length; i++){
            tablica[i] = Math.random();
            System.out.println(tablica[i]);
        }
        for(int i = 0; i<tablica.length; i++){
            if(i%2==0) System.out.println(tablica[i]);
        }
        for(int i = 0; i<tablica.length; i++){
            if((int)i%2 != 0) System.out.println(tablica[i]);
        }
    }
}

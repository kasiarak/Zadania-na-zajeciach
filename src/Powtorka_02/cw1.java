package Powtorka_02;

public class cw1 {
    public static void main(String[] args) {
        int tablica[] = new int [10];
        for (int i = 0; i < tablica.length; i++){
            tablica[i] = (int)(Math.random()*50);
        }
        System.out.print("Tablica: [ ");
        for (int i = 0; i < tablica.length; i++){
            System.out.print(tablica[i] + " ");
        }
        System.out.println("]");
        System.out.println(elementNajblizszySredniej(tablica));
    }
    static int elementNajblizszySredniej(int[] tablica){
        int x = 0;
        int roznica = 50;
        int suma = 0;
        for (int i = 0; i < tablica.length; i++){
            suma = suma + tablica[i];
        }
        int srednia = suma/(tablica.length);
        for (int i = 0; i < tablica.length; i++){
            if(Math.abs(srednia-tablica[i])<roznica){
                roznica = srednia - tablica[i];
                x = tablica[i];
            }
        }
        return x;
    }
}

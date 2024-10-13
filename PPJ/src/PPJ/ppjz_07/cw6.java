package PPJ.ppjz_07;

public class cw6 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        System.out.print("Tablica arr1: [ ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 25);
            System.out.print(arr1[i] + " ");
        }
        System.out.print("]");
        System.out.print("\nTablica arr2: [ ");
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = (int) (Math.random() * 25);
            System.out.print(arr2[i] + " ");
        }
        System.out.print("]");
        System.out.print("\nNowa tablica: [ ");
        int[] nowatablica = new int[arr1.length + arr2.length];
        int rozmiar = 0;
        for (int i = 0; i < nowatablica.length; i++) {
            if (i > 9) {
                nowatablica[i] = arr2[rozmiar];
                rozmiar++;
            } else {
                nowatablica[i] = arr1[i];
            }
            System.out.print(nowatablica[i] + " ");
        }
        System.out.print("]");
        System.out.print("\nNowa tablica bez duplikatów: [ ");
        int indeks = 0;
        int rozmiar2 = nowatablica.length;
        int[] nowatablicabezduplikatow = new int[rozmiar2];
        for (int i = 0; i < nowatablica.length; i++) {
            boolean czywystepuje = false;
            for (int j = 0; j < nowatablicabezduplikatow.length; j++) {
                if (nowatablicabezduplikatow[j] == nowatablica[i]) {
                    czywystepuje = true;
                }
            }
            if (czywystepuje == true) rozmiar2--;
            if (czywystepuje == false) {
                nowatablicabezduplikatow[indeks] = nowatablica[i];
                System.out.print(nowatablicabezduplikatow[indeks] + " ");
                indeks++;
            }
        }
        System.out.print("]");
        int min = 25;
        int max = 0;
        for (int i = 0; i < nowatablica.length - 1; i++) {
            if (nowatablica[i] < min) min = nowatablica[i];
            if (nowatablica[i] > max) max = nowatablica[i];
        }
        System.out.println("\nNajwiększy element: "+ max + "\nNajmniejszy element: " + min);
    }
}

package PPJ.Powtorka_02;

public class cw7 {
    public static void main(String[] args) {
        int[] tab = {11, 21, 33, 78, 342};
        swap(tab, 1,3);
        for (int i = 0; i < tab.length; i++){
            System.out.println(tab[i]);
        }
    }
    public static void swap(int[] tab, int source, int destination){
        int x = tab[source];
        tab[source] = tab[destination];
        tab[destination] = x;
    }
}

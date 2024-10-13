package PPJ.ppjz_07;

public class cw5 {
    public static void main(String[] args) {
        int rozmiar = 10+(int)(Math.random()*6);
        System.out.println("Wylosowany rozmiar: " + rozmiar);
        int[] liczby = new int[rozmiar];
        for (int i = 0; i < liczby.length; i++){
            liczby[i] = i;
        }
        System.out.println("Tablica:");
        for (int i = 0; i < liczby.length; i++){
            System.out.print(liczby[i] + " ");
        }

        for (int i=liczby.length - 1; i > 0; i--){
            int index = (int)(Math.random()*(i+1));
            int x = liczby[i];
            liczby[i] = liczby[index];
            liczby[index] = x;
        }

        System.out.println();
        System.out.println("Po wymieszaniu elementów: ");
        for (int i = 0; i < liczby.length; i++){
            System.out.print(liczby[i] + "  ");
        }
        System.out.println();
        for (int i = 0; i < rozmiar; i++){
            for (int x = 0; x < liczby.length; x++){
                if(i==liczby[x]){
                    System.out.print("*  ");
                }else {
                    System.out.print(".  ");
                }
            }
            System.out.println();
        }


    }
}

package PPJ.ppjz_08;

public class cw1 {
    public static void main(String[] args) {
        int rozmiar1 = (int)(Math.random()*10);
        int[] tablica1 = new int[rozmiar1];
        int rozmiar2 = (int)(Math.random()*10);
        int[] tablica2 = new int[rozmiar2];
        int rozmiar3 = (int)(Math.random()*10);
        int[] tablica3 = new int[rozmiar3];
        int[] tablica123 = new int[rozmiar1+rozmiar2+rozmiar3+1];

        System.out.println("Tablica1: ");
        for(int i = 0; i < tablica1.length; i++){
            tablica1[i] = (int)(Math.random()*10);
            System.out.print(tablica1[i]);
        }
        System.out.println("\nTablica2: ");
        for(int i = 0; i < tablica2.length; i++){
            tablica2[i] = (int)(Math.random()*10);
            System.out.print(tablica2[i]);
        }
        System.out.println("\nTablica3: ");
        for(int i = 0; i < tablica3.length; i++){
            tablica3[i] = (int)(Math.random()*10);
            System.out.print(tablica3[i]);
        }
        System.out.println("\nTablica123: ");
        int x = 0;
        for(int i = 0; i < tablica1.length; i++){
            tablica123[x] = tablica1[i];
            x++;
            System.out.print(tablica123[i]);
        }
        for(int i = 0; i < tablica2.length; i++){
            x++;
            tablica123[x] = tablica2[i];
            System.out.print(tablica123[x]);
        }
        for(int i = 0; i < tablica3.length; i++){
            x++;
            tablica123[x] = tablica3[i];
            System.out.print(tablica123[x]);
        }

        System.out.println("\nTablica dwuwymiarowa: ");
        int tablicadwuwymiarowa[][] = new int[3][tablica123.length];
        int y = 0;
        for(int i = 0; i<tablica1.length; i++){
            tablicadwuwymiarowa[0][y] = tablica1[i];
            System.out.print(tablicadwuwymiarowa[0][y]);
            y++;
        }
        for(int i = 0; i<tablica2.length; i++){
            tablicadwuwymiarowa[1][y] = tablica2[i];
            System.out.print(tablicadwuwymiarowa[1][y]);
            y++;
        }
        for(int i = 0; i<tablica3.length; i++){
            tablicadwuwymiarowa[2][y] = tablica3[i];
            System.out.print(tablicadwuwymiarowa[2][y]);
            y++;
        }



    }
}

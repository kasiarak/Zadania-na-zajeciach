package PPJ.ppjz_07;
public class cw2 {
    public static void main(String[] args) {
        boolean tablica[] = new boolean[10];
        boolean tablicafalsetrue[] = {true,false};

        for(int i = 0; i<tablica.length; i++){
            tablica[i] = tablicafalsetrue[(int)(Math.random()*2)];
        }

        int rozmiartrue = 0;
        int rozmiarfalse = 0;

        for (int i = 0; i<tablica.length; i++){
            if(tablica[i] == true) rozmiartrue++;
            else rozmiarfalse++;
        }

        int index1 = 0;
        int index2 = 0;

        boolean tablicatrue[] = new boolean[rozmiartrue];
        boolean tablicafalse[] = new boolean[rozmiarfalse];

        for(int i = 0; i<tablicatrue.length; i++){
            tablicatrue[i] = true;
        }
        for(int i = 0; i<tablicafalse.length; i++){
            tablicafalse[i] = false;
        }

        for(int i = 0; i < tablicatrue.length; i++){
            System.out.println("Tablica z elementami true: " + tablicatrue[i]);
        }
        for(int i = 0; i < tablicafalse.length; i++){
            System.out.println("Tablica z elementami false: " + tablicafalse[i]);
        }
    }
}

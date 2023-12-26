package ppjz_08;

public class cw2 {
    public static void main(String[] args) {
        int tablicadwuwymiarowa[][] = new int[8][8];
        for(int i = 0; i < tablicadwuwymiarowa.length; i++){
            for(int j = 0; j < tablicadwuwymiarowa.length; j++){
                tablicadwuwymiarowa[i][j] = (int)(Math.random()*10);
            }
        }
        int suma1 = 0;
        for(int i = 0; i<tablicadwuwymiarowa.length; i++){
            suma1 = suma1 + tablicadwuwymiarowa[i][i];
        }
        System.out.println("Suma1: " + suma1);

        int suma2 = 0;
        for(int i = 0; i<tablicadwuwymiarowa.length; i++){
            int x = tablicadwuwymiarowa.length-1;
            suma2 = suma2 + tablicadwuwymiarowa[i][x];
            x--;
        }
        System.out.println("Suma2: " + suma2);
    }
}

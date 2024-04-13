package PPJ.ppjz_07;

public class cw3 {
    public static void main(String[] args) {
        int[] tab = {1,2,3,4,4,3,2,1};
        String odpoczatku = " ";
        String odkonca = " ";
        for(int i = 0; i < tab.length; i++){
            String element = String.valueOf(tab[i]);
            odpoczatku = odpoczatku + element;
        }
        for(int i = tab.length-1; i>=0; i--){
            String element = String.valueOf(tab[i]);
            odkonca = odkonca + element;
        }
        if(odpoczatku.equals(odkonca)) System.out.println("True");
        else System.out.println("false");
    }
}

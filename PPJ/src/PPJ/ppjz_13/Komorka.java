package PPJ.ppjz_13;

public class Komorka extends Telefon {
    String[] ostatniePolaczenia = new String[10];
    int indeks = 0;
    void zadzwon(String numer){
        System.out.println(numer);
        ostatniePolaczenia[indeks] = numer;
        indeks++;
    }
    void wyswietlHistoriePolaczen(){
        for(int i =0; i <ostatniePolaczenia.length; i++){
            System.out.println(ostatniePolaczenia[i]);
        }
    }
}

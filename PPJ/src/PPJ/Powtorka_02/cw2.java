package PPJ.Powtorka_02;

public class cw2 {
    public static void main(String[] args) {
        char tablica[] = {'A','L','A','M','A','K','O','T','A'};
        System.out.println(metoda("KOT", tablica));
    }
    static int metoda(String ciag, char[] tablica){
        int iloscZnakow = 0;
        for (int i = 0; i < ciag.length(); i++){
            for (int j = 0; j < tablica.length; j++){
                if(tablica[j]==ciag.charAt(i)) iloscZnakow++;
            }
        }
        return iloscZnakow;
    }
}

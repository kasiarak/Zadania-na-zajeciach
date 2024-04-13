package PPJ.ppjz_13;

public class Smartfon extends Komorka {
    int indeks = 0;
    Osoba tablicaKontaktow[] = new Osoba[20];
    void zadzwon(Osoba osoba){
        tablicaKontaktow[indeks] =  osoba;
        indeks++;
    }
    void wyswietlHistoriePolaczen(){
        for (int i = 0; i < tablicaKontaktow.length; i++){
            if(tablicaKontaktow[i]==null) break;
            System.out.println(tablicaKontaktow[i].imie+ " " + tablicaKontaktow[i].nazwisko + " " + tablicaKontaktow[i].numer);
        }
    }
}

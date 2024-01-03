package ppjz_12;

public class Osoba {
    String imie;
    int rokUrodzenia;
    Osoba[] tablica;
    public Osoba(String imie, int rokUrodzenia){
        this.imie = imie;
        this.rokUrodzenia = rokUrodzenia;
    }
    public Osoba(String imie){
        this.imie = imie;
        this.rokUrodzenia = 1990;
    }
    String zwrocImie(){
        return imie;
    }
    int zwrocWiek(){
        return 2024-rokUrodzenia;
    }
    static String zwrocStarszaOsobe(Osoba osoba1, Osoba osoba2){
        if(osoba1.zwrocWiek()>osoba2.zwrocWiek()) return osoba1.zwrocImie();
        else return osoba2.zwrocImie();
    }
    static String zwrocNajstarszaOsobe(Osoba[] tablica){
        int x = 0;
        int indeks = 0;
        for(int i = 0; i < tablica.length; i++){
            if(tablica[i].zwrocWiek()>x){
                x = tablica[i].zwrocWiek();
                indeks = i;
            }
        }
        return tablica[indeks].zwrocImie();
    }
    public static void main(String[] args) {

        Osoba[] tablica = new Osoba[3];
        Osoba osoba1 = new Osoba("Adam", 2000);
        tablica[0] = osoba1;

        Osoba osoba2 = new Osoba("Ania");
        tablica[1] = osoba2;

        Osoba osoba3 = new Osoba("Lena", 2020);
        tablica[2] = osoba3;

        System.out.println(zwrocStarszaOsobe(osoba1,osoba2));
        System.out.println(zwrocNajstarszaOsobe(tablica));


    }

}

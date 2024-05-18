package GUI.zadanie_01_01;

import static java.lang.Character.isUpperCase;

public abstract class Singer {
    String imie;
    int numer;
    static int x = 1;
    public Singer(String imie){
        this.imie = imie;
        this.numer = x++;
    }
    abstract String sing();
    public String toString(){
        return "("+numer+") " + imie + ": " + sing();
    }
    static String loudest(Singer sng[]){
        int najwiecejWielkichLiter = 0;
        int wielkieLitery = 0;
        int indeks = 0;
        for(int i = 0; i < sng.length; i++){
            for(int j = 0; j < sng[i].sing().length(); j++){
                if(isUpperCase(sng[i].sing().charAt(j))) wielkieLitery++;
            }
            if(wielkieLitery>najwiecejWielkichLiter){
                najwiecejWielkichLiter = wielkieLitery;
                indeks = i;
            }
            wielkieLitery = 0;
        }
        return sng[indeks].toString();
    }
}

package ppjz_12;

public class Spawacz extends Osoba2 {
    int stazpracy;
    public Spawacz(String imie, int stazpracy){
        super(imie);
        this.stazpracy = stazpracy;
    }
    public String Wyswietl(){
        return super.wyswietl() + " Staż pracy: " + this.stazpracy;
    }
}

package PPJ.ppjz_14;

public class DrzewoOwocowe extends DrzewoLisciaste {
    String nazwaOwoca;
    public DrzewoOwocowe(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int ksztaltLiscia, String nazwaOwoca){
        super(wiecznieZielone, wysokosc, przekrojDrzewa, ksztaltLiscia);
        this.nazwaOwoca = nazwaOwoca;
    }
    public String toString(){
        return wiecznieZielone + " " + wysokosc + " " + przekrojDrzewa + " " + ksztaltLiscia + " " + nazwaOwoca;
    }
}

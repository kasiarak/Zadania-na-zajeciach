package PPJ.ppjz_14;

public class DrzewoLisciaste extends Drzewo {
    int ksztaltLiscia;

    public DrzewoLisciaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int ksztaltLiscia) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        this.ksztaltLiscia = ksztaltLiscia;
    }
    public String toString(){
        return wiecznieZielone + " " + wysokosc + " " + przekrojDrzewa + " " + ksztaltLiscia;
    }

}

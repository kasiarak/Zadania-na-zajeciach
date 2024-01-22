package ppjz_13;

public class DrzewoIglaste extends Drzewo {
    int iloscIgiel;
    double dlugoscSzyszki;

    public DrzewoIglaste(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa, int IloscIgiel, double dlugoscSzyszki) {
        super(wiecznieZielone, wysokosc, przekrojDrzewa);
        this.iloscIgiel = iloscIgiel;
        this.dlugoscSzyszki = dlugoscSzyszki;
    }
    String string(){
        return wiecznieZielone + " " + wysokosc + " " + przekrojDrzewa + " " + iloscIgiel + " " + dlugoscSzyszki;
    }
}

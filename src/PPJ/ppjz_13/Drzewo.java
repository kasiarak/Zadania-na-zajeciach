package PPJ.ppjz_13;

public class Drzewo {
    boolean wiecznieZielone;
    int wysokosc;
    String przekrojDrzewa;
    public Drzewo(boolean wiecznieZielone, int wysokosc, String przekrojDrzewa){
        this.wiecznieZielone = wiecznieZielone;
        this.wysokosc = wysokosc;
        this.przekrojDrzewa = przekrojDrzewa;
    }
    public String toString(){
        return wiecznieZielone + " " + wysokosc + " " + przekrojDrzewa;
    }
}

package ppjz_14;

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
    void zerwijOwoc()throws DrzewoBezOwocoweException{
        if(!(this instanceof DrzewoOwocowe)) {
            throw new DrzewoBezOwocoweException();
        }
    }
    public static void main(String[] args) {
        Drzewo [] tablica = new Drzewo[6];
        DrzewoIglaste sosna = new DrzewoIglaste(true, 6,"2", 100, 3);
        DrzewoIglaste modrzew = new DrzewoIglaste(true,7,"1", 200, 4);
        DrzewoLisciaste dąb = new DrzewoLisciaste(false, 10, "3", 3);
        DrzewoLisciaste osika = new DrzewoLisciaste(false,8, "1", 2);
        DrzewoOwocowe morelowiec = new DrzewoOwocowe(false, 8, "2", 4, "morela");
        DrzewoOwocowe sliwa = new DrzewoOwocowe(false,3,"4",2, "sliwa");
        tablica[0] = sosna;
        tablica[1] = modrzew;
        tablica[2] = dąb;
        tablica[3] = osika;
        tablica[4] = morelowiec;
        tablica[5] = sliwa;
        for (int i = 0; i < tablica.length; i++){
            System.out.println(tablica[i].toString());
        }
        try {
            dąb.zerwijOwoc();
        }catch (DrzewoBezOwocoweException e){
            System.out.println("Drzewo nie jest drzewem owocowym");
        }
    }
}

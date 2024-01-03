package ppjz_12;

public class Dzem {
    String smak;
    double waga;
    public Dzem(String smak, double waga){
        this.smak = smak;
        this.waga = waga;
    }
    public Dzem(double waga){
        this.waga = waga;
        this.smak = "no name";
    }
    public Dzem(String smak){
        this.smak = smak;
        this.waga = 100.0;
    }

    public static void main(String[] args) {
        Dzem dzem1 = new Dzem("Truskawkowy",50.0);
        Dzem dzem2 = new Dzem(70.0);
        Dzem dzem3 = new Dzem("Truskawkowy");
    }
}

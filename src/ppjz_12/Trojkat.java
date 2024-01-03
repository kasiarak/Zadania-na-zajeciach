package ppjz_12;

public class Trojkat {
    private int a;
    Trojkat(int a){
        this.a = a;
    }
    public int getATrojkat() {
        return a;
    }
    public double PoleTrojkata(){
        return (Math.pow(a,2)*Math.sqrt(3))/4;
    }
}

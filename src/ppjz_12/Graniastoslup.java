package ppjz_12;

public class Graniastoslup extends Trojkat{
    private int h;
    Graniastoslup(int a, int h){
        super(a);
        this.h = h;
    }
    public double PoleGraniastoslupa(){
        return 2*PoleTrojkata()+3*getATrojkat()*h;
    }
    public double ObjetoscGraniastoslupa(){
        return PoleTrojkata()*h;
    }
}

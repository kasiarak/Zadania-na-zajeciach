package ppjz_12;

public class Ostroslup extends Trojkat{
    private int h;
    public Ostroslup(int a, int h){
        super(a);
        this.h = h;
    }
    public double PoleOstroslupa(){
        return PoleTrojkata()+3*getATrojkat()*(Math.sqrt(Math.pow(h,2)+Math.pow(1/3*(getATrojkat()*Math.sqrt(3)/2),2)));
    }
    public double ObjetoscOstroslupa(){
        return 1/3*h*PoleTrojkata();
    }
}

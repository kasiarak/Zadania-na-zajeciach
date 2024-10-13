package PPJ.ppjz_12;

public class Prostopadloscian extends Prostokąt {
    private int h;
    public Prostopadloscian(int a, int b, int h){
        super(a,b);
        this.h=h;
    }
    public int PoleProstopadloscianu(){
        return 2*PoleProstokata()+2*getBProstokat()*h+2*getAProstokat()*h;
    }
    public int ObjetoscProstopadloscianu(){
        return PoleProstokata()*h;
    }
}

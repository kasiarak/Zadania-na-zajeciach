package PPJ.ppjz_12;

public class Prostokąt {
    private int a;
    private int b;
    public int getAProstokat() {
        return a;
    }
    public int getBProstokat(){
        return b;
    }
    Prostokąt(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int PoleProstokata(){
        return a*b;
    }
}

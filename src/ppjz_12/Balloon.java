package ppjz_12;

public class Balloon {
    double wielkość;
    double iloscHelu = 0.005+Math.random()*0.004;
    public Balloon(double wielkość){
        this.wielkość = wielkość;
    }
    public int getLoad(){
        return (int)(wielkość*iloscHelu*100);
    }
    public static void main(String[] args) {
        Balloon balloon = new Balloon(12);
        System.out.println("Udźwig balonu: " + balloon.getLoad());
    }
}

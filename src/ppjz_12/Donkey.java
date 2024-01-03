package ppjz_12;

public class Donkey {
    private double mass;
    int size = 1;
    Balloon[] balloons = new Balloon[size];
    public Donkey(double mass){
        this.mass = mass;
    }
    public void addBalloon(Balloon balloon){
         balloons[--size] = balloon;
         size++;
    }
    boolean isFlying(){
        int load = 0;
        for(int i = 0; i < balloons.length; i++){
            load = load + balloons[i].getLoad();
        }
        if(load>mass) return true;
        else return false;
    }
    public static void main(String[] args) {
        Donkey donkey = new Donkey(5);
        Balloon balloon1 = new Balloon(6);
        Balloon balloon2 = new Balloon(8);
        donkey.addBalloon(balloon1);
        donkey.addBalloon(balloon2);
        System.out.println(donkey.isFlying());
        if(donkey.isFlying()==true) System.out.println("Ja latam!");
    }
}

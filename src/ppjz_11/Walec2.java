package ppjz_11;

public class Walec2 {
    private int promień;
    private int wysokość;
    public Walec2(int promień, int wysokość){
        this.promień = promień;
        this.wysokość = wysokość;
    }
    public void show(){
        System.out.println("Pole powierzchni podstawy: " + (int)(Math.pow(promień,2)*3.14));
        System.out.println("Objętość walca: " + (int)(Math.pow(promień,2)*3.14)*wysokość);
    }

    public static void main(String[] args) {
        Walec2 walec = new Walec2(2,2);
        walec.show();
    }
}

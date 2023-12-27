package ppjz_11;

public class Kwadrat2 {
    private int bok;
    public Kwadrat2(int bok){
        this.bok = bok;
    }
    public void show() {
        System.out.println("Pole powierzchni: " + bok * bok);
        System.out.println("Objętość sześcianu: " + bok*bok*bok);
    }

    public static void main(String[] args) {
        Kwadrat2 kwadrat = new Kwadrat2(5);
        kwadrat.show();
    }
}

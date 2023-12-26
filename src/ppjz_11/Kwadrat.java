package ppjz_11;

public class Kwadrat {
    private int bok;
    public Kwadrat(int bok){
        this.bok = bok;
    }
    public void show() {
        System.out.println("Pole powierzchni: " + bok * bok);
        System.out.println("Objętość sześcianu: " + bok*bok*bok);
    }

    public static void main(String[] args) {
        Kwadrat kwadrat = new Kwadrat(5);
        kwadrat.show();
    }
}

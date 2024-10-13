package PPJ.Powtorka_01;

public class cw4 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Podaj współrzędną X środka");
        int xs = scanner.nextInt();
        System.out.println("Podaj współrzędną Y środka");
        int ys = scanner.nextInt();
        System.out.println("Podaj promień");
        int r = scanner.nextInt();
        System.out.println("Podaj współrzędną X punktu");
        int x = scanner.nextInt();
        System.out.println("Podaj współrzędną Y punktu");
        int y = scanner.nextInt();
        if(Math.sqrt((y+ys)^2+(x+xs)^2)<=r) System.out.println("Punkt należy do koła");
        else System.out.println("Punkt nie należy do koła");
    }
}

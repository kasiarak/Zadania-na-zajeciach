package PPJ.Powtorka_01;

public class cw8 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Podaj n");
        int n = scanner.nextInt();
        int suma1 = 0;
        for(int i=1; i<=n; i++){
            int x = i*(i+1);
            suma1 = suma1+x;
        }
        System.out.println(suma1 + " = " + (n*(n+1)*(n+2))/3);
        int suma2 = 0;
        for (int i = 1; i<=n; i++){
            int x = ((int)Math.pow(-1,(i-1)))*(int)Math.pow(i,2);
            suma2 = suma2+x;
        }
        System.out.println(suma2 + " = " + ((-1)^(n-1)*n*(n+1))/2);

    }
}

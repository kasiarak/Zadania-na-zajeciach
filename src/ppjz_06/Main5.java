package ppjz_06;

public class Main5 {
    public static void main(String[] args) {
                java.util.Scanner scanner = new java.util.Scanner(System.in);
                System.out.println("Podaj liczbe");
                int a = scanner.nextInt();
                int i = 0;
                int suma = 0;
                while(scanner.hasNext()){
                    suma = suma + a;
                    a = scanner.nextInt();
                    i++;
                    if(a==0) break;
                }
                System.out.println("Liczba wpisań: " + i);
                System.out.println("Suma: " + suma );
        }
}

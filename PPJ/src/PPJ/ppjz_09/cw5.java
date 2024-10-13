package PPJ.ppjz_09;

public class cw5 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Wprowadź liczbę");
        int liczba = scanner.nextInt();
        splitToDigits(liczba);
    }
    public static void splitToDigits(int x){
        int ilosccyfr = 0;
        int y = x;
        while(y != 0){
            y = y/10;
            ilosccyfr++;
        }
        int cyfry [] = new int[ilosccyfr];
        int indeks = 0;
        for(int i = ilosccyfr; i > 0; i--){
            cyfry[indeks] = (int)(x/Math.pow(10,i-1));
            indeks++;
            x = (int)(x%Math.pow(10,i-1));
        }
        System.out.print("Tablica zawierająca cyfry tworzące liczbę: [ ");
        for(int i = 0; i < cyfry.length; i++){
            System.out.print(cyfry[i] + " ");
        }
        System.out.print("]");
    }
}

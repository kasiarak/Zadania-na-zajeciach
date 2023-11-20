package Powtorka_01;

public class cw9 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Podaj liczbę naturalną dodatnią");
        int x = scanner.nextInt();
        int ileCyfr = 0;
        int tmp = x;
        while (tmp != 0){
            tmp=tmp/10;
            ileCyfr=ileCyfr+1;
        }
        int sumaPoteg = 0;
        tmp = x;
        while (tmp != 0){
            int cyfra = tmp%10;
            tmp = (tmp-cyfra)/10;
            int potega = 1;
            int licznik = 0;
            while (licznik<ileCyfr){
                potega = potega*cyfra;
                licznik = licznik + 1;
            }
            sumaPoteg = sumaPoteg + potega;
        }
        if(sumaPoteg==x){
            System.out.println("Jest liczbą Armstronga");
        }else{
            System.out.println("Nie jest liczbą Armstronga");
        }


    }
}

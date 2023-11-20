package Powtorka_01_Analiza;

public class IX {
    public static void main(String[] args) {
        boolean wykonuj = true;
        int res = 15, i = 10;
        do{
            i--;
            if(i==6)
                wykonuj = false;
            res = 2;
        }while(wykonuj);
        System.out.println(res);
    }
}

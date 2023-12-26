package ppjz_10;

public class cw3 {
    public static void main(String[] args) {
        int NWD = gcdI(36,24);
        System.out.println(NWD);

    }
    public static int gcdI(int a, int b){
        while(b!=0){
            int x = a%b;
            a=b;
            b=x;
        }
        return a;
    }
}

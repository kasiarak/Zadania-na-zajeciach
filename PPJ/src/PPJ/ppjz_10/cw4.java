package PPJ.ppjz_10;

public class cw4 {
    public static void main(String[] args) {
        int NWD;
        NWD = gcdR(64, 24);
        System.out.println(NWD);
    }

    public static int gcdR(int a, int b) {
        if(b==0) return a;
        else return gcdR(b,a%b);
    }
}

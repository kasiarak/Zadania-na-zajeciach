package ppjz_09;

public class cw4 {
    public static void main(String[] args) {
        findMax(1,2,3);
    }
    public static void findMax(int a, int b, int c){
        if(a>b && a>c) System.out.println(a);
        if(b>a && b>c) System.out.println(c);
        else System.out.println(c);
    }
}

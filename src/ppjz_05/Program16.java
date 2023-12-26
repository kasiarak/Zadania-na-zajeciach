package ppjz_05;

public class Program16 {
        public static void main(String[] args){
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            System.out.println("Podaj znak");
            char z = scanner.next().charAt(0);
            if(z >= '0' && z <= '9'){
                System.out.println(z);
            }else if (z >= 'a' && z <= 'f'){
                if(z == 'a') System.out.println(10);
                if(z == 'b') System.out.println(11);
                if(z == 'c') System.out.println(12);
                if(z == 'd') System.out.println(13);
                if(z == 'e') System.out.println(14);
                if(z == 'f') System.out.println(15);
            }else if(z >= 'A' && z <= 'F'){
                if(z == 'A') System.out.println(10);
                if(z == 'B') System.out.println(11);
                if(z == 'C') System.out.println(12);
                if(z == 'D') System.out.println(13);
                if(z == 'E') System.out.println(14);
                if(z == 'F') System.out.println(15);
            }else{
                System.out.println(-1);
            }
        }
}

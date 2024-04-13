package PPJ.ppjz_06;

public class Main2 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Wprowadź miesiąc");
        int a = scanner.nextInt();
        System.out.println("Wprowadź rok");
        int b = scanner.nextInt();
        if(a == 2){
            if(b%4==0 && b%100!=0){
                System.out.println("Liczba dni: 29");
            }else{
                System.out.println("Liczba dni: 28");
            }
        }else{
            switch (a){
                case 1, 3, 5, 7, 8, 10, 12 -> {
                    System.out.println("Liczba dni: " + 31);
                    break;
                }
                case 4, 6, 9, 11 -> {
                    System.out.println("Liczba dni: " +30);
                    break;
                }
            }
        }


    }
}

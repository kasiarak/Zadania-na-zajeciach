package ppjz_06;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Wprowadź znak");
        char ch = scanner.next().charAt(0);
        switch (ch){
            case 'a', 'i', 'y', 'u', 'e', 'o' -> {
                System.out.println("Jest samogłoska");
                break;
            }
            case 'A', 'I', 'Y', 'U', 'E', 'O' -> {
                System.out.println("Jest samogłoska");
                break;
            }
            default -> System.out.println("Jest spolgloska");
        }
    }
}
public class Program14 {
	public static void main(String [] args){
	java.util.Scanner scanner = new java.util.Scanner(System.in);
	System.out.println("Wprowadz pierwsza liczbe calkowita");
	int num = scanner.nextInt();
	System.out.println("Wprowadz druga liczbe calkowita");
	int num2 = scanner.nextInt();
	int a = num2 % num;
	if(a == 0) System.out.println("Druga wartosc stanowi calkowita wielokrotnosc pierwszej");
	else System.out.println("Druga wartosc nie stanowi calkowitej wielokrotnosci pierwszej");
	}
}
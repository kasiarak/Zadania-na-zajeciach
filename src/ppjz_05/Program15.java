public class Program15{
	public static void main(String [] args){
	java.util.Scanner scanner = new java.util.Scanner(System.in);
	System.out.println("Wprowadz pierwszy kat");
	int num = scanner.nextInt();
	System.out.println("Wprowadz drugi kat");
	int num2 = scanner.nextInt();
	System.out.println("Wprowadz trzeci kat");
	int num3 = scanner.nextInt();
	if(num+num2+num3 > 180 && num+num2+num3 < 180){
	System.out.println("Taki trojkat nie moze istniec");
	}else{
	if(num > num2 && num > num3){
		if(num*num > (num2*num2) + (num3*num3)) System.out.println("Trojkat jest ostrokatny");
	}else if (num2 > num && num2 > num3){
		if(num2*num2 > num3*num3 + num*num) System.out.println("Trojkat jest ostrokatny");
	}else if(num3 > num && num3 > num2){
		if(num3*num3 > num2*num2 + num*num) System.out.println("Trojkat jest ostrokatny");
	}else{
		System.out.println("Trojkat nie jest ostrokatny");
	}		
	}
	}
}
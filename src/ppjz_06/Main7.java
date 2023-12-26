package ppjz_06;

public class Main7 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Podaj dzień");
        int dzien = scanner.nextInt();
        System.out.println("Podaj miesiąc");
        int miesiac = scanner.nextInt();

        if (miesiac > 12 || dzien > 31) System.out.println("Wpisz ponownie");
        else {
            int iloscDni = (miesiac - 1) * 31 + dzien;

            switch (miesiac) {
                case 3, 4:
                    iloscDni = iloscDni - 3;
                    break;
                case 5, 6:
                    iloscDni = iloscDni - 4;
                    break;
                case 7, 8, 9:
                    iloscDni = iloscDni - 5;
                    break;
                case 10, 11:
                    iloscDni = iloscDni - 6;
                    break;
                case 12:
                    iloscDni = iloscDni - 7;
                    break;
            }

            System.out.println("Od rozpoczęcia roku minęło " + iloscDni + " dni");
        }
    }
}

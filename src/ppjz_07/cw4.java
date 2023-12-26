package ppjz_07;

public class cw4 {
    public static void main(String[] args) {
        char[] tablica = new char[5];
        for (int i = 0; i < tablica.length; i++) {
            ;
            tablica[i] = (char) ('a' + Math.random() * ('z' - 'a' + 1));
            System.out.println(tablica[i]);
        }

        System.out.println("Podaj zmienną char");
        java.util.Scanner in = new java.util.Scanner(System.in);

        while(in.hasNext()){
            char c = in.next().charAt(0);
            for (int x = 0; x < tablica.length; x++) {
                if (tablica[x] == c) {
                    tablica[x] = '0';
                }
            }
            System.out.println(tablica[0] + " " +tablica[1] + " " + tablica[2] + " " + tablica[3] + " " + tablica[4]);
            if(tablica[0]=='0' && tablica[1]=='0' && tablica[2]=='0' && tablica[3]=='0' && tablica[4]=='0') break;
        }


    }
}

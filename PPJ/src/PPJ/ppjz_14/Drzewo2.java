package PPJ.ppjz_14;

public class Drzewo2 {
    static Owoc[] tablica = new Owoc[100];
    static void zerwijOwoc(int indeks){
        int i = (int)(1+Math.random()*3);
        if(i == 1){
            Jabłko jabłko = new Jabłko();
            tablica[indeks] = jabłko;
        }else if(i == 2){
            Pomarancza pomarancza = new Pomarancza();
            tablica[indeks] = pomarancza;
        }else{
            Gruszka gruszka = new Gruszka();
            tablica[indeks] = gruszka;
        }
    }

    public static void main(String[] args) {
        double waga = 0;
        int indeks = 0;
        while (waga<5000){
            zerwijOwoc(indeks);
            waga = waga + tablica[indeks].masa;
            indeks++;
        }
        for (int i = 0; i < tablica.length; i++){
            if(tablica[i]==null) break;
            System.out.println(tablica[i].nazwa);
        }
    }
}

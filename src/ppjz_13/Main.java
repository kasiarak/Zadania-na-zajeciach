package ppjz_13;

public class Main {
    public static void main(String[] args) {
        Telefon telefon = new Telefon();
        Komorka komorka = new Komorka();
        Smartfon smartfon = new Smartfon();
        Telefon tablica[] = new Telefon[3];
        tablica[0] = telefon;
        tablica[1] = komorka;
        tablica[2] = smartfon;

        Osoba osoba = new Osoba("Imie", "Nazwisko", "333444555");
        telefon.zadzwon("343434343");
        telefon.zadzwon("348343394");
        telefon.zadzwon("943943333");
        telefon.zadzwon("345129584");
        telefon.zadzwon("283930293");
        telefon.zadzwon("123456789");
        komorka.zadzwon("4342343434");
        komorka.zadzwon("987654321");
        komorka.zadzwon("4342343434");
        komorka.zadzwon("987654321");
        komorka.zadzwon("4342343434");
        komorka.zadzwon("987654321");
        komorka.zadzwon("4342343434");
        komorka.zadzwon("987654321");
        smartfon.zadzwon("123456789");
        smartfon.zadzwon(osoba);
        smartfon.zadzwon("293832099");
        smartfon.zadzwon("123456789");
        smartfon.zadzwon(osoba);
        smartfon.zadzwon("293832099");
        smartfon.zadzwon("123456789");
        smartfon.zadzwon(osoba);
        smartfon.zadzwon("293832099");
        smartfon.zadzwon(osoba);
        telefon.wyswietlHistoriePolaczen();
        komorka.wyswietlHistoriePolaczen();
        smartfon.wyswietlHistoriePolaczen();



    }
}

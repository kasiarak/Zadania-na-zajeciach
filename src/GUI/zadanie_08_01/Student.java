package GUI.zadanie_08_01;

import static java.lang.Integer.parseInt;

public class Student {
    String imie;
    String grupa;
    String wynik;
    public Student(String name, String grupa, String wynik) {
        this.imie = name;
        this.grupa = grupa;
        this.wynik = wynik;
    }

    @Override
    public String toString() {
        return imie+" ("+grupa+") - "+wynik;
    }
}

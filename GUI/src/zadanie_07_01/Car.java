package GUI.zadanie_07_01;

public class Car {
    String marka;
    String cena;
    public Car(String marka, String cena){
        this.marka = marka;
        this.cena = cena;
    }

    @Override
    public String toString() {
        return marka + " " + cena;
    }
}

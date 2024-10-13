package GUI.zadanie_07_02;

public class Purchase {
    private String name;
    private String price;

    public Purchase(String name, String price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " " + price;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }
}

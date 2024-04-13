package GUI.zadanie_02_02;

public abstract class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    String getName(String name){
        return name;
    }
    double getPrice(double price){
        return price;
    }
}

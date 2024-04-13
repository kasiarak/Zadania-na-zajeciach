package PPJ.ppjz_11;

public class Fruit {
    String name;
    double weight;
    public Fruit(String name, double weight){
        this.name = name;
        this.weight = weight;
    }
    public void show(){
        System.out.println("Name: " + name);
        System.out.println("Weight: " + weight);
    }

    public static void main(String[] args) {
        Fruit fruit = new Fruit("Jabłko", 0.5+Math.random()*0.3);
        fruit.show();
    }
}

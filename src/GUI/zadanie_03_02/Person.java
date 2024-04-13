package GUI.zadanie_03_02;

import static java.util.Arrays.sort;

public class Person implements Comparable<Person>{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public int compareTo(Person person){
       return age - person.age;
    }
    public static void main(String[] args) {
        Person p1 = new Person("Piotr", 51);
        Person p2 = new Person("Ania", 17);
        Person p3 = new Person("Jacek", 67);
        Person p4 = new Person("Julia", 37);
        Person p5 = new Person("Dariusz", 25);
        Person[] array = {p1,p2,p3,p4,p5};
        sort(array);
        for(int i = 0; i < array.length; i++){
           System.out.println(array[i]);
        }
    }
}

package GUI.zadanie_06_02;

import java.util.Collection;
import java.util.Collections;

public class Person implements Comparable<Person>{
    String name;
    int birthYear;

    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    @Override
    public int compareTo(Person o) {
        System.out.println(this.name + " " + o.name);
        return this.name.compareTo(o.name);
    }
    public static boolean isInColl(
            Collection<Person> coll, String name, int year){
        return coll.contains(new Person(name, year));
    }
}

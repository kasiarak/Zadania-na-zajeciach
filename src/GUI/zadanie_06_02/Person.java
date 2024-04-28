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
        return this.name.compareTo(o.name);
    }
    public static boolean isInColl(
            Collection<Person> coll, String name, int year){
        boolean x = false;
        for(Person person : coll){
            if(person.name.equals(name) && person.birthYear == year) x = true;
        }
        return x;
    }
}

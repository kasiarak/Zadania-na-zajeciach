package ppjz_11;

public class Person {
    public String name;
    public String surname;
    public int birthday;

    public Person(String name, String surname, int birthday) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }

    public static void main(String[] args) {
        Person person = new Person("Katarzyna", "Rak", 2005);
    }
}

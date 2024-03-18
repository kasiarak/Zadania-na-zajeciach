package zadanie_02_01;

public class Initials implements TwoStringsOper{
    @Override
    public String apply(String string1, String string2) {
        return String.valueOf(string1.charAt(0))+ String.valueOf(string2.charAt(0));
    }
}

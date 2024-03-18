package zadanie_02_01;

public class Separ implements TwoStringsOper{
    String separator;
    @Override
    public String apply(String string1, String string2) {
        return string1 + separator + string2;
    }
    public Separ(String separator){
        this.separator = separator;
    }
}

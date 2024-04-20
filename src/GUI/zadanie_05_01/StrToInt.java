package GUI.zadanie_05_01;

public class StrToInt implements Transform<String, Integer>{
    @Override
    public Integer apply(String s) {
        return s.length();
    }
}

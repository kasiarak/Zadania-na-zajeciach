package zad2;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class XList<T> extends ArrayList<T> {
    public XList(T... elements) {
        super(Arrays.asList(elements));
    }

    public XList(Collection<T> elements) {
        super(elements);
    }

    public static <T> XList<T> of(T... elements) {
        return new XList<>(elements);
    }

    public static <T> XList<T> of(Collection<T> elements) {
        return new XList<>(elements);
    }

    public static XList<String> charsOf(String word) {
        XList<String> list = new XList<>();
        for (int i = 0; i < word.length(); i++) {
            list.add(String.valueOf(word.charAt(i)));
        }
        return list;
    }

    public static XList<String> tokensOf(String words, String sep) {
        return new XList<>(Arrays.asList(words.split(sep)));
    }

    public static XList<String> tokensOf(String words) {
        return new XList<>(Arrays.asList(words.split(" ")));
    }

    public XList<T> union(Collection<T> elements) {
        XList<T> list = new XList<>(this);
        list.addAll(elements);
        return list;
    }

    public XList<T> union(T... elements) {
        XList<T> list = new XList<>(this);
        list.addAll(Arrays.asList(elements));
        return list;
    }

    public XList<T> diff(Collection<T> elements) {
        XList<T> list = new XList<>(this);
        list.removeAll(elements);
        return list;
    }

    public XList<T> unique() {
        LinkedHashSet<T> set = new LinkedHashSet<>(this);
        return new XList<>(set);
    }

    private <U> XList<XList<U>> combine(List<XList<U>> list){
        if(list.size() == 0){
            XList<XList<U>> result = new XList<>();
            result.add(new XList<U>());
            return result;
        }
        XList<XList<U>> result = new XList<>();
        for(U element : list.get(list.size() - 1)){
            XList<XList<U>> temp = combine(list.subList(0, list.size() - 1));
            for(XList<U> el : temp){
                el.add(element);
            }
            result.addAll(temp);
        }
        return result;
    }

    public <U> XList<XList<U>> combine(){
        XList<XList<U>> list = new XList<>();
        for(List<U> t : (List<List<U>>) this){
            list.add(XList.of(t));
        }
        return this.combine(list);
    }

    public <U> XList<U> collect(Function<T, U> function){
        XList<U> list = new XList<>();
        for(T t : this){
            list.add(function.apply(t));
        }
        return list;
    }

    public String join(String sep){
        String word = "";
        for(T t : this){
            word += t.toString();
            if(t != this.get(this.size()-1)) word += sep;
        }
        return word.toString();
    }

    public String join(){
        String word = "";
        for(T t : this){
            word += t.toString();
        }
        return word.toString();
    }

    public void forEachWithIndex(BiConsumer<T, Integer> f){
        for(int i = 0; i < this.size(); i++){
            f.accept(this.get(i), i);
        }
    }
}
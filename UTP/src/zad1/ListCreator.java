package zad1;

import java.util.ArrayList;
import java.util.List;

public class ListCreator<T> {
    private List<T> list;

    private ListCreator(List<T> list) {
        this.list = list;
    }

    public static <T> ListCreator<T> collectFrom(List<T> src) {
        return new ListCreator<>(src);
    }

    public ListCreator<T> when(Selector<T> selector) {
        List<T> filteredList = new ArrayList<>();
        for (T element : list) {
            if (selector.select(element)) {
                filteredList.add(element);
            }
        }
        this.list = filteredList;
        return this;
    }

    public <R> List<R> mapEvery(Mapper<T, R> mapper) {
        List<R> mappedList = new ArrayList<>();
        for (T item : list) {
            mappedList.add(mapper.map(item));
        }
        return mappedList;
    }
}

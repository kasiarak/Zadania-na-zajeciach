package zad1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ProgLang {
    private final Map<String, List<String>> langsMap
;

    public ProgLang(String filePath) {
        langsMap = new LinkedHashMap<>();
        try {
            Files.readAllLines(Paths.get(filePath)).forEach(s -> {
                String[] split = s.split("\t");
                langsMap.put(split[0],
                        new ArrayList<>(
                                Arrays.stream(Arrays.copyOfRange(split, 1, split.length))
                                        .collect(Collectors.toCollection(LinkedHashSet::new))
                        ));
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Map<String, List<String>> getLangsMap() {
        return langsMap;
    }

    public Map<String, List<String>> getProgsMap() {
        Map<String, List<String>> progsMap = new LinkedHashMap<>();
        langsMap.forEach((k, v) -> v.forEach(s -> {
            if (progsMap.containsKey(s)) {
                if (!progsMap.get(s).contains(k)) {
                    progsMap.get(s).add(k);
                }
            } else {
                progsMap.put(s, new ArrayList<>(Collections.singletonList(k)));
            }
        }));

        return progsMap;
    }

    public Map<String, List<String>> getLangsMapSortedByNumOfProgs() {
        return this.sorted(
                this.langsMap,
                Map.Entry.comparingByValue(
                        Collections.reverseOrder(Comparator.comparingInt(List::size))
                ));
    }

    public Map<String, List<String>> getProgsMapSortedByNumOfLangs() {
        return this.sorted(
                this.getProgsMap(),
                Map.Entry.<String, List<String>>comparingByValue(
                        Collections.reverseOrder(
                                Comparator.comparingInt(List::size)
                        )
                ).thenComparing(Map.Entry.comparingByKey()));
    }

    public <T, U> Map<T, U> sorted(Map<T, U> map, Comparator<Map.Entry<T, U>> fn) {
        return map
                .entrySet()
                .stream()
                .sorted(fn)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new
                ));
    }
    
    public <T, U> Map<T, U> filtered(Map<T, U> map, Predicate<Map.Entry<T, U>> fn) {
        return map
                .entrySet()
                .stream()
                .filter(fn)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue,
                        LinkedHashMap::new
                ));
    }

    public Map<String, List<String>> getProgsMapForNumOfLangsGreaterThan(int n) {
        return this.filtered(this.getProgsMap(), x -> x.getValue().size() > n);
    }
}

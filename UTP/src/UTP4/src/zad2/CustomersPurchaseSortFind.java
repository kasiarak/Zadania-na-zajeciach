package zad2;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CustomersPurchaseSortFind {
    List<Purchase> purchases;

    public CustomersPurchaseSortFind() {
        purchases = new ArrayList<>();
    }

    public void readFile(String path) {
        try {
            Files.lines(Paths.get(path))
                    .map(line -> line.split(";"))
                    .filter(parts -> parts.length == 5)
                    .forEach(parts -> {
                        String id = parts[0];
                        String name = parts[1];
                        String product = parts[2];
                        double price = Double.parseDouble(parts[3]);
                        double quantity = Double.parseDouble(parts[4]);
                        purchases.add(new Purchase(id, name, product, price, quantity));
                    });
        } catch (IOException e) {
            System.out.println("Błąd przy wczytywaniu pliku: " + e.getMessage());
        }
    }

    public void showSortedBy(String sortBy) {
        if ("Nazwiska".equals(sortBy)) {
            System.out.println("Nazwiska");
            purchases.stream()
                    .sorted(Comparator.comparing(Purchase::getName)
                            .thenComparing(Purchase::getId))
                    .forEach(p -> System.out.println(p));
        } else if ("Koszty".equals(sortBy)) {
            System.out.println("Koszty");
            purchases.stream()
                    .sorted(Comparator.comparing(Purchase::getTotalCost).reversed()
                            .thenComparing(Purchase::getId))
                    .forEach(p -> System.out.println(p + " (koszt: " + p.getTotalCost() + ")"));
        }
        System.out.println();
    }

    public void showPurchaseFor(String customerId) {
        System.out.println("Klient " + customerId);
        purchases.stream()
                .filter(p -> p.getId().equals(customerId))
                .forEach(System.out::println);
    }
}

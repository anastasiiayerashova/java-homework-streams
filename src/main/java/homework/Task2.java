package homework;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static List<String> toUpperCaseSortedDesc(List<String> strings) {
        return strings.stream()
                .map(s -> s.toUpperCase())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> names = List.of("Anna", "Ivan", "Olga", "Peter", "Maria", "Taras");
        System.out.println(toUpperCaseSortedDesc(names));
    }
}

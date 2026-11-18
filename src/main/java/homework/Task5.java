package homework;

import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task5 {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> it1 = first.iterator();
        Iterator<T> it2 = second.iterator();

        return Stream.generate(() -> 0)
                .takeWhile(i -> it1.hasNext() && it2.hasNext())
                .flatMap(i -> Stream.of(it1.next(), it2.next()));
    }

    public static void main(String[] args) {
        System.out.println(zip(Stream.of("1", "2", "3"), Stream.of("a", "b"))
                .collect(Collectors.toList()));

        System.out.println(zip(Stream.of("A", "B", "C", "D"), Stream.of("x", "y", "z", "w"))
                .collect(Collectors.toList()));

        System.out.println(zip(Stream.iterate(1, x -> x + 1), Stream.iterate(-1, x -> x - 1))
                .limit(6)
                .collect(Collectors.toList()));
    }
}

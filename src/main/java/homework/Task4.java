package homework;

import java.util.stream.Stream;

public class Task4 {
    public static Stream<Long> randomStream(long seed, long a, long c, long m) {
        return Stream.iterate(seed, x -> Math.floorMod(a * x + c, m));
    }

    public static void main(String[] args) {
        long a = 25214903917L;
        long c = 11;
        long m = 1L << 48;
        long seed = 42;

        randomStream(seed, a, c, m)
                .limit(10)
                .forEach(x -> System.out.println(x));
    }
}

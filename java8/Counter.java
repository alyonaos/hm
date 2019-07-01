package java8;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Counter {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("Alex", "Peter", "Don", "Jacob", "Felix", "Felix", "Paul", "Alex");
        System.out.println(countNames(names));

    }

    static Map<String, Integer> countNames(Stream<String> names) {
        return names
                .collect(Collectors.toMap(s -> s, s -> 1, (a, b) -> a + 1));
    }
}

package java8;

import java.util.*;
import java.util.stream.Stream;

public class Java8 {
    public static void main(String[] args) {
        List<String> text = new ArrayList<>(Arrays.asList(" The popularity of tea in the United Kingdom has a long history, reflecting the nation's development since the seventeenth century.\n" +
                " It was in 1657 that Thomas Garway, the owner of a coffee house, sold the first tea in London. The drink soon became popular as an alternative to coffee, and by the year 1700, there were over 500 coffee houses in the British capital selling the new drink."));
        System.out.println(findMaxLongWord(text.stream()));
    }

    static Optional<String> findMaxLongWord(Stream<String> words){
        return words
                .flatMap(word -> Arrays.asList(word.split("\\s+")).stream())
                .max(Comparator.comparing(word -> word.length()));
    }
}

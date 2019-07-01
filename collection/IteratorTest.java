package collection;

import genericsCollection.Pair;

import static java.util.Arrays.asList;

public class IteratorTest {
    public static void main(String[] args) {

        for(Integer max : new PairMaxIterable(asList(new Pair(6,2), new Pair(3,2), new Pair(1,5)))) {
            System.out.print(max + " ");
        }

        System.out.println();

        for(Integer max : IteratorUtils.maxPairs(1,2,3,4,5,6,-5)) {
            System.out.print(max + " ");
        }
    }
}

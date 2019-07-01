package collection;

import genericsCollection.Pair;

import java.util.Iterator;
import java.util.List;

public class PairMaxIterable implements Iterable<Integer> {
    private List<Pair<Integer>> list;

    public PairMaxIterable(List<Pair<Integer>> list) {
        this.list = list;
    }

    public PairMaxIterable() {

    }

    @Override
    public Iterator<Integer> iterator() {
        return new PairMaxIterator(list);
    }
}

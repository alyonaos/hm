package collection;

import genericsCollection.Pair;

import java.util.Iterator;
import java.util.List;

public class PairMaxIterator<E extends Comparable<E>> implements Iterator<E> {
    private List<Pair<E>> list;
    private int i = 0;

    public PairMaxIterator(List<Pair<E>> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return i < list.size();
    }

    @Override
    public E next() {
        return (E) list.get(i++).max(2);
    }
}

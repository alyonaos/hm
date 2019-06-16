
/**
 *
 *
 *
 *
 *
 *
 *
 * */

package genericsCollection;

import java.util.List;

public class Pair<E> {
    private Integer E;
    E e1;
    E e2;

    public Pair(E e1, E e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    public E getE1() {
        return e1;
    }

    public void setE1(E e1) {
        this.e1 = e1;
    }

    public E getE2() {
        return e2;
    }

    public void setE2(E e2) {
        this.e2 = e2;
    }

    public Integer min(Integer Integer) {
        return min(E);
    }

    public Integer max(Integer Integer) {
        return max(E);
    }
    Integer iterable (List<Pair<Integer>> pairList) {
        return max(E);
    }
}

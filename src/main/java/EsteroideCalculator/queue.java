package EsteroideCalculator;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class queue {
    public static Queue<Double> sum(Double queue1, Double queue2) {
        Queue<Double> queue;
        queue = new Queue<Double>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Double> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Double aDouble) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Double> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public boolean equals(Object o) {
                return false;
            }

            @Override
            public int hashCode() {
                return 0;
            }

            @Override
            public boolean offer(Double aDouble) {
                return false;
            }

            @Override
            public Double remove() {
                return null;
            }

            @Override
            public Double poll() {
                return null;
            }

            @Override
            public Double element() {
                return null;
            }

            @Override
            public Double peek() {
                return null;
            }
        };
        queue.offer(queue1);
        queue.offer(queue2);
        System.out.println(queue1);
        return queue;
    }
}

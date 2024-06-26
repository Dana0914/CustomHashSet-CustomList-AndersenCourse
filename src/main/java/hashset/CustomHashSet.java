package hashset;


@SuppressWarnings("unchecked")
public class CustomHashSet<T> implements ISet<T> {
    private T[] buckets;
    private int size;

    public CustomHashSet() {
        buckets = (T[]) new Object[10];
        size = 0;
    }
    @Override
    public boolean add(T element) {
        if (size == buckets.length) {
            resize();
        }
        if (contains(element)) {
            return false;
        }
        buckets[size++] = element;
        return true;
    }

    @Override
    public boolean contains(T element) {
        for (int i = 0; i < size; i++) {
            if (buckets[i].equals(element)) {
                return true;
            }

        }
        return false;
    }

    @Override
    public boolean remove(T element) {
        for (int i = 0; i < size; i++) {
            if (buckets[i].equals(element)) {
                buckets[i] = buckets[i+1];
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    private void resize() {
        int newSize = (int) ((size * 1.5) + 1);
        T[] newBuckets = (T[]) new Object[newSize];
        if (size >= 0) System.arraycopy(buckets, 0, newBuckets, 0, size);
        buckets = newBuckets;
    }

}


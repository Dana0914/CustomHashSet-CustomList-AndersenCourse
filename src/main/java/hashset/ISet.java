package hashset;

public interface ISet<T> {
    boolean add(T element);
    boolean contains(T element);
    boolean remove(T element);
    int size();

}

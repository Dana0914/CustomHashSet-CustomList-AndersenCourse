package andersen.lesson.hashset;

public interface ISet<T> {
    boolean add(T element);
    boolean contains(T element);
    void remove(T element);
    int size();

}

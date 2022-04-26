package design_pattern;

public interface Box<T> {
    boolean add(T element);
    T remove(int index);
    int size();
    T get(int index);
}

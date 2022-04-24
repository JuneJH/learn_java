package box;

public interface Box<T> {

    public boolean add(T element);
    public T get(int index);
    public T remove(int index);
    public int size();

}

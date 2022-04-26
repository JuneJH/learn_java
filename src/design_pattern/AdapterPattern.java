package design_pattern;

public abstract class AdapterPattern<T> implements Box<T>{

    @Override
    public boolean add(T element) {
        return false;
    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public T get(int index) {
        return null;
    }
}

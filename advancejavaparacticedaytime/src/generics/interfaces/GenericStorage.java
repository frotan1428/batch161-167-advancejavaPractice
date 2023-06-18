package generics.interfaces;

public class GenericStorage<T> implements Storage<T>{


    private T storeItem;

    @Override
    public void store(T item) {
        storeItem=item;
    }

    @Override
    public T retrieve() {
        return storeItem;
    }
}

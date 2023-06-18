package genereics.genericInterfaces;
//if we implement generic interface Class should be also generic
public class GenericClassImpl01<T> implements GenericInterface <T>{
    @Override
    public void setValue(T t) {

    }

    @Override
    public T getValue() {
        return null;
    }
}

package generics.method;

public class MyClass <T>{


    private  T value;

    public MyClass(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public  <E> void printElements(E element){
        System.out.println( "Elements " + element);

    }
}

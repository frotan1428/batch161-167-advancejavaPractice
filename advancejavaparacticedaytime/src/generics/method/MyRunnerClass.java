package generics.method;

public class MyRunnerClass {

    public static void main(String[] args) {

        //Task 1 : create a generic method that print any kind of Data Type

        MyClass<Integer>  intObj= new MyClass<>(10);
        intObj.printElements(10);
        intObj.printElements(15);

        MyClass<String>  StringObj= new MyClass<>("Hello ,");
      //  System.out.println(StringObj.getValue());
        StringObj.printElements("World");

    }
}

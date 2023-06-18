package generics.clasess;

public class BoxRunnerClass {
    //// Task 1 : Create a Box to store and retrieve strings

    public static void main(String[] args) {

        Box<String> stringBox= new Box<>("Hello , Generics");

        System.out.println("Item in stringBox " +stringBox.getItem());
        stringBox.setItem("Welcome to the word of generics ");

        System.out.println("update item in StringBox:"+ stringBox.getItem());
        // Task 2 Create 2 a Box to store and retrieve integers
        Box<Integer> integerBox2 = new Box<>(20);
        System.out.println("Item in stringBox " +integerBox2.getItem());
        integerBox2.setItem(21);
        System.out.println("Item in stringBox " +integerBox2.getItem());


    }
}

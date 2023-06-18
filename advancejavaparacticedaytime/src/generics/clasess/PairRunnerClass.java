package generics.clasess;

public class PairRunnerClass {

    /*

Task: Implement a generic class called Pair that represents a pair of elements.
The Pair class should have two type parameters, T and U, representing the types of the two elements in the pair.
Then, create a runner class to demonstrate the usage of the Pair class with different types.
 */


    public static void main(String[] args) {


        //scenario  1 : Pair of String

        Pair<String,String> namePair =new Pair<>("Enes","Bahtiyar");
        System.out.println("Full name :" +namePair.getFirst()+ " "+ namePair.getSecond());
        // Scenario 2: Pair of Integers

        Pair<Integer,Integer> namePair2 =new Pair<>(10,20);
        System.out.println("sum of to number: "+ (namePair2.getFirst()+namePair2.getSecond()));

        // Scenario 4: Pair of Custom Objects
        // Assuming we have a Person class with name and age fields

        Person person1= new Person("Musleh",27);
        Person person2= new Person("serhan",25);

        Pair<Person,Person> personPair= new Pair<>(person1,person2);

        System.out.println("First person : "+ personPair.getFirst().getName() + " ," + personPair.getFirst().getAge());
        System.out.println("Second  person : "+ personPair.getSecond().getName() + " ," + personPair.getSecond().getAge());



    }

}

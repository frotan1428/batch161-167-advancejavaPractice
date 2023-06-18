package generics.interfaces;

public class StorageRunnerClass {

    ///*
    //Task: Implement a generic interface called Storage that represents a data storage mechanism.
    //Then, create a class that implements the Storage interface to store and retrieve items of any type.
    // */


    public static void main(String[] args) {

        Storage<String>  stringStorage = new GenericStorage<>();

        stringStorage.store("Hello , generics");

        String retrieveString = stringStorage.retrieve();
        System.out.println("RetrieveString : " +retrieveString);

        Storage<Integer>  IntegertStorage = new GenericStorage<>();
        IntegertStorage.store(20);
        Integer retrieveInteger  = IntegertStorage.retrieve();
        System.out.println("RetrieveString : " +retrieveInteger);

    }

}

package genereics.bounding;

import java.util.ArrayList;
import java.util.List;

public class GenericLowerBoundAndWildcard {
    public static void main(String[] args) {

        System.out.println("********** wildcard lower bound ***********");
        //list of Integers
        List<Integer> intlist = new ArrayList<>();
        addElements(intlist);
        System.out.println(intlist);
        //list of Numbers
        List<Number> numList = new ArrayList<>();
        addElements(numList);
        System.out.println(numList);

        List<Double> doubleList = new ArrayList<>();
        //addElements(doubleList); //CTE because Double is not parent of Integer

        System.out.println("********** wildcard upper bound ***********");
        multiplyByTwo(intlist);
        multiplyByTwo(numList);
        multiplyByTwo(doubleList);

        System.out.println("********** printElement ***********");
        List<String> strLst = new ArrayList<>();
        printElement(strLst);
        printElement(numList);
        printElement(doubleList);

        System.out.println("********** printObject ***********");
        //printObject(strLst);
        List<Object> objList = new ArrayList<>();
        printObject(objList);


    }

    //method to add elements from Integer and its parent classes
    //super Integer --> brings parent classes of Integer
    public static void addElements(List<? super Integer> list){ //Number, Objects
        //?-->wildCard(unknown type)
        for(int i = 1; i<=10;i++){
            list.add(i);
        }
    }
    //using wildCard with upper bound
    public static void multiplyByTwo(List<? extends Number> list){
        //list.add(1); //  when we use wildcards (unknown data type)we cannot do any operations related to data type
        list.size(); //methods that are not related to data type can be applied
        list.stream().map(t->2*t.doubleValue()).forEach(System.out::println);
    }

    //wildcard limitations
    public static void printElement(List<?> listOfUnknown){
        //listOfUnknown.add("Java");
        listOfUnknown.add(null); //null value has no data type
        //we can use methods like size(), clear(), remove() that are not related to data type
        //but we cannot add value since wildcard does not know the datatype

        for(Object o: listOfUnknown){
            System.out.println(o);
        }
    }

    public static void printObject(List<Object> listObject){
        listObject.add("Java");

        for(Object o: listObject){
            System.out.println(o);
        }
    }
}

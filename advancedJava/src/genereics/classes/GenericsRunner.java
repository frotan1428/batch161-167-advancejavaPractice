package genereics.classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericsRunner {
    public static void main(String[] args) {

        System.out.println("************ Generic Class with Single Parameter *************");
        GenericClass<String> obj = new GenericClass<>(); //wit Java 7, we don't need to write data type to right
        obj.setType("Hello Generics");
        String str = obj.getType(); //no need to type cast


//        GenericClass<String> obj2 = new GenericClass<>();
//        obj2.setType(1234); //we get CTE if we try to set different data type

        //if we want to set Integer value:
        GenericClass<Integer> num = new GenericClass<>();
        num.setType(1234);

        GenericClass<Double> doubleValue = new GenericClass<>();
        doubleValue.setType(13.4);

        //We used generics concept in Collections like List, Map etc
        List<Integer> list = new ArrayList<>();
        list.add(234);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Hello");
       // map.put("Hello", 1); we cannot set different data type than declared


        System.out.println("************ Generic Class with Multiple Parameters *************");
        //create instance from GenericTypeTwoParams
        GenericTypeTwoParams<String, Integer> obj1 = new GenericTypeTwoParams<>("Java", 3);
        GenericTypeTwoParams<Integer, String> obj2 = new GenericTypeTwoParams<>(34, "Generics");
        System.out.println(obj1.getS());
        System.out.println(obj2.getU());
    }
}

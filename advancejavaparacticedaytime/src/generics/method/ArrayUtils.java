package generics.method;

public class ArrayUtils {


    public static <T extends  Comparable<T>>  T findMaximum(T [] array){

        if (array ==null || array.length==0){
            throw  new IllegalArgumentException("Arrays cannot be null or empty");
        }//[1,2]

        T max =array[0];//1
        for (int i = 1; i <array.length ; i++) {

            if (array[i].compareTo(max) >0){
                max=array[i];
            }
        }
        return max;

    }
}

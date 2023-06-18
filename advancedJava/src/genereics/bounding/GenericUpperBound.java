package genereics.bounding;

public class GenericUpperBound <T extends Number>{ //we are setting bounds from upper classes
    //Data type of T will be only classes which extends from Numbers

    private T[] numberArray;

    //constructor
    public GenericUpperBound(T[] numberArray) {
        this.numberArray = numberArray;
    }

    //method to find average of array
    public double getAverage(){
        double sum =0;
        for(T t: numberArray){
            sum += t.doubleValue(); //converts elements to double
        }
        double avg = sum/numberArray.length;
        return avg;
    }

    //main
    public static void main(String[] args) {
        Integer[] intArr = {2, 5, 8, 9, 3};
        Double [] doubleArr = {1.4, 6.3, 7.3, 8.0};
        String [] strArr = {"Java", "Generics", "Ara", "Fantastic!"};
        GenericUpperBound<Integer> obj1 = new GenericUpperBound<>(intArr);
        System.out.println(obj1.getAverage());

        GenericUpperBound<Double> obj2 = new GenericUpperBound<>(doubleArr);
        System.out.println(obj2.getAverage());

        //String is not within its bound; should extend 'java.lang.Number'
        //GenericUpperBound<String> obj = new GenericUpperBound<String>(strArr); //CTE

        //GenericUpperBound<Object> obj4 = new GenericUpperBound<Object>(intArr);

    }

}

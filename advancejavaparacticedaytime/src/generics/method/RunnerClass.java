package generics.method;

public class RunnerClass {

    public static void main(String[] args) {


        //task find the maximum integer or decimal with generic method

        Integer [] numbers = {5,10,30,20};

        Double [] decimal ={3.14,5.5,2.3,0.90};

        Integer maxNumber =   ArrayUtils.findMaximum(numbers);
        Double maxDecimal = ArrayUtils.findMaximum(decimal);
        System.out.println("Maximum Number :" +maxNumber);
        System.out.println("Maximum Decimal  :" +maxDecimal);


    }
}

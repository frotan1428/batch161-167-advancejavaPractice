package enumType;

public class LearnEnum {
    public static void main(String[] args) {
        DaysOfWeek day = DaysOfWeek.FRIDAY;
        System.out.println(day);

        if(day == DaysOfWeek.FRIDAY){
            System.out.println("Waay , tomorrow is holiday");
        }
        //to print all constant values from enum class
        for(DaysOfWeek d : DaysOfWeek.values()){
            System.out.println(d);
        }
    }
}

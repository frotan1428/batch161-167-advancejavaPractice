package multithread.creation;

public class ThreadCreation01 {

      /*
                Task 1: Create a Counter class that extends Thread class.
                Create two threads from Counter class, that will count from 1 to 100.
         */

    public static void main(String[] args) {

        CounterA thread1 = new CounterA("RoadRunner");
        CounterB thread2 = new CounterB("SpeedGonzales");

//        thread1.run();
//        thread2.run();

//        thread1.start();
//        thread2.start();
    }

}

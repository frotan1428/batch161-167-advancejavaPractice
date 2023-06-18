package multithread.volatileJeyword;

public class NumeratorRunnerClass {

    /*
    The 'volatile' keyword guarantees that when a change is made to a variable,
            it will be visible to other threads. A 'volatile' variable is read from the main memory of the computer
            instead of the CPU cache and is written back to the main memory instead of the CPU cache.
     */

    public static void main(String[] args) {


        Numerator numerator= new Numerator();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
               numerator.getOrder();
            }
        });
        thread1.setName("enes");
        thread1.start();


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                numerator.getOrder();
            }
        });
        thread2.setName("Serhan");
        thread2.start();



        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                numerator.getOrder();
            }
        });
        thread3.setName("Musleh");
        thread3.start();



        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                numerator.getOrder();
            }
        });
        thread4.setName("Yasar");
        thread4.start();



        Thread thread5 = new Thread(new Runnable() {
            @Override
            public void run() {
                numerator.getOrder();
            }
        });
        thread5.setName("Tuba");
        thread5.start();


        Thread thread6 = new Thread(new Runnable() {
            @Override
            public void run() {
                numerator.getOrder();
            }
        });
        thread6.setName("Tajala");
        thread6.start();

    }
}

package thread;

public class Thread03_MultiThreading {
    public static int counter = 0;

    public static void main(String[] args) {

        Thread thread1 = new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+" running");
                Counter.count();
                System.out.println(Thread.currentThread().getName()+" terminated");
            }
        });



        Thread thread2 = new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+" running");
                Counter.count();
                System.out.println(Thread.currentThread().getName()+" terminated");
            }
        });
        thread1.setName("Ali");
        thread1.start();



        thread2.setName("Naci");
        thread2.start();

    }
}
class Counter{
    //method to increase value of counter till 1000

    //synchronized  keyword allows the method to be used by one thread at the same time
    // when count method is used by one thread, other threads should wait
    public synchronized static void count(){
        for (int i =1; i<=1000; i++){
            Thread03_MultiThreading.counter++;
           // System.out.println(Thread.currentThread().getName()+" -->counting:"+Thread03_MultiThreading.counter);
        }
        System.out.println("Counter value: "+Thread03_MultiThreading.counter); //2000
    }
}

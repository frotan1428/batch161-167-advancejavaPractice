package thread;

public class Thread02_MultiThreading {
    public static void main(String[] args) {

        long startTime  = System.currentTimeMillis();
        CounterWithoutThread counter1 = new CounterWithoutThread("Otgo");
        CounterWithoutThread counter2 = new CounterWithoutThread("Ali");
        counter1.countMe();
        System.out.println("-----------------");
        counter2.countMe();
        long endTime = System.currentTimeMillis();
        System.out.println("Duration without multi thread: "+(endTime-startTime));


        System.out.println("===============================");
        long startTime1  = System.currentTimeMillis();
        CounterWithThread counter3 = new CounterWithThread("Naci");
        CounterWithThread counter4 = new CounterWithThread("Zia");

        counter3.start();



        System.out.println("----------------");
        counter4.start();

        try {
            counter3.join(); //waits for the thread to terminate and then joins to main thread
            counter4.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        long endTime2 = System.currentTimeMillis();
        System.out.println("Duration with multi thread: "+(endTime2-startTime1));

    }
}
class CounterWithoutThread{
    private String name;
    //constructor

    public CounterWithoutThread(String name) {
        this.name = name;
    }

    //method to print number from 1 to 10
    public void countMe(){
        System.out.println("Current Thread: "+Thread.currentThread().getName());
        for (int i =1; i<=10; i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(name+" is counting: "+i);
        }
    }
}

//class extends Thread
class CounterWithThread extends Thread{
    private String name;
    //constr

    public CounterWithThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        countMe();
    }

    //method to print number from 1 to 10
    public void countMe(){
        System.out.println("Current Thread: "+Thread.currentThread().getName());
        for (int i =1; i<=10; i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(name+" is counting: "+i);
        }
    }

}
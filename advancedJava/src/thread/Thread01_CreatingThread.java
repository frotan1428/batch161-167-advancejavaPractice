package thread;

public class Thread01_CreatingThread {
    public static void main(String[] args) {
        //main thread
        System.out.println("Current Thread: "+Thread.currentThread().getName());

        //thread from MyThread
        MyThread thread1 = new MyThread();
        thread1.start(); //start() creates a thread
        //thread1.run(); //run() only executes code blocks inside of run method,
        // but it will not create thread.

        //thread from MyRunnable class
        MyRunnable myRunnable = new MyRunnable(); //create instance of MyRunnable class
        Thread thread2 = new Thread(myRunnable); //passed MyRunnable as a parameters
        thread2.start(); //to start thread

        //creating thread with anonymous class
        Thread thread3 = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Current Thread: "+Thread.currentThread().getName());
                System.out.println("Thread by anonymous class");
            }
        });
        thread3.setName("Anonymous Thread");
        thread3.start();


        //creating thread with lambda
        Thread thread4 = new Thread(()->{
            System.out.println("Current Thread: "+Thread.currentThread().getName());
            System.out.println("Thread created by Lambda");
        });
        thread4.setName("Lambda Thread");
        thread4.start();


        System.out.println("********* end of codes **********");

    }
}

//1st way to create thread: extending Thread class
class MyThread extends Thread{
    @Override
    public void run() {

        System.out.println("MyThread is running");
    }
}

//2nd way to create thread: implementing Runnable interface
class MyRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("MyRunnable thread is running..");
    }
}
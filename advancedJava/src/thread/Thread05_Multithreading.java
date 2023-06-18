package thread;

public class Thread05_Multithreading {
    public static void main(String[] args) {

        //synchronized keyword can be used in method level
        // it can be also used with block to synchronize some parts of code

        Brackets1 brackets = new Brackets1();
        long startTime = System.currentTimeMillis();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i= 0; i<10; i++){
                    brackets.generateBrackets();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i= 0; i<10; i++){
                    brackets.generateBrackets();
                }
            }
        });
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        long endTime = System.currentTimeMillis();
        //duration when method is synchronized
        //System.out.println("Duration: "+(endTime-startTime)); //5334
        //duration when we use synchronized block
        System.out.println("Duration: "+(endTime-startTime)); //2685
    }
}
class Brackets1{
    public  void generateBrackets(){
        // in our method if we have some code block which can be shared by threads, we can leave
        // that part out side of synchronized block. The codes inside synchronized block will
        // be blocked for the thread

        // this -- to block the codes inside the synchronized block

        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                if (i <= 5) {
                    System.out.print("[");
                } else {
                    System.out.print("]");
                }
            }
            System.out.println("");
        }
        //some other codes that can be shared
        for(int i = 0; i<5; i++){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
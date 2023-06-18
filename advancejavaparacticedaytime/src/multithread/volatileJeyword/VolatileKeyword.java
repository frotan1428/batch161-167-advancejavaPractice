package multithread.volatileJeyword;

/*
Task : create a Java program that showcases the usage of the
 volatile keyword in a multi-threaded environment.
  The program consists of two threads: a writer thread and a reader thread.
  */
public class VolatileKeyword {

    private static volatile boolean flag = false;

    public static void main(String[] args) {


        Thread writerThread = new Thread(()-> {

            try {
                Thread.sleep(300);
                flag=true;
                System.out.println("Writer :  flag is set True  ....");
            } catch (InterruptedException e) {
               e.printStackTrace();
            }
        });

        Thread readerThread = new Thread(()-> {

            while (!flag){
                // do nothing ,wait for the flag to became true
            }
            System.out.println("Reader  :  flag is now true Existing ...");

        });

        writerThread.start();
        readerThread.start();


    }
}

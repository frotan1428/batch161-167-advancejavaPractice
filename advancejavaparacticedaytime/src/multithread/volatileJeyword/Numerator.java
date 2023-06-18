package multithread.volatileJeyword;

public class Numerator {

    private volatile static  int counter =0;

    public  void getOrder(){

        String name = Thread.currentThread().getName();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

       synchronized (this){////this, referring to the current instance of the class containing the getOrder() method.
            counter++;
            System.out.println("Dear " +name +  " your number is : "+counter);
        }
    }
}

package multithread.shopwaitnotify;


/*
Task: Create  an application to track the stock quantity in a market.
If there is not enough product in the market, wait for new products to arrive.
Once new products arrive, allow for product sales to occur.
*/
public class ShopWaitNotify {


    public  static volatile  int stock=2;
    public static void main(String[] args) {


        ShopWaitNotify shop= new ShopWaitNotify();

        Thread consumerTHread = new Thread(new Runnable() {
            @Override
            public void run() {
                shop.consumeProduct(8);
            }
        });

        consumerTHread.setName("Consumer ");

        Thread producerThread= new Thread(new Runnable() {
            @Override
            public void run() {

                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                shop.producerProduct(5);
            }
        });

        producerThread.setName("Producer");

        consumerTHread.start();
        producerThread.start();

    }

    public synchronized void consumeProduct (int amount ){ //3

        if (amount>stock){

            System.out.println();

            System.out.println(Thread.currentThread().getName() +" would like to buy a product");
            System.out.println("There is no enough product .current Stock " +stock);
            System.out.println("Wait  for producer to restock ...");

            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        if (amount<=stock){

            System.out.println();
            System.out.println(Thread.currentThread().getName() +" would like to buy a product");
            stock=stock-amount;
            System.out.println("Updated Stock " + stock);
        }
        else {


            System.out.println();

            System.out.println(Thread.currentThread().getName() +" would like to buy a product");
            System.out.println("There is no enough product .current Stock " +stock);
            System.out.println("Come back tomorrow if you are out of Stock ");
        }

    }

    public synchronized void producerProduct (int amount ){

        System.out.println();
        System.out.println(Thread.currentThread().getName() +" would like to buy a product");
        System.out.println("New Product updated..");
        stock=stock+amount;
        System.out.println("new product has been updated.. Updated stock :" +stock);
        notify();
        System.out.println();

    }

}


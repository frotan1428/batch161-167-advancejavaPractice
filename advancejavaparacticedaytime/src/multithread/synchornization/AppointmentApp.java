package multithread.synchornization;

/*

In multithreading programming, if multiple threads attempt to access a shared resource simultaneously,
unwanted results can occur. In such cases, it is necessary to provide sequential access to the threads.

When one thread is using a resource, the others must wait for it. This is achieved using the "synchronized" keyword.


        Task : Create a simple appointment application
        The application has to give a new appointment one day after another.
 */
public class AppointmentApp {

    public static void main(String[] args) {

        String [] users={"Enes Bejtiyar","Serhan Ebubechir","Tajalla Ahzer","Tuba Karaca","Ziaurahman Musleh "};

        AppointmentCenter apCenter= new AppointmentCenter();

        for (String user:users){
            Thread thread1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    Thread.currentThread().setName(user);
                   String name= Thread.currentThread().getName();

                    System.out.println("Dear " + name + "   your appointment day is :" +apCenter.getAppointmentDay() );
                }
            });
            thread1.start();

        }
    }


}

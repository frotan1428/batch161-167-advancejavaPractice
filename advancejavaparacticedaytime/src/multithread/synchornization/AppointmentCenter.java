package multithread.synchornization;

import java.time.LocalDate;

public class AppointmentCenter {

    private LocalDate day = LocalDate.now();

    public  LocalDate getAppointmentDay(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        synchronized (this){
            day = day.plusDays(1);
            return day;
        }
    }
}

package java8Features.dateAndTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class MyClas {
    public static void main(String[] args) {
        LocalTime localTime=LocalTime.now();
        System.out.println(localTime);

        LocalDate localDate=LocalDate.of(2003, 05, 27);
        System.out.println(localDate);
    }
}

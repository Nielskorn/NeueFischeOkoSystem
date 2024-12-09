package org.neuefische.GroupTask.Time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());
        LocalDate date = LocalDate.now();
        date = date.plusWeeks(2);
        System.out.println(date);
        LocalDate today = LocalDate.now();
        LocalDate yesterday = LocalDate.of(2040, today.getMonth(), today.getDayOfMonth());
        System.out.println( compareDate(yesterday));
        System.out.println(calculateDiff(today, yesterday));
        LocalDate today2 = LocalDate.of(2014,5,15);
        Animal animal=new Animal("jim",today2);
        System.out.println(animal);
        LocalDate today3 = LocalDate.now();
        Instant instant = Instant.now();
        ;
        System.out.println(bithdayUtil(animal.getBithday()));
        Timezone
            }

    public static Boolean compareDate(LocalDate date1) {
        LocalDate today = LocalDate.now();
        return today.isBefore(date1);
    }
    public static Long calculateDiff(LocalDate date1, LocalDate date2) {
        return ChronoUnit.DAYS.between(date1, date2);
    }
    public static long bithdayUtil(LocalDate ld1){
        LocalDate today = LocalDate.now();
        LocalDate nextBday=LocalDate.of(today.getYear(), ld1.getMonth(), ld1.getDayOfMonth());
        if(today.isAfter(nextBday)||today.equals(nextBday)){
            nextBday=nextBday.plusYears(1);
        }
        return ChronoUnit.DAYS.between(today, nextBday);

    }
}

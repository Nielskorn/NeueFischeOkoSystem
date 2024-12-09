package org.neuefische;

import java.time.*;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        System.out.println(demo.Jim);
        List<String> per=new ArrayList<>();
        per.add("John");
        per.add("Jane");
        Appointment appointment=new Appointment(Weekday.FRIDAY,per);
        System.out.println(appointment);
        FunWithJava funwithjava=new FunWithJava();
        System.out.println(funwithjava.getTimestamp());
        //local Date nur Datum
        LocalDate today=LocalDate.now();
        System.out.println(today);
        //localDateTime
        LocalDateTime dateTime=LocalDateTime.now();
        System.out.println(dateTime);
        //ZonedDateTime =Datum&Uhrzeit  und Zeitzone
        ZonedDateTime zonedDateTime=ZonedDateTime.now();
        System.out.println(zonedDateTime);
        //Instant =zulu Zeitpunkt
        Instant instant=Instant.now();
        System.out.println(instant);
        //instant in localDateTime
        ZoneId zoneId=ZoneId.of("America/New_York");
        System.out.println(zoneId);
       // Instant instant2=Instant.now();
      //  System.out.println(instant2);
        LocalDateTime dateTime2=instant.atZone(zoneId).toLocalDateTime();
        System.out.println(dateTime2);
        LocalDateTime dateTime3=instant.atZone(zoneId).toLocalDateTime();
        System.out.println(dateTime3);
        dateTime3= dateTime3.minusDays(1);
        System.out.println(dateTime3);
    }

}
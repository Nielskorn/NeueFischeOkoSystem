package org.neuefische.GroupTask;

public record Person(int id, String firstName, String lastName, int age,Gender gender,DaysOfTheWeek favoriteDayOfTheWeek) {
}
enum Gender {
    MALE, FEMALE,DIVERSE
}

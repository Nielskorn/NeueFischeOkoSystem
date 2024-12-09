package org.neuefische.GroupTask;

public class Main {
    public static void main(String[] args) {
        PersonRepository personRepository = new PersonRepository();
        personRepository.addPerson(new Person(1,"jim","bob",10,Gender.MALE,DaysOfTheWeek.FRIDAY));
        Person person = personRepository.findPersonById(1).orElseThrow();
        System.out.println(person);
        Person person2 = personRepository.findPersonById(2).orElseThrow();
        System.out.println(person2);
    }
}

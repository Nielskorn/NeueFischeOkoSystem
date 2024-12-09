package org.neuefische.GroupTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonRepository {
private List<Person> people;
public PersonRepository() {
    people = new ArrayList<Person>();
}
public List<Person> getPeople() {
    return people;
}
public void setPeople(List<Person> people) {
    this.people = people;
}
public void addPerson(Person person) {
    people.add(person);
}
public void removePerson(Person person) {
    people.remove(person);
}
public Optional<Person> findPersonByLastName(String name){
    for(Person person : people){
        if(person.lastName().equals(name)){
            return Optional.of(person);
        }
    }
    return Optional.empty();
}
public Optional<Person> findPersonById(int id) {
    for(Person person : people){
        if(person.id() == id){
            return Optional.of(person);
        }
    }
    return Optional.empty();
}
public Optional<List<Person>> findPersonsByGender(Gender gender) {
    List<Person>result=new ArrayList<>();
    for(Person person : people){
        if(person.gender().equals(gender)){
            result.add(person);
        }
    }
    if(result.isEmpty()){
        return Optional.empty();
    }else {
    return Optional.of(result);}
}
    public int  PersonsCountByGender(Gender gender) {
    int count = 0;
    for(Person person : people){
            if(person.gender().equals(gender)){
                count++;
            }
        }

            return count;
    }
public Optional<List<Person>> findPersonsByWeekday(DaysOfTheWeek day) {
    List<Person>result=new ArrayList<>();
    for(Person person : people){
        if (person.favoriteDayOfTheWeek().equals(day)) {
            result.add(person);
        }
    }
    if(result.isEmpty()){
        return Optional.empty();
    }else {
    return Optional.of(result);}
}
}

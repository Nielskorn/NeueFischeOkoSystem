package org.neuefische.GroupTask.Time;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Objects;
@Getter
@Setter
public class Animal {
   LocalDate bithday= LocalDate.of(2024,5,15);
   String name;
   Animal(String n, LocalDate d) {
       name = n;
       bithday = d;
   }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(bithday, animal.bithday) && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bithday, name);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "bithday=" + bithday +
                ", name='" + name + '\'' +
                '}';
    }
}

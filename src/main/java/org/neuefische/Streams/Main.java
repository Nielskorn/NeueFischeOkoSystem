package org.neuefische.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("C");
        list.add("D");
        list.stream().peek(string -> System.out.println(string)).forEach(System.out::println);
        System.out.println("");
        list.stream().distinct().forEach(System.out::println);
        Stream.of("Anton", "Berta", "Cäsar").peek(System.out::println);
    }
}

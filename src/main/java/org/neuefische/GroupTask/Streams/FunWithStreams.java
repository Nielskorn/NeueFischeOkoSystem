package org.neuefische.GroupTask.Streams;

import java.util.List;
import java.util.stream.Collectors;

public class FunWithStreams {

    public List<Integer> coolNumbers(List<Integer> numbers) {
       int sum=0;
       return numbers.stream().
               filter(n -> n % 2 == 0)
               .map(n -> n * 2)
               .sorted()
                // .reduce(e->sum+e);
               //.forEach(System.out::println);
               .collect(Collectors.toList());


    }

//    List<Integer> findeEven(List<Integer> findeEven) {
//        return findeEven.stream().filter(x->x%2==0).toList();
//    }
//    List<Integer> doubletheNumbers(List<Integer> numbers) {
//        return numbers.stream().map(e->e*2).toList();
//    }
//    List<Integer>sortNumbers(List<Integer> numbers) {
//        return numbers.stream().sorted().toList();
//    }
//    int getSum(List<Integer> numbers) {
//        int sum = 0;
//        return numbers.stream().reduce(e->sum+e);
//    }
//    void printAll(List<Integer> numbers) {
//        numbers.forEach(System.out::println);
//    }
//    List<Integer> CollectNum(List<Integer> numbers) {
//
//      return numbers.stream().collect(Collectors.toList());
//    }
}

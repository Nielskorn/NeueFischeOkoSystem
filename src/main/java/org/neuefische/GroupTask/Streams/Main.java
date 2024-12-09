package org.neuefische.GroupTask.Streams;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FunWithStreams funWithStreams = new FunWithStreams();
        List<Integer>numbers=new ArrayList<Integer>();
        for(int i=1;i<=100;i++){
            numbers.add(i);
        }
        List<Integer>coolnumbers= funWithStreams.coolNumbers(numbers);
        System.out.println(coolnumbers.get(25));

        funStreamsAndCvs funStreamsAndCvs = new funStreamsAndCvs();
        try{
        List<Student> students=funStreamsAndCvs.createdStudensfromCsv();
            students.forEach(System.out::println);
    } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

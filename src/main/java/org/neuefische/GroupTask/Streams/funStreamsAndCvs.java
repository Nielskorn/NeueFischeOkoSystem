package org.neuefische.GroupTask.Streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class funStreamsAndCvs {
   public List<Student> createdStudensfromCsv() throws IOException {

//       if(!Files.exists(Path.of("src/main/resources/students.csv"))){
//           System.out.println("X");
//       }
    List<Student>lines= Files.lines(Path.of("src/main/resources/students.csv")).
          // peek(System.out::println).
            skip(1).filter(e->!e.isEmpty())
            .distinct()
            .map(line-> line.split(","))
                    .map(columns->new Student(Integer.parseInt(columns[0]),columns[1],Integer.parseInt(columns[3]),Integer.parseInt(columns[2])))
            .collect(Collectors.toList());

       return lines;
   }}

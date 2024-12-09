package org.neuefische.GroupTask.lombok;

import lombok.*;

import java.util.List;
@Value
@AllArgsConstructor
@Builder
public class Course {
    int id;
    String name;
    Teacher teacher;
    List<Student> students;
}

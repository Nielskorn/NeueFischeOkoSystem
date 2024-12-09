package org.neuefische.GroupTask.lombok;

import lombok.*;
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@With
public class Student {
    int id;
    String name;
    String address;
    int grade;
}

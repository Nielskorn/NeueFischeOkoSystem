package org.neuefische.GroupTask.lombok;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    Student jim =new Student(1,"jim","himmelweg8",4);
    System.out.println(jim);
     Student jane = new Student.StudentBuilder().name("Jane").address("himmelweg").grade(1).id(1).build();
    Teacher joe = new Teacher(1,"joe","English");
    Teacher bob = new Teacher(2,"bob","English");
    Course math=new Course.CourseBuilder().name("Math").teacher(bob).build();
    System.out.println(joe);
        System.out.println(jane);

        System.out.println(jane.getGrade());
        System.out.println(jim.getAddress());
        System.out.println(math);
        System.out.println(bob.Name());

//    course.setId(4);
//    course.setName("english");
//    course.setTeacher(joe);
    List<Student> studentList=new ArrayList<>();
    studentList.add(jim);
    studentList.add(jane);
//    course.setStudents(studentList);
        Course course= new Course(1,"english",joe,studentList);
        Course kurse1=new Course.CourseBuilder().name("kurse1").teacher(bob).students(studentList).build();
    System.out.println(course);
    Student johns=jane.withGrade(6);
        System.out.println(johns);
        List<Course>courseList=new ArrayList<>();
        courseList.add(course);
        courseList.add(kurse1);
        University university=new University(1,"dummward",courseList);
        System.out.println(university);
        UniversityService universityService=new UniversityService();
       double avg= universityService.AvrageGrade(course);
        System.out.println(avg);
        System.out.println(universityService.AvrageGrade(university));
        System.out.println(universityService.getStudentsWithaTwo(university));

    }
}

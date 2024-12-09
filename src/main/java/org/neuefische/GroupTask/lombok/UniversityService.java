package org.neuefische.GroupTask.lombok;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UniversityService {
    double AvrageGrade(Course course) {
        double avg = 0;
        avg= (double) course.getStudents().stream().mapToDouble(Student::getGrade).sum() /course.getStudents().size();
        System.out.println("AverageGrade: "+avg);
        return avg;
        }
        double AvrageGrade(University university) {
        double avg = 0;
        List<Course>courses=university.courses();
        for(int i=0;i<courses.size();i++) {
            Course course=courses.get(i);
          avg+= AvrageGrade(course);

        }
        return avg/courses.size();
    }
    List<Student>getStudentsWithaTwo(University university) {
        List<Student> students = new ArrayList<>();
        List<Course> courses = university.courses();
        for (int i = 0; i < courses.size(); i++) {
            Course course = courses.get(i);
            students = course.getStudents().stream().filter(student -> student.getGrade() <= 2).sorted().collect(Collectors.toList());
        }
        return students;
    }
}


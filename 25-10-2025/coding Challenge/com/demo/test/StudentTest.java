package com.demo.test;
import com.demo.beans.Student;
import com.demo.dao.StudentDao;
import com.demo.service.StudentService;
import com.demo.service.LowAttendanceException;
import java.util.*;

public class StudentTest {
    public static void main(String[] args) {
        StudentDao dao = new StudentDao();
        StudentService service = new StudentService();

        // Create 10 student objects
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Sakshi", "Java", 85, 92));
        students.add(new Student(2, "Riya", "Python", 58, 80));
        students.add(new Student(3, "Amit", "C++", 70, 88));
        students.add(new Student(4, "Rahul", "Java", 95, 78));
        students.add(new Student(5, "Sneha", "C#", 45, 55));
        students.add(new Student(6, "Vikas", "Python", 82, 66));
        students.add(new Student(7, "Priya", "Java", 65, 90));
        students.add(new Student(8, "Ankit", "C++", 60, 72));
        students.add(new Student(9, "Neha", "C", 78, 89));
        students.add(new Student(10, "Rohan", "JavaScript", 88, 93));

        // Save students to file
        dao.saveStudents(students);

        // Sort students by attendance
        dao.sortByAttendance(students);
        System.out.println("\nStudents sorted by decreasing attendance:");
        for (Student s : students) {
            System.out.println(s);
        }

        // Display grades (handling exception)
        System.out.println("\nChecking Grades:");
        for (Student s : students) {
            try {
                System.out.println(s.getSname() + " → Grade: " + service.calculateGrade(s));
            } catch (LowAttendanceException e) {
                System.out.println(s.getSname() + " → " + e.getMessage());
            }
        }
    }
}


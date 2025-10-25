package com.demo.dao;


import com.demo.beans.*;
import java.io.*;
import java.util.*;

public class StudentDao {

    private static final String FILE_NAME = "students.dat";

    // Save list of students using serialization
    public void saveStudents(List<Student> students) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            for (Student s : students) {
                oos.writeObject(s);
            }
            System.out.println("✅ Students saved successfully to file: " + FILE_NAME);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Read students back from file (deserialization)
    public List<Student> readStudents() {
        List<Student> students = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            while (true) {
                try {
                    Student s = (Student) ois.readObject();
                    students.add(s);
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }

    // Sort students in decreasing order of attendance
    public void sortByAttendance(List<Student> students) {
        students.sort((a, b) -> Double.compare(b.getAttendance_percentage(), a.getAttendance_percentage()));
    }
}

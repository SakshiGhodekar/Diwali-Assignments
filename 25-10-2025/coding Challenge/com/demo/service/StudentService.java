package com.demo.service;


import com.demo.beans.*;

public class StudentService {

    // Calculate Grade and check attendance
    public String calculateGrade(Student s) throws LowAttendanceException {
        if (s.getAttendance_percentage() < 60) {
            throw new LowAttendanceException("Attendance below 60%! Not eligible for grading.");
        }

        double score = s.getScore();
        if (score >= 90) return "A";
        else if (score >= 75) return "B";
        else if (score >= 60) return "C";
        else return "D";
    }
}

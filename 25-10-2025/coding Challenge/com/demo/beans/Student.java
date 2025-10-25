package com.demo.beans;

import java.io.Serializable;

public class Student implements Serializable {
    private int rollno;
    private String sname;
    private String course;
    private double attendance_percentage;
    private double score;

    public Student() {}

    public Student(int rollno, String sname, String course, double attendance_percentage, double score) {
        this.rollno = rollno;
        this.sname = sname;
        this.course = course;
        this.attendance_percentage = attendance_percentage;
        this.score = score;
    }

    public int getRollno() { return rollno; }
    public String getSname() { return sname; }
    public String getCourse() { return course; }
    public double getAttendance_percentage() { return attendance_percentage; }
    public double getScore() { return score; }

    @Override
    public String toString() {
        return rollno + " - " + sname + " (" + course + ") | Attendance: " 
               + attendance_percentage + "% | Score: " + score;
    }
}


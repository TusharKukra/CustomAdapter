package com.example.customadapter;

import java.util.ArrayList;

public class Teacher {
    String name;
    String course;

    public Teacher(String name, String course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }
    public static ArrayList<Teacher> get6randomteacher(){
        ArrayList<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("Tushar", "Btech"));
        teachers.add(new Teacher("Saurav", "Law"));
        teachers.add(new Teacher("Amardeep", "UPSC"));
        teachers.add(new Teacher("Rohit", "Btech"));
        teachers.add(new Teacher("Harshit", "MBA"));
        teachers.add(new Teacher("Sumit", "Law"));
        return teachers;
    }
}

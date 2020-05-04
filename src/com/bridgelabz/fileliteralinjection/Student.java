package com.bridgelabz.fileliteralinjection;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
    private String name;
    private String course;
    private String hobby;

    public String getName() {
        return name;
    }

    @Value("${student.name}")
    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    @Value("${student.course}")
    public void setCourse(String course) {
        this.course = course;
    }

    public String getHobby() {
        return hobby;
    }

    @Value("${student.hobby}")
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void displayStudentInfo() {
        System.out.println("Student name " + name);
        System.out.println("Student's course " + course);
        System.out.println("Hobby " + hobby);
    }
}

package com.example.databinding.model;

/**
 * Created by piyush on 23/12/17.
 */

public class Student {
    private String name;
    private String className;
    private String rollNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public Student(String name, String className, String rollNo) {

        this.name = name;
        this.className = className;
        this.rollNo = rollNo;
    }
}
package com.example.samplesrpingboot.entity;

public class Student
{
    public String name;
    public int rank;

    public Student(String name, int rank) {
        this.name = name;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rank=" + rank +
                '}';
    }
}

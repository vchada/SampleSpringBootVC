package com.example.samplesrpingboot.service;

import com.example.samplesrpingboot.entity.Student;

import java.util.List;

public interface MainService {

    public List<Student> getAllStudents();

    Student getAllStudentsbyRank(int rank);
}

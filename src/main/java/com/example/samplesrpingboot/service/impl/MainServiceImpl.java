package com.example.samplesrpingboot.service.impl;

import com.example.samplesrpingboot.entity.Student;
import com.example.samplesrpingboot.service.MainService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MainServiceImpl implements MainService {

    @Override
    public List<Student> getAllStudents() {
        List<Student> studentList = new ArrayList<>();
        Student s1 = new Student("John Doe",5);
        Student s2 = new Student("Alex",3);
        Student s3 = new Student("Peter Parker",2);
        Student s4 = new Student("Tony Stark",1);
        Student s5 = new Student("William",6);
        Student s6 = new Student("Jeff",4);

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);
        studentList.add(s6);

        return studentList;
    }

    @Override
    public Student getAllStudentsbyRank(int rank) {

        Student retval = new Student("",0);
        List<Student> studentList = new ArrayList<>();
        Student s1 = new Student("John Doe",5);
        Student s2 = new Student("Alex",3);
        Student s3 = new Student("Peter Parker",2);
        Student s4 = new Student("Tony Stark",1);
        Student s5 = new Student("William",6);
        Student s6 = new Student("Jeff",4);

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);
        studentList.add(s6);

        for(Student student:studentList)
        {
            if(student.rank == rank)
            {
                retval= student;
            }
        }
        return retval;
    }
}

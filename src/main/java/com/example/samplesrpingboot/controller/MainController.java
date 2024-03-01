package com.example.samplesrpingboot.controller;

import com.example.samplesrpingboot.entity.Student;
import com.example.samplesrpingboot.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class MainController
{
    /**
     *
     * GET - to pull the data
     * PUT - update
     * POST - create
     * DELETE - delete
     * PATCH -- partial updates
     *
     *
     * */

    @Autowired
    MainService mainService;

    @GetMapping("/api/getAllStudents")
    public List<Student> getAllStudents()
    {
        return mainService.getAllStudents();
    }

    @GetMapping("/api/getStudentByRank/{rank}")
    public Student getAllStudents(@PathVariable(name = "rank") int rank)
    {
        return mainService.getAllStudentsbyRank(rank);
    }
}

package com.jobi.students.controllers;
/*
 * Created by Tinotenda Jobi on 5/9/2020 16:17
 */

import com.jobi.students.models.Student;
import com.jobi.students.services.IStudentsService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class StudentsController {
    IStudentsService studentsService;

    public StudentsController(IStudentsService studentsService) {
        this.studentsService = studentsService;
    }

    @PostMapping("/addStudent")
    private Student addStudent(@RequestBody Student student){
        return studentsService.addStudent(student);
    }

    @GetMapping("/getStudent/{id}")
    private Optional<Student> getStudentById(@PathVariable Long id){
        return studentsService.getStudentById(id);
    }

    @DeleteMapping ("/deleteStudent/{id}")
    private void deleteStudentById(@PathVariable Long id){
         studentsService.deleteStudentById(id);
    }

    @PatchMapping ("/editStudent")
    private Student editStudent(@RequestBody Student student){
        return studentsService.editStudent(student);
    }
}

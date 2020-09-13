package com.jobi.students.services;
/*
 * Created by Tinotenda Jobi on 5/9/2020 16:19
 */

import com.jobi.students.models.Student;

import java.util.Optional;

public interface IStudentsService {
    Student addStudent(Student student);

    Optional<Student> getStudentById(Long id);

    void deleteStudentById(Long id);

    Student editStudent(Student student);
}

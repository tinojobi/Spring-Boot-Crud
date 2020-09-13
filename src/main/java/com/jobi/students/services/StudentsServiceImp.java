package com.jobi.students.services;
/*
 * Created by Tinotenda Jobi on 5/9/2020 16:18
 */

import com.jobi.students.models.Student;
import com.jobi.students.repositories.StudentsRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentsServiceImp implements IStudentsService{

    StudentsRepository studentsRepository;

    public StudentsServiceImp(StudentsRepository studentsRepository) {
        this.studentsRepository = studentsRepository;
    }

    @Override
    public Student addStudent(Student student) {
        return studentsRepository.save(student);
    }

    @Override
    public Optional<Student> getStudentById(Long id) {
        return studentsRepository.findById(id);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentsRepository.deleteById(id);
    }

    @Override
    public Student editStudent(Student student) {
        return studentsRepository.save(student);
    }
}

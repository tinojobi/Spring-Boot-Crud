package com.jobi.students.repositories;
/*
 * Created by Tinotenda Jobi on 5/9/2020 16:18
 */

import com.jobi.students.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepository extends JpaRepository<Student,Long> {
}

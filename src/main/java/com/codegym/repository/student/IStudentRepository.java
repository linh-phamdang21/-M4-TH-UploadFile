package com.codegym.repository.student;

import com.codegym.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IStudentRepository extends JpaRepository<Student, Long> {
    //    @Query("select c from Classes c where c.id:=?")
//    List<Student> getAllById(Classes classes);
}

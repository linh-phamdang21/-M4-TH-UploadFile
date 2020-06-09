package com.codegym.service.student;

import com.codegym.model.Student;
import com.codegym.repository.student.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentService implements IStudentService {
    @Autowired
    private IStudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(Long id) {
        return null;
    }

    @Override
    public void save(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void remove(Long id) {

    }

//    @Override
//    public List<Student> getAllByClasses(Classes classes) {
//        return studentRepository.getAllByClasses(classes);
//    }
}

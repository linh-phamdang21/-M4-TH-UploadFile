package com.codegym.controller;

import com.codegym.model.Student;
import com.codegym.model.StudentForm;
import com.codegym.service.student.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/student")
public class HomeController {

    @Autowired
    Environment env;

    @Autowired
    private IStudentService studentService;

    @GetMapping()
    public ModelAndView home(){
        List<Student> studentList = studentService.findAll();
        return new ModelAndView("home", "list", studentList);
    }

    @GetMapping("/create")
    public ModelAndView showFormCreate(){
        return new ModelAndView("create", "student", new StudentForm());
    }

    @PostMapping("/create")
    public ModelAndView creatStudent(@ModelAttribute StudentForm studentForm){
        Student student = new Student(studentForm.getName(), studentForm.getAddress(), null);
        MultipartFile multipartFile = studentForm.getAvatar();
        String fileName = multipartFile.getOriginalFilename();
        String fileUpload = env.getProperty("file_upload").toString();
        try {
            FileCopyUtils.copy(studentForm.getAvatar().getBytes(), new File(fileUpload + fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        student.setAvatar(fileName);
        studentService.save(student);
        return new ModelAndView("create", "student", new StudentForm());
    }
}

package com.SpringBoot.StudentManagement.Controller;

import com.SpringBoot.StudentManagement.Model.Student;
import com.SpringBoot.StudentManagement.Services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("user/")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService service;

    @GetMapping("getAllDetails")
    public List<Student> get(){
        return service.get();
    }

}


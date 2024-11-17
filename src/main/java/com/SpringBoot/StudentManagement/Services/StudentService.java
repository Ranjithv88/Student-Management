package com.SpringBoot.StudentManagement.Services;

import com.SpringBoot.StudentManagement.Model.Student;
import com.SpringBoot.StudentManagement.Repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository repository;

    public List<Student> get(){
        return repository.findAll();
    }

    public String post(Student student){
        repository.save(student);
        return "Student Added.....!";
    }

    public String put(Student student, long id){
        student.setId(id);
        repository.save(student);
        return "Student Update.....!";
    }

    public String delete(long id){
        repository.deleteById(id);
        return "Student Delete SuccessFully.....!";
    }

}
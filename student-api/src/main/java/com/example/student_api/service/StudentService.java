package com.example.student_api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.student_api.entity.Student;
import com.example.student_api.repository.StudentRepository;

@Service
public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public List<Student> getAll() {
        return repository.findAll();
    }

    public Student getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Student save(Student student) {
        return repository.save(student);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}

package com.gursimrat.studentsystem.service;
import com.gursimrat.studentsystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
package com.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.model.Student;
import com.student.service.StudentService;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("students/{id}")
    public Student getStudent(@PathVariable("id") long rollNo) {
        return studentService.getStudent(rollNo);
    }

    @PostMapping("savestudent")
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @PutMapping("updatestudent")
    public Student updateStudent(@RequestBody Student student) {
        return studentService.UpdateStudentData(student);
    }

    @DeleteMapping("deletestudent/{id}")
    public String deleteStudent(@PathVariable("id") long rollNo) {
        boolean deletionStatus = studentService.deleteStudent(rollNo);
        return deletionStatus ? "Student deleted successfully" : "Failed to delete student";
    }
}

package com.student.service;

import java.util.List;

import com.student.model.Student;

public interface StudentService 
{
	public Student getStudent(long roll_no);
	public Student saveStudent(Student student);
	public boolean deleteStudent(long roll_no);
	public Student UpdateStudentData(Student student);
	public List<Student>getAllStudent();
	
}

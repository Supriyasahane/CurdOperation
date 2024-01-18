package com.student.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.model.Student;
import com.student.repo.StudentRepo;
import com.student.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService
{
	@Autowired
	StudentRepo studentRepo;

	@Override
	public Student getStudent(long roll_no) 
	{
		
		return studentRepo.findById(roll_no).get();
	}

	@Override
	public Student saveStudent(Student student) 
	{
		
		return studentRepo.save(student);
		
	}

	@Override
	public boolean deleteStudent(long roll_no) {
	    try {
	        studentRepo.deleteById(roll_no);
	        return true; // Deletion successful
	    } catch (Exception e) {
	        // Handle exceptions (e.g., if the student with the given ID does not exist)
	        return false; // Deletion failed
	    }
	}

	@Override
	public Student UpdateStudentData(Student student)
	{
		
		return studentRepo.save(student);
	}

	@Override
	public List<Student> getAllStudent() 
	{
	
		return studentRepo.findAll();
	}

}

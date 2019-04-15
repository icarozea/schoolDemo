package co.com.zea.ovidio.service;

import java.util.List;

import co.com.zea.ovidio.model.Course;
import co.com.zea.ovidio.model.Student;

public interface IStudentService {
	
	public Student retrieveStudent(String studentId);
	public List<Course> retrieveCourses(String studentId);
}

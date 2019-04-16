package co.com.zea.ovidio.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import co.com.zea.ovidio.Configuration;
import co.com.zea.ovidio.model.Course;
import co.com.zea.ovidio.model.Student;

@Service
public class StudentService implements IStudentService {

	private static List<Student> students = new ArrayList<>();

	static {
		// Initialize Data
		Course course1 = new Course("Course1", "Spring", "10 Steps",
				Arrays.asList("Learn Maven", "Import Project", "First Example", "Second Example"));
		Course course2 = new Course("Course2", "Spring MVC", "10 Examples",
				Arrays.asList("Learn Maven", "Import Project", "First Example", "Second Example"));

		Student ranga = new Student("Student1", "Ranga Karanam", "Hiker, Programmer and Architect",
				new ArrayList<>(Arrays.asList(course1, course2)));

		students.add(ranga);
	}
	
	@Autowired
	private Configuration configuration;
	
	@Value("${valores.valor_fijo}")
	String valorFijo;

	public Student retrieveStudent(String studentId) {
		for (Student student : students) {
			if (student.getId().equals(studentId)) {
				return student;
			}
		}
		return null;
	}

	public List<Course> retrieveCourses(String studentId) {
		
		System.out.println("Variables{ valorFijo:"+valorFijo + " Maximun:" + configuration.getMaximum());
		Student student = retrieveStudent(studentId);
		//this.ejemploProperties();
		if (student == null) {
			return null;
		}

		return student.getCourses();
	}

}

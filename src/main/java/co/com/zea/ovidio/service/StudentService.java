package co.com.zea.ovidio.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

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

	private void ejemploProperties() {
		Properties p = new Properties();
		String pathProperties = System.getenv().get("PATH_CONF");
		try {
			p.load(new FileReader(pathProperties + "/app.properties"));
			System.out.println("[OZEA] valor3=" + p.getProperty("valor3"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String myVar = System.getenv().get("USER");
		System.out.println("[OZEA] USER=" + myVar);
		System.out.println("[OZEA] USER=${USER}");
		System.out.println("[OZEA] PATH_CONF=${PATH_CONF}");

	}

	public Student retrieveStudent(String studentId) {
		for (Student student : students) {
			if (student.getId().equals(studentId)) {
				return student;
			}
		}
		return null;
	}

	public List<Course> retrieveCourses(String studentId) {
		Student student = retrieveStudent(studentId);
		//this.ejemploProperties();
		if (student == null) {
			return null;
		}

		return student.getCourses();
	}

	public List<String> valorVariablesEntorno() {

		List<String> valores = new ArrayList<String>();
		Properties p = new Properties();
		String pathProperties = System.getenv().get("PATH_CONF");

		String myVar = System.getenv().get("PWD");

		valores.add("PATH_CONF:" + pathProperties);
		valores.add("PWD:" + myVar);
		return valores;

	}

}

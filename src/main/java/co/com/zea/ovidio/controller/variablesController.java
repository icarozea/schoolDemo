package co.com.zea.ovidio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.zea.ovidio.model.Course;
import co.com.zea.ovidio.service.StudentService;

@RestController
@RequestMapping("/variables")
public class variablesController {
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/")
	public List<String> callVariables(){
		return studentService.valorVariablesEntorno();
	}

	@GetMapping("/{studentId}/courses")
	public List<Course> retrieveCoursesForStudent(@PathVariable String studentId) {
		return studentService.retrieveCourses(studentId);
	}

}

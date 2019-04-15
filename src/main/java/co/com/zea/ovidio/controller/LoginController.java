package co.com.zea.ovidio.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	@GetMapping(value = "/", produces = "application/json")
	public String showMessage(ModelMap model) {
		model.put("name", "Ovidio");
		return "Welcome!!!";
	}
}

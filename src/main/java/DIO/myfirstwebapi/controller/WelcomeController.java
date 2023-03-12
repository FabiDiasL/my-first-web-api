package DIO.myfirstwebapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class WelcomeController {
	
	@GetMapping
	public String welcome() {
		return "Welcome to my Spring Boot WEB API";
	}
}

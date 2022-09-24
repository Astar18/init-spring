package ec.edu.itsqmet.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/client")
public class ClientController {
	
	
	@GetMapping("/saludar")
	public String saludar() {
	return "Hello World";
	}
	
	
	
}

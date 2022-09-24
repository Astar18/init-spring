package ec.edu.itsqmet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.itsqmet.service.IClientService;

@RestController
@RequestMapping("/client")
public class ClientController {
	
//	private ClientService clientService = new ClientService(); 
	@Autowired
	private IClientService clientService;
	@GetMapping("/saludar")
	public String saludar() {
	return clientService.saludar();
	}
	@PostMapping("/saludP")
	public String saludP() {
		return clientService.saludP();
	}
	@PutMapping("/saludPT")
	public String saludPT() {
		return clientService.saludPT();
	}
	@DeleteMapping("/saludD")
	public String saludD() {
		return clientService.saludD();
	}
	@PatchMapping("/saludPH")
	public String saludPH() {
		return clientService.saludPH();
	}
}

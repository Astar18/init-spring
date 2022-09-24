package ec.edu.itsqmet.service.impl;

import org.springframework.stereotype.Service;

import ec.edu.itsqmet.service.IClientService;

@Service
public class ClientService implements IClientService{
	
	public String saludar() {
		return "Hello World";
	}
	public String saludP() {
		return "Soy un método POST";
	}
	public String saludPT() {
		return "Soy un método PUT";
	}
	public String saludD() {
		return "Soy un método DELETE";
	}
	public String saludPH() {
		return "Soy un método PATCH";
	}
	public String nombre() {
		return "Alex";
	}
	
}

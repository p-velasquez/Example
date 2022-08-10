package cl.bbr.b2c.tutoria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.bbr.b2c.tutoria.manager.TutoriaManager;

@Service
public class TutoriaServiceAImpl implements TutoriaServiceA {
	
	@Autowired
	TutoriaManager tutoriaManager;


	public String mirror(String texto) {
		return texto;
	}

	public String mirrorDesdeManager(String texto) {
		return tutoriaManager.mirror(texto);
	}

	public String numerosDesdeManager() {
		return tutoriaManager.getNumeros();
	}

}

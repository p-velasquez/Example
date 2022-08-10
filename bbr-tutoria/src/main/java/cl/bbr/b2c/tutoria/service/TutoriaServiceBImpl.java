package cl.bbr.b2c.tutoria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.bbr.b2c.tutoria.dto.TutoriaDTO;
import cl.bbr.b2c.tutoria.manager.TutoriaManager;

@Service
public class TutoriaServiceBImpl implements TutoriaServiceB {

	@Autowired
	TutoriaServiceA tutoriaService;
	
	@Autowired
	TutoriaManager tutoriaManager;
	
	public String mirror(String texto) {
		return tutoriaService.mirror(texto);
	}

	public TutoriaDTO getDTO() {
		return tutoriaManager.getDTO();
	}
}
	
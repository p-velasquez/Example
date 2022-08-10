package cl.bbr.b2c.tutoria.manager;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import cl.bbr.b2c.tutoria.dto.TutoriaDTO;

@Service
public class TutoriaManagerImpl implements TutoriaManager {
	
	@Value("${LISTA}")
	private String numeros;
	
	public String mirror(String texto) {
		return texto;
	}

	public String getNumeros() {
		return numeros;
	}
	
	public TutoriaDTO getDTO(){
		TutoriaDTO tutoriaDTO = new TutoriaDTO(99,"Juan"); 
		return tutoriaDTO;
	}
}

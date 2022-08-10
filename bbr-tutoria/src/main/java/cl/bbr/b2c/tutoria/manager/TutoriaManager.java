package cl.bbr.b2c.tutoria.manager;

import cl.bbr.b2c.tutoria.dto.TutoriaDTO;

public interface TutoriaManager {

	public String mirror( String texto );

	public String getNumeros();
	
	public TutoriaDTO getDTO();
	
	
}

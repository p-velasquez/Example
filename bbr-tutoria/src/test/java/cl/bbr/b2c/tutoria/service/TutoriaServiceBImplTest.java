package cl.bbr.b2c.tutoria.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class TutoriaServiceBImplTest {
	
	protected final Logger logger = LogManager.getLogger(getClass().getName());
	
	@Autowired
	private TutoriaServiceB tutoriaService;
	
	@Test
	public void mirrorTest() {

		logger.debug("----------------- mirrorTest() ---------------");
		
		logger.debug(""+this.tutoriaService.mirror("Prueba"));
		
		logger.debug("----------------- mirrorTest() ---------------");
		
	}
	
	@Test
	public void getDTOTest() {

		logger.debug("----------------- getDTOTest() ---------------");
		
		logger.debug("Nombre: "+this.tutoriaService.getDTO().getNombre());
		logger.debug("Edad: "+this.tutoriaService.getDTO().getEdad());
		
		logger.debug("----------------- getDTOTest() ---------------");
		
	}
	
}

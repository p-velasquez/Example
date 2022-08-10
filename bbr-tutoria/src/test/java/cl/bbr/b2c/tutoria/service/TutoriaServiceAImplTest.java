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
public class TutoriaServiceAImplTest {
	
	protected final Logger logger = LogManager.getLogger(getClass().getName());
	
	@Autowired
	private TutoriaServiceA tutoriaService;
	
	@Test
	public void mirrorTest() {

		logger.debug("----------------- mirrorTest() ---------------");
		
		logger.debug(""+this.tutoriaService.mirror("Prueba"));
		
		logger.debug("----------------- mirrorTest() ---------------");
		
	}
	
	@Test
	public void mirrorDesdeManagerTest() {

		logger.debug("----------------- mirrorDesdeManagerTest() ---------------");
		
		logger.debug(""+this.tutoriaService.mirrorDesdeManager("Prueba Manager"));
		
		logger.debug("----------------- mirrorDesdeManagerTest() ---------------");
		
	}	
	
	@Test
	public void numerosDesdeManagerTest() {

		logger.debug("----------------- numerosDesdeManagerTest() ---------------");
		
		logger.debug(""+this.tutoriaService.numerosDesdeManager());
		
		logger.debug("----------------- numerosDesdeManagerTest() ---------------");
		
	}	
	
}

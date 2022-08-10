package cl.bbr.b2c.tutoria.manager;

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
public class TutoriaManagerImplTest {
	
	protected final Logger logger = LogManager.getLogger(getClass().getName());
	
	@Autowired
	private TutoriaManager tutoriaManager;
	
	@Test
	public void mirrorTest() {

		logger.debug("----------------- mirrorTest() ---------------");
		
		logger.debug(""+this.tutoriaManager.mirror("Prueba"));
		
		logger.debug("----------------- mirrorTest() ---------------");
		
	}	
	
	@Test
	public void numerosTest() {

		logger.debug("----------------- numerosTest() ---------------");
		
		logger.debug(""+this.tutoriaManager.getNumeros());
		
		logger.debug("----------------- numerosTest() ---------------");
		
	}	
	
}

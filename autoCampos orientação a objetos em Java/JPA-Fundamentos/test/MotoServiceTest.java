package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.autocampos.jpa.services.impl.MotoService;

/**
 * Classe MotoServiceTest testa a classe MotoService
 * @author Caio Lelis e Breno Alexandre
 * @since 2022
 * @version 1.0
 * */
public class MotoServiceTest {
	
	/**
	 * Testa o m�todo all() para checar se n�o � nulo
	 * */
	@Test
	public void testAll() {
		MotoService motoServ = new MotoService();
		assertNotNull(motoServ.all());
	}

}

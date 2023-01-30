package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.autocampos.jpa.services.impl.CarroService;

/**
 * Classe CarroServiceTest testa a classe CarroService
 * @author Caio Lelis e Breno Alexandre
 * @since 2022
 * @version 1.0
 * */
public class CarroServiceTest {
	
	/**
	 * Testa o m�todo all() para checar se n�o � nulo
	 * */
	@Test
	public void testAll() {
		CarroService carServ = new CarroService();
		assertNotNull(carServ.all());
	}
	
	
}

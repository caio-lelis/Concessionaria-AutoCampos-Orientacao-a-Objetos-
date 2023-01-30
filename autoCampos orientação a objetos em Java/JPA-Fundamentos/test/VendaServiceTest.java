package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.autocampos.jpa.services.impl.VendaService;

/**
 * Classe VendaServiceTest testa a classe VendaService
 * @author Caio Lelis e Breno Alexandre
 * @since 2022
 * @version 1.0
 * */
public class VendaServiceTest {
	
	/**
	 * Testa o método all() para checar se não é nulo
	 * */
	@Test
	public void testAll() {
		VendaService vendaServ = new VendaService();
		assertNotNull(vendaServ.all());
	}

}

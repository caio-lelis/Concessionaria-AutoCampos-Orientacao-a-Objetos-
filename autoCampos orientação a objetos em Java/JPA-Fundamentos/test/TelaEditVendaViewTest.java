package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.autocampos.jpa.ui.TelaEditVendaView;
import com.autocampos.jpa.models.Venda;

/**
 * Classe TelaEditVendaViewTest testa a classe TelaEditVendaView
 * @author Caio Lelis e Breno Alexandre
 * @since 2022
 * @version 1.0
 * */
public class TelaEditVendaViewTest {
	
	/**
	 * Testa o método actionPerformed() para checar se a data da venda que foi cadastrada
	 * é igual a data da venda no banco de dados.
	 * */
	@Test
	public void actionPerformed() {
		TelaEditVendaView editTelaVenda = new TelaEditVendaView();
		Venda venda = new Venda();
		
		assertEquals(editTelaVenda.iniciaComponentes(), venda.getDataVenda());
	}

}

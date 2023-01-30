package com.autocampos.jpa.services.interfaces;

import java.util.List;
import com.autocampos.jpa.models.Venda;

/**
 * Classe VendaNegociacao chama a Entity Manager para negociar a venda
 * de compradores e herda da classe CrudService.
 * @author Caio Lelis e Breno Alexandre
 * @since 2022
 * @version 1.0
 * */
public interface VendaNegociacao extends CrudService<Venda, Integer> {

    List<Venda> searchByName(String comprador);
    
}

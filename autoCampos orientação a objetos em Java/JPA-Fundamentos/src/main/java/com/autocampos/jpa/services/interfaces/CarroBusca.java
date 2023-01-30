package com.autocampos.jpa.services.interfaces;

import java.util.List;
import com.autocampos.jpa.models.Carro;

/**
 * Classe CarroBusca chama a Entity Manager para gerenciar a busca
 * de carros e herda da classe CrudService.
 * @author Caio Lelis e Breno Alexandre
 * @since 2022
 * @version 1.0
 * */
public interface CarroBusca extends CrudService<Carro, Integer> {
    List<Carro> searchByName(String name);
}

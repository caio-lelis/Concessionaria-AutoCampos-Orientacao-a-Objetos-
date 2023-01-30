package com.autocampos.jpa.services.interfaces;

import java.util.List;
import com.autocampos.jpa.models.Moto;

/**
 * Classe MotoBusca chama a Entity Manager para gerenciar a busca
 * de motos e herda da classe CrudService.
 * @author Caio Lelis e Breno Alexandre
 * @since 2022
 * @version 1.0
 * */
public interface MotoBusca extends CrudService<Moto, Integer> {

    List<Moto> searchByName(String name);
    
}

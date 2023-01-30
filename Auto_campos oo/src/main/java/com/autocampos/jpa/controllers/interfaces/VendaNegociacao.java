package com.autocampos.jpa.controllers.interfaces;

import java.util.List;

import com.autocampos.jpa.models.Venda;

public interface VendaNegociacao extends CrudService<Venda, Integer> {

    List<Venda> searchByName(String comprador);
    
}

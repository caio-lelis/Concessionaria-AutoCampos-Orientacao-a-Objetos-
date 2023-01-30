package com.autocampos.jpa.controllers.interfaces;

import java.util.List;

import com.autocampos.jpa.models.Carro;

public interface CarroBusca extends CrudService<Carro, Integer> {
    List<Carro> searchByName(String name);
}

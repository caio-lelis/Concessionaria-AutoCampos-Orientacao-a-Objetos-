package com.autocampos.jpa.controllers.interfaces;

import java.util.List;

import com.autocampos.jpa.models.Moto;

public interface MotoBusca extends CrudService<Moto, Integer> {

    List<Moto> searchByName(String name);
    
}

package com.autocampos.jpa.services.interfaces;

import java.util.List;

/**
 * Classe CrudService chama a Entity Manager para gerenciar o banco de dados.
 * @author Caio Lelis e Breno Alexandre
 * @since 2022
 * @version 1.0
 * */
public interface CrudService<T,K> {
	List<T> all();
	T byId(K id);
	T insert(T entity);
	T update(T entity);
	void delete(T entity);
	void deleteById(K id);

}

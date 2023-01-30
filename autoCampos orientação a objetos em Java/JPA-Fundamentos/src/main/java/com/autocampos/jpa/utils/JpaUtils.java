package com.autocampos.jpa.utils;

import javax.persistence.*;

/**
 * Classe JpaUtils faz liga��o com a Entity Manager para a manipula��o de dados
 * @author Caio Lelis e Breno Alexandre
 * @since 2022
 * @version 1.1
 * */
public class JpaUtils {
	private static EntityManagerFactory ENTITY_MANAGER_FACTORY =null;
	
	/*
	 * Liga a Entity Manager ao c�digo quando ela n�o estiver vazia
	 * */
	public static EntityManager getEntityManager(){
		if(ENTITY_MANAGER_FACTORY==null) {
			ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("autocampos-jpa");
		}
		return ENTITY_MANAGER_FACTORY.createEntityManager();
	}
}
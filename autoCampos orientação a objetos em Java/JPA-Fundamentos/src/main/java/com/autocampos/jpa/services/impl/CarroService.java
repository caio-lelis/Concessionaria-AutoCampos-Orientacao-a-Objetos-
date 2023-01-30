package com.autocampos.jpa.services.impl;

import java.util.*;
import javax.persistence.EntityManager;
import com.autocampos.jpa.models.Carro;
import com.autocampos.jpa.services.interfaces.CarroBusca;
import com.autocampos.jpa.utils.JpaUtils;

/**
  * Classe CarroService cria a Entity Manager e o banco de dados e herda da classe 
  * CarroBusca.
  * @author Caio Lelis e Breno Alexandre
  * @since 2022
  * @version 1.0
  * */
public class CarroService implements CarroBusca {
	
	/**
	 * Sobrescreve o método all() da classe CrudService. Lista todos os carros.
	 * @return List
	 * */
    @Override
    public List<Carro> all() {
        List<Carro> carros = new ArrayList<Carro>();
        EntityManager em = null;
        try {
            em = JpaUtils.getEntityManager();
            carros = em.createQuery("from Carro", Carro.class).getResultList();
            return carros;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    /**
	 * Sobrescreve o método byId() da classe CrudService. Busca carro pela id.
	 * @param id
	 * @return Carro
	 * */
    @Override
    public Carro byId(Integer id) {
        EntityManager em = null;
        try {
            em = JpaUtils.getEntityManager();
            return em.find(Carro.class, id);
        } finally {
            if (em != null) {
                em.close();
            }
        }

    }
    
    /**
	 * Sobrescreve o método insert() da classe CrudService. Cadastra um carro novo.
	 * @param entity
	 * @return Carro
	 * */
    @Override
    public Carro insert(Carro entity) {
        EntityManager em = null;
        try {
            em = JpaUtils.getEntityManager();
            em.getTransaction().begin();
            em.persist(entity);
            em.getTransaction().commit();
            return entity;
        } finally {
            if (em != null) {
                em.close();
            }
        }

    }
    
    /**
	 * Sobrescreve o método update() da classe CrudService. Atualiza informações
	 * de um carro.
	 * @param entity
	 * @return Carro
	 * */
    @Override
    public Carro update(Carro entity) {
        EntityManager em = null;
        try {
            em = JpaUtils.getEntityManager();
            em.getTransaction().begin();
            em.merge(entity);
            em.getTransaction().commit();
            return entity;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    /**
	 * Sobrescreve o método delete() da classe CrudService. Exclui um carro.
	 * @param entity
	 * */
    @Override
    public void delete(Carro entity) {
        EntityManager em = null;
        try {
            em = JpaUtils.getEntityManager();
            em.getTransaction().begin();
            em.remove(entity);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    /**
	 * Sobrescreve o método delete() da classe CrudService. Exclui um carro pela id.
	 * @param id
	 * */
    @Override
    public void deleteById(Integer id) {
        EntityManager em = null;
        try {
            em = JpaUtils.getEntityManager();
            em.getTransaction().begin();
            em.remove(em.find(Carro.class, id));
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }

    }
    
    /**
	 * Sobrescreve o método searchByName() da classe CarroBusca. Busca carro pelo nome.
	 * @param name
	 * @return List
	 * */
    @Override
    public List<Carro> searchByName(String name) {
        EntityManager em = null;
        try {
            em = JpaUtils.getEntityManager();
            return em.createQuery("from Carro where modelo like :modelo", Carro.class)
                    .setParameter("modelo", "%" + name + "%")
                    .getResultList();
        } finally {
            if (em != null) {
                em.close();
            }
        }

    }
    
    /**
	 * Busca carro pela marca.
	 * @param name
	 * @return List
	 * */
    public List<Carro> searchByMarca(String name) {
        EntityManager em = null;
        try {
            em = JpaUtils.getEntityManager();
            return em.createQuery("from Carro where marca like :marca", Carro.class)
                    .setParameter("marca", "%" + name + "%")
                    .getResultList();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    /**
	 * Busca carro pelo valor.
	 * @param valor
	 * @return List
	 * */
    public List<Carro> searchByValor(double valor) {
        EntityManager em = null;
        try {
            em = JpaUtils.getEntityManager();
            return em.createQuery("from Carro where valor <= :valor", Carro.class)
                    .setParameter("valor", valor)
                    .getResultList();
        } finally {
            if (em != null) {
                em.close();
            }
        }

    }

}

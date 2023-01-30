package com.autocampos.jpa.services.impl;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import com.autocampos.jpa.models.Moto;
import com.autocampos.jpa.services.interfaces.MotoBusca;
import com.autocampos.jpa.utils.JpaUtils;

/**
 * Classe MotoService cria a Entity Manager e o banco de dados e herda da classe 
 * MotoBusca.
 * @author Caio Lelis e Breno Alexandre
 * @since 2022
 * @version 1.0
 * */
public class MotoService implements MotoBusca{
	
	/**
	 * Sobrescreve o método all() da classe CrudService. Lista todas as motos.
	 * @return List
	 * */
    @Override
    public List<Moto> all() {
        // Lista que receberão os  objetos Motos que vieram 
        //do banco de dados
        List<Moto> motos = new ArrayList<Moto>();
        // Objeto que representa a conexão com o banco de dados
        EntityManager em = null;
        try{
            em = JpaUtils.getEntityManager();
            motos = em.createQuery("from Moto", Moto.class).getResultList();
            return motos;
        } finally {
            if(em != null){
                em.close();
            }
        }
        
    }
    
    /**
	 * Sobrescreve o método byId() da classe CrudService. Busca moto pela id.
	 * @param id
	 * @return Moto
	 * */
    @Override
    public Moto byId(Integer id) {
        EntityManager em = null;
        try{
            em = JpaUtils.getEntityManager();
            return em.find(Moto.class, id);
        } finally {
            if(em != null){
                em.close();
            }
        }

    }
    
    /**
	 * Sobrescreve o método insert() da classe CrudService. Cadastra uma moto nova.
	 * @param entity
	 * @return Moto
	 * */
    @Override
    public Moto insert(Moto entity) {
        EntityManager em = null;
        try{
            em = JpaUtils.getEntityManager();
            em.getTransaction().begin();
            em.persist(entity);
            em.getTransaction().commit();
            return entity;
        } finally {
            if(em != null){
                em.close();
            }
        }
       
    }
    
    /**
	 * Sobrescreve o método update() da classe CrudService. Atualiza informações
	 * de uma moto.
	 * @param entity
	 * @return Moto
	 * */
    @Override
    public Moto update(Moto entity) {
        EntityManager em = null;
        try{
            em = JpaUtils.getEntityManager();
            em.getTransaction().begin();
            em.merge(entity);
            em.getTransaction().commit();
            return entity;
        } finally {
            if(em != null){
                em.close();
            }
        }
    }
    
    /**
	 * Sobrescreve o método delete() da classe CrudService. Exclui uma moto.
	 * @param entity
	 * */
    @Override
    public void delete(Moto entity) {
        EntityManager em = null;
        try{
            em = JpaUtils.getEntityManager();
            em.getTransaction().begin();
            em.remove(entity);
            em.getTransaction().commit();
        } finally {
            if(em != null){
                em.close();
            }
        }
        
    }
    
    /**
	 * Sobrescreve o método delete() da classe CrudService. Exclui uma moto pela id.
	 * @param id
	 * */
    @Override
    public void deleteById(Integer id) {
        EntityManager em = null;
        try{
            em = JpaUtils.getEntityManager();
            em.getTransaction().begin();
            em.remove(em.find(Moto.class, id));
            em.getTransaction().commit();
        } finally {
            if(em != null){
                em.close();
            }
        }
        
    }
    
    /**
	 * Sobrescreve o método searchByName() da classe MotoBusca. Busca moto pelo nome.
	 * @param name
	 * @return List
	 * */
    @Override
    public List<Moto> searchByName(String name) {
        EntityManager em = null;
        try{
            em = JpaUtils.getEntityManager();
            return em.createQuery("from Moto where modelo like :modelo", Moto.class)
                    .setParameter("modelo", "%" + name + "%")
                    .getResultList();
        } finally {
            if(em != null){
                em.close();
            }
        }
        
    }
    
}

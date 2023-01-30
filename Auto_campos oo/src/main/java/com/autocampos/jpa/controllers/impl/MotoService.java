package com.autocampos.jpa.controllers.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import com.autocampos.jpa.controllers.interfaces.MotoBusca;
import com.autocampos.jpa.controllers.utils.JpaUtils;
import com.autocampos.jpa.models.Moto;

public class MotoService implements MotoBusca{

    @Override
    public List<Moto> all() {
        // Lista que receberá os  objetos Motos que vieram 
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

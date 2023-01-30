package com.autocampos.jpa.services.impl;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import com.autocampos.jpa.models.Venda;
import com.autocampos.jpa.services.interfaces.VendaNegociacao;
import com.autocampos.jpa.utils.JpaUtils;

/**
 * Classe VendaService cria a Entity Manager e o banco de dados e herda da classe 
 * VendaNegociacao.
 * @author Caio Lelis e Breno Alexandre
 * @since 2022
 * @version 1.0
 * */
public class VendaService implements VendaNegociacao {
	
	/**
	 * Sobrescreve o método all() da classe CrudService. Lista todas as vendas.
	 * @return List
	 * */
    @Override
    public List<Venda> all() {
        List<Venda> vendas = new ArrayList<Venda>();
        EntityManager em = null;
        try {
            em = JpaUtils.getEntityManager();
            vendas = em.createQuery("from Venda", Venda.class).getResultList();
            return vendas;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    /**
	 * Sobrescreve o método byId() da classe CrudService. Busca venda pela id.
	 * @param id
	 * @return Venda
	 * */
    @Override
    public Venda byId(Integer id) {
        EntityManager em = null;
        try {
            em = JpaUtils.getEntityManager();
            return em.find(Venda.class, id);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    /**
	 * Sobrescreve o método insert() da classe CrudService. Cadastra uma venda nova.
	 * @param entity
	 * @return Venda
	 * */
    @Override
    public Venda insert(Venda entity) {
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
	 * de uma venda.
	 * @param entity
	 * @return Venda
	 * */
    @Override
    public Venda update(Venda entity) {
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
	 * Sobrescreve o método delete() da classe CrudService. Exclui uma venda.
	 * @param entity
	 * */
    @Override
    public void delete(Venda entity) {
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
	 * Sobrescreve o método delete() da classe CrudService. Exclui uma venda pela id.
	 * @param id
	 * */
    @Override
    public void deleteById(Integer id) {
        EntityManager em = null;
        try{
            em = JpaUtils.getEntityManager();
            em.getTransaction().begin();
            em.remove(em.find(Venda.class, id));
            em.getTransaction().commit();
        } finally {
            if(em != null){
                em.close();
            }
        }
    }
    
    /**
	 * Sobrescreve o método searchByName() da classe VendaNegociacao. Busca venda pelo
	 * nome.
	 * @param comprador
	 * @return List
	 * */
    @Override
    public List<Venda> searchByName(String comprador) {
        EntityManager em = null;
        try {
            em = JpaUtils.getEntityManager();
            return em.createQuery("from Venda where comprador <= :comprador", Venda.class)
                    .setParameter("comprador", comprador)
                    .getResultList();
        } finally {
            if (em != null) {
                em.close();
            }
        }

    }
    

}

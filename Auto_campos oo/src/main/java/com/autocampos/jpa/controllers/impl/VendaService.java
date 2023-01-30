package com.autocampos.jpa.controllers.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import com.autocampos.jpa.controllers.interfaces.VendaNegociacao;
import com.autocampos.jpa.controllers.utils.JpaUtils;
import com.autocampos.jpa.models.Venda;

public class VendaService implements VendaNegociacao {

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

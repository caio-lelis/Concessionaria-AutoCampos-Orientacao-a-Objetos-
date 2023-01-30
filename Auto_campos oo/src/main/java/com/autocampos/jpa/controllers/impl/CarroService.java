package com.autocampos.jpa.controllers.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import com.autocampos.jpa.controllers.interfaces.CarroBusca;
import com.autocampos.jpa.controllers.utils.JpaUtils;
import com.autocampos.jpa.models.Carro;

public class CarroService implements CarroBusca {

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

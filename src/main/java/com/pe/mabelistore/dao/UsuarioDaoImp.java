package com.pe.mabelistore.dao;

import com.pe.mabelistore.models.Usuario;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class UsuarioDaoImp implements UsuarioDao{

    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public List<Usuario> getUsuario() {
        String query = "FROM Usuario";
        return  entityManager.createQuery(query).getResultList();
    }
}

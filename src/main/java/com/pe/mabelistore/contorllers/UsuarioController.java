package com.pe.mabelistore.contorllers;

import com.pe.mabelistore.dao.UsuarioDao;
import com.pe.mabelistore.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;//dao

    @RequestMapping(value = "api/usuarios")
    public List<Usuario> getUsuario(){
        return usuarioDao.getUsuario();
    }
}

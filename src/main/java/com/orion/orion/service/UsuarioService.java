package com.orion.orion.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orion.orion.dto.UsuarioDTO;
import com.orion.orion.entity.usuario.UsuarioEntity;
import com.orion.orion.repository.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository repository;

    public Optional<UsuarioEntity> chamaUsuario(Integer id_usuario){    
         return repository.findById(id_usuario);
    }

    public List<UsuarioEntity> chamaLogin(String login){       
        return repository.findByLogin(login);
    }


    
}

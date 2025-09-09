package com.orion.orion.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;

import com.orion.orion.entity.usuario.UsuarioEntity;
import com.orion.orion.service.UsuarioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/id/{login}")
    public Optional<UsuarioEntity> getMethodName(@PathVariable(name = "login") Integer login) {
        return usuarioService.chamaUsuario(login);
    }

    @GetMapping("/login/{login}")
    public List<UsuarioEntity> getMethodLogin(@PathVariable(name = "login") String login) {
        return usuarioService.chamaLogin(login);
    }
    
    

    
    
}

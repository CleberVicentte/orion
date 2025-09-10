package com.orion.orion.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.orion.orion.dto.UsuarioDTO;
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

    @GetMapping("/id/{id_usuario}")
    
    public ResponseEntity<Optional<UsuarioDTO>> getMethodName(
                                                                @PathVariable(name = "id_usuario") Integer id_usuario) {
            Optional<UsuarioEntity> usuario = usuarioService.chamaUsuario(id_usuario);  
            Optional<UsuarioDTO> dtos = usuario.stream()
                            .map(UsuarioDTO::new)    
                            .toList();

            return ResponseEntity.ok(dtos)                ;

    }

    @GetMapping("/login/{login}")
    public List<UsuarioEntity> getMethodLogin(@PathVariable(name = "login") String login) {
        return usuarioService.chamaLogin(login);
    }

      

    
    
}

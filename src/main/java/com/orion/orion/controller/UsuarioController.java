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
import org.springframework.web.bind.annotation.RequestParam;




@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/id/{id_usuario}")
    
    //Optional Representa um Unico valor que pode ou não existir - quando não tem certeza se existe objeto 
    public ResponseEntity<Optional<UsuarioDTO>> getMethodName(
                                                                @PathVariable(name = "id_usuario") Integer id_usuario) {
            Optional<UsuarioEntity> usuario = usuarioService.chamaUsuario(id_usuario);  
            //retirado stream e mantido Map no Optional 
            Optional<UsuarioDTO> dtos = usuario.map(UsuarioDTO::new);    

            return ResponseEntity.ok(dtos)                ;

    }

    //Exemplo do login em Dto Utilizando a List = List usada Varios resultados ou nenhum
    @GetMapping("/login/{login}")
    public ResponseEntity<List<UsuarioDTO>> getMethodName(@PathVariable String login) {
        List<UsuarioEntity> entity = usuarioService.chamaLogin(login);
        List<UsuarioDTO> dtos = entity.stream()
                                      .map(UsuarioDTO::new)
                                      .toList();
        return ResponseEntity.ok(dtos);
    }
    

    /*@GetMapping("/login/{login}")
    public List<UsuarioEntity> getMethodLogin(@PathVariable(name = "login") String login) {
        return usuarioService.chamaLogin(login);
    }*/

      

    
    
}

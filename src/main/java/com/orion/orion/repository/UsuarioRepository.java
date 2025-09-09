package com.orion.orion.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.orion.orion.entity.usuario.UsuarioEntity;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Integer>, JpaSpecificationExecutor<UsuarioEntity>{
   // List<UsuarioEntity> findById_usuario(Integer id_usuario);
    
    @Query(value = "Select * from TBUSUARIO where login = ?", nativeQuery = true)
    public List<UsuarioEntity> findByLogin(String login);
}
    


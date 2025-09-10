package com.orion.orion.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.orion.orion.dto.UsuarioDTO;
import com.orion.orion.entity.usuario.UsuarioEntity;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Integer>{

   // @Query(value = "SELECT * FROM SERVICOSTABELAEXC", nativeQuery = true)
   // Page<UsuarioEntity> findAll(Pageable pageable);

    @Query(value = "Select * from TBUSUARIO where id_usuario = ?", nativeQuery = true)
    public List<UsuarioEntity> findById_usuario(Integer id_usuario);
    
    @Query(value = "Select * from TBUSUARIO where login = ?", nativeQuery = true)
    public List<UsuarioEntity> findByLogin(String login);
}
    


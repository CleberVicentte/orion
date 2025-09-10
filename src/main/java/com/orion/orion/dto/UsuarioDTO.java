package com.orion.orion.dto;

import java.util.Optional;
import java.util.stream.Collectors;

import com.orion.orion.entity.usuario.UsuarioEntity;

public class UsuarioDTO {

    private Integer id_usuario ;
    private String login ;
    private String descricao ;
    private String senha ;

    @Override
    public String toString() {
        return "UsuarioDTO [id_usuario=" + id_usuario + ", login=" + login + ", descricao=" + descricao + ", senha="
                + senha + ", status=" + status + ", hashCode()=" + hashCode() + ", getId_usuario()=" + getId_usuario()
                + ", getLogin()=" + getLogin() + ", getDescricao()=" + getDescricao() + ", getSenha()=" + getSenha()
                + ", getStatus()=" + getStatus() + ", getClass()=" + getClass() + ", toString()=" + super.toString()
                + "]";
    }

    private String status ;

    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id_usuario == null) ? 0 : id_usuario.hashCode());
        result = prime * result + ((login == null) ? 0 : login.hashCode());
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
        result = prime * result + ((senha == null) ? 0 : senha.hashCode());
        result = prime * result + ((status == null) ? 0 : status.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        UsuarioDTO other = (UsuarioDTO) obj;
        if (id_usuario == null) {
            if (other.id_usuario != null)
                return false;
        } else if (!id_usuario.equals(other.id_usuario))
            return false;
        if (login == null) {
            if (other.login != null)
                return false;
        } else if (!login.equals(other.login))
            return false;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        if (senha == null) {
            if (other.senha != null)
                return false;
        } else if (!senha.equals(other.senha))
            return false;
        if (status == null) {
            if (other.status != null)
                return false;
        } else if (!status.equals(other.status))
            return false;
        return true;
    }

    public UsuarioDTO(Integer id_usuario, String login, String descricao, String senha, String status) {
        this.id_usuario = id_usuario;
        this.login = login;
        this.descricao = descricao;
        this.senha = senha;
        this.status = status;
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public String getLogin() {
        return login;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getSenha() {
        return senha;
    }

    public String getStatus() {
        return status;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    

    public static Optional<UsuarioDTO> converter(Optional<UsuarioEntity> usuario) {
        return usuario.stream().map(UsuarioDTO::new).collect(Collectors.toList());
    }
    
}

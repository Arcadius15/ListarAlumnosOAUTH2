package com.idat.tarea1.repositorio;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.idat.tarea1.modelo.Usuario;

@RepositoryRestResource(path = "usuario")
public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer>{

	Optional<Usuario> findByUsuario(String usuario);
}

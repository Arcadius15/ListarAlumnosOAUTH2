package com.idat.tarea1.seguridad;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.idat.tarea1.modelo.Usuario;
import com.idat.tarea1.repositorio.UsuarioRepositorio;

@Service
public class UserDetService implements UserDetailsService{
	
	@Autowired
	private UsuarioRepositorio repositorio;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Usuario> usuario = repositorio.findByUsuario(username);
		if (usuario.isPresent()) {
			return usuario.get();
		}else {
			throw new UsernameNotFoundException("El usuario no existe");
		}
	}

}

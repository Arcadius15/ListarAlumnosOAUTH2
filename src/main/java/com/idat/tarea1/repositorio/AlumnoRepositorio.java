package com.idat.tarea1.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.idat.tarea1.modelo.Alumno;

@RepositoryRestResource(path = "alumno")
public interface AlumnoRepositorio extends JpaRepository<Alumno, Integer>{

}

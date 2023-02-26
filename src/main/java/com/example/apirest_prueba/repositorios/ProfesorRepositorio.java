package com.example.apirest_prueba.repositorios;

import com.example.apirest_prueba.modelos.Alumno;
import com.example.apirest_prueba.modelos.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesorRepositorio extends JpaRepository<Profesor, Long> {

}

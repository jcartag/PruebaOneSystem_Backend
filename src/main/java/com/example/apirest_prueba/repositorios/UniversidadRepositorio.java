package com.example.apirest_prueba.repositorios;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UniversidadRepositorio {
    String obtenerHorario();
    String irAClase();
    String obtenerPrograma();
    String obtenerPaseParqueadero();
}

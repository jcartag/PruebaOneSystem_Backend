package com.example.apirest_prueba.servicios;

import com.example.apirest_prueba.modelos.Alumno;
import com.example.apirest_prueba.modelos.Profesor;

import java.util.List;

public interface IProfesorServicio {

    public List<Profesor> getAll();

    public Profesor save(Profesor profesor);

    public Profesor getById(long id);

    public void  delete(long id);

    String obtenerHorario();

    String irAClase();

    String obtenerPrograma();

    String  obtenerPaseParqueadero();
}

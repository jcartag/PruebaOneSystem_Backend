package com.example.apirest_prueba.servicios;

import com.example.apirest_prueba.modelos.Alumno;

import java.util.List;

public interface IAlumnoServicio {

    public List<Alumno> getAll();

    public Alumno save(Alumno alumno);

    public Alumno getById(long idAlumno);

    public void  delete(long idAlumno);

    String obtenerHorario();

    String irAClase();

    String obtenerPrograma();

    String  obtenerPaseParqueadero();


}

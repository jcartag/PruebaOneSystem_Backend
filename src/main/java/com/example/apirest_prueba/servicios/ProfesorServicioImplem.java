package com.example.apirest_prueba.servicios;

import com.example.apirest_prueba.modelos.Profesor;
import com.example.apirest_prueba.repositorios.ProfesorRepositorio;
import com.example.apirest_prueba.repositorios.UniversidadRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service
public class ProfesorServicioImplem implements IProfesorServicio {

    @Autowired
    ProfesorRepositorio profesorRepositorio;
    @Autowired(required = false)
    UniversidadRepositorio universidadRepositorio;
    @Override
    public List<Profesor> getAll() { return profesorRepositorio.findAll(); }
    @Override
    public Profesor save(Profesor profesor) {
        return profesorRepositorio.save(profesor);
    }
    @Override
    public Profesor getById(long id) {
        return profesorRepositorio.getById(id);
    }
    @Override
    public void delete(long id) {
        profesorRepositorio.deleteById(id);
    }
    @Override
    public String obtenerHorario() {
        return universidadRepositorio.obtenerHorario();
    }
    @Override
    public String irAClase() { return universidadRepositorio.irAClase(); }
    @Override
    public String obtenerPrograma() {
        return universidadRepositorio.obtenerPrograma();
    }
    @Override
    public String  obtenerPaseParqueadero() { return universidadRepositorio.obtenerPaseParqueadero();}
}

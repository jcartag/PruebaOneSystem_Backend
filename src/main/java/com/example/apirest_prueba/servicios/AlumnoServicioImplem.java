package com.example.apirest_prueba.servicios;

import com.example.apirest_prueba.modelos.Alumno;
import com.example.apirest_prueba.repositorios.AlumnoRepository;
import com.example.apirest_prueba.repositorios.UniversidadRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service
public class AlumnoServicioImplem implements IAlumnoServicio {

    @Autowired
    AlumnoRepository alumnoRepository;
    @Autowired(required = false)
    UniversidadRepositorio universidadRepositorio;
    @Override
    public List<Alumno> getAll() {
        return alumnoRepository.findAll();
    }
    @Override
    public Alumno save(Alumno alumno) { return alumnoRepository.save(alumno);}
    @Override
    public Alumno getById(long idAlumno) { return alumnoRepository.getById(idAlumno); }
    @Override
    public void delete(long idAlumno) { alumnoRepository.deleteById(idAlumno); }
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
    public String  obtenerPaseParqueadero() {
        return universidadRepositorio.obtenerPaseParqueadero();
    }

}

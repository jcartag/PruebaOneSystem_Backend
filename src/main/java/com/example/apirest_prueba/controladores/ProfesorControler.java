package com.example.apirest_prueba.controladores;


import com.example.apirest_prueba.modelos.Profesor;
import com.example.apirest_prueba.servicios.ProfesorServicioImplem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(exposedHeaders="Access-Control-Allow-Origin")
public class ProfesorControler {
    @Autowired
    ProfesorServicioImplem profesorServicioImplem;
    @GetMapping("/profesor")
    public List<Profesor> obtenerProfesor(){
        return profesorServicioImplem.getAll();
    }

    @PostMapping("/guardarProfesor")
    public ResponseEntity<Profesor> guardarProfesor(@RequestBody Profesor profesor){
        Profesor nuevo_profesor = profesorServicioImplem.save(profesor);
        return new ResponseEntity<>(nuevo_profesor, HttpStatus.CREATED);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/profesor/{id}")
    public ResponseEntity<Profesor> obtenerProfesorId(@PathVariable long id){
        Profesor profesorPorId = profesorServicioImplem.getById(id);

        return ResponseEntity.ok(profesorPorId);
    }

    @PutMapping("/profesor/{id}")
    public ResponseEntity<Profesor> actualizar(@PathVariable long id, @RequestBody Profesor profesor){

        Profesor profesorPorId = profesorServicioImplem.getById(id);
        profesorPorId.setNombre_completo(profesor.getNombre_completo());
        profesorPorId.setIdentificacion(profesor.getIdentificacion());
        profesorPorId.setNumero_telefono((int) profesor.getNumero_telefono());
        profesorPorId.setEmail(profesor.getEmail());
        profesorPorId.setDireccion_residencia(profesor.getDireccion_residencia());
        profesorPorId.setGenero(profesor.getGenero());
        profesorPorId.setSalario(profesor.getSalario());
        profesorPorId.setDependencia(profesor.getDependencia());
        profesorPorId.setMateria(profesor.getMateria());


        Profesor profesor_actualizado = profesorServicioImplem.save(profesorPorId);
        return  new ResponseEntity<>(profesor_actualizado, HttpStatus.CREATED);
    }

    @DeleteMapping("/profesor/{id}")
    public ResponseEntity<HashMap<String, Boolean>> eliminarProfesor(@PathVariable long id){
        this.profesorServicioImplem.delete(id);

        HashMap<String, Boolean> estadoProfesorEliminado = new HashMap<>();
        estadoProfesorEliminado.put("Eliminado", true);
        return ResponseEntity.ok(estadoProfesorEliminado);
    }
}
